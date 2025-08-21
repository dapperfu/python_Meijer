package av;

import cv.C13558a;
import io.reactivex.s;
import io.reactivex.w;

/* loaded from: classes10.dex */
public enum g implements io.reactivex.g<Object>, s<Object>, io.reactivex.i<Object>, w<Object>, io.reactivex.c, lw.c, Ju.b {
    INSTANCE;

    @Override // lw.c
    public void cancel() {
    }

    @Override // Ju.b
    public void dispose() {
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return true;
    }

    @Override // lw.b
    public void onComplete() {
    }

    @Override // lw.b
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.i
    public void onSuccess(Object obj) {
    }

    @Override // lw.c
    public void t(long j10) {
    }

    public static <T> s<T> a() {
        return INSTANCE;
    }

    @Override // lw.b
    public void b(lw.c cVar) {
        cVar.cancel();
    }

    @Override // lw.b
    public void onError(Throwable th2) {
        C13558a.s(th2);
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        bVar.dispose();
    }
}
