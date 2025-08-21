package Tu;

import Lu.o;
import av.i;
import cv.C13558a;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class c<T, R> extends l<R> {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f36828a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends y<? extends R>> f36829b;

    /* renamed from: c, reason: collision with root package name */
    final i f36830c;

    /* renamed from: d, reason: collision with root package name */
    final int f36831d;

    static final class a<T, R> extends AtomicInteger implements s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final s<? super R> f36832a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends y<? extends R>> f36833b;

        /* renamed from: c, reason: collision with root package name */
        final av.c f36834c = new av.c();

        /* renamed from: d, reason: collision with root package name */
        final C0807a<R> f36835d = new C0807a<>(this);

        /* renamed from: e, reason: collision with root package name */
        final Ou.e<T> f36836e;

        /* renamed from: f, reason: collision with root package name */
        final i f36837f;

        /* renamed from: g, reason: collision with root package name */
        Ju.b f36838g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f36839h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f36840i;

        /* renamed from: j, reason: collision with root package name */
        R f36841j;

        /* renamed from: k, reason: collision with root package name */
        volatile int f36842k;

        /* renamed from: Tu.c$a$a, reason: collision with other inner class name */
        static final class C0807a<R> extends AtomicReference<Ju.b> implements w<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f36843a;

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f36843a.b(th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(R r10) {
                this.f36843a.c(r10);
            }

            C0807a(a<?, R> aVar) {
                this.f36843a = aVar;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.e(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f36840i = true;
            this.f36838g.dispose();
            this.f36835d.a();
            if (getAndIncrement() == 0) {
                this.f36836e.clear();
                this.f36841j = null;
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f36839h = true;
            a();
        }

        void b(Throwable th2) {
            if (!this.f36834c.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36837f != i.END) {
                this.f36838g.dispose();
            }
            this.f36842k = 0;
            a();
        }

        void c(R r10) {
            this.f36841j = r10;
            this.f36842k = 2;
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f36840i;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f36834c.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36837f == i.IMMEDIATE) {
                this.f36835d.a();
            }
            this.f36839h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f36836e.offer(t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f36838g, bVar)) {
                this.f36838g = bVar;
                this.f36832a.onSubscribe(this);
            }
        }

        a(s<? super R> sVar, o<? super T, ? extends y<? extends R>> oVar, int i10, i iVar) {
            this.f36832a = sVar;
            this.f36833b = oVar;
            this.f36837f = iVar;
            this.f36836e = new Wu.c(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            r2.clear();
            r10.f36841j = null;
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
                io.reactivex.s<? super R> r0 = r10.f36832a
                av.i r1 = r10.f36837f
                Ou.e<T> r2 = r10.f36836e
                av.c r3 = r10.f36834c
                r4 = 1
                r5 = r4
            L12:
                boolean r6 = r10.f36840i
                r7 = 0
                if (r6 == 0) goto L1e
                r2.clear()
                r10.f36841j = r7
                goto L99
            L1e:
                int r6 = r10.f36842k
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L3d
                av.i r8 = av.i.IMMEDIATE
                if (r1 == r8) goto L30
                av.i r8 = av.i.BOUNDARY
                if (r1 != r8) goto L3d
                if (r6 != 0) goto L3d
            L30:
                r2.clear()
                r10.f36841j = r7
                java.lang.Throwable r1 = r3.b()
                r0.onError(r1)
                return
            L3d:
                r8 = 0
                if (r6 != 0) goto L8b
                boolean r6 = r10.f36839h
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
                Lu.o<? super T, ? extends io.reactivex.y<? extends R>> r6 = r10.f36833b     // Catch: java.lang.Throwable -> L74
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L74
                java.lang.String r7 = "The mapper returned a null SingleSource"
                java.lang.Object r6 = Nu.b.e(r6, r7)     // Catch: java.lang.Throwable -> L74
                io.reactivex.y r6 = (io.reactivex.y) r6     // Catch: java.lang.Throwable -> L74
                r10.f36842k = r4
                Tu.c$a$a<R> r7 = r10.f36835d
                r6.a(r7)
                goto L99
            L74:
                r1 = move-exception
                Ku.a.b(r1)
                Ju.b r4 = r10.f36838g
                r4.dispose()
                r2.clear()
                r3.a(r1)
                java.lang.Throwable r1 = r3.b()
                r0.onError(r1)
                return
            L8b:
                r9 = 2
                if (r6 != r9) goto L99
                R r6 = r10.f36841j
                r10.f36841j = r7
                r0.onNext(r6)
                r10.f36842k = r8
                goto L12
            L99:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L12
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tu.c.a.a():void");
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super R> sVar) {
        if (g.c(this.f36828a, this.f36829b, sVar)) {
            return;
        }
        this.f36828a.subscribe(new a(sVar, this.f36829b, this.f36831d, this.f36830c));
    }

    public c(l<T> lVar, o<? super T, ? extends y<? extends R>> oVar, i iVar, int i10) {
        this.f36828a = lVar;
        this.f36829b = oVar;
        this.f36830c = iVar;
        this.f36831d = i10;
    }
}
