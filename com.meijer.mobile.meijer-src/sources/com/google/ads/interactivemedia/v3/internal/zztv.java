package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zztv extends zzts {
    private zztv() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzts
    final int zza(zztw zztwVar) {
        int i10;
        synchronized (zztwVar) {
            i10 = zztwVar.remaining - 1;
            zztwVar.remaining = i10;
        }
        return i10;
    }

    /* synthetic */ zztv(zztu zztuVar) {
        super(null);
    }
}
