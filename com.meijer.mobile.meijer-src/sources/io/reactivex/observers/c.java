package io.reactivex.observers;

import av.h;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public abstract class c implements io.reactivex.c, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Ju.b> f138890a = new AtomicReference<>();

    protected void onStart() {
    }

    @Override // Ju.b
    public final void dispose() {
        Mu.d.a(this.f138890a);
    }

    @Override // Ju.b
    public final boolean isDisposed() {
        return this.f138890a.get() == Mu.d.DISPOSED;
    }

    @Override // io.reactivex.c, io.reactivex.i
    public final void onSubscribe(Ju.b bVar) {
        if (h.c(this.f138890a, bVar, getClass())) {
            onStart();
        }
    }
}
