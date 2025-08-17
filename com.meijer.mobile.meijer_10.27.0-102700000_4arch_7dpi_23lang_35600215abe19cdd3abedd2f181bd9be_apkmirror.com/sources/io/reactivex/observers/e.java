package io.reactivex.observers;

import gv.C14313a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.s;

/* loaded from: classes9.dex */
public final class e<T> implements s<T>, Nu.b {

    /* renamed from: a, reason: collision with root package name */
    final s<? super T> f138250a;

    /* renamed from: b, reason: collision with root package name */
    Nu.b f138251b;

    /* renamed from: c, reason: collision with root package name */
    boolean f138252c;

    void b() {
        this.f138252c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f138250a.onSubscribe(Qu.e.INSTANCE);
            try {
                this.f138250a.onError(nullPointerException);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                C14313a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Ou.a.b(th3);
            C14313a.s(new CompositeException(nullPointerException, th3));
        }
    }

    void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f138250a.onSubscribe(Qu.e.INSTANCE);
            try {
                this.f138250a.onError(nullPointerException);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                C14313a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Ou.a.b(th3);
            C14313a.s(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // Nu.b
    public void dispose() {
        this.f138251b.dispose();
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return this.f138251b.isDisposed();
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f138252c) {
            return;
        }
        this.f138252c = true;
        if (this.f138251b == null) {
            a();
            return;
        }
        try {
            this.f138250a.onComplete();
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f138252c) {
            C14313a.s(th2);
            return;
        }
        this.f138252c = true;
        if (this.f138251b != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f138250a.onError(th2);
                return;
            } catch (Throwable th3) {
                Ou.a.b(th3);
                C14313a.s(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f138250a.onSubscribe(Qu.e.INSTANCE);
            try {
                this.f138250a.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                Ou.a.b(th4);
                C14313a.s(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            Ou.a.b(th5);
            C14313a.s(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f138252c) {
            return;
        }
        if (this.f138251b == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f138251b.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                Ou.a.b(th2);
                onError(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f138250a.onNext(t10);
        } catch (Throwable th3) {
            Ou.a.b(th3);
            try {
                this.f138251b.dispose();
                onError(th3);
            } catch (Throwable th4) {
                Ou.a.b(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        if (Qu.d.t(this.f138251b, bVar)) {
            this.f138251b = bVar;
            try {
                this.f138250a.onSubscribe(this);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f138252c = true;
                try {
                    bVar.dispose();
                    C14313a.s(th2);
                } catch (Throwable th3) {
                    Ou.a.b(th3);
                    C14313a.s(new CompositeException(th2, th3));
                }
            }
        }
    }

    public e(s<? super T> sVar) {
        this.f138250a = sVar;
    }
}
