package io.reactivex.observers;

import av.C6298a;
import av.m;
import cv.C13558a;
import io.reactivex.s;

/* loaded from: classes10.dex */
public final class f<T> implements s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final s<? super T> f138895a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f138896b;

    /* renamed from: c, reason: collision with root package name */
    Ju.b f138897c;

    /* renamed from: d, reason: collision with root package name */
    boolean f138898d;

    /* renamed from: e, reason: collision with root package name */
    C6298a<Object> f138899e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f138900f;

    public f(s<? super T> sVar) {
        this(sVar, false);
    }

    void a() {
        C6298a<Object> c6298a;
        do {
            synchronized (this) {
                try {
                    c6298a = this.f138899e;
                    if (c6298a == null) {
                        this.f138898d = false;
                        return;
                    }
                    this.f138899e = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!c6298a.a(this.f138895a));
    }

    public f(s<? super T> sVar, boolean z10) {
        this.f138895a = sVar;
        this.f138896b = z10;
    }

    @Override // Ju.b
    public void dispose() {
        this.f138897c.dispose();
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f138897c.isDisposed();
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f138900f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f138900f) {
                    return;
                }
                if (!this.f138898d) {
                    this.f138900f = true;
                    this.f138898d = true;
                    this.f138895a.onComplete();
                } else {
                    C6298a<Object> c6298a = this.f138899e;
                    if (c6298a == null) {
                        c6298a = new C6298a<>(4);
                        this.f138899e = c6298a;
                    }
                    c6298a.b(m.e());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f138900f) {
            C13558a.s(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f138900f) {
                    if (this.f138898d) {
                        this.f138900f = true;
                        C6298a<Object> c6298a = this.f138899e;
                        if (c6298a == null) {
                            c6298a = new C6298a<>(4);
                            this.f138899e = c6298a;
                        }
                        Object objM = m.m(th2);
                        if (this.f138896b) {
                            c6298a.b(objM);
                        } else {
                            c6298a.d(objM);
                        }
                        return;
                    }
                    this.f138900f = true;
                    this.f138898d = true;
                    z10 = false;
                }
                if (z10) {
                    C13558a.s(th2);
                } else {
                    this.f138895a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f138900f) {
            return;
        }
        if (t10 == null) {
            this.f138897c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f138900f) {
                    return;
                }
                if (!this.f138898d) {
                    this.f138898d = true;
                    this.f138895a.onNext(t10);
                    a();
                } else {
                    C6298a<Object> c6298a = this.f138899e;
                    if (c6298a == null) {
                        c6298a = new C6298a<>(4);
                        this.f138899e = c6298a;
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
        if (Mu.d.t(this.f138897c, bVar)) {
            this.f138897c = bVar;
            this.f138895a.onSubscribe(this);
        }
    }
}
