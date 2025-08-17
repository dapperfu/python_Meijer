package Yu;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class Q0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f40961b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40962a;

        /* renamed from: b, reason: collision with root package name */
        final Qu.h f40963b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f40964c;

        /* renamed from: d, reason: collision with root package name */
        long f40965d;

        @Override // io.reactivex.s
        public void onComplete() {
            long j10 = this.f40965d;
            if (j10 != Long.MAX_VALUE) {
                this.f40965d = j10 - 1;
            }
            if (j10 != 0) {
                a();
            } else {
                this.f40962a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40962a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40962a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f40963b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, long j10, Qu.h hVar, io.reactivex.q<? extends T> qVar) {
            this.f40962a = sVar;
            this.f40963b = hVar;
            this.f40964c = qVar;
            this.f40965d = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f40963b.isDisposed()) {
                    this.f40964c.subscribe(this);
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
        Qu.h hVar = new Qu.h();
        sVar.onSubscribe(hVar);
        long j10 = this.f40961b;
        new a(sVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, hVar, this.f41135a).a();
    }

    public Q0(io.reactivex.l<T> lVar, long j10) {
        super(lVar);
        this.f40961b = j10;
    }
}
