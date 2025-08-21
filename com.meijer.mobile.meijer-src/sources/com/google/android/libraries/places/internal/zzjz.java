package com.google.android.libraries.places.internal;

import Ee.L;

/* loaded from: classes6.dex */
final class zzjz {
    private String description;
    private Integer distanceMeters;
    private zzb[] matchedSubstrings;
    private String placeId;
    private zza structuredFormatting;
    private String[] types;

    class zza {
        private String mainText;
        private zzb[] mainTextMatchedSubstrings;
        private String secondaryText;
        private zzb[] secondaryTextMatchedSubstrings;

        zza() {
        }

        final String zza() {
            return this.mainText;
        }

        final String zzb() {
            return this.secondaryText;
        }

        final L zzc() {
            zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            return zzbVarArr != null ? L.t(zzbVarArr) : L.x();
        }

        final L zzd() {
            zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            return zzbVarArr != null ? L.t(zzbVarArr) : L.x();
        }
    }

    class zzb {
        Integer length;
        Integer offset;

        zzb() {
        }
    }

    zzjz() {
    }

    final String zza() {
        return this.description;
    }

    final Integer zzb() {
        return this.distanceMeters;
    }

    final String zzc() {
        return this.placeId;
    }

    final zza zzd() {
        return this.structuredFormatting;
    }

    final L zze() {
        String[] strArr = this.types;
        return strArr != null ? L.t(strArr) : L.x();
    }

    final L zzf() {
        zzb[] zzbVarArr = this.matchedSubstrings;
        return zzbVarArr != null ? L.t(zzbVarArr) : L.x();
    }
}
