package io.reactivex.observers;

import cv.C13558a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.s;

/* loaded from: classes10.dex */
public final class e<T> implements s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final s<? super T> f138892a;

    /* renamed from: b, reason: collision with root package name */
    Ju.b f138893b;

    /* renamed from: c, reason: collision with root package name */
    boolean f138894c;

    void b() {
        this.f138894c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f138892a.onSubscribe(Mu.e.INSTANCE);
            try {
                this.f138892a.onError(nullPointerException);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                C13558a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Ku.a.b(th3);
            C13558a.s(new CompositeException(nullPointerException, th3));
        }
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f138892a.onSubscribe(Mu.e.INSTANCE);
            try {
                this.f138892a.onError(nullPointerException);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                C13558a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Ku.a.b(th3);
            C13558a.s(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // Ju.b
    public void dispose() {
        this.f138893b.dispose();
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this.f138893b.isDisposed();
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f138894c) {
            return;
        }
        this.f138894c = true;
        if (this.f138893b == null) {
            a();
            return;
        }
        try {
            this.f138892a.onComplete();
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f138894c) {
            C13558a.s(th2);
            return;
        }
        this.f138894c = true;
        if (this.f138893b != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f138892a.onError(th2);
                return;
            } catch (Throwable th3) {
                Ku.a.b(th3);
                C13558a.s(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f138892a.onSubscribe(Mu.e.INSTANCE);
            try {
                this.f138892a.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                Ku.a.b(th4);
                C13558a.s(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            Ku.a.b(th5);
            C13558a.s(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f138894c) {
            return;
        }
        if (this.f138893b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f138893b.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                Ku.a.b(th2);
                onError(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f138892a.onNext(t10);
        } catch (Throwable th3) {
            Ku.a.b(th3);
            try {
                this.f138893b.dispose();
                onError(th3);
            } catch (Throwable th4) {
                Ku.a.b(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        if (Mu.d.t(this.f138893b, bVar)) {
            this.f138893b = bVar;
            try {
                this.f138892a.onSubscribe(this);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f138894c = true;
                try {
                    bVar.dispose();
                    C13558a.s(th2);
                } catch (Throwable th3) {
                    Ku.a.b(th3);
                    C13558a.s(new CompositeException(th2, th3));
                }
            }
        }
    }

    public e(s<? super T> sVar) {
        this.f138892a = sVar;
    }
}
