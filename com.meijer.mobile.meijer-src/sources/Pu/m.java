package Pu;

import cv.C13558a;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class m<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, Ju.b {

    /* renamed from: a, reason: collision with root package name */
    final Lu.q<? super T> f27243a;

    /* renamed from: b, reason: collision with root package name */
    final Lu.g<? super Throwable> f27244b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.a f27245c;

    /* renamed from: d, reason: collision with root package name */
    boolean f27246d;

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f27246d) {
            return;
        }
        this.f27246d = true;
        try {
            this.f27245c.run();
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f27246d) {
            C13558a.s(th2);
            return;
        }
        this.f27246d = true;
        try {
            this.f27244b.accept(th2);
        } catch (Throwable th3) {
            Ku.a.b(th3);
            C13558a.s(new CompositeException(th2, th3));
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f27246d) {
            return;
        }
        try {
            if (this.f27243a.test(t10)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            Ku.a.b(th2);
            dispose();
            onError(th2);
        }
    }

    public m(Lu.q<? super T> qVar, Lu.g<? super Throwable> gVar, Lu.a aVar) {
        this.f27243a = qVar;
        this.f27244b = gVar;
        this.f27245c = aVar;
    }

    @Override // Ju.b
    public void dispose() {
        Mu.d.a(this);
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return Mu.d.b(get());
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        Mu.d.o(this, bVar);
    }
}
