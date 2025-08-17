package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public abstract class zzuf extends zzud implements zzuu {
    protected zzuf() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzud
    protected /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    protected abstract zzuu zzc();

    @Override // com.google.ads.interactivemedia.v3.internal.zzuu
    public final void zzo(Runnable runnable, Executor executor) {
        zzc().zzo(runnable, executor);
    }
}
