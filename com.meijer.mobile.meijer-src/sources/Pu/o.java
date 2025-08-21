package Pu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class o<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f27250a;

    /* renamed from: b, reason: collision with root package name */
    final int f27251b;

    /* renamed from: c, reason: collision with root package name */
    Ou.f<T> f27252c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f27253d;

    /* renamed from: e, reason: collision with root package name */
    int f27254e;

    public void c() {
        this.f27253d = true;
    }

    public boolean a() {
        return this.f27253d;
    }

    public Ou.f<T> b() {
        return this.f27252c;
    }

    @Override // io.reactivex.s
    public void onComplete() {
        this.f27250a.a(this);
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        this.f27250a.d(this, th2);
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f27254e == 0) {
            this.f27250a.c(this, t10);
        } else {
            this.f27250a.b();
        }
    }

    public o(p<T> pVar, int i10) {
        this.f27250a = pVar;
        this.f27251b = i10;
    }

    @Override // Ju.b
    public void dispose() {
        Mu.d.a(this);
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return Mu.d.b(get());
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        if (Mu.d.o(this, bVar)) {
            if (bVar instanceof Ou.b) {
                Ou.b bVar2 = (Ou.b) bVar;
                int iA = bVar2.a(3);
                if (iA == 1) {
                    this.f27254e = iA;
                    this.f27252c = bVar2;
                    this.f27253d = true;
                    this.f27250a.a(this);
                    return;
                }
                if (iA == 2) {
                    this.f27254e = iA;
                    this.f27252c = bVar2;
                    return;
                }
            }
            this.f27252c = av.q.b(-this.f27251b);
        }
    }
}
