package Uu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.q0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5424q0 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.t f38793a;

    /* renamed from: b, reason: collision with root package name */
    final long f38794b;

    /* renamed from: c, reason: collision with root package name */
    final long f38795c;

    /* renamed from: d, reason: collision with root package name */
    final long f38796d;

    /* renamed from: e, reason: collision with root package name */
    final long f38797e;

    /* renamed from: f, reason: collision with root package name */
    final TimeUnit f38798f;

    /* renamed from: Uu.q0$a */
    static final class a extends AtomicReference<Ju.b> implements Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f38799a;

        /* renamed from: b, reason: collision with root package name */
        final long f38800b;

        /* renamed from: c, reason: collision with root package name */
        long f38801c;

        a(io.reactivex.s<? super Long> sVar, long j10, long j11) {
            this.f38799a = sVar;
            this.f38801c = j10;
            this.f38800b = j11;
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
            if (!isDisposed()) {
                long j10 = this.f38801c;
                this.f38799a.onNext(Long.valueOf(j10));
                if (j10 == this.f38800b) {
                    Mu.d.a(this);
                    this.f38799a.onComplete();
                } else {
                    this.f38801c = j10 + 1;
                }
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Long> sVar) {
        a aVar = new a(sVar, this.f38794b, this.f38795c);
        sVar.onSubscribe(aVar);
        io.reactivex.t tVar = this.f38793a;
        if (!(tVar instanceof Xu.n)) {
            aVar.a(tVar.f(aVar, this.f38796d, this.f38797e, this.f38798f));
            return;
        }
        t.c cVarB = tVar.b();
        aVar.a(cVarB);
        cVarB.d(aVar, this.f38796d, this.f38797e, this.f38798f);
    }

    public C5424q0(long j10, long j11, long j12, long j13, TimeUnit timeUnit, io.reactivex.t tVar) {
        this.f38796d = j12;
        this.f38797e = j13;
        this.f38798f = timeUnit;
        this.f38793a = tVar;
        this.f38794b = j10;
        this.f38795c = j11;
    }
}
