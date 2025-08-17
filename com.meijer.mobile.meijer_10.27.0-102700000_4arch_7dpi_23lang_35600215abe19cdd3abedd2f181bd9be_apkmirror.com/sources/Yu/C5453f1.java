package Yu;

import gv.C14313a;

/* renamed from: Yu.f1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5453f1<T> extends io.reactivex.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41249a;

    /* renamed from: Yu.f1$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f41250a;

        /* renamed from: b, reason: collision with root package name */
        Nu.b f41251b;

        /* renamed from: c, reason: collision with root package name */
        T f41252c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41253d;

        @Override // Nu.b
        public void dispose() {
            this.f41251b.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41251b.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41253d) {
                return;
            }
            this.f41253d = true;
            T t10 = this.f41252c;
            this.f41252c = null;
            if (t10 == null) {
                this.f41250a.onComplete();
            } else {
                this.f41250a.onSuccess(t10);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41253d) {
                C14313a.s(th2);
            } else {
                this.f41253d = true;
                this.f41250a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41253d) {
                return;
            }
            if (this.f41252c == null) {
                this.f41252c = t10;
                return;
            }
            this.f41253d = true;
            this.f41251b.dispose();
            this.f41250a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41251b, bVar)) {
                this.f41251b = bVar;
                this.f41250a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar) {
            this.f41250a = iVar;
        }
    }

    @Override // io.reactivex.h
    public void d(io.reactivex.i<? super T> iVar) {
        this.f41249a.subscribe(new a(iVar));
    }

    public C5453f1(io.reactivex.q<T> qVar) {
        this.f41249a = qVar;
    }
}
