package Uu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Uu.j1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5404j1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38557b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f38558c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f38559d;

    /* renamed from: e, reason: collision with root package name */
    final int f38560e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f38561f;

    /* renamed from: Uu.j1$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38562a;

        /* renamed from: b, reason: collision with root package name */
        final long f38563b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f38564c;

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.t f38565d;

        /* renamed from: e, reason: collision with root package name */
        final Wu.c<Object> f38566e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f38567f;

        /* renamed from: g, reason: collision with root package name */
        Ju.b f38568g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f38569h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f38570i;

        /* renamed from: j, reason: collision with root package name */
        Throwable f38571j;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38570i = true;
            a();
        }

        void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            io.reactivex.s<? super T> sVar = this.f38562a;
            Wu.c<Object> cVar = this.f38566e;
            boolean z10 = this.f38567f;
            TimeUnit timeUnit = this.f38564c;
            io.reactivex.t tVar = this.f38565d;
            long j10 = this.f38563b;
            int iAddAndGet = 1;
            while (!this.f38569h) {
                boolean z11 = this.f38570i;
                Long l10 = (Long) cVar.n();
                boolean z12 = l10 == null;
                long jC = tVar.c(timeUnit);
                if (!z12 && l10.longValue() > jC - j10) {
                    z12 = true;
                }
                if (z11) {
                    if (!z10) {
                        Throwable th2 = this.f38571j;
                        if (th2 != null) {
                            this.f38566e.clear();
                            sVar.onError(th2);
                            return;
                        } else if (z12) {
                            sVar.onComplete();
                            return;
                        }
                    } else if (z12) {
                        Throwable th3 = this.f38571j;
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
                    cVar.poll();
                    sVar.onNext(cVar.poll());
                }
            }
            this.f38566e.clear();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38569h) {
                return;
            }
            this.f38569h = true;
            this.f38568g.dispose();
            if (getAndIncrement() == 0) {
                this.f38566e.clear();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38569h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38571j = th2;
            this.f38570i = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38566e.m(Long.valueOf(this.f38565d.c(this.f38564c)), t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38568g, bVar)) {
                this.f38568g = bVar;
                this.f38562a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
            this.f38562a = sVar;
            this.f38563b = j10;
            this.f38564c = timeUnit;
            this.f38565d = tVar;
            this.f38566e = new Wu.c<>(i10);
            this.f38567f = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38557b, this.f38558c, this.f38559d, this.f38560e, this.f38561f));
    }

    public C5404j1(io.reactivex.q<T> qVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, int i10, boolean z10) {
        super(qVar);
        this.f38557b = j10;
        this.f38558c = timeUnit;
        this.f38559d = tVar;
        this.f38560e = i10;
        this.f38561f = z10;
    }
}
