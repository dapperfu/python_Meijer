package io.reactivex.observers;

import av.h;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public abstract class d<T> implements s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Ju.b> f138891a = new AtomicReference<>();

    protected void a() {
    }

    @Override // Ju.b
    public final void dispose() {
        Mu.d.a(this.f138891a);
    }

    @Override // Ju.b
    public final boolean isDisposed() {
        return this.f138891a.get() == Mu.d.DISPOSED;
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Ju.b bVar) {
        if (h.c(this.f138891a, bVar, getClass())) {
            a();
        }
    }
}
