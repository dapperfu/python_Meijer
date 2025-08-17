package Yu;

import av.C6159c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Yu.j1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5465j1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f41332b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f41333c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f41334d;

    /* renamed from: e, reason: collision with root package name */
    final int f41335e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f41336f;

    /* renamed from: Yu.j1$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41337a;

        /* renamed from: b, reason: collision with root package name */
        final long f41338b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f41339c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.t f41340d;

        /* renamed from: e, reason: collision with root package name */
        final C6159c<Object> f41341e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f41342f;

        /* renamed from: g, reason: collision with root package name */
        Nu.b f41343g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f41344h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f41345i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f41346j;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41345i = true;
            a();
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.s<? super T> sVar = this.f41337a;
            C6159c<Object> c6159c = this.f41341e;
            boolean z10 = this.f41342f;
            TimeUnit timeUnit = this.f41339c;
            io.reactivex.t tVar = this.f41340d;
            long j10 = this.f41338b;
            int iAddAndGet = 1;
            while (!this.f41344h) {
                boolean z11 = this.f41345i;
                Long l10 = (Long) c6159c.n();
                boolean z12 = l10 == null;
                long jC = tVar.c(timeUnit);
                if (!z12 && l10.longValue() > jC - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th2 = this.f41346j;
                        if (th2 != null) {
                            this.f41341e.clear();
                            sVar.onError(th2);
                            return;
                        } else if (z12) {
                            sVar.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th3 = this.f41346j;
                        if (th3 != null) {
                            sVar.onError(th3);
                            return;
                        } else {
                            sVar.onComplete();
                            return;
                        }
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    c6159c.poll();
                    sVar.onNext(c6159c.poll());
                }
            }
            this.f41341e.clear();
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41344h) {
                return;
            }
            this.f41344h = true;
            this.f41343g.dispose();
            if (getAndIncrement() == 0) {
                this.f41341e.clear();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41344h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41346j = th2;
            this.f41345i = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41341e.m(Long.valueOf(this.f41340d.c(this.f41339c)), t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41343g, bVar)) {
                this.f41343g = bVar;
                this.f41337a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
            this.f41337a = sVar;
            this.f41338b = j10;
            this.f41339c = timeUnit;
            this.f41340d = tVar;
            this.f41341e = new C6159c<>(i10);
            this.f41342f = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41332b, this.f41333c, this.f41334d, this.f41335e, this.f41336f));
    }

    public C5465j1(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
        super(qVar);
        this.f41332b = j10;
        this.f41333c = timeUnit;
        this.f41334d = tVar;
        this.f41335e = i10;
        this.f41336f = z10;
    }
}
