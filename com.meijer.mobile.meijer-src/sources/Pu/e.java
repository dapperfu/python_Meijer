package Pu;

/* loaded from: classes10.dex */
public final class e<T> extends d<T> {
    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (this.f27223a == null) {
            this.f27224b = th2;
        }
        countDown();
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (this.f27223a == null) {
            this.f27223a = t10;
            this.f27225c.dispose();
            countDown();
        }
    }
}
