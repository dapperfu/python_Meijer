package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzrf implements Runnable {
    final /* synthetic */ zzrb zza;
    final /* synthetic */ Runnable zzb;

    zzrf(zzrb zzrbVar, Runnable runnable) {
        this.zza = zzrbVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzrb zzrbVar = this.zza;
        Intrinsics.h(zzrbVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        zzra zzraVarZzc = zzqj.zzc(zzqj.zzd(), (zzra) zzrbVar);
        try {
            this.zzb.run();
            Unit unit = Unit.f142422a;
        } finally {
        }
    }

    public final String toString() {
        Runnable runnable = this.zzb;
        StringBuilder sb2 = new StringBuilder(runnable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(runnable);
        sb2.append("]");
        return sb2.toString();
    }
}
