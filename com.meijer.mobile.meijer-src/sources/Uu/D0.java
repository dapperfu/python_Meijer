package Uu;

import cv.C13558a;
import io.reactivex.t;

/* loaded from: classes10.dex */
public final class D0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f37833b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f37834c;

    /* renamed from: d, reason: collision with root package name */
    final int f37835d;

    static final class a<T> extends Pu.b<T> implements io.reactivex.s<T>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f37836a;

        /* renamed from: b, reason: collision with root package name */
        final t.c f37837b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f37838c;

        /* renamed from: d, reason: collision with root package name */
        final int f37839d;

        /* renamed from: e, reason: collision with root package name */
        Ou.f<T> f37840e;

        /* renamed from: f, reason: collision with root package name */
        Ju.b f37841f;

        /* renamed from: g, reason: collision with root package name */
        Throwable f37842g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f37843h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f37844i;

        /* renamed from: j, reason: collision with root package name */
        int f37845j;

        /* renamed from: k, reason: collision with root package name */
        boolean f37846k;

        @Override // Ou.c
        public int a(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f37846k = true;
            return 2;
        }

        void e() {
            int iAddAndGet = 1;
            while (!this.f37844i) {
                boolean z10 = this.f37843h;
                Throwable th2 = this.f37842g;
                if (!this.f37838c && z10 && th2 != null) {
                    this.f37844i = true;
                    this.f37836a.onError(this.f37842g);
                    this.f37837b.dispose();
                    return;
                }
                this.f37836a.onNext(null);
                if (z10) {
                    this.f37844i = true;
                    Throwable th3 = this.f37842g;
                    if (th3 != null) {
                        this.f37836a.onError(th3);
                    } else {
                        this.f37836a.onComplete();
                    }
                    this.f37837b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        boolean b(boolean z10, boolean z11, io.reactivex.s<? super T> sVar) {
            if (this.f37844i) {
                this.f37840e.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f37842g;
            if (this.f37838c) {
                if (!z11) {
                    return false;
                }
                this.f37844i = true;
                if (th2 != null) {
                    sVar.onError(th2);
                } else {
                    sVar.onComplete();
                }
                this.f37837b.dispose();
                return true;
            }
            if (th2 != null) {
                this.f37844i = true;
                this.f37840e.clear();
                sVar.onError(th2);
                this.f37837b.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f37844i = true;
            sVar.onComplete();
            this.f37837b.dispose();
            return true;
        }

        @Override // Ou.f
        public void clear() {
            this.f37840e.clear();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f37844i) {
                return;
            }
            this.f37844i = true;
            this.f37841f.dispose();
            this.f37837b.dispose();
            if (this.f37846k || getAndIncrement() != 0) {
                return;
            }
            this.f37840e.clear();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void f() {
            /*
                r7 = this;
                Ou.f<T> r0 = r7.f37840e
                io.reactivex.s<? super T> r1 = r7.f37836a
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.f37843h
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.b(r4, r5, r1)
                if (r4 == 0) goto L13
                goto L2e
            L13:
                boolean r4 = r7.f37843h
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.b(r4, r6, r1)
                if (r4 == 0) goto L25
                goto L2e
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
            L2e:
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r3 = move-exception
                Ku.a.b(r3)
                r7.f37844i = r2
                Ju.b r2 = r7.f37841f
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                io.reactivex.t$c r0 = r7.f37837b
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Uu.D0.a.f():void");
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37844i;
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return this.f37840e.isEmpty();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37843h) {
                return;
            }
            this.f37843h = true;
            g();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37843h) {
                C13558a.s(th2);
                return;
            }
            this.f37842g = th2;
            this.f37843h = true;
            g();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f37843h) {
                return;
            }
            if (this.f37845j != 2) {
                this.f37840e.offer(t10);
            }
            g();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f37841f, bVar)) {
                this.f37841f = bVar;
                if (bVar instanceof Ou.b) {
                    Ou.b bVar2 = (Ou.b) bVar;
                    int iA = bVar2.a(7);
                    if (iA == 1) {
                        this.f37845j = iA;
                        this.f37840e = bVar2;
                        this.f37843h = true;
                        this.f37836a.onSubscribe(this);
                        g();
                        return;
                    }
                    if (iA == 2) {
                        this.f37845j = iA;
                        this.f37840e = bVar2;
                        this.f37836a.onSubscribe(this);
                        return;
                    }
                }
                this.f37840e = new Wu.c(this.f37839d);
                this.f37836a.onSubscribe(this);
            }
        }

        @Override // Ou.f
        public T poll() throws Exception {
            return this.f37840e.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37846k) {
                e();
            } else {
                f();
            }
        }

        a(io.reactivex.s<? super T> sVar, t.c cVar, boolean z10, int i10) {
            this.f37836a = sVar;
            this.f37837b = cVar;
            this.f37838c = z10;
            this.f37839d = i10;
        }

        void g() {
            if (getAndIncrement() == 0) {
                this.f37837b.b(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.t tVar = this.f37833b;
        if (tVar instanceof Xu.n) {
            this.f38360a.subscribe(sVar);
        } else {
            this.f38360a.subscribe(new a(sVar, tVar.b(), this.f37834c, this.f37835d));
        }
    }

    public D0(io.reactivex.q<T> qVar, io.reactivex.t tVar, boolean z10, int i10) {
        super(qVar);
        this.f37833b = tVar;
        this.f37834c = z10;
        this.f37835d = i10;
    }
}
