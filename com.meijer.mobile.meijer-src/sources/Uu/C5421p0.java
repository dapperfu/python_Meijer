package Uu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5421p0 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.t f38763a;

    /* renamed from: b, reason: collision with root package name */
    final long f38764b;

    /* renamed from: c, reason: collision with root package name */
    final long f38765c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f38766d;

    /* renamed from: Uu.p0$a */
    static final class a extends AtomicReference<Ju.b> implements Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f38767a;

        /* renamed from: b, reason: collision with root package name */
        long f38768b;

        a(io.reactivex.s<? super Long> sVar) {
            this.f38767a = sVar;
        }

        public void a(Ju.b bVar) {
            Mu.d.o(this, bVar);
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
            if (get() != Mu.d.DISPOSED) {
                io.reactivex.s<? super Long> sVar = this.f38767a;
                long j10 = this.f38768b;
                this.f38768b = 1 + j10;
                sVar.onNext(Long.valueOf(j10));
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        io.reactivex.t tVar = this.f38763a;
        if (!(tVar instanceof Xu.n)) {
            aVar.a(tVar.f(aVar, this.f38764b, this.f38765c, this.f38766d));
            return;
        }
        t.c cVarB = tVar.b();
        aVar.a(cVarB);
        cVarB.d(aVar, this.f38764b, this.f38765c, this.f38766d);
    }

    public C5421p0(long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f38764b = j10;
        this.f38765c = j11;
        this.f38766d = timeUnit;
        this.f38763a = tVar;
    }
}
