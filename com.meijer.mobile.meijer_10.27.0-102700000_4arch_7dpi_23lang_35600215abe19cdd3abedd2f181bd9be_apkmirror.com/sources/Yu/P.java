package Yu;

import gv.C14313a;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
public final class P<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f40927b;

    /* renamed from: c, reason: collision with root package name */
    final T f40928c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f40929d;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40930a;

        /* renamed from: b, reason: collision with root package name */
        final long f40931b;

        /* renamed from: c, reason: collision with root package name */
        final T f40932c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f40933d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f40934e;

        /* renamed from: f, reason: collision with root package name */
        long f40935f;

        /* renamed from: g, reason: collision with root package name */
        boolean f40936g;

        @Override // Nu.b
        public void dispose() {
            this.f40934e.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40934e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40936g) {
                return;
            }
            this.f40936g = true;
            T t10 = this.f40932c;
            if (t10 == null && this.f40933d) {
                this.f40930a.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f40930a.onNext(t10);
            }
            this.f40930a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40936g) {
                C14313a.s(th2);
            } else {
                this.f40936g = true;
                this.f40930a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40936g) {
                return;
            }
            long j10 = this.f40935f;
            if (j10 != this.f40931b) {
                this.f40935f = j10 + 1;
                return;
            }
            this.f40936g = true;
            this.f40934e.dispose();
            this.f40930a.onNext(t10);
            this.f40930a.onComplete();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40934e, bVar)) {
                this.f40934e = bVar;
                this.f40930a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, T t10, boolean z10) {
            this.f40930a = sVar;
            this.f40931b = j10;
            this.f40932c = t10;
            this.f40933d = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40927b, this.f40928c, this.f40929d));
    }

    public P(io.reactivex.q<T> qVar, long j10, T t10, boolean z10) {
        super(qVar);
        this.f40927b = j10;
        this.f40928c = t10;
        this.f40929d = z10;
    }
}
