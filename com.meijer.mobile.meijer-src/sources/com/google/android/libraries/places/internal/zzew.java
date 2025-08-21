package com.google.android.libraries.places.internal;

import Ee.L;

/* loaded from: classes6.dex */
public final class zzew implements zzbep {
    private final zzbes zza;

    private zzew(zzbes zzbesVar) {
        this.zza = zzbesVar;
    }

    public static zzew zzc(zzbes zzbesVar) {
        return new zzew(zzbesVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final L zzb() {
        L lS = L.s(((zzbev) this.zza).zzb());
        zzber.zza(lS);
        return lS;
    }
}
