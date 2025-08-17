package com.google.android.libraries.places.internal;

import Ce.L;

/* loaded from: classes6.dex */
final class zzapc implements zzbfj {
    private final zzcbd zza;
    private final Class zzb;
    private final Class zzc;

    zzapc(zzcbd zzcbdVar, int i10, Class cls, Class cls2) {
        this.zza = zzcbdVar;
        this.zzb = cls;
        this.zzc = cls2;
    }

    @Override // com.google.android.libraries.places.internal.zzbfj
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar, zzbfe zzbfeVar) {
        try {
            L l10 = (L) this.zza.zzb();
            zzapd.zzb(zzbiuVar, this.zzb, true);
            zzapd.zzb(zzbiuVar, this.zzc, false);
            return new zzaqd(new zzapy(zzbfeVar, zzbiuVar, zzbfdVar, 2, l10));
        } catch (zzbjw e10) {
            return new zzaqm(zzbjv.zzb(e10));
        }
    }
}
