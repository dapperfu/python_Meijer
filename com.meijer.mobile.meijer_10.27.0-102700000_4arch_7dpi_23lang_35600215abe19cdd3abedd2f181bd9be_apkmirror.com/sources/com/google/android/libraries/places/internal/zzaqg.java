package com.google.android.libraries.places.internal;

import Be.p;
import com.google.common.util.concurrent.q;

/* loaded from: classes6.dex */
public final class zzaqg {
    private static final zzaqg zza = new zzaqg(zzaqe.PROCEED, null, null, null, null);
    private final zzaqe zzb;
    private final q zzc;

    public static zzaqg zza() {
        return zza;
    }

    public final zzaqe zzc() {
        return this.zzb;
    }

    static {
        new zzaqg(zzaqe.DELAY_START, null, null, null, null);
    }

    public final q zzd() {
        p.w(this.zzb == zzaqe.CONTINUE_AFTER);
        return this.zzc;
    }

    private zzaqg(zzaqe zzaqeVar, zzaqf zzaqfVar, zzaqb zzaqbVar, q qVar, zzbfd zzbfdVar) {
        this.zzb = (zzaqe) p.q(zzaqeVar);
        this.zzc = qVar;
    }

    public static zzaqg zzb(q qVar) {
        p.q(qVar);
        return new zzaqg(zzaqe.CONTINUE_AFTER, null, null, qVar, null);
    }
}
