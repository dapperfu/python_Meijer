package Uu;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class V0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.q<? super Throwable> f38259b;

    /* renamed from: c, reason: collision with root package name */
    final long f38260c;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38261a;

        /* renamed from: b, reason: collision with root package name */
        final Mu.h f38262b;

        /* renamed from: c, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38263c;

        /* renamed from: d, reason: collision with root package name */
        final Lu.q<? super Throwable> f38264d;

        /* renamed from: e, reason: collision with root package name */
        long f38265e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38261a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            long j10 = this.f38265e;
            if (j10 != Long.MAX_VALUE) {
                this.f38265e = j10 - 1;
            }
            if (j10 == 0) {
                this.f38261a.onError(th2);
                return;
            }
            try {
                if (this.f38264d.test(th2)) {
                    a();
                } else {
                    this.f38261a.onError(th2);
                }
            } catch (Throwable th3) {
                Ku.a.b(th3);
                this.f38261a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38261a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38262b.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, long j10, Lu.q<? super Throwable> qVar, Mu.h hVar, io.reactivex.q<? extends T> qVar2) {
            this.f38261a = sVar;
            this.f38262b = hVar;
            this.f38263c = qVar2;
            this.f38264d = qVar;
            this.f38265e = j10;
        }

        void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f38262b.isDisposed()) {
                    this.f38263c.subscribe(this);
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
        new a(sVar, this.f38260c, this.f38259b, hVar, this.f38360a).a();
    }

    public V0(io.reactivex.l<T> lVar, long j10, Lu.q<? super Throwable> qVar) {
        super(lVar);
        this.f38259b = qVar;
        this.f38260c = j10;
    }
}
