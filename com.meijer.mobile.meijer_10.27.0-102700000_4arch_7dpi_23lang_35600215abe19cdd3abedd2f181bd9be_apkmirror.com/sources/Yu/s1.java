package Yu;

import av.C6159c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class s1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f41622b;

    /* renamed from: c, reason: collision with root package name */
    final long f41623c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f41624d;

    /* renamed from: e, reason: collision with root package name */
    final io.reactivex.t f41625e;

    /* renamed from: f, reason: collision with root package name */
    final int f41626f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f41627g;

    static final class a<T> extends AtomicBoolean implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41628a;

        /* renamed from: b, reason: collision with root package name */
        final long f41629b;

        /* renamed from: c, reason: collision with root package name */
        final long f41630c;

        /* renamed from: d, reason: collision with root package name */
        final TimeUnit f41631d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.t f41632e;

        /* renamed from: f, reason: collision with root package name */
        final C6159c<Object> f41633f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f41634g;

        /* renamed from: h, reason: collision with root package name */
        Nu.b f41635h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f41636i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f41637j;

        void a() {
            Throwable th2;
            if (compareAndSet(false, true)) {
                io.reactivex.s<? super T> sVar = this.f41628a;
                C6159c<Object> c6159c = this.f41633f;
                boolean z10 = this.f41634g;
                long jC = this.f41632e.c(this.f41631d) - this.f41630c;
                while (!this.f41636i) {
                    if (!z10 && (th2 = this.f41637j) != null) {
                        c6159c.clear();
                        sVar.onError(th2);
                        return;
                    }
                    Object objPoll = c6159c.poll();
                    if (objPoll == null) {
                        Throwable th3 = this.f41637j;
                        if (th3 != null) {
                            sVar.onError(th3);
                            return;
                        } else {
                            sVar.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = c6159c.poll();
                    if (((Long) objPoll).longValue() >= jC) {
                        sVar.onNext(objPoll2);
                    }
                }
                c6159c.clear();
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41636i) {
                return;
            }
            this.f41636i = true;
            this.f41635h.dispose();
            if (compareAndSet(false, true)) {
                this.f41633f.clear();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41636i;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41637j = th2;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C6159c<Object> c6159c = this.f41633f;
            long jC = this.f41632e.c(this.f41631d);
            long j10 = this.f41630c;
            long j11 = this.f41629b;
            boolean z10 = j11 == Long.MAX_VALUE;
            c6159c.m(Long.valueOf(jC), t10);
            while (!c6159c.isEmpty()) {
                if (((Long) c6159c.n()).longValue() > jC - j10 && (z10 || (c6159c.p() >> 1) <= j11)) {
                    return;
                }
                c6159c.poll();
                c6159c.poll();
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41635h, bVar)) {
                this.f41635h = bVar;
                this.f41628a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
            this.f41628a = sVar;
            this.f41629b = j10;
            this.f41630c = j11;
            this.f41631d = timeUnit;
            this.f41632e = tVar;
            this.f41633f = new C6159c<>(i10);
            this.f41634g = z10;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41622b, this.f41623c, this.f41624d, this.f41625e, this.f41626f, this.f41627g));
    }

    public s1(io.reactivex.q<T> qVar, long j10, long j11, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
        super(qVar);
        this.f41622b = j10;
        this.f41623c = j11;
        this.f41624d = timeUnit;
        this.f41625e = tVar;
        this.f41626f = i10;
        this.f41627g = z10;
    }
}
