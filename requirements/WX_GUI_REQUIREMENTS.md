# Requirements: wxPython GUI for `python_Meijer` v2

This document defines the requirements for a cross platform wxPython desktop app that delivers full feature parity with the v2 CLI of [`python_Meijer`](https://github.com/dapperfu/python_Meijer/tree/v2). Parity means every CLI command and option has an equivalent GUI action or setting, and produces the same results or files.

## 1. Scope and non goals
- **In scope**
  - GUI surfaces for all CLI capabilities: `list`, `coupons`, `stores`, `cart`, `ads`, `gas`, `auth`, `email-2fa`, `status`, settings, proxy and local backend flags, and verbose logging.
  - Authentication flows that include log analysis and quick token capture, plus full login where supported by the CLI.
  - File import and export and cost estimation features from the `list` group.
- **Non goals**
  - Re implementing scraping logic that already exists in the library.
  - Building a browser automation UI beyond progress and status.
  - Advanced maps or custom graphics in v1. Textual results are sufficient.

## 2. Platforms, runtime, packaging
- **OS**: Windows 10 or later, macOS 12 or later, Linux such as Ubuntu 22.04 or later.
- **Python**: 3.11 or later.
- **GUI toolkit**: wxPython 4.2 or later.
- **Packaging**: PyInstaller one folder per OS. Code signing for macOS and Windows when certificates are available.
- **App data paths**: use `platformdirs` to place config and data in OS appropriate directories. Also respect existing CLI file locations such as `~/.config/meijer/login.txt` and the email 2FA file. Provide migration when moving files to a new location.

## 3. Architecture
- **Layers**
  - **UI layer**: wx frames, panels, dialogs, menus, sizers.
  - **Application layer**: controllers that translate UI actions into calls to the library, one controller per CLI group.
  - **Domain layer**: reuse the `meijer` package directly. Do not shell out to the CLI. The CLI README is the parity specification.
- **Concurrency**
  - Never block the main thread. Use worker threads and a thread safe queue. Marshal back to the UI with `wx.CallAfter` or custom wx events.
  - Long operations show a cancellable progress dialog with an activity log that streams lines as steps complete.
- **Configuration**
  - Settings file in TOML or YAML under the user config directory. Include proxy, local backend URL, logging level, default store, and export defaults.
  - Hot reload settings after saving from the Settings dialog.

## 4. Navigation and screens
Top level frame with a left navigation tree and a main panel that swaps child panels.

### 4.1 Dashboard
- Shows authentication status, current store, last sync time, worker queue status, and recent actions.
- Provides a `Refresh` button that triggers the status check.

### 4.2 Shopping List
Maps to `meijer list *`.
- **Grid**: columns `[Done, Item, Qty, Notes, Aisle, Matched Product, Est. Price]`. Sorting and filtering by column.
- **Add item**: text, quantity, notes, and optional UPC. Supports import from file that mirrors CLI `--file` semantics.
- **Show filters**: toggles for Completed and Pending as per CLI options.
- **Estimate cost**: dialog fields for Store ID, output path, include location, include matched, and method selection such as cart, shop_scan, search, keywords. Results populate grid and can be written to CSV or Excel.
- **Favorites**: read only list.
- **Clear** and **Clear All** with confirmation.
- **Defrag**: options for Store ID, reverse, zig, show before and after. Preview pane with export.
- **Import and Export**: formats auto, text, csv, json, xlsx. Auto detect on import as in the CLI.
- **Interactive mode**: inline editor session that mirrors the CLI interactive flow but with native widgets.

### 4.3 Coupons
- **List**: table with filters for all, clipped, available. Clip and unclip actions for selected rows.

### 4.4 Stores
- **Search**: inputs for city, zip, near latitude and longitude, radius, services filter, limit. Output table with store details. Export to CSV.
- **Show**: details by Store ID.
- **Nearby**: fields for latitude, longitude, radius, limit, and sort.
- **Gas**: view gas station info and prices using city, zip, and radius filters.

### 4.5 Cart
- **Show**: table with item rows and totals.
- **Add**: input for UPC, quantity, and store id.
- **Remove**: by index with optional quantity. Clear with confirmation.
- **Info**: stats panel.
- **Slots**: date selector with pickup or delivery toggle.
- **Set Store**: input for Store ID.
- **Checkout**: method picker that mirrors CLI behavior.

### 4.6 Authentication and 2FA
- **Auth dashboard**: shows token presence, expiration, scopes, and last refresh. Buttons for login, logout, and config view.
- **Log analysis**: run auth log modes such as auto, full, and quick against a chosen mitmproxy log file. File picker, mode radio, output path. Progress with step logs.
- **Login**: method picker such as selenium, headless requests, hybrid with an optional keep open flag.
- **Logout** and **Config**: show and optionally edit key paths with validation.
- **Email 2FA**: setup that creates or edits the email template file, test connectivity, and wait for code with timeout. Provide an IMAP settings editor that writes the same format as the CLI expects.

### 4.7 Settings
- Global `Proxy host:port` and `Local backend URL` that map to CLI global `--proxy` and `--local`. Changes apply app wide.
- Defaults for preferred store, default export folder, and estimation defaults.
- Logging level and a toggle to show the live log panel.

### 4.8 Log panel
- Collapsible pane at the bottom with structured log lines and filter by level. Respect `-v`, `-vv`, and `-vvv` semantics.

## 5. UX and interaction details
- Keyboard friendly navigation and accelerators for primary actions.
- Non blocking operations with clear busy indicators and cancel when the backend allows it.
- File dialogs remember the last used directory.
- Errors show actionable messages and a button to copy details to the clipboard.

## 6. Data and files
- Respect CLI file conventions.
  - Credentials live at `~/.config/meijer/login.txt` unless overridden.
  - Email 2FA template file in the same config directory with fields for server, port, username, password, and SSL. Use the same plain text format the CLI expects.
- Exports support CSV, Excel, JSON, and TXT with the same schema and column order that the CLI produces.
- If a local Flask backend URL is set, route requests through it and show that state in the status bar.

## 7. Security and privacy
- Do not store plaintext passwords except in the same files and formats the CLI already uses and only when the user explicitly saves them.
- Mask secrets in the UI by default with a reveal toggle.
- Consider OS keychain integration later. Keep parity with current CLI behavior for v1.

## 8. Testing and diagnostics
- Unit tests for controllers and formatters with network and filesystem mocked.
- GUI smoke tests that open each panel, run a representative operation, and assert the UI remains responsive.
- A diagnostic dialog that gathers environment details, config paths, and the last 200 log lines with a Copy button.

## 9. Acceptance criteria
1. Every CLI command documented in the v2 README is reachable in the GUI with equivalent options and produces equivalent results or files.
2. Proxy and local backend settings apply to all networked actions and match CLI flags.
3. Auth log analysis works with a selected mitmproxy log and saves tokens in the same way as the CLI.
4. Email 2FA setup, test, and wait behave like the CLI including timeout handling.
5. List estimation writes CSV or Excel identical in schema to CLI output and shows the same content in the grid.
6. Long actions never freeze the UI and provide progress feedback and a cancel option when possible.

## 10. Developer notes for Cursor
- **Suggested project layout**
  ```
  wxmeijer/
    app.py                # wx.App and top level frame bootstrap
    ui/                   # Panels and dialogs
      dashboard.py
      list_panel.py
      coupons_panel.py
      stores_panel.py
      cart_panel.py
      auth_panel.py
      email2fa_panel.py
      settings_dialog.py
      log_panel.py
    controllers/          # Command controllers mirroring CLI groups
      list_controller.py
      coupons_controller.py
      stores_controller.py
      cart_controller.py
      auth_controller.py
      email2fa_controller.py
      settings_controller.py
    services/             # Wrappers around meijer library calls
      client.py           # central API client config such as proxy and base URL
      auth.py
      export.py
    models/               # Dataclasses for UI binding
    assets/
    tests/
  ```
- **UI style**: use sizers for layout and avoid absolute positions. Prefer native controls for tables, filters, and file pickers.
- **Library usage**: import the `meijer` package directly rather than spawning subprocesses. The README command list defines what to expose.

## 11. References
- Project v2 branch: https://github.com/dapperfu/python_Meijer/tree/v2
