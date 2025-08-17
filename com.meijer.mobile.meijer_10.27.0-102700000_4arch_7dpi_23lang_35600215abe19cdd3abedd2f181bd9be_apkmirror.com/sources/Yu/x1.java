package Yu;

import io.reactivex.t;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class x1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final long f41757b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f41758c;

    /* renamed from: d, reason: collision with root package name */
    final io.reactivex.t f41759d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f41760e;

    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41761a;

        /* renamed from: b, reason: collision with root package name */
        final long f41762b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f41763c;

        /* renamed from: d, reason: collision with root package name */
        final t.c f41764d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f41765e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference<T> f41766f = new AtomicReference<>();

        /* renamed from: g, reason: collision with root package name */
        Nu.b f41767g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f41768h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f41769i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f41770j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f41771k;

        /* renamed from: l, reason: collision with root package name */
        boolean f41772l;

        @Override // Nu.b
        public void dispose() {
            this.f41770j = true;
            this.f41767g.dispose();
            this.f41764d.dispose();
            if (getAndIncrement() == 0) {
                this.f41766f.lazySet(null);
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41768h = true;
            a();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f41771k = true;
            a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41770j;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41769i = th2;
            this.f41768h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41766f.set(t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41767g, bVar)) {
                this.f41767g = bVar;
                this.f41761a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, long j10, TimeUnit timeUnit, t.c cVar, boolean z10) {
            this.f41761a = sVar;
            this.f41762b = j10;
            this.f41763c = timeUnit;
            this.f41764d = cVar;
            this.f41765e = z10;
        }

        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.f41766f;
                io.reactivex.s<? super T> sVar = this.f41761a;
                int iAddAndGet = 1;
                while (!this.f41770j) {
                    boolean z11 = this.f41768h;
                    if (z11 && this.f41769i != null) {
                        atomicReference.lazySet(null);
                        sVar.onError(this.f41769i);
                        this.f41764d.dispose();
                        return;
                    }
                    if (atomicReference.get() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11) {
                        T andSet = atomicReference.getAndSet(null);
                        if (!z10 && this.f41765e) {
                            sVar.onNext(andSet);
                        }
                        sVar.onComplete();
                        this.f41764d.dispose();
                        return;
                    }
                    if (z10) {
                        if (this.f41771k) {
                            this.f41772l = false;
                            this.f41771k = false;
                        }
                    } else if (!this.f41772l || this.f41771k) {
                        sVar.onNext(atomicReference.getAndSet(null));
                        this.f41771k = false;
                        this.f41772l = true;
                        this.f41764d.c(this, this.f41762b, this.f41763c);
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
        this.f41135a.subscribe(new a(sVar, this.f41757b, this.f41758c, this.f41759d.b(), this.f41760e));
    }

    public x1(io.reactivex.l<T> lVar, long j10, TimeUnit timeUnit, io.reactivex.t tVar, boolean z10) {
        super(lVar);
        this.f41757b = j10;
        this.f41758c = timeUnit;
        this.f41759d = tVar;
        this.f41760e = z10;
    }
}
