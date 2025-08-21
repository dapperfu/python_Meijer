package com.google.android.libraries.places.internal;

import De.p;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class zzbjc {
    private zzbjx zza = zzbjx.zza(Collections.EMPTY_LIST);
    private final zzbez zzb = zzbez.zza;
    private zzbiz zzc;

    public final zzbjc zzb(zzbiz zzbizVar) {
        this.zzc = zzbizVar;
        return this;
    }

    public final zzbjc zza(zzbjx zzbjxVar) {
        this.zza = (zzbjx) p.r(zzbjxVar, "StatusOr addresses cannot be null.");
        return this;
    }

    public final zzbjd zzc() {
        return new zzbjd(this.zza, this.zzb, this.zzc);
    }

    zzbjc() {
    }
}
