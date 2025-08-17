package Yu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.q0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5485q0 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.t f41568a;

    /* renamed from: b, reason: collision with root package name */
    final long f41569b;

    /* renamed from: c, reason: collision with root package name */
    final long f41570c;

    /* renamed from: d, reason: collision with root package name */
    final long f41571d;

    /* renamed from: e, reason: collision with root package name */
    final long f41572e;

    /* renamed from: f, reason: collision with root package name */
    final TimeUnit f41573f;

    /* renamed from: Yu.q0$a */
    static final class a extends AtomicReference<Nu.b> implements Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f41574a;

        /* renamed from: b, reason: collision with root package name */
        final long f41575b;

        /* renamed from: c, reason: collision with root package name */
        long f41576c;

        a(io.reactivex.s<? super Long> sVar, long j10, long j11) {
            this.f41574a = sVar;
            this.f41576c = j10;
            this.f41575b = j11;
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
            if (!isDisposed()) {
                long j10 = this.f41576c;
                this.f41574a.onNext(Long.valueOf(j10));
                if (j10 == this.f41575b) {
                    Qu.d.a(this);
                    this.f41574a.onComplete();
                } else {
                    this.f41576c = j10 + 1;
                }
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        a aVar = new a(sVar, this.f41569b, this.f41570c);
        sVar.onSubscribe(aVar);
        io.reactivex.t tVar = this.f41568a;
        if (!(tVar instanceof bv.n)) {
            aVar.a(tVar.f(aVar, this.f41571d, this.f41572e, this.f41573f));
            return;
        }
        t.c cVarB = tVar.b();
        aVar.a(cVarB);
        cVarB.d(aVar, this.f41571d, this.f41572e, this.f41573f);
    }

    public C5485q0(long j10, long j11, long j12, long j13, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f41571d = j12;
        this.f41572e = j13;
        this.f41573f = timeUnit;
        this.f41568a = tVar;
        this.f41569b = j10;
        this.f41570c = j11;
    }
}
