package Tu;

import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class v<T> implements w<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<Nu.b> f35493a;

    /* renamed from: b, reason: collision with root package name */
    final w<? super T> f35494b;

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        this.f35494b.onError(th2);
    }

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onSubscribe(Nu.b bVar) {
        Qu.d.e(this.f35493a, bVar);
    }

    @Override // io.reactivex.w, io.reactivex.i
    public void onSuccess(T t10) {
        this.f35494b.onSuccess(t10);
    }

    public v(AtomicReference<Nu.b> atomicReference, w<? super T> wVar) {
        this.f35493a = atomicReference;
        this.f35494b = wVar;
    }
}
