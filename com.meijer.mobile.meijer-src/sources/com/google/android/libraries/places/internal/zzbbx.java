package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbbx implements zzbbi {
    private final zzbbl zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.libraries.places.internal.zzbbi
    public final boolean zza() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.libraries.places.internal.zzbbi
    public final zzbbl zzb() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbbi
    public final int zzc() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    final String zzd() {
        return this.zzb;
    }

    final Object[] zze() {
        return this.zzc;
    }

    zzbbx(zzbbl zzbblVar, String str, Object[] objArr) {
        this.zza = zzbblVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 >= 55296) {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.zzd = i10 | (cCharAt2 << i12);
                return;
            }
        }
    }
}
