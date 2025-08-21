package Uu;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Uu.c1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5383c1<T> extends io.reactivex.l<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f38407a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends T> f38408b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.d<? super T, ? super T> f38409c;

    /* renamed from: d, reason: collision with root package name */
    final int f38410d;

    /* renamed from: Uu.c1$a */
    static final class a<T> extends AtomicInteger implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Boolean> f38411a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.d<? super T, ? super T> f38412b;

        /* renamed from: c, reason: collision with root package name */
        final Mu.a f38413c = new Mu.a(2);

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38414d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38415e;

        /* renamed from: f, reason: collision with root package name */
        final b<T>[] f38416f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38417g;

        /* renamed from: h, reason: collision with root package name */
        T f38418h;

        /* renamed from: i, reason: collision with root package name */
        T f38419i;

        void a(Wu.c<T> cVar, Wu.c<T> cVar2) {
            this.f38417g = true;
            cVar.clear();
            cVar2.clear();
        }

        boolean c(Ju.b bVar, int i10) {
            return this.f38413c.a(i10, bVar);
        }

        void d() {
            b<T>[] bVarArr = this.f38416f;
            this.f38414d.subscribe(bVarArr[0]);
            this.f38415e.subscribe(bVarArr[1]);
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38417g) {
                return;
            }
            this.f38417g = true;
            this.f38413c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f38416f;
                bVarArr[0].f38421b.clear();
                bVarArr[1].f38421b.clear();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38417g;
        }

        a(io.reactivex.s<? super Boolean> sVar, int i10, io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Lu.d<? super T, ? super T> dVar) {
            this.f38411a = sVar;
            this.f38414d = qVar;
            this.f38415e = qVar2;
            this.f38412b = dVar;
            this.f38416f = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        void b() {
            boolean z10;
            boolean z11;
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f38416f;
                b<T> bVar = bVarArr[0];
                Wu.c<T> cVar = bVar.f38421b;
                b<T> bVar2 = bVarArr[1];
                Wu.c<T> cVar2 = bVar2.f38421b;
                int iAddAndGet = 1;
                while (!this.f38417g) {
                    boolean z12 = bVar.f38423d;
                    if (z12 && (th3 = bVar.f38424e) != null) {
                        a(cVar, cVar2);
                        this.f38411a.onError(th3);
                        return;
                    }
                    boolean z13 = bVar2.f38423d;
                    if (z13 && (th2 = bVar2.f38424e) != null) {
                        a(cVar, cVar2);
                        this.f38411a.onError(th2);
                        return;
                    }
                    if (this.f38418h == null) {
                        this.f38418h = cVar.poll();
                    }
                    if (this.f38418h == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f38419i == null) {
                        this.f38419i = cVar2.poll();
                    }
                    T t10 = this.f38419i;
                    if (t10 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z13 && z10 && z11) {
                        this.f38411a.onNext(Boolean.TRUE);
                        this.f38411a.onComplete();
                        return;
                    }
                    if (z12 && z13 && z10 != z11) {
                        a(cVar, cVar2);
                        this.f38411a.onNext(Boolean.FALSE);
                        this.f38411a.onComplete();
                        return;
                    }
                    if (!z10 && !z11) {
                        try {
                            if (!this.f38412b.test(this.f38418h, t10)) {
                                a(cVar, cVar2);
                                this.f38411a.onNext(Boolean.FALSE);
                                this.f38411a.onComplete();
                                return;
                            }
                            this.f38418h = null;
                            this.f38419i = null;
                        } catch (Throwable th4) {
                            Ku.a.b(th4);
                            a(cVar, cVar2);
                            this.f38411a.onError(th4);
                            return;
                        }
                    }
                    if (z10 || z11) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                cVar.clear();
                cVar2.clear();
            }
        }
    }

    /* renamed from: Uu.c1$b */
    static final class b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f38420a;

        /* renamed from: b, reason: collision with root package name */
        final Wu.c<T> f38421b;

        /* renamed from: c, reason: collision with root package name */
        final int f38422c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f38423d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f38424e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38423d = true;
            this.f38420a.b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38424e = th2;
            this.f38423d = true;
            this.f38420a.b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38421b.offer(t10);
            this.f38420a.b();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38420a.c(bVar, this.f38422c);
        }

        b(a<T> aVar, int i10, int i11) {
            this.f38420a = aVar;
            this.f38422c = i10;
            this.f38421b = new Wu.c<>(i11);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Boolean> sVar) {
        a aVar = new a(sVar, this.f38410d, this.f38407a, this.f38408b, this.f38409c);
        sVar.onSubscribe(aVar);
        aVar.d();
    }

    public C5383c1(io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Lu.d<? super T, ? super T> dVar, int i10) {
        this.f38407a = qVar;
        this.f38408b = qVar2;
        this.f38409c = dVar;
        this.f38410d = i10;
    }
}
