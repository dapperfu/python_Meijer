package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbyo {
    private final String[] zza;

    public final String zzb(int i10) {
        int i11 = i10 + i10;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.zza;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public final String zzc(int i10) {
        int i11 = i10 + i10 + 1;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.zza;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int iZza = zza();
        for (int i10 = 0; i10 < iZza; i10++) {
            sb2.append(zzb(i10));
            sb2.append(": ");
            sb2.append(zzc(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public final int zza() {
        return this.zza.length >> 1;
    }
}
