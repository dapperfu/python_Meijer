package Uu;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class Q0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38186b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38187a;

        /* renamed from: b, reason: collision with root package name */
        final Mu.h f38188b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38189c;

        /* renamed from: d, reason: collision with root package name */
        long f38190d;

        @Override // io.reactivex.s
        public void onComplete() {
            long j10 = this.f38190d;
            if (j10 != Long.MAX_VALUE) {
                this.f38190d = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f38187a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38187a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38187a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38188b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, long j10, Mu.h hVar, io.reactivex.q<? extends T> qVar) {
            this.f38187a = sVar;
            this.f38188b = hVar;
            this.f38189c = qVar;
            this.f38190d = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f38188b.isDisposed()) {
                    this.f38189c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Mu.h hVar = new Mu.h();
        sVar.onSubscribe(hVar);
        long j10 = this.f38186b;
        new a(sVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, hVar, this.f38360a).a();
    }

    public Q0(io.reactivex.l<T> lVar, long j10) {
        super(lVar);
        this.f38186b = j10;
    }
}
