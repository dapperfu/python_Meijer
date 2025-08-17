package Yu;

import gv.C14313a;

/* renamed from: Yu.v0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5494v0<R, T> extends AbstractC5436a<T, R> {
    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        try {
            throw null;
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ou.a.b(th2);
            C14313a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public C5494v0(io.reactivex.q<T> qVar, io.reactivex.p<? extends R, ? super T> pVar) {
        super(qVar);
    }
}
