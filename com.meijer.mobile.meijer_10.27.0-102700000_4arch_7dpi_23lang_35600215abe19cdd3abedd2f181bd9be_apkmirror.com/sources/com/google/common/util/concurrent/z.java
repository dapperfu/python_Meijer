package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC11289a;

/* loaded from: classes6.dex */
public final class z<V> extends AbstractC11289a.j<V> {
    public static <V> z<V> a() {
        return new z<>();
    }

    private z() {
    }

    @Override // com.google.common.util.concurrent.AbstractC11289a
    public boolean set(V v10) {
        return super.set(v10);
    }

    @Override // com.google.common.util.concurrent.AbstractC11289a
    public boolean setException(Throwable th2) {
        return super.setException(th2);
    }

    @Override // com.google.common.util.concurrent.AbstractC11289a
    public boolean setFuture(q<? extends V> qVar) {
        return super.setFuture(qVar);
    }
}
