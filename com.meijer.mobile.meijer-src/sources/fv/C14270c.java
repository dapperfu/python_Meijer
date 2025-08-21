package fv;

import av.C6298a;
import av.m;
import cv.C13558a;
import io.reactivex.s;

/* renamed from: fv.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C14270c<T> extends AbstractC14272e<T> implements C6298a.InterfaceC1178a<Object> {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC14272e<T> f133689a;

    /* renamed from: b, reason: collision with root package name */
    boolean f133690b;

    /* renamed from: c, reason: collision with root package name */
    C6298a<Object> f133691c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f133692d;

    void d() {
        C6298a<Object> c6298a;
        while (true) {
            synchronized (this) {
                try {
                    c6298a = this.f133691c;
                    if (c6298a == null) {
                        this.f133690b = false;
                        return;
                    }
                    this.f133691c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c6298a.c(this);
        }
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f133692d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f133692d) {
                    return;
                }
                this.f133692d = true;
                if (!this.f133690b) {
                    this.f133690b = true;
                    this.f133689a.onComplete();
                    return;
                }
                C6298a<Object> c6298a = this.f133691c;
                if (c6298a == null) {
                    c6298a = new C6298a<>(4);
                    this.f133691c = c6298a;
                }
                c6298a.b(m.e());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f133692d) {
            C13558a.s(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f133692d) {
                    this.f133692d = true;
                    if (this.f133690b) {
                        C6298a<Object> c6298a = this.f133691c;
                        if (c6298a == null) {
                            c6298a = new C6298a<>(4);
                            this.f133691c = c6298a;
                        }
                        c6298a.d(m.m(th2));
                        return;
                    }
                    this.f133690b = true;
                    z10 = false;
                }
                if (z10) {
                    C13558a.s(th2);
                } else {
                    this.f133689a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f133692d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f133692d) {
                    return;
                }
                if (!this.f133690b) {
                    this.f133690b = true;
                    this.f133689a.onNext(t10);
                    d();
                } else {
                    C6298a<Object> c6298a = this.f133691c;
                    if (c6298a == null) {
                        c6298a = new C6298a<>(4);
                        this.f133691c = c6298a;
                    }
                    c6298a.b(m.z(t10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        boolean z10 = true;
        if (!this.f133692d) {
            synchronized (this) {
                try {
                    if (!this.f133692d) {
                        if (this.f133690b) {
                            C6298a<Object> c6298a = this.f133691c;
                            if (c6298a == null) {
                                c6298a = new C6298a<>(4);
                                this.f133691c = c6298a;
                            }
                            c6298a.b(m.l(bVar));
                            return;
                        }
                        this.f133690b = true;
                        z10 = false;
                    }
                } finally {
                }
            }
        }
        if (z10) {
            bVar.dispose();
        } else {
            this.f133689a.onSubscribe(bVar);
            d();
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        this.f133689a.subscribe(sVar);
    }

    @Override // av.C6298a.InterfaceC1178a, Lu.q
    public boolean test(Object obj) {
        return m.b(obj, this.f133689a);
    }

    C14270c(AbstractC14272e<T> abstractC14272e) {
        this.f133689a = abstractC14272e;
    }
}
