package Uu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class x1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f38982b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f38983c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f38984d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f38985e;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38986a;

        /* renamed from: b, reason: collision with root package name */
        final long f38987b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f38988c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f38989d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f38990e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<T> f38991f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        Ju.b f38992g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f38993h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f38994i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f38995j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f38996k;

        /* renamed from: l, reason: collision with root package name */
        boolean f38997l;

        @Override // Ju.b
        public void dispose() {
            this.f38995j = true;
            this.f38992g.dispose();
            this.f38989d.dispose();
            if (getAndIncrement() == 0) {
                this.f38991f.lazySet(null);
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38993h = true;
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38996k = true;
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38995j;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38994i = th2;
            this.f38993h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38991f.set(t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38992g, bVar)) {
                this.f38992g = bVar;
                this.f38986a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar, boolean z10) {
            this.f38986a = sVar;
            this.f38987b = j10;
            this.f38988c = timeUnit;
            this.f38989d = cVar;
            this.f38990e = z10;
        }

        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.f38991f;
                io.reactivex.s<? super T> sVar = this.f38986a;
                int iAddAndGet = 1;
                while (!this.f38995j) {
                    boolean z11 = this.f38993h;
                    if (z11 && this.f38994i != null) {
                        atomicReference.lazySet(null);
                        sVar.onError(this.f38994i);
                        this.f38989d.dispose();
                        return;
                    }
                    if (atomicReference.get() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11) {
                        T andSet = atomicReference.getAndSet(null);
                        if (!z10 && this.f38990e) {
                            sVar.onNext(andSet);
                        }
                        sVar.onComplete();
                        this.f38989d.dispose();
                        return;
                    }
                    if (z10) {
                        if (this.f38996k) {
                            this.f38997l = false;
                            this.f38996k = false;
                        }
                    } else if (!this.f38997l || this.f38996k) {
                        sVar.onNext(atomicReference.getAndSet(null));
                        this.f38996k = false;
                        this.f38997l = true;
                        this.f38989d.c(this, this.f38987b, this.f38988c);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38982b, this.f38983c, this.f38984d.b(), this.f38985e));
    }

    public x1(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, boolean z10) {
        super(lVar);
        this.f38982b = j10;
        this.f38983c = timeUnit;
        this.f38984d = tVar;
        this.f38985e = z10;
    }
}
