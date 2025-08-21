package Pu;

import cv.C13558a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class j<T> extends AtomicReference<Ju.b> implements w<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final Lu.g<? super T> f27235a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.g<? super Throwable> f27236b;

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onError(Throwable th2) {
        lazySet(Mu.d.DISPOSED);
        try {
            this.f27236b.accept(th2);
        } catch (Throwable th3) {
            Ku.a.b(th3);
            C13558a.s(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.w, io.reactivex.i
    public void onSuccess(T t10) {
        lazySet(Mu.d.DISPOSED);
        try {
            this.f27235a.accept(t10);
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
        }
    }

    public j(Lu.g<? super T> gVar, Lu.g<? super Throwable> gVar2) {
        this.f27235a = gVar;
        this.f27236b = gVar2;
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

    @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
    public void onSubscribe(Ju.b bVar) {
        Mu.d.o(this, bVar);
    }
}
