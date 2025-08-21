package Uu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class s1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38847b;

    /* renamed from: c, reason: collision with root package name */
    final long f38848c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f38849d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f38850e;

    /* renamed from: f, reason: collision with root package name */
    final int f38851f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f38852g;

    static final class a<T> extends AtomicBoolean implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38853a;

        /* renamed from: b, reason: collision with root package name */
        final long f38854b;

        /* renamed from: c, reason: collision with root package name */
        final long f38855c;

        /* renamed from: d, reason: collision with root package name */
        final TimeUnit f38856d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.t f38857e;

        /* renamed from: f, reason: collision with root package name */
        final Wu.c<Object> f38858f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f38859g;

        /* renamed from: h, reason: collision with root package name */
        Ju.b f38860h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f38861i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f38862j;

        void a() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                io.reactivex.s<? super T> sVar = this.f38853a;
                Wu.c<Object> cVar = this.f38858f;
                boolean z10 = this.f38859g;
                long jC = this.f38857e.c(this.f38856d) - this.f38855c;
                while (!this.f38861i) {
                    if (!z10 && (th2 = this.f38862j) != null) {
                        cVar.clear();
                        sVar.onError(th2);
                        return;
                    }
                    Object objPoll = cVar.poll();
                    if (objPoll == null) {
                        Throwable th3 = this.f38862j;
                        if (th3 != null) {
                            sVar.onError(th3);
                            return;
                        } else {
                            sVar.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = cVar.poll();
                    if (((Long) objPoll).longValue() >= jC) {
                        sVar.onNext(objPoll2);
                    }
                }
                cVar.clear();
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38861i) {
                return;
            }
            this.f38861i = true;
            this.f38860h.dispose();
            if (compareAndSet(false, true)) {
                this.f38858f.clear();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38861i;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38862j = th2;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            Wu.c<Object> cVar = this.f38858f;
            long jC = this.f38857e.c(this.f38856d);
            long j10 = this.f38855c;
            long j11 = this.f38854b;
            boolean z10 = j11 == Long.MAX_VALUE;
            cVar.m(Long.valueOf(jC), t10);
            while (!cVar.isEmpty()) {
                if (((Long) cVar.n()).longValue() > jC - j10 && (z10 || (cVar.p() >> 1) <= j11)) {
                    return;
                }
                cVar.poll();
                cVar.poll();
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38860h, bVar)) {
                this.f38860h = bVar;
                this.f38853a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
            this.f38853a = sVar;
            this.f38854b = j10;
            this.f38855c = j11;
            this.f38856d = timeUnit;
            this.f38857e = tVar;
            this.f38858f = new Wu.c<>(i10);
            this.f38859g = z10;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38847b, this.f38848c, this.f38849d, this.f38850e, this.f38851f, this.f38852g));
    }

    public s1(io.reactivex.q<T> qVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
        super(qVar);
        this.f38847b = j10;
        this.f38848c = j11;
        this.f38849d = timeUnit;
        this.f38850e = tVar;
        this.f38851f = i10;
        this.f38852g = z10;
    }
}
