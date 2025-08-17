package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public abstract class Hj0 extends Fj0 implements com.google.common.util.concurrent.q {
    protected Hj0() {
    }

    protected abstract com.google.common.util.concurrent.q w();

    @Override // com.google.common.util.concurrent.q
    public final void addListener(Runnable runnable, Executor executor) {
        w().addListener(runnable, executor);
    }
}
