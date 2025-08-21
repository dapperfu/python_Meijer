package Uu;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class U0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.d<? super Integer, ? super Throwable> f38251b;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38252a;

        /* renamed from: b, reason: collision with root package name */
        final Mu.h f38253b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38254c;

        /* renamed from: d, reason: collision with root package name */
        final Lu.d<? super Integer, ? super Throwable> f38255d;

        /* renamed from: e, reason: collision with root package name */
        int f38256e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38252a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            try {
                Lu.d<? super Integer, ? super Throwable> dVar = this.f38255d;
                int i10 = this.f38256e + 1;
                this.f38256e = i10;
                if (dVar.test(Integer.valueOf(i10), th2)) {
                    a();
                } else {
                    this.f38252a.onError(th2);
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f38252a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38252a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38253b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, Lu.d<? super Integer, ? super Throwable> dVar, Mu.h hVar, io.reactivex.q<? extends T> qVar) {
            this.f38252a = sVar;
            this.f38253b = hVar;
            this.f38254c = qVar;
            this.f38255d = dVar;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f38253b.isDisposed()) {
                    this.f38254c.subscribe(this);
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
        new a(sVar, this.f38251b, hVar, this.f38360a).a();
    }

    public U0(io.reactivex.l<T> lVar, Lu.d<? super Integer, ? super Throwable> dVar) {
        super(lVar);
        this.f38251b = dVar;
    }
}
