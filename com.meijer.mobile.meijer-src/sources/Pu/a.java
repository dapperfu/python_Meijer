package Pu;

import cv.C13558a;

/* loaded from: classes10.dex */
public abstract class a<T, R> implements io.reactivex.s<T>, Ou.b<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final io.reactivex.s<? super R> f27218a;

    /* renamed from: b, reason: collision with root package name */
    protected Ju.b f27219b;

    /* renamed from: c, reason: collision with root package name */
    protected Ou.b<T> f27220c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f27221d;

    /* renamed from: e, reason: collision with root package name */
    protected int f27222e;

    protected void b() {
    }

    protected boolean c() {
        return true;
    }

    @Override // Ou.f
    public void clear() {
        this.f27220c.clear();
    }

    @Override // Ju.b
    public void dispose() {
        this.f27219b.dispose();
    }

    protected final int e(int i10) {
        Ou.b<T> bVar = this.f27220c;
        if (bVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iA = bVar.a(i10);
        if (iA != 0) {
            this.f27222e = iA;
        }
        return iA;
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f27219b.isDisposed();
    }

    @Override // Ou.f
    public boolean isEmpty() {
        return this.f27220c.isEmpty();
    }

    @Override // Ou.f
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f27221d) {
            return;
        }
        this.f27221d = true;
        this.f27218a.onComplete();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f27221d) {
            C13558a.s(th2);
        } else {
            this.f27221d = true;
            this.f27218a.onError(th2);
        }
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Ju.b bVar) {
        if (Mu.d.t(this.f27219b, bVar)) {
            this.f27219b = bVar;
            if (bVar instanceof Ou.b) {
                this.f27220c = (Ou.b) bVar;
            }
            if (c()) {
                this.f27218a.onSubscribe(this);
                b();
            }
        }
    }

    public a(io.reactivex.s<? super R> sVar) {
        this.f27218a = sVar;
    }

    protected final void d(Throwable th2) {
        Ku.a.b(th2);
        this.f27219b.dispose();
        onError(th2);
    }
}
