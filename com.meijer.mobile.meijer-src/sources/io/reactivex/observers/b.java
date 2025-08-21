package io.reactivex.observers;

import av.h;
import io.reactivex.s;

/* loaded from: classes10.dex */
public abstract class b<T> implements s<T> {

    /* renamed from: a, reason: collision with root package name */
    private Ju.b f138889a;

    protected void a() {
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Ju.b bVar) {
        if (h.d(this.f138889a, bVar, getClass())) {
            this.f138889a = bVar;
            a();
        }
    }
}
