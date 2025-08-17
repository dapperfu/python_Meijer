package Yu;

import java.util.ArrayDeque;

/* renamed from: Yu.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5462i1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f41299b;

    /* renamed from: Yu.i1$a */
    static final class a<T> extends ArrayDeque<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41300a;

        /* renamed from: b, reason: collision with root package name */
        final int f41301b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41302c;

        @Override // Nu.b
        public void dispose() {
            this.f41302c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41302c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41300a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41300a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41301b == size()) {
                this.f41300a.onNext(poll());
            }
            offer(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41302c, bVar)) {
                this.f41302c = bVar;
                this.f41300a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, int i10) {
            super(i10);
            this.f41300a = sVar;
            this.f41301b = i10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41299b));
    }

    public C5462i1(io.reactivex.q<T> qVar, int i10) {
        super(qVar);
        this.f41299b = i10;
    }
}
