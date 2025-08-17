package io.reactivex.observers;

import ev.h;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public abstract class c implements io.reactivex.c, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Nu.b> f138248a = new AtomicReference<>();

    protected void onStart() {
    }

    @Override // Nu.b
    public final void dispose() {
        Qu.d.a(this.f138248a);
    }

    @Override // Nu.b
    public final boolean isDisposed() {
        return this.f138248a.get() == Qu.d.DISPOSED;
    }

    @Override // io.reactivex.c, io.reactivex.i
    public final void onSubscribe(Nu.b bVar) {
        if (h.c(this.f138248a, bVar, getClass())) {
            onStart();
        }
    }
}
