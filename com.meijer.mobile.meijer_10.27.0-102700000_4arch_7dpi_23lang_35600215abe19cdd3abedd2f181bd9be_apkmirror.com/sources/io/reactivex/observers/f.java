package io.reactivex.observers;

import ev.C13780a;
import ev.m;
import gv.C14313a;
import io.reactivex.s;

/* loaded from: classes9.dex */
public final class f<T> implements s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final s<? super T> f138253a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f138254b;

    /* renamed from: c, reason: collision with root package name */
    Nu.b f138255c;

    /* renamed from: d, reason: collision with root package name */
    boolean f138256d;

    /* renamed from: e, reason: collision with root package name */
    C13780a<Object> f138257e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f138258f;

    public f(s<? super T> sVar) {
        this(sVar, false);
    }

    void a() {
        C13780a<Object> c13780a;
        do {
            synchronized (this) {
                try {
                    c13780a = this.f138257e;
                    if (c13780a == null) {
                        this.f138256d = false;
                        return;
                    }
                    this.f138257e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!c13780a.a(this.f138253a));
    }

    public f(s<? super T> sVar, boolean z10) {
        this.f138253a = sVar;
        this.f138254b = z10;
    }

    @Override // Nu.b
    public void dispose() {
        this.f138255c.dispose();
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f138255c.isDisposed();
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f138258f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f138258f) {
                    return;
                }
                if (!this.f138256d) {
                    this.f138258f = true;
                    this.f138256d = true;
                    this.f138253a.onComplete();
                } else {
                    C13780a<Object> c13780a = this.f138257e;
                    if (c13780a == null) {
                        c13780a = new C13780a<>(4);
                        this.f138257e = c13780a;
                    }
                    c13780a.b(m.e());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f138258f) {
            C14313a.s(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f138258f) {
                    if (this.f138256d) {
                        this.f138258f = true;
                        C13780a<Object> c13780a = this.f138257e;
                        if (c13780a == null) {
                            c13780a = new C13780a<>(4);
                            this.f138257e = c13780a;
                        }
                        Object objM = m.m(th2);
                        if (this.f138254b) {
                            c13780a.b(objM);
                        } else {
                            c13780a.d(objM);
                        }
                        return;
                    }
                    this.f138258f = true;
                    this.f138256d = true;
                    z10 = false;
                }
                if (z10) {
                    C14313a.s(th2);
                } else {
                    this.f138253a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f138258f) {
            return;
        }
        if (t10 == null) {
            this.f138255c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f138258f) {
                    return;
                }
                if (!this.f138256d) {
                    this.f138256d = true;
                    this.f138253a.onNext(t10);
                    a();
                } else {
                    C13780a<Object> c13780a = this.f138257e;
                    if (c13780a == null) {
                        c13780a = new C13780a<>(4);
                        this.f138257e = c13780a;
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
        if (Qu.d.t(this.f138255c, bVar)) {
            this.f138255c = bVar;
            this.f138253a.onSubscribe(this);
        }
    }
}
