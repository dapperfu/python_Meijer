package Tu;

/* loaded from: classes9.dex */
public final class e<T> extends d<T> {
    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f35451a == null) {
            this.f35452b = th2;
        }
        countDown();
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f35451a == null) {
            this.f35451a = t10;
            this.f35453c.dispose();
            countDown();
        }
    }
}
