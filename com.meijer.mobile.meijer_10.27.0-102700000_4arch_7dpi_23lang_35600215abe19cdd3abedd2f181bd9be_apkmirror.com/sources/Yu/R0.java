package Yu;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class R0<T> extends AbstractC5436a<T, T> {

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40966a;

        /* renamed from: b, reason: collision with root package name */
        final Qu.h f40967b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f40968c;

        @Override // io.reactivex.s
        public void onComplete() {
            try {
                throw null;
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f40966a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40966a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40966a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f40967b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, Pu.e eVar, Qu.h hVar, io.reactivex.q<? extends T> qVar) {
            this.f40966a = sVar;
            this.f40967b = hVar;
            this.f40968c = qVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.f40968c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Qu.h hVar = new Qu.h();
        sVar.onSubscribe(hVar);
        new a(sVar, null, hVar, this.f41135a).a();
    }

    public R0(io.reactivex.l<T> lVar, Pu.e eVar) {
        super(lVar);
    }
}
