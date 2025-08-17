package Yu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class B1 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.t f40572a;

    /* renamed from: b, reason: collision with root package name */
    final long f40573b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f40574c;

    static final class a extends AtomicReference<Nu.b> implements Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f40575a;

        a(io.reactivex.s<? super Long> sVar) {
            this.f40575a = sVar;
        }

        public void a(Nu.b bVar) {
            Qu.d.p(this, bVar);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() == Qu.d.DISPOSED) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!isDisposed()) {
                this.f40575a.onNext(0L);
                lazySet(Qu.e.INSTANCE);
                this.f40575a.onComplete();
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        aVar.a(this.f40572a.e(aVar, this.f40573b, this.f40574c));
    }

    public B1(long j10, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f40573b = j10;
        this.f40574c = timeUnit;
        this.f40572a = tVar;
    }
}
