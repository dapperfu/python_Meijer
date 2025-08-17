package Tu;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class o<T> extends AtomicReference<Nu.b> implements io.reactivex.s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f35478a;

    /* renamed from: b, reason: collision with root package name */
    final int f35479b;

    /* renamed from: c, reason: collision with root package name */
    Su.f<T> f35480c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f35481d;

    /* renamed from: e, reason: collision with root package name */
    int f35482e;

    public void c() {
        this.f35481d = true;
    }

    public boolean a() {
        return this.f35481d;
    }

    public Su.f<T> b() {
        return this.f35480c;
    }

    @Override // io.reactivex.s
    public void onComplete() {
        this.f35478a.a(this);
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        this.f35478a.b(this, th2);
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f35482e == 0) {
            this.f35478a.c(this, t10);
        } else {
            this.f35478a.d();
        }
    }

    public o(p<T> pVar, int i10) {
        this.f35478a = pVar;
        this.f35479b = i10;
    }

    @Override // Nu.b
    public void dispose() {
        Qu.d.a(this);
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return Qu.d.b(get());
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        if (Qu.d.o(this, bVar)) {
            if (bVar instanceof Su.b) {
                Su.b bVar2 = (Su.b) bVar;
                int iA = bVar2.a(3);
                if (iA == 1) {
                    this.f35482e = iA;
                    this.f35480c = bVar2;
                    this.f35481d = true;
                    this.f35478a.a(this);
                    return;
                }
                if (iA == 2) {
                    this.f35482e = iA;
                    this.f35480c = bVar2;
                    return;
                }
            }
            this.f35480c = ev.q.b(-this.f35479b);
        }
    }
}
