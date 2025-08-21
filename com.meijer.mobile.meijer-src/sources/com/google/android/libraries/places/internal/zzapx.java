package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
final class zzapx {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private boolean zzd = false;
    private final int zze;

    private zzapx(int i10, int i11, int i12, int i13) {
        this.zza = i10;
        this.zze = i11;
        this.zzb = i12;
        this.zzc = i13;
    }

    static zzapx zzb(int i10) {
        return new zzapx(i10, 1, 0, 0);
    }

    final void zza() {
        this.zzd = true;
    }

    final /* synthetic */ int zzd() {
        return this.zza;
    }

    final /* synthetic */ int zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ int zzg() {
        return this.zze;
    }

    final zzapx zzc() {
        int i10 = this.zze;
        p.x(!(i10 == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i10 == 3) {
            return new zzapx(this.zza, 4, this.zzb, this.zzc);
        }
        if (i10 == 1 && this.zzd) {
            int i11 = this.zza;
            int i12 = this.zzb;
            return new zzapx(i11, 2, i12, i12);
        }
        int i13 = this.zzb;
        int i14 = i13 + 1;
        int i15 = this.zza;
        int i16 = i14 >= i15 ? 3 : 1;
        int i17 = this.zzc;
        if (i14 < i15) {
            i13 = i14;
        }
        return new zzapx(i15, i16, i13, i17);
    }
}
