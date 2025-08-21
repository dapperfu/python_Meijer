package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.u;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class zzapw implements Executor {
    private volatile Executor zza;

    public zzapw(Executor executor) {
        this.zza = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final void zza() {
        this.zza = u.a();
    }
}
