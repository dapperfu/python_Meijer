package com.google.android.libraries.places.internal;

import Be.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzri {
    private final zzra zza;

    private zzri(zzra zzraVar) {
        this.zza = zzraVar;
    }

    public static zzri zza() {
        return new zzri(zzqj.zzb(false));
    }

    public static Runnable zzb(zzri zzriVar, Runnable runnable) {
        zzra trace = zzriVar.zza;
        p.r(trace, "Trying to propagate null trace");
        int i10 = zzrh.zza;
        Intrinsics.j(trace, "trace");
        Intrinsics.j(runnable, "runnable");
        return new zzrf(trace, runnable);
    }

    public final String toString() {
        return this.zza.toString();
    }
}
