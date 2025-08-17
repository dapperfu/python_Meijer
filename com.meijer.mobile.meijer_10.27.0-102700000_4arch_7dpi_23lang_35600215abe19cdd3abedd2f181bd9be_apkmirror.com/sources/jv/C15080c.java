package jv;

import ev.C13780a;
import ev.m;
import gv.C14313a;
import io.reactivex.s;

/* renamed from: jv.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C15080c<T> extends AbstractC15082e<T> implements C13780a.InterfaceC2062a<Object> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC15082e<T> f141085a;

    /* renamed from: b, reason: collision with root package name */
    boolean f141086b;

    /* renamed from: c, reason: collision with root package name */
    C13780a<Object> f141087c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f141088d;

    void d() {
        C13780a<Object> c13780a;
        while (true) {
            synchronized (this) {
                try {
                    c13780a = this.f141087c;
                    if (c13780a == null) {
                        this.f141086b = false;
                        return;
                    }
                    this.f141087c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c13780a.c(this);
        }
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f141088d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f141088d) {
                    return;
                }
                this.f141088d = true;
                if (!this.f141086b) {
                    this.f141086b = true;
                    this.f141085a.onComplete();
                    return;
                }
                C13780a<Object> c13780a = this.f141087c;
                if (c13780a == null) {
                    c13780a = new C13780a<>(4);
                    this.f141087c = c13780a;
                }
                c13780a.b(m.e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f141088d) {
            C14313a.s(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f141088d) {
                    this.f141088d = true;
                    if (this.f141086b) {
                        C13780a<Object> c13780a = this.f141087c;
                        if (c13780a == null) {
                            c13780a = new C13780a<>(4);
                            this.f141087c = c13780a;
                        }
                        c13780a.d(m.m(th2));
                        return;
                    }
                    this.f141086b = true;
                    z10 = false;
                }
                if (z10) {
                    C14313a.s(th2);
                } else {
                    this.f141085a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f141088d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f141088d) {
                    return;
                }
                if (!this.f141086b) {
                    this.f141086b = true;
                    this.f141085a.onNext(t10);
                    d();
                } else {
                    C13780a<Object> c13780a = this.f141087c;
                    if (c13780a == null) {
                        c13780a = new C13780a<>(4);
                        this.f141087c = c13780a;
                    }
                    c13780a.b(m.z(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        boolean z10 = true;
        if (!this.f141088d) {
            synchronized (this) {
                try {
                    if (!this.f141088d) {
                        if (this.f141086b) {
                            C13780a<Object> c13780a = this.f141087c;
                            if (c13780a == null) {
                                c13780a = new C13780a<>(4);
                                this.f141087c = c13780a;
                            }
                            c13780a.b(m.l(bVar));
                            return;
                        }
                        this.f141086b = true;
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            bVar.dispose();
        } else {
            this.f141085a.onSubscribe(bVar);
            d();
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        this.f141085a.subscribe(sVar);
    }

    @Override // ev.C13780a.InterfaceC2062a, Pu.q
    public boolean test(Object obj) {
        return m.b(obj, this.f141085a);
    }

    C15080c(AbstractC15082e<T> abstractC15082e) {
        this.f141085a = abstractC15082e;
    }
}
