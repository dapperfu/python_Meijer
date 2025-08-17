package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes7.dex */
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: h, reason: collision with root package name */
    private final ScheduledFuture<?> f88681h;

    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th2) {
            p.this.F(th2);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.E(v10);
        }
    }

    interface b<T> {
        void a(Throwable th2);

        void set(T t10);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f88681h.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.a
    protected void b() {
        this.f88681h.cancel(H());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f88681h.getDelay(timeUnit);
    }

    p(c<V> cVar) {
        this.f88681h = cVar.a(new a());
    }
}
