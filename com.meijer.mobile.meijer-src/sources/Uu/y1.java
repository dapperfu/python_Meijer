package Uu;

import ev.C13890b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class y1<T> extends AbstractC5375a<T, C13890b<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f39004b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f39005c;

    static final class a<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super C13890b<T>> f39006a;

        /* renamed from: b, reason: collision with root package name */
        final TimeUnit f39007b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.t f39008c;

        /* renamed from: d, reason: collision with root package name */
        long f39009d;

        /* renamed from: e, reason: collision with root package name */
        Ju.b f39010e;

        @Override // Ju.b
        public void dispose() {
            this.f39010e.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f39010e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39006a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f39006a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            long jC = this.f39008c.c(this.f39007b);
            long j10 = this.f39009d;
            this.f39009d = jC;
            this.f39006a.onNext(new C13890b(t10, jC - j10, this.f39007b));
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f39010e, bVar)) {
                this.f39010e = bVar;
                this.f39009d = this.f39008c.c(this.f39007b);
                this.f39006a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super C13890b<T>> sVar, TimeUnit timeUnit, io.reactivex.t tVar) {
            this.f39006a = sVar;
            this.f39008c = tVar;
            this.f39007b = timeUnit;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super C13890b<T>> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f39005c, this.f39004b));
    }

    public y1(io.reactivex.q<T> qVar, TimeUnit timeUnit, io.reactivex.t tVar) {
        super(qVar);
        this.f39004b = tVar;
        this.f39005c = timeUnit;
    }
}
