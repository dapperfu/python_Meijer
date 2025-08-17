package Yu;

import gv.C14313a;

/* renamed from: Yu.p1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5483p1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f41544b;

    /* renamed from: Yu.p1$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41545a;

        /* renamed from: b, reason: collision with root package name */
        boolean f41546b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41547c;

        /* renamed from: d, reason: collision with root package name */
        long f41548d;

        @Override // Nu.b
        public void dispose() {
            this.f41547c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41547c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41546b) {
                return;
            }
            this.f41546b = true;
            this.f41547c.dispose();
            this.f41545a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41546b) {
                C14313a.s(th2);
                return;
            }
            this.f41546b = true;
            this.f41547c.dispose();
            this.f41545a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41546b) {
                return;
            }
            long j10 = this.f41548d;
            long j11 = j10 - 1;
            this.f41548d = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f41545a.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41547c, bVar)) {
                this.f41547c = bVar;
                if (this.f41548d != 0) {
                    this.f41545a.onSubscribe(this);
                    return;
                }
                this.f41546b = true;
                bVar.dispose();
                Qu.e.e(this.f41545a);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10) {
            this.f41545a = sVar;
            this.f41548d = j10;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41544b));
    }

    public C5483p1(io.reactivex.q<T> qVar, long j10) {
        super(qVar);
        this.f41544b = j10;
    }
}
