package Yu;

import av.C6159c;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Yu.d1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5447d1<T> extends io.reactivex.u<Boolean> implements Su.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41206a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41207b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.d<? super T, ? super T> f41208c;

    /* renamed from: d, reason: collision with root package name */
    final int f41209d;

    /* renamed from: Yu.d1$a */
    static final class a<T> extends AtomicInteger implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f41210a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.d<? super T, ? super T> f41211b;

        /* renamed from: c, reason: collision with root package name */
        final Qu.a f41212c = new Qu.a(2);

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.q<? extends T> f41213d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.q<? extends T> f41214e;

        /* renamed from: f, reason: collision with root package name */
        final b<T>[] f41215f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41216g;

        /* renamed from: h, reason: collision with root package name */
        T f41217h;

        /* renamed from: i, reason: collision with root package name */
        T f41218i;

        void a(C6159c<T> c6159c, C6159c<T> c6159c2) {
            this.f41216g = true;
            c6159c.clear();
            c6159c2.clear();
        }

        boolean c(Nu.b bVar, int i10) {
            return this.f41212c.a(i10, bVar);
        }

        void d() {
            b<T>[] bVarArr = this.f41215f;
            this.f41213d.subscribe(bVarArr[0]);
            this.f41214e.subscribe(bVarArr[1]);
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41216g) {
                return;
            }
            this.f41216g = true;
            this.f41212c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f41215f;
                bVarArr[0].f41220b.clear();
                bVarArr[1].f41220b.clear();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41216g;
        }

        a(io.reactivex.w<? super Boolean> wVar, int i10, io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Pu.d<? super T, ? super T> dVar) {
            this.f41210a = wVar;
            this.f41213d = qVar;
            this.f41214e = qVar2;
            this.f41211b = dVar;
            this.f41215f = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        void b() {
            boolean z10;
            boolean z11;
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f41215f;
                b<T> bVar = bVarArr[0];
                C6159c<T> c6159c = bVar.f41220b;
                b<T> bVar2 = bVarArr[1];
                C6159c<T> c6159c2 = bVar2.f41220b;
                int iAddAndGet = 1;
                while (!this.f41216g) {
                    boolean z12 = bVar.f41222d;
                    if (z12 && (th3 = bVar.f41223e) != null) {
                        a(c6159c, c6159c2);
                        this.f41210a.onError(th3);
                        return;
                    }
                    boolean z13 = bVar2.f41222d;
                    if (z13 && (th2 = bVar2.f41223e) != null) {
                        a(c6159c, c6159c2);
                        this.f41210a.onError(th2);
                        return;
                    }
                    if (this.f41217h == null) {
                        this.f41217h = c6159c.poll();
                    }
                    if (this.f41217h == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f41218i == null) {
                        this.f41218i = c6159c2.poll();
                    }
                    T t10 = this.f41218i;
                    if (t10 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z13 && z10 && z11) {
                        this.f41210a.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z12 && z13 && z10 != z11) {
                        a(c6159c, c6159c2);
                        this.f41210a.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if (!z10 && !z11) {
                        try {
                            if (!this.f41211b.test(this.f41217h, t10)) {
                                a(c6159c, c6159c2);
                                this.f41210a.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f41217h = null;
                                this.f41218i = null;
                            }
                        } catch (Throwable th4) {
                            Ou.a.b(th4);
                            a(c6159c, c6159c2);
                            this.f41210a.onError(th4);
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
                c6159c.clear();
                c6159c2.clear();
            }
        }
    }

    /* renamed from: Yu.d1$b */
    static final class b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f41219a;

        /* renamed from: b, reason: collision with root package name */
        final C6159c<T> f41220b;

        /* renamed from: c, reason: collision with root package name */
        final int f41221c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f41222d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f41223e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41222d = true;
            this.f41219a.b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41223e = th2;
            this.f41222d = true;
            this.f41219a.b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41220b.offer(t10);
            this.f41219a.b();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41219a.c(bVar, this.f41221c);
        }

        b(a<T> aVar, int i10, int i11) {
            this.f41219a = aVar;
            this.f41221c = i10;
            this.f41220b = new C6159c<>(i11);
        }
    }

    @Override // Su.a
    public io.reactivex.l<Boolean> b() {
        return C14313a.o(new C5444c1(this.f41206a, this.f41207b, this.f41208c, this.f41209d));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super Boolean> wVar) {
        a aVar = new a(wVar, this.f41209d, this.f41206a, this.f41207b, this.f41208c);
        wVar.onSubscribe(aVar);
        aVar.d();
    }

    public C5447d1(io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Pu.d<? super T, ? super T> dVar, int i10) {
        this.f41206a = qVar;
        this.f41207b = qVar2;
        this.f41208c = dVar;
        this.f41209d = i10;
    }
}
