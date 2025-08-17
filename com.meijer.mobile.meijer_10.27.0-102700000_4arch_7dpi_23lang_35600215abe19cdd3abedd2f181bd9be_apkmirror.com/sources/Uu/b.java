package Uu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class b extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final Pu.a f36336a;

    public b(Pu.a aVar) {
        this.f36336a = aVar;
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        Nu.b bVarB = Nu.c.b();
        cVar.onSubscribe(bVarB);
        try {
            this.f36336a.run();
            if (!bVarB.isDisposed()) {
                cVar.onComplete();
            }
        } catch (Throwable th2) {
            Ou.a.b(th2);
            if (!bVarB.isDisposed()) {
                cVar.onError(th2);
            } else {
                C14313a.s(th2);
            }
        }
    }
}
