package Uu;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class R0<T> extends AbstractC5375a<T, T> {

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38191a;

        /* renamed from: b, reason: collision with root package name */
        final Mu.h f38192b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38193c;

        @Override // io.reactivex.s
        public void onComplete() {
            try {
                throw null;
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38191a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38191a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38191a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38192b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, Lu.e eVar, Mu.h hVar, io.reactivex.q<? extends T> qVar) {
            this.f38191a = sVar;
            this.f38192b = hVar;
            this.f38193c = qVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.f38193c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        Mu.h hVar = new Mu.h();
        sVar.onSubscribe(hVar);
        new a(sVar, null, hVar, this.f38360a).a();
    }

    public R0(io.reactivex.l<T> lVar, Lu.e eVar) {
        super(lVar);
    }
}
