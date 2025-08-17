package io.reactivex.observers;

import ev.h;
import io.reactivex.s;

/* loaded from: classes9.dex */
public abstract class b<T> implements s<T> {

    /* renamed from: a, reason: collision with root package name */
    private Nu.b f138247a;

    protected void a() {
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Nu.b bVar) {
        if (h.d(this.f138247a, bVar, getClass())) {
            this.f138247a = bVar;
            a();
        }
    }
}
