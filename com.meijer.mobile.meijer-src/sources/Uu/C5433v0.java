package Uu;

import cv.C13558a;

/* renamed from: Uu.v0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5433v0<R, T> extends AbstractC5375a<T, R> {
    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        try {
            throw null;
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            Ku.a.b(th2);
            C13558a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public C5433v0(io.reactivex.q<T> qVar, io.reactivex.p<? extends R, ? super T> pVar) {
        super(qVar);
    }
}
