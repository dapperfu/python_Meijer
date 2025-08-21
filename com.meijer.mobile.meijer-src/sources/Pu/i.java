package Pu;

import cv.C13558a;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class i extends AtomicReference<Ju.b> implements io.reactivex.c, Ju.b, Lu.g<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    final Lu.g<? super Throwable> f27233a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.a f27234b;

    @Override // Lu.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        C13558a.s(new OnErrorNotImplementedException(th2));
    }

    @Override // io.reactivex.c, io.reactivex.i
    public void onComplete() {
        try {
            this.f27234b.run();
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
        }
        lazySet(Mu.d.DISPOSED);
    }

    @Override // io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        try {
            this.f27233a.accept(th2);
        } catch (Throwable th3) {
            Ku.a.b(th3);
            C13558a.s(th3);
        }
        lazySet(Mu.d.DISPOSED);
    }

    public i(Lu.g<? super Throwable> gVar, Lu.a aVar) {
        this.f27233a = gVar;
        this.f27234b = aVar;
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

    @Override // io.reactivex.c, io.reactivex.i
    public void onSubscribe(Ju.b bVar) {
        Mu.d.o(this, bVar);
    }
}
