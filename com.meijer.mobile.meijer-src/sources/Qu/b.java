package Qu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class b extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final Lu.a f31453a;

    public b(Lu.a aVar) {
        this.f31453a = aVar;
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        Ju.b bVarB = Ju.c.b();
        cVar.onSubscribe(bVarB);
        try {
            this.f31453a.run();
            if (!bVarB.isDisposed()) {
                cVar.onComplete();
            }
        } catch (Throwable th2) {
            Ku.a.b(th2);
            if (!bVarB.isDisposed()) {
                cVar.onError(th2);
            } else {
                C13558a.s(th2);
            }
        }
    }
}
