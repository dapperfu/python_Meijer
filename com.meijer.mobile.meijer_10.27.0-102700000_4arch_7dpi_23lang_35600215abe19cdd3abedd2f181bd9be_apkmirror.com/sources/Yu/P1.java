package Yu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class P1<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.s<? super T> f40952a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Nu.b> f40953b = new AtomicReference<>();

    @Override // Nu.b
    public void dispose() {
        Qu.d.a(this.f40953b);
        Qu.d.a(this);
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f40953b.get() == Qu.d.DISPOSED;
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        this.f40952a.onNext(t10);
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        if (Qu.d.o(this.f40953b, bVar)) {
            this.f40952a.onSubscribe(this);
        }
    }

    public P1(io.reactivex.s<? super T> sVar) {
        this.f40952a = sVar;
    }

    public void a(Nu.b bVar) {
        Qu.d.m(this, bVar);
    }

    @Override // io.reactivex.s
    public void onComplete() {
        dispose();
        this.f40952a.onComplete();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        dispose();
        this.f40952a.onError(th2);
    }
}
