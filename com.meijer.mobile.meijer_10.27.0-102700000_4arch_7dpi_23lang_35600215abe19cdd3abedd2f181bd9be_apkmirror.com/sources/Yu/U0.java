package Yu;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class U0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.d<? super Integer, ? super Throwable> f41026b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41027a;

        /* renamed from: b, reason: collision with root package name */
        final Qu.h f41028b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f41029c;

        /* renamed from: d, reason: collision with root package name */
        final Pu.d<? super Integer, ? super Throwable> f41030d;

        /* renamed from: e, reason: collision with root package name */
        int f41031e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41027a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            try {
                Pu.d<? super Integer, ? super Throwable> dVar = this.f41030d;
                int i10 = this.f41031e + 1;
                this.f41031e = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
                    a();
                } else {
                    this.f41027a.onError(th2);
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f41027a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41027a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41028b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, Pu.d<? super Integer, ? super Throwable> dVar, Qu.h hVar, io.reactivex.q<? extends T> qVar) {
            this.f41027a = sVar;
            this.f41028b = hVar;
            this.f41029c = qVar;
            this.f41030d = dVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f41028b.isDisposed()) {
                    this.f41029c.subscribe(this);
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
        new a(sVar, this.f41026b, hVar, this.f41135a).a();
    }

    public U0(io.reactivex.l<T> lVar, Pu.d<? super Integer, ? super Throwable> dVar) {
        super(lVar);
        this.f41026b = dVar;
    }
}
