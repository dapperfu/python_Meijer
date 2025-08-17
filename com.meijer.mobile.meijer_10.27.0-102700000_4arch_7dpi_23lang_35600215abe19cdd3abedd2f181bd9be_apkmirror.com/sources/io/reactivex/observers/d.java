package io.reactivex.observers;

import ev.h;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public abstract class d<T> implements s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Nu.b> f138249a = new AtomicReference<>();

    protected void a() {
    }

    @Override // Nu.b
    public final void dispose() {
        Qu.d.a(this.f138249a);
    }

    @Override // Nu.b
    public final boolean isDisposed() {
        return this.f138249a.get() == Qu.d.DISPOSED;
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Nu.b bVar) {
        if (h.c(this.f138249a, bVar, getClass())) {
            a();
        }
    }
}
