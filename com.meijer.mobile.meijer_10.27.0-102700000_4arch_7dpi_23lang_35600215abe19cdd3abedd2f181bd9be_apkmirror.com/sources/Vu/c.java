package Vu;

import av.C6158b;
import av.C6159c;
import dv.AbstractC13583a;
import dv.EnumC13584b;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public final class c<T> extends Vu.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final int f38030c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f38031d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f38032e;

    /* renamed from: f, reason: collision with root package name */
    final Pu.a f38033f;

    static final class a<T> extends AbstractC13583a<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        final pw.b<? super T> f38034a;

        /* renamed from: b, reason: collision with root package name */
        final Su.e<T> f38035b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f38036c;

        /* renamed from: d, reason: collision with root package name */
        final Pu.a f38037d;

        /* renamed from: e, reason: collision with root package name */
        pw.c f38038e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f38039f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38040g;

        /* renamed from: h, reason: collision with root package name */
        Throwable f38041h;

        /* renamed from: i, reason: collision with root package name */
        final AtomicLong f38042i = new AtomicLong();

        /* renamed from: j, reason: collision with root package name */
        boolean f38043j;

        @Override // pw.b
        public void onComplete() {
            this.f38040g = true;
            if (this.f38043j) {
                this.f38034a.onComplete();
            } else {
                d();
            }
        }

        @Override // pw.b
        public void b(pw.c cVar) {
            if (EnumC13584b.p(this.f38038e, cVar)) {
                this.f38038e = cVar;
                this.f38034a.b(this);
                cVar.t(Long.MAX_VALUE);
            }
        }

        boolean c(boolean z10, boolean z11, pw.b<? super T> bVar) {
            if (this.f38039f) {
                this.f38035b.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f38036c) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.f38041h;
                if (th2 != null) {
                    bVar.onError(th2);
                } else {
                    bVar.onComplete();
                }
                return true;
            }
            Throwable th3 = this.f38041h;
            if (th3 != null) {
                this.f38035b.clear();
                bVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.onComplete();
            return true;
        }

        @Override // pw.c
        public void cancel() {
            if (this.f38039f) {
                return;
            }
            this.f38039f = true;
            this.f38038e.cancel();
            if (this.f38043j || getAndIncrement() != 0) {
                return;
            }
            this.f38035b.clear();
        }

        @Override // Su.f
        public void clear() {
            this.f38035b.clear();
        }

        @Override // Su.f
        public boolean isEmpty() {
            return this.f38035b.isEmpty();
        }

        @Override // pw.b
        public void onError(Throwable th2) {
            this.f38041h = th2;
            this.f38040g = true;
            if (this.f38043j) {
                this.f38034a.onError(th2);
            } else {
                d();
            }
        }

        @Override // pw.b
        public void onNext(T t10) {
            if (this.f38035b.offer(t10)) {
                if (this.f38043j) {
                    this.f38034a.onNext(null);
                    return;
                } else {
                    d();
                    return;
                }
            }
            this.f38038e.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f38037d.run();
            } catch (Throwable th2) {
                Ou.a.b(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // Su.f
        public T poll() throws Exception {
            return this.f38035b.poll();
        }

        @Override // pw.c
        public void t(long j10) {
            if (this.f38043j || !EnumC13584b.o(j10)) {
                return;
            }
            ev.d.a(this.f38042i, j10);
            d();
        }

        a(pw.b<? super T> bVar, int i10, boolean z10, boolean z11, Pu.a aVar) {
            Su.e<T> c6158b;
            this.f38034a = bVar;
            this.f38037d = aVar;
            this.f38036c = z11;
            if (z10) {
                c6158b = new C6159c<>(i10);
            } else {
                c6158b = new C6158b<>(i10);
            }
            this.f38035b = c6158b;
        }

        void d() {
            boolean z10;
            if (getAndIncrement() == 0) {
                Su.e<T> eVar = this.f38035b;
                pw.b<? super T> bVar = this.f38034a;
                int iAddAndGet = 1;
                while (!c(this.f38040g, eVar.isEmpty(), bVar)) {
                    long j10 = this.f38042i.get();
                    long j11 = 0;
                    while (j11 != j10) {
                        boolean z11 = this.f38040g;
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
                    if (j11 != j10 || !c(this.f38040g, eVar.isEmpty(), bVar)) {
                        if (j11 != 0 && j10 != Long.MAX_VALUE) {
                            this.f38042i.addAndGet(-j11);
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
    protected void h(pw.b<? super T> bVar) {
        this.f38026b.g(new a(bVar, this.f38030c, this.f38031d, this.f38032e, this.f38033f));
    }

    public c(io.reactivex.f<T> fVar, int i10, boolean z10, boolean z11, Pu.a aVar) {
        super(fVar);
        this.f38030c = i10;
        this.f38031d = z10;
        this.f38032e = z11;
        this.f38033f = aVar;
    }
}
