package Ru;

import io.reactivex.l;
import io.reactivex.s;

/* loaded from: classes10.dex */
public final class b<T> extends io.reactivex.f<T> {

    /* renamed from: b, reason: collision with root package name */
    private final l<T> f34038b;

    static final class a<T> implements s<T>, lw.c {

        /* renamed from: a, reason: collision with root package name */
        final lw.b<? super T> f34039a;

        /* renamed from: b, reason: collision with root package name */
        Ju.b f34040b;

        @Override // lw.c
        public void t(long j10) {
        }

        @Override // lw.c
        public void cancel() {
            this.f34040b.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f34039a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f34039a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f34039a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f34040b = bVar;
            this.f34039a.b(this);
        }

        a(lw.b<? super T> bVar) {
            this.f34039a = bVar;
        }
    }

    @Override // io.reactivex.f
    protected void h(lw.b<? super T> bVar) {
        this.f34038b.subscribe(new a(bVar));
    }

    public b(l<T> lVar) {
        this.f34038b = lVar;
    }
}
