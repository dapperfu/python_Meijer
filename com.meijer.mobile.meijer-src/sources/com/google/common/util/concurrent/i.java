package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public abstract class i<V> extends h<V> implements q<V> {

    public static abstract class a<V> extends i<V> {

        /* renamed from: a, reason: collision with root package name */
        private final q<V> f88935a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.h
        /* renamed from: t, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final q<V> b() {
            return this.f88935a;
        }

        protected a(q<V> qVar) {
            this.f88935a = (q) De.p.q(qVar);
        }
    }

    /* renamed from: t */
    protected abstract q<? extends V> a();

    protected i() {
    }

    @Override // com.google.common.util.concurrent.q
    public void addListener(Runnable runnable, Executor executor) {
        a().addListener(runnable, executor);
    }
}
