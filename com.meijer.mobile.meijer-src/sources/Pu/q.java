package Pu;

import cv.C13558a;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class q<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final Lu.g<? super T> f27255a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.g<? super Throwable> f27256b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.a f27257c;

    /* renamed from: d, reason: collision with root package name */
    final Lu.g<? super Ju.b> f27258d;

    public q(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2, Lu.a aVar, Lu.g<? super Ju.b> gVar3) {
        this.f27255a = gVar;
        this.f27256b = gVar2;
        this.f27257c = aVar;
        this.f27258d = gVar3;
    }

    @Override // Ju.b
    public void dispose() {
        Mu.d.a(this);
    }

    @Override // Ju.b
    public boolean isDisposed() {
        if (get() == Mu.d.DISPOSED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (!isDisposed()) {
            lazySet(Mu.d.DISPOSED);
            try {
                this.f27257c.run();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                C13558a.s(th2);
            }
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (!isDisposed()) {
            lazySet(Mu.d.DISPOSED);
            try {
                this.f27256b.accept(th2);
                return;
            } catch (Throwable th3) {
                Ku.a.b(th3);
                C13558a.s(new CompositeException(th2, th3));
                return;
            }
        }
        C13558a.s(th2);
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (!isDisposed()) {
            try {
                this.f27255a.accept(t10);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                get().dispose();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        if (Mu.d.o(this, bVar)) {
            try {
                this.f27258d.accept(this);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }
}
