package Uu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class P1<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.s<? super T> f38177a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Ju.b> f38178b = new AtomicReference<>();

    @Override // Ju.b
    public void dispose() {
        Mu.d.a(this.f38178b);
        Mu.d.a(this);
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f38178b.get() == Mu.d.DISPOSED;
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        this.f38177a.onNext(t10);
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        if (Mu.d.o(this.f38178b, bVar)) {
            this.f38177a.onSubscribe(this);
        }
    }

    public P1(io.reactivex.s<? super T> sVar) {
        this.f38177a = sVar;
    }

    public void a(Ju.b bVar) {
        Mu.d.m(this, bVar);
    }

    @Override // io.reactivex.s
    public void onComplete() {
        dispose();
        this.f38177a.onComplete();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        dispose();
        this.f38177a.onError(th2);
    }
}
