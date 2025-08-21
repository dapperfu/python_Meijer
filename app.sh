#!/usr/bin/env bash
set -euo pipefail

# Requirements:
#   1) adb in PATH and a device connected with USB debugging enabled
#   2) jadx CLI in PATH (binary name can be either `jadx` or `jadx-cli`)
#
# Usage:
#   ./pull_and_decompile_meijer.sh
#   ./pull_and_decompile_meijer.sh <substring>   # optional, defaults to "meijer"

MATCH_SUBSTR="${1:-meijer}"

# Find jadx binary
JADX_BIN="$(command -v jadx || true)"
if [[ -z "${JADX_BIN}" ]]; then
  if command -v jadx-cli >/dev/null 2>&1; then
    JADX_BIN="$(command -v jadx-cli)"
  else
    echo "jadx not found in PATH. Install jadx or add it to PATH."
    #exit 1
  fi
fi

# Check adb and device
command -v adb >/dev/null 2>&1 || { echo "adb not found in PATH"; exit 1; }
if ! adb get-state 1>/dev/null 2>&1; then
  echo "No device found by adb. Connect a device and enable USB debugging."
  exit 1
fi

echo "[1] Finding packages containing: ${MATCH_SUBSTR}"
PKGS_RAW="$(adb shell "cmd package list packages 2>/dev/null || pm list packages" \
  | tr -d '\r' | sed 's/^package://')"

# Case-insensitive fixed-string match
mapfile -t PKGS < <(printf "%s\n" "${PKGS_RAW}" | grep -iF "${MATCH_SUBSTR}" || true)

if [[ ${#PKGS[@]} -eq 0 ]]; then
  echo "No packages found matching '${MATCH_SUBSTR}'."
  exit 1
fi

echo "Matched packages:"
printf "  %s\n" "${PKGS[@]}"

echo "[2] Pulling APKs to current directory: $(pwd)"
for pkg in "${PKGS[@]}"; do
  echo "==> Processing ${pkg}"

  APK_PATHS_RAW="$(adb shell "cmd package path ${pkg} 2>/dev/null || pm path ${pkg}" || true)"
  mapfile -t APK_PATHS < <(printf "%s\n" "${APK_PATHS_RAW}" | tr -d '\r' | sed 's/^package://')

  if [[ ${#APK_PATHS[@]} -eq 0 ]]; then
    echo "    No APK paths returned for ${pkg}. Skipping."
    continue
  fi

  pkg_safe="${pkg//[^A-Za-z0-9._-]/_}"
  LOCAL_APKS=()

  for remote in "${APK_PATHS[@]}"; do
    base="$(basename "${remote}")"
    local_file="${pkg_safe}-${base}"
    echo "    Pulling ${remote} -> ${local_file}"
    if adb pull "${remote}" "./${local_file}" >/dev/null; then
      LOCAL_APKS+=("./${local_file}")
    else
      echo "    Pull failed for ${remote}. Continuing."
    fi
  done

  if [[ ${#LOCAL_APKS[@]} -eq 0 ]]; then
    echo "    Nothing pulled for ${pkg}. Skipping decompile."
    continue
  fi

  OUT_DIR="${pkg_safe}-src"
  echo "[3] Decompiling ${pkg} with jadx into: ${OUT_DIR}"
  rm -rf "${OUT_DIR}"
  mkdir -p "${OUT_DIR}"

  if "${JADX_BIN}" -d "${OUT_DIR}" "${LOCAL_APKS[@]}"; then
    echo "    Decompiled ${pkg} into ${OUT_DIR}"
  else
    echo "    jadx failed for ${pkg}. Continuing."
  fi
done

echo
echo "All done."
