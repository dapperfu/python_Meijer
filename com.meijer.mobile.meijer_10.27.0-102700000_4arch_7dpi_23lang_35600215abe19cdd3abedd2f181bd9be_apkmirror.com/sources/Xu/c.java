package Xu;

import Pu.o;
import av.C6159c;
import ev.i;
import gv.C14313a;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class c<T, R> extends l<R> {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f39852a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends y<? extends R>> f39853b;

    /* renamed from: c, reason: collision with root package name */
    final i f39854c;

    /* renamed from: d, reason: collision with root package name */
    final int f39855d;

    static final class a<T, R> extends AtomicInteger implements s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final s<? super R> f39856a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends y<? extends R>> f39857b;

        /* renamed from: c, reason: collision with root package name */
        final ev.c f39858c = new ev.c();

        /* renamed from: d, reason: collision with root package name */
        final C0854a<R> f39859d = new C0854a<>(this);

        /* renamed from: e, reason: collision with root package name */
        final Su.e<T> f39860e;

        /* renamed from: f, reason: collision with root package name */
        final i f39861f;

        /* renamed from: g, reason: collision with root package name */
        Nu.b f39862g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f39863h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f39864i;

        /* renamed from: j, reason: collision with root package name */
        R f39865j;

        /* renamed from: k, reason: collision with root package name */
        volatile int f39866k;

        /* renamed from: Xu.c$a$a, reason: collision with other inner class name */
        static final class C0854a<R> extends AtomicReference<Nu.b> implements w<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f39867a;

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f39867a.b(th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(R r10) {
                this.f39867a.c(r10);
            }

            C0854a(a<?, R> aVar) {
                this.f39867a = aVar;
            }

            void a() {
                Qu.d.a(this);
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.e(this, bVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f39864i = true;
            this.f39862g.dispose();
            this.f39859d.a();
            if (getAndIncrement() == 0) {
                this.f39860e.clear();
                this.f39865j = null;
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39863h = true;
            a();
        }

        void b(Throwable th2) {
            if (!this.f39858c.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f39861f != i.END) {
                this.f39862g.dispose();
            }
            this.f39866k = 0;
            a();
        }

        void c(R r10) {
            this.f39865j = r10;
            this.f39866k = 2;
            a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f39864i;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f39858c.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f39861f == i.IMMEDIATE) {
                this.f39859d.a();
            }
            this.f39863h = true;
            a();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f39860e.offer(t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f39862g, bVar)) {
                this.f39862g = bVar;
                this.f39856a.onSubscribe(this);
            }
        }

        a(s<? super R> sVar, o<? super T, ? extends y<? extends R>> oVar, int i10, i iVar) {
            this.f39856a = sVar;
            this.f39857b = oVar;
            this.f39861f = iVar;
            this.f39860e = new C6159c(i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            r2.clear();
            r10.f39865j = null;
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
                io.reactivex.s<? super R> r0 = r10.f39856a
                ev.i r1 = r10.f39861f
                Su.e<T> r2 = r10.f39860e
                ev.c r3 = r10.f39858c
                r4 = 1
                r5 = r4
            L12:
                boolean r6 = r10.f39864i
                r7 = 0
                if (r6 == 0) goto L1e
                r2.clear()
                r10.f39865j = r7
                goto L99
            L1e:
                int r6 = r10.f39866k
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L3d
                ev.i r8 = ev.i.IMMEDIATE
                if (r1 == r8) goto L30
                ev.i r8 = ev.i.BOUNDARY
                if (r1 != r8) goto L3d
                if (r6 != 0) goto L3d
            L30:
                r2.clear()
                r10.f39865j = r7
                java.lang.Throwable r1 = r3.b()
                r0.onError(r1)
                return
            L3d:
                r8 = 0
                if (r6 != 0) goto L8b
                boolean r6 = r10.f39863h
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
                Pu.o<? super T, ? extends io.reactivex.y<? extends R>> r6 = r10.f39857b     // Catch: java.lang.Throwable -> L74
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L74
                java.lang.String r7 = "The mapper returned a null SingleSource"
                java.lang.Object r6 = Ru.b.e(r6, r7)     // Catch: java.lang.Throwable -> L74
                io.reactivex.y r6 = (io.reactivex.y) r6     // Catch: java.lang.Throwable -> L74
                r10.f39866k = r4
                Xu.c$a$a<R> r7 = r10.f39859d
                r6.a(r7)
                goto L99
            L74:
                r1 = move-exception
                Ou.a.b(r1)
                Nu.b r4 = r10.f39862g
                r4.dispose()
                r2.clear()
                r3.a(r1)
                java.lang.Throwable r1 = r3.b()
                r0.onError(r1)
                return
            L8b:
                r9 = 2
                if (r6 != r9) goto L99
                R r6 = r10.f39865j
                r10.f39865j = r7
                r0.onNext(r6)
                r10.f39866k = r8
                goto L12
            L99:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L12
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Xu.c.a.a():void");
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super R> sVar) {
        if (g.c(this.f39852a, this.f39853b, sVar)) {
            return;
        }
        this.f39852a.subscribe(new a(sVar, this.f39853b, this.f39855d, this.f39854c));
    }

    public c(l<T> lVar, o<? super T, ? extends y<? extends R>> oVar, i iVar, int i10) {
        this.f39852a = lVar;
        this.f39853b = oVar;
        this.f39854c = iVar;
        this.f39855d = i10;
    }
}
