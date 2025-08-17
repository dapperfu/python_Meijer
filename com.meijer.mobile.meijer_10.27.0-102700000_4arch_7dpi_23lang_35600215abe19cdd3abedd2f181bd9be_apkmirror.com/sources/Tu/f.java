package Tu;

/* loaded from: classes9.dex */
public final class f<T> extends d<T> {
    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        this.f35451a = null;
        this.f35452b = th2;
        countDown();
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        this.f35451a = t10;
    }
}
