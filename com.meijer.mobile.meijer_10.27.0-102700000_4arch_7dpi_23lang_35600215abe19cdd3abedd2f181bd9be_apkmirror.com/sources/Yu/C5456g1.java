package Yu;

import gv.C14313a;
import java.util.NoSuchElementException;

/* renamed from: Yu.g1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5456g1<T> extends io.reactivex.u<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41263a;

    /* renamed from: b, reason: collision with root package name */
    final T f41264b;

    /* renamed from: Yu.g1$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super T> f41265a;

        /* renamed from: b, reason: collision with root package name */
        final T f41266b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41267c;

        /* renamed from: d, reason: collision with root package name */
        T f41268d;

        /* renamed from: e, reason: collision with root package name */
        boolean f41269e;

        @Override // Nu.b
        public void dispose() {
            this.f41267c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41267c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41269e) {
                return;
            }
            this.f41269e = true;
            T t10 = this.f41268d;
            this.f41268d = null;
            if (t10 == null) {
                t10 = this.f41266b;
            }
            if (t10 != null) {
                this.f41265a.onSuccess(t10);
            } else {
                this.f41265a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41269e) {
                C14313a.s(th2);
            } else {
                this.f41269e = true;
                this.f41265a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41269e) {
                return;
            }
            if (this.f41268d == null) {
                this.f41268d = t10;
                return;
            }
            this.f41269e = true;
            this.f41267c.dispose();
            this.f41265a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41267c, bVar)) {
                this.f41267c = bVar;
                this.f41265a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super T> wVar, T t10) {
            this.f41265a = wVar;
            this.f41266b = t10;
        }
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super T> wVar) {
        this.f41263a.subscribe(new a(wVar, this.f41264b));
    }

    public C5456g1(io.reactivex.q<? extends T> qVar, T t10) {
        this.f41263a = qVar;
        this.f41264b = t10;
    }
}
