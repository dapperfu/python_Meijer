package ev;

import gv.C14313a;
import io.reactivex.s;
import io.reactivex.w;

/* loaded from: classes9.dex */
public enum g implements io.reactivex.g<Object>, s<Object>, io.reactivex.i<Object>, w<Object>, io.reactivex.c, pw.c, Nu.b {
    INSTANCE;

    @Override // pw.c
    public void cancel() {
    }

    @Override // Nu.b
    public void dispose() {
    }

    @Override // Nu.b
    public boolean isDisposed() {
        return true;
    }

    @Override // pw.b
    public void onComplete() {
    }

    @Override // pw.b
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.i
    public void onSuccess(Object obj) {
    }

    @Override // pw.c
    public void t(long j10) {
    }

    public static <T> s<T> a() {
        return INSTANCE;
    }

    @Override // pw.b
    public void b(pw.c cVar) {
        cVar.cancel();
    }

    @Override // pw.b
    public void onError(Throwable th2) {
        C14313a.s(th2);
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        bVar.dispose();
    }
}
