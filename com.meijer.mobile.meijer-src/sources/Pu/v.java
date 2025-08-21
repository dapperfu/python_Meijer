package Pu;

import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class v<T> implements w<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Ju.b> f27265a;

    /* renamed from: b, reason: collision with root package name */
    final w<? super T> f27266b;

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        this.f27266b.onError(th2);
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onSubscribe(Ju.b bVar) {
        Mu.d.e(this.f27265a, bVar);
    }

    @Override // io.reactivex.w, io.reactivex.i
    public void onSuccess(T t10) {
        this.f27266b.onSuccess(t10);
    }

    public v(AtomicReference<Ju.b> atomicReference, w<? super T> wVar) {
        this.f27265a = atomicReference;
        this.f27266b = wVar;
    }
}
