package Ru;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class c<T> extends Ru.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final int f34041c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f34042d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f34043e;

    /* renamed from: f, reason: collision with root package name */
    final Lu.a f34044f;

    static final class a<T> extends Zu.a<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        final lw.b<? super T> f34045a;

        /* renamed from: b, reason: collision with root package name */
        final Ou.e<T> f34046b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f34047c;

        /* renamed from: d, reason: collision with root package name */
        final Lu.a f34048d;

        /* renamed from: e, reason: collision with root package name */
        lw.c f34049e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f34050f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f34051g;

        /* renamed from: h, reason: collision with root package name */
        Throwable f34052h;

        /* renamed from: i, reason: collision with root package name */
        final AtomicLong f34053i = new AtomicLong();

        /* renamed from: j, reason: collision with root package name */
        boolean f34054j;

        @Override // lw.b
        public void onComplete() {
            this.f34051g = true;
            if (this.f34054j) {
                this.f34045a.onComplete();
            } else {
                d();
            }
        }

        @Override // lw.b
        public void b(lw.c cVar) {
            if (Zu.b.p(this.f34049e, cVar)) {
                this.f34049e = cVar;
                this.f34045a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        boolean c(boolean z10, boolean z11, lw.b<? super T> bVar) {
            if (this.f34050f) {
                this.f34046b.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f34047c) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f34052h;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f34052h;
            if (th3 != null) {
                this.f34046b.clear();
                bVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        @Override // lw.c
        public void cancel() {
            if (this.f34050f) {
                return;
            }
            this.f34050f = true;
            this.f34049e.cancel();
            if (this.f34054j || getAndIncrement() != 0) {
                return;
            }
            this.f34046b.clear();
        }

        @Override // Ou.f
        public void clear() {
            this.f34046b.clear();
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return this.f34046b.isEmpty();
        }

        @Override // lw.b
        public void onError(Throwable th2) {
            this.f34052h = th2;
            this.f34051g = true;
            if (this.f34054j) {
                this.f34045a.onError(th2);
            } else {
                d();
            }
        }

        @Override // lw.b
        public void onNext(T t10) {
            if (this.f34046b.offer(t10)) {
                if (this.f34054j) {
                    this.f34045a.onNext(null);
                    return;
                } else {
                    d();
                    return;
                }
            }
            this.f34049e.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f34048d.run();
            } catch (Throwable th2) {
                Ku.a.b(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // Ou.f
        public T poll() throws Exception {
            return this.f34046b.poll();
        }

        @Override // lw.c
        public void t(long j10) {
            if (this.f34054j || !Zu.b.o(j10)) {
                return;
            }
            av.d.a(this.f34053i, j10);
            d();
        }

        a(lw.b<? super T> bVar, int i10, boolean z10, boolean z11, Lu.a aVar) {
            Ou.e<T> bVar2;
            this.f34045a = bVar;
            this.f34048d = aVar;
            this.f34047c = z11;
            if (z10) {
                bVar2 = new Wu.c<>(i10);
            } else {
                bVar2 = new Wu.b<>(i10);
            }
            this.f34046b = bVar2;
        }

        void d() {
            boolean z10;
            if (getAndIncrement() == 0) {
                Ou.e<T> eVar = this.f34046b;
                lw.b<? super T> bVar = this.f34045a;
                int iAddAndGet = 1;
                while (!c(this.f34051g, eVar.isEmpty(), bVar)) {
                    long j10 = this.f34053i.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z11 = this.f34051g;
                        T tPoll = eVar.poll();
                        if (tPoll == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!c(z11, z10, bVar)) {
                            if (z10) {
                                break;
                            }
                            bVar.onNext(tPoll);
                            j11++;
                        } else {
                            return;
                        }
                    }
                    if (j11 != j10 || !c(this.f34051g, eVar.isEmpty(), bVar)) {
                        if (j11 != 0 && j10 != Long.MAX_VALUE) {
                            this.f34053i.addAndGet(-j11);
                        }
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.f
    protected void h(lw.b<? super T> bVar) {
        this.f34037b.g(new a(bVar, this.f34041c, this.f34042d, this.f34043e, this.f34044f));
    }

    public c(io.reactivex.f<T> fVar, int i10, boolean z10, boolean z11, Lu.a aVar) {
        super(fVar);
        this.f34041c = i10;
        this.f34042d = z10;
        this.f34043e = z11;
        this.f34044f = aVar;
    }
}
