package Vu;

import io.reactivex.l;
import io.reactivex.s;

/* loaded from: classes9.dex */
public final class b<T> extends io.reactivex.f<T> {

    /* renamed from: b, reason: collision with root package name */
    private final l<T> f38027b;

    static final class a<T> implements s<T>, pw.c {

        /* renamed from: a, reason: collision with root package name */
        final pw.b<? super T> f38028a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f38029b;

        @Override // pw.c
        public void t(long j10) {
        }

        @Override // pw.c
        public void cancel() {
            this.f38029b.dispose();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38028a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38028a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38028a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f38029b = bVar;
            this.f38028a.b(this);
        }

        a(pw.b<? super T> bVar) {
            this.f38028a = bVar;
        }
    }

    @Override // io.reactivex.f
    protected void h(pw.b<? super T> bVar) {
        this.f38027b.subscribe(new a(bVar));
    }

    public b(l<T> lVar) {
        this.f38027b = lVar;
    }
}
