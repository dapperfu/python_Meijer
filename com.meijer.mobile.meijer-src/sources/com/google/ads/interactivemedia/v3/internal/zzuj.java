package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzuj {
    private final zzrm zza;

    /* synthetic */ zzuj(boolean z10, zzrm zzrmVar, zzui zzuiVar) {
        this.zza = zzrmVar;
    }

    public final zzuu zza(Callable callable, Executor executor) {
        return new zztz(this.zza, false, executor, callable);
    }
}
