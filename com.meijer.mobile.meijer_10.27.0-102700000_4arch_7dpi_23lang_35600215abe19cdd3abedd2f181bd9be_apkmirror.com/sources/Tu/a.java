package Tu;

import gv.C14313a;

/* loaded from: classes9.dex */
public abstract class a<T, R> implements io.reactivex.s<T>, Su.b<R> {

    /* renamed from: a, reason: collision with root package name */
    protected final io.reactivex.s<? super R> f35446a;

    /* renamed from: b, reason: collision with root package name */
    protected Nu.b f35447b;

    /* renamed from: c, reason: collision with root package name */
    protected Su.b<T> f35448c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f35449d;

    /* renamed from: e, reason: collision with root package name */
    protected int f35450e;

    protected void b() {
    }

    protected boolean c() {
        return true;
    }

    @Override // Su.f
    public void clear() {
        this.f35448c.clear();
    }

    @Override // Nu.b
    public void dispose() {
        this.f35447b.dispose();
    }

    protected final int e(int i10) {
        Su.b<T> bVar = this.f35448c;
        if (bVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iA = bVar.a(i10);
        if (iA != 0) {
            this.f35450e = iA;
        }
        return iA;
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f35447b.isDisposed();
    }

    @Override // Su.f
    public boolean isEmpty() {
        return this.f35448c.isEmpty();
    }

    @Override // Su.f
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f35449d) {
            return;
        }
        this.f35449d = true;
        this.f35446a.onComplete();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f35449d) {
            C14313a.s(th2);
        } else {
            this.f35449d = true;
            this.f35446a.onError(th2);
        }
    }

    @Override // io.reactivex.s
    public final void onSubscribe(Nu.b bVar) {
        if (Qu.d.t(this.f35447b, bVar)) {
            this.f35447b = bVar;
            if (bVar instanceof Su.b) {
                this.f35448c = (Su.b) bVar;
            }
            if (c()) {
                this.f35446a.onSubscribe(this);
                b();
            }
        }
    }

    public a(io.reactivex.s<? super R> sVar) {
        this.f35446a = sVar;
    }

    protected final void d(Throwable th2) {
        Ou.a.b(th2);
        this.f35447b.dispose();
        onError(th2);
    }
}
