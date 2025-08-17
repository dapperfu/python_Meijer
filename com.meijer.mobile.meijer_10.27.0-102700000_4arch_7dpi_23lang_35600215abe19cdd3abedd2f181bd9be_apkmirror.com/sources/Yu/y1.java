package Yu;

import iv.C14765b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class y1<T> extends AbstractC5436a<T, C14765b<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f41779b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f41780c;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super C14765b<T>> f41781a;

        /* renamed from: b, reason: collision with root package name */
        final TimeUnit f41782b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.t f41783c;

        /* renamed from: d, reason: collision with root package name */
        long f41784d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f41785e;

        @Override // Nu.b
        public void dispose() {
            this.f41785e.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41785e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41781a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41781a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long jC = this.f41783c.c(this.f41782b);
            long j10 = this.f41784d;
            this.f41784d = jC;
            this.f41781a.onNext(new C14765b(t10, jC - j10, this.f41782b));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41785e, bVar)) {
                this.f41785e = bVar;
                this.f41784d = this.f41783c.c(this.f41782b);
                this.f41781a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super C14765b<T>> sVar, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f41781a = sVar;
            this.f41783c = tVar;
            this.f41782b = timeUnit;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super C14765b<T>> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41780c, this.f41779b));
    }

    public y1(io.reactivex.q<T> qVar, TimeUnit timeUnit, io.reactivex.t tVar) {
        super(qVar);
        this.f41779b = tVar;
        this.f41780c = timeUnit;
    }
}
