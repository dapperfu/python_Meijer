package Yu;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class V0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super Throwable> f41034b;

    /* renamed from: c, reason: collision with root package name */
    final long f41035c;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41036a;

        /* renamed from: b, reason: collision with root package name */
        final Qu.h f41037b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f41038c;

        /* renamed from: d, reason: collision with root package name */
        final Pu.q<? super Throwable> f41039d;

        /* renamed from: e, reason: collision with root package name */
        long f41040e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41036a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            long j10 = this.f41040e;
            if (j10 != Long.MAX_VALUE) {
                this.f41040e = j10 - 1;
            }
            if (j10 == 0) {
                this.f41036a.onError(th2);
                return;
            }
            try {
                if (this.f41039d.test(th2)) {
                    a();
                } else {
                    this.f41036a.onError(th2);
                }
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f41036a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41036a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41037b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, long j10, Pu.q<? super Throwable> qVar, Qu.h hVar, io.reactivex.q<? extends T> qVar2) {
            this.f41036a = sVar;
            this.f41037b = hVar;
            this.f41038c = qVar2;
            this.f41039d = qVar;
            this.f41040e = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f41037b.isDisposed()) {
                    this.f41038c.subscribe(this);
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
        new a(sVar, this.f41035c, this.f41034b, hVar, this.f41135a).a();
    }

    public V0(io.reactivex.l<T> lVar, long j10, Pu.q<? super Throwable> qVar) {
        super(lVar);
        this.f41034b = qVar;
        this.f41035c = j10;
    }
}
