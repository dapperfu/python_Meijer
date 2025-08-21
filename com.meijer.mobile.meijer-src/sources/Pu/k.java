package Pu;

import cv.C13558a;

/* loaded from: classes10.dex */
public class k<T> extends b<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final io.reactivex.s<? super T> f27237a;

    /* renamed from: b, reason: collision with root package name */
    protected T f27238b;

    @Override // Ou.c
    public final int a(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // Ju.b
    public void dispose() {
        set(4);
        this.f27238b = null;
    }

    @Override // Ou.f
    public final void clear() {
        lazySet(32);
        this.f27238b = null;
    }

    public k(io.reactivex.s<? super T> sVar) {
        this.f27237a = sVar;
    }

    public final void b() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f27237a.onComplete();
    }

    public final void c(T t10) {
        int i10 = get();
        if ((i10 & 54) == 0) {
            io.reactivex.s<? super T> sVar = this.f27237a;
            if (i10 == 8) {
                this.f27238b = t10;
                lazySet(16);
                sVar.onNext(null);
            } else {
                lazySet(2);
                sVar.onNext(t10);
            }
            if (get() != 4) {
                sVar.onComplete();
            }
        }
    }

    public final void d(Throwable th2) {
        if ((get() & 54) != 0) {
            C13558a.s(th2);
        } else {
            lazySet(2);
            this.f27237a.onError(th2);
        }
    }

    @Override // Ju.b
    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // Ou.f
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // Ou.f
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f27238b;
        this.f27238b = null;
        lazySet(32);
        return t10;
    }
}
