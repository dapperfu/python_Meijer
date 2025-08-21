package Uu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class B1 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.t f37797a;

    /* renamed from: b, reason: collision with root package name */
    final long f37798b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f37799c;

    static final class a extends AtomicReference<Ju.b> implements Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f37800a;

        a(io.reactivex.s<? super Long> sVar) {
            this.f37800a = sVar;
        }

        public void a(Ju.b bVar) {
            Mu.d.p(this, bVar);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() == Mu.d.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!isDisposed()) {
                this.f37800a.onNext(0L);
                lazySet(Mu.e.INSTANCE);
                this.f37800a.onComplete();
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        aVar.a(this.f37797a.e(aVar, this.f37798b, this.f37799c));
    }

    public B1(long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f37798b = j10;
        this.f37799c = timeUnit;
        this.f37797a = tVar;
    }
}
