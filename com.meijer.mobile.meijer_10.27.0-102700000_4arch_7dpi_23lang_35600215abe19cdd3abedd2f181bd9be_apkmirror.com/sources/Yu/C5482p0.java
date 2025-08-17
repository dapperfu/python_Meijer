package Yu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.p0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5482p0 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.t f41538a;

    /* renamed from: b, reason: collision with root package name */
    final long f41539b;

    /* renamed from: c, reason: collision with root package name */
    final long f41540c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f41541d;

    /* renamed from: Yu.p0$a */
    static final class a extends AtomicReference<Nu.b> implements Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f41542a;

        /* renamed from: b, reason: collision with root package name */
        long f41543b;

        a(io.reactivex.s<? super Long> sVar) {
            this.f41542a = sVar;
        }

        public void a(Nu.b bVar) {
            Qu.d.o(this, bVar);
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
            if (get() != Qu.d.DISPOSED) {
                io.reactivex.s<? super Long> sVar = this.f41542a;
                long j10 = this.f41543b;
                this.f41543b = 1 + j10;
                sVar.onNext(Long.valueOf(j10));
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        io.reactivex.t tVar = this.f41538a;
        if (!(tVar instanceof bv.n)) {
            aVar.a(tVar.f(aVar, this.f41539b, this.f41540c, this.f41541d));
            return;
        }
        t.c cVarB = tVar.b();
        aVar.a(cVarB);
        cVarB.d(aVar, this.f41539b, this.f41540c, this.f41541d);
    }

    public C5482p0(long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f41539b = j10;
        this.f41540c = j11;
        this.f41541d = timeUnit;
        this.f41538a = tVar;
    }
}
