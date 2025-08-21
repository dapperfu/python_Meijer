package Mu;

import io.reactivex.s;
import io.reactivex.w;

/* loaded from: classes10.dex */
public enum e implements Ou.b<Object> {
    INSTANCE,
    NEVER;

    @Override // Ou.f
    public void clear() {
    }

    @Override // Ju.b
    public void dispose() {
    }

    @Override // Ou.f
    public boolean isEmpty() {
        return true;
    }

    @Override // Ou.f
    public Object poll() throws Exception {
        return null;
    }

    public static void b(io.reactivex.c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onComplete();
    }

    public static void e(s<?> sVar) {
        sVar.onSubscribe(INSTANCE);
        sVar.onComplete();
    }

    public static void l(Throwable th2, io.reactivex.c cVar) {
        cVar.onSubscribe(INSTANCE);
        cVar.onError(th2);
    }

    public static void m(Throwable th2, s<?> sVar) {
        sVar.onSubscribe(INSTANCE);
        sVar.onError(th2);
    }

    public static void o(Throwable th2, w<?> wVar) {
        wVar.onSubscribe(INSTANCE);
        wVar.onError(th2);
    }

    @Override // Ou.c
    public int a(int i10) {
        return i10 & 2;
    }

    @Override // Ju.b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // Ou.f
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
