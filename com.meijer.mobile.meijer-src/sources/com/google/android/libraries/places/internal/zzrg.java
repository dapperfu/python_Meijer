package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class zzrg implements Runnable {
    final /* synthetic */ Ref.ObjectRef zza;
    final /* synthetic */ zzra zzb;
    final /* synthetic */ Runnable zzc;

    zzrg(Ref.ObjectRef objectRef, zzra zzraVar, Runnable runnable) {
        this.zza = objectRef;
        this.zzb = zzraVar;
        this.zzc = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        if (((zzrm) this.zza.f143742a) != null) {
            throw null;
        }
        zzra zzraVar = this.zzb;
        Intrinsics.h(zzraVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        Runnable runnable = this.zzc;
        zzra zzraVarZzc = zzqj.zzc(zzqj.zzd(), zzraVar);
        try {
            runnable.run();
            Unit unit = Unit.f143329a;
        } finally {
        }
    }

    public final String toString() {
        Runnable runnable = this.zzc;
        StringBuilder sb2 = new StringBuilder(runnable.toString().length() + 14);
        sb2.append("propagating=[");
        sb2.append(runnable);
        sb2.append("]");
        return sb2.toString();
    }
}
