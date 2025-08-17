package Yu;

import av.C6159c;
import gv.C14313a;
import io.reactivex.t;

/* loaded from: classes9.dex */
public final class D0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f40608b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f40609c;

    /* renamed from: d, reason: collision with root package name */
    final int f40610d;

    static final class a<T> extends Tu.b<T> implements io.reactivex.s<T>, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40611a;

        /* renamed from: b, reason: collision with root package name */
        final t.c f40612b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f40613c;

        /* renamed from: d, reason: collision with root package name */
        final int f40614d;

        /* renamed from: e, reason: collision with root package name */
        Su.f<T> f40615e;

        /* renamed from: f, reason: collision with root package name */
        Nu.b f40616f;

        /* renamed from: g, reason: collision with root package name */
        Throwable f40617g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f40618h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f40619i;

        /* renamed from: j, reason: collision with root package name */
        int f40620j;

        /* renamed from: k, reason: collision with root package name */
        boolean f40621k;

        @Override // Su.c
        public int a(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f40621k = true;
            return 2;
        }

        void e() {
            int iAddAndGet = 1;
            while (!this.f40619i) {
                boolean z10 = this.f40618h;
                Throwable th2 = this.f40617g;
                if (!this.f40613c && z10 && th2 != null) {
                    this.f40619i = true;
                    this.f40611a.onError(this.f40617g);
                    this.f40612b.dispose();
                    return;
                }
                this.f40611a.onNext(null);
                if (z10) {
                    this.f40619i = true;
                    Throwable th3 = this.f40617g;
                    if (th3 != null) {
                        this.f40611a.onError(th3);
                    } else {
                        this.f40611a.onComplete();
                    }
                    this.f40612b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        boolean b(boolean z10, boolean z11, io.reactivex.s<? super T> sVar) {
            if (this.f40619i) {
                this.f40615e.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f40617g;
            if (this.f40613c) {
                if (!z11) {
                    return false;
                }
                this.f40619i = true;
                if (th2 != null) {
                    sVar.onError(th2);
                } else {
                    sVar.onComplete();
                }
                this.f40612b.dispose();
                return true;
            }
            if (th2 != null) {
                this.f40619i = true;
                this.f40615e.clear();
                sVar.onError(th2);
                this.f40612b.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f40619i = true;
            sVar.onComplete();
            this.f40612b.dispose();
            return true;
        }

        @Override // Su.f
        public void clear() {
            this.f40615e.clear();
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f40619i) {
                return;
            }
            this.f40619i = true;
            this.f40616f.dispose();
            this.f40612b.dispose();
            if (this.f40621k || getAndIncrement() != 0) {
                return;
            }
            this.f40615e.clear();
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
                Su.f<T> r0 = r7.f40615e
                io.reactivex.s<? super T> r1 = r7.f40611a
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.f40618h
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.b(r4, r5, r1)
                if (r4 == 0) goto L13
                goto L2e
            L13:
                boolean r4 = r7.f40618h
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
                Ou.a.b(r3)
                r7.f40619i = r2
                Nu.b r2 = r7.f40616f
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                io.reactivex.t$c r0 = r7.f40612b
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yu.D0.a.f():void");
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40619i;
        }

        @Override // Su.f
        public boolean isEmpty() {
            return this.f40615e.isEmpty();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40618h) {
                return;
            }
            this.f40618h = true;
            g();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40618h) {
                C14313a.s(th2);
                return;
            }
            this.f40617g = th2;
            this.f40618h = true;
            g();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40618h) {
                return;
            }
            if (this.f40620j != 2) {
                this.f40615e.offer(t10);
            }
            g();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40616f, bVar)) {
                this.f40616f = bVar;
                if (bVar instanceof Su.b) {
                    Su.b bVar2 = (Su.b) bVar;
                    int iA = bVar2.a(7);
                    if (iA == 1) {
                        this.f40620j = iA;
                        this.f40615e = bVar2;
                        this.f40618h = true;
                        this.f40611a.onSubscribe(this);
                        g();
                        return;
                    }
                    if (iA == 2) {
                        this.f40620j = iA;
                        this.f40615e = bVar2;
                        this.f40611a.onSubscribe(this);
                        return;
                    }
                }
                this.f40615e = new C6159c(this.f40614d);
                this.f40611a.onSubscribe(this);
            }
        }

        @Override // Su.f
        public T poll() throws Exception {
            return this.f40615e.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40621k) {
                e();
            } else {
                f();
            }
        }

        a(io.reactivex.s<? super T> sVar, t.c cVar, boolean z10, int i10) {
            this.f40611a = sVar;
            this.f40612b = cVar;
            this.f40613c = z10;
            this.f40614d = i10;
        }

        void g() {
            if (getAndIncrement() == 0) {
                this.f40612b.b(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        io.reactivex.t tVar = this.f40608b;
        if (tVar instanceof bv.n) {
            this.f41135a.subscribe(sVar);
        } else {
            this.f41135a.subscribe(new a(sVar, tVar.b(), this.f40609c, this.f40610d));
        }
    }

    public D0(io.reactivex.q<T> qVar, io.reactivex.t tVar, boolean z10, int i10) {
        super(qVar);
        this.f40608b = tVar;
        this.f40609c = z10;
        this.f40610d = i10;
    }
}
