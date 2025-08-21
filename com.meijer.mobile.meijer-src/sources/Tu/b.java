package Tu;

import Lu.o;
import av.i;
import cv.C13558a;
import io.reactivex.j;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class b<T, R> extends l<R> {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f36812a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends j<? extends R>> f36813b;

    /* renamed from: c, reason: collision with root package name */
    final i f36814c;

    /* renamed from: d, reason: collision with root package name */
    final int f36815d;

    static final class a<T, R> extends AtomicInteger implements s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final s<? super R> f36816a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends j<? extends R>> f36817b;

        /* renamed from: c, reason: collision with root package name */
        final av.c f36818c = new av.c();

        /* renamed from: d, reason: collision with root package name */
        final C0806a<R> f36819d = new C0806a<>(this);

        /* renamed from: e, reason: collision with root package name */
        final Ou.e<T> f36820e;

        /* renamed from: f, reason: collision with root package name */
        final i f36821f;

        /* renamed from: g, reason: collision with root package name */
        Ju.b f36822g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f36823h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f36824i;

        /* renamed from: j, reason: collision with root package name */
        R f36825j;

        /* renamed from: k, reason: collision with root package name */
        volatile int f36826k;

        /* renamed from: Tu.b$a$a, reason: collision with other inner class name */
        static final class C0806a<R> extends AtomicReference<Ju.b> implements io.reactivex.i<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f36827a;

            @Override // io.reactivex.i
            public void onComplete() {
                this.f36827a.b();
            }

            @Override // io.reactivex.i
            public void onError(Throwable th2) {
                this.f36827a.c(th2);
            }

            @Override // io.reactivex.i
            public void onSuccess(R r10) {
                this.f36827a.d(r10);
            }

            C0806a(a<?, R> aVar) {
                this.f36827a = aVar;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.e(this, bVar);
            }
        }

        void b() {
            this.f36826k = 0;
            a();
        }

        @Override // Ju.b
        public void dispose() {
            this.f36824i = true;
            this.f36822g.dispose();
            this.f36819d.a();
            if (getAndIncrement() == 0) {
                this.f36820e.clear();
                this.f36825j = null;
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f36823h = true;
            a();
        }

        void c(Throwable th2) {
            if (!this.f36818c.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36821f != i.END) {
                this.f36822g.dispose();
            }
            this.f36826k = 0;
            a();
        }

        void d(R r10) {
            this.f36825j = r10;
            this.f36826k = 2;
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f36824i;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f36818c.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36821f == i.IMMEDIATE) {
                this.f36819d.a();
            }
            this.f36823h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f36820e.offer(t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f36822g, bVar)) {
                this.f36822g = bVar;
                this.f36816a.onSubscribe(this);
            }
        }

        a(s<? super R> sVar, o<? super T, ? extends j<? extends R>> oVar, int i10, i iVar) {
            this.f36816a = sVar;
            this.f36817b = oVar;
            this.f36821f = iVar;
            this.f36820e = new Wu.c(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            r2.clear();
            r10.f36825j = null;
            r0.onError(r3.b());
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void a() {
            /*
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L8
                goto La0
            L8:
                io.reactivex.s<? super R> r0 = r10.f36816a
                av.i r1 = r10.f36821f
                Ou.e<T> r2 = r10.f36820e
                av.c r3 = r10.f36818c
                r4 = 1
                r5 = r4
            L12:
                boolean r6 = r10.f36824i
                r7 = 0
                if (r6 == 0) goto L1e
                r2.clear()
                r10.f36825j = r7
                goto L99
            L1e:
                int r6 = r10.f36826k
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L3d
                av.i r8 = av.i.IMMEDIATE
                if (r1 == r8) goto L30
                av.i r8 = av.i.BOUNDARY
                if (r1 != r8) goto L3d
                if (r6 != 0) goto L3d
            L30:
                r2.clear()
                r10.f36825j = r7
                java.lang.Throwable r1 = r3.b()
                r0.onError(r1)
                return
            L3d:
                r8 = 0
                if (r6 != 0) goto L8b
                boolean r6 = r10.f36823h
                java.lang.Object r7 = r2.poll()
                if (r7 != 0) goto L49
                r8 = r4
            L49:
                if (r6 == 0) goto L5b
                if (r8 == 0) goto L5b
                java.lang.Throwable r1 = r3.b()
                if (r1 != 0) goto L57
                r0.onComplete()
                return
            L57:
                r0.onError(r1)
                return
            L5b:
                if (r8 == 0) goto L5e
                goto L99
            L5e:
                Lu.o<? super T, ? extends io.reactivex.j<? extends R>> r6 = r10.f36817b     // Catch: java.lang.Throwable -> L74
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L74
                java.lang.String r7 = "The mapper returned a null MaybeSource"
                java.lang.Object r6 = Nu.b.e(r6, r7)     // Catch: java.lang.Throwable -> L74
                io.reactivex.j r6 = (io.reactivex.j) r6     // Catch: java.lang.Throwable -> L74
                r10.f36826k = r4
                Tu.b$a$a<R> r7 = r10.f36819d
                r6.a(r7)
                goto L99
            L74:
                r1 = move-exception
                Ku.a.b(r1)
                Ju.b r4 = r10.f36822g
                r4.dispose()
                r2.clear()
                r3.a(r1)
                java.lang.Throwable r1 = r3.b()
                r0.onError(r1)
                return
            L8b:
                r9 = 2
                if (r6 != r9) goto L99
                R r6 = r10.f36825j
                r10.f36825j = r7
                r0.onNext(r6)
                r10.f36826k = r8
                goto L12
            L99:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L12
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tu.b.a.a():void");
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super R> sVar) {
        if (g.b(this.f36812a, this.f36813b, sVar)) {
            return;
        }
        this.f36812a.subscribe(new a(sVar, this.f36813b, this.f36815d, this.f36814c));
    }

    public b(l<T> lVar, o<? super T, ? extends j<? extends R>> oVar, i iVar, int i10) {
        this.f36812a = lVar;
        this.f36813b = oVar;
        this.f36814c = iVar;
        this.f36815d = i10;
    }
}
