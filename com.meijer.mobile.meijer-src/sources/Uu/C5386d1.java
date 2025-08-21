package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Uu.d1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5386d1<T> extends io.reactivex.u<Boolean> implements Ou.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f38431a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends T> f38432b;

    /* renamed from: c, reason: collision with root package name */
    final Lu.d<? super T, ? super T> f38433c;

    /* renamed from: d, reason: collision with root package name */
    final int f38434d;

    /* renamed from: Uu.d1$a */
    static final class a<T> extends AtomicInteger implements Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f38435a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.d<? super T, ? super T> f38436b;

        /* renamed from: c, reason: collision with root package name */
        final Mu.a f38437c = new Mu.a(2);

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38438d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38439e;

        /* renamed from: f, reason: collision with root package name */
        final b<T>[] f38440f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38441g;

        /* renamed from: h, reason: collision with root package name */
        T f38442h;

        /* renamed from: i, reason: collision with root package name */
        T f38443i;

        void a(Wu.c<T> cVar, Wu.c<T> cVar2) {
            this.f38441g = true;
            cVar.clear();
            cVar2.clear();
        }

        boolean c(Ju.b bVar, int i10) {
            return this.f38437c.a(i10, bVar);
        }

        void d() {
            b<T>[] bVarArr = this.f38440f;
            this.f38438d.subscribe(bVarArr[0]);
            this.f38439e.subscribe(bVarArr[1]);
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38441g) {
                return;
            }
            this.f38441g = true;
            this.f38437c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f38440f;
                bVarArr[0].f38445b.clear();
                bVarArr[1].f38445b.clear();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38441g;
        }

        a(io.reactivex.w<? super Boolean> wVar, int i10, io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Lu.d<? super T, ? super T> dVar) {
            this.f38435a = wVar;
            this.f38438d = qVar;
            this.f38439e = qVar2;
            this.f38436b = dVar;
            this.f38440f = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        void b() {
            boolean z10;
            boolean z11;
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f38440f;
                b<T> bVar = bVarArr[0];
                Wu.c<T> cVar = bVar.f38445b;
                b<T> bVar2 = bVarArr[1];
                Wu.c<T> cVar2 = bVar2.f38445b;
                int iAddAndGet = 1;
                while (!this.f38441g) {
                    boolean z12 = bVar.f38447d;
                    if (z12 && (th3 = bVar.f38448e) != null) {
                        a(cVar, cVar2);
                        this.f38435a.onError(th3);
                        return;
                    }
                    boolean z13 = bVar2.f38447d;
                    if (z13 && (th2 = bVar2.f38448e) != null) {
                        a(cVar, cVar2);
                        this.f38435a.onError(th2);
                        return;
                    }
                    if (this.f38442h == null) {
                        this.f38442h = cVar.poll();
                    }
                    if (this.f38442h == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f38443i == null) {
                        this.f38443i = cVar2.poll();
                    }
                    T t10 = this.f38443i;
                    if (t10 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z13 && z10 && z11) {
                        this.f38435a.onSuccess(Boolean.TRUE);
                        return;
                    }
                    if (z12 && z13 && z10 != z11) {
                        a(cVar, cVar2);
                        this.f38435a.onSuccess(Boolean.FALSE);
                        return;
                    }
                    if (!z10 && !z11) {
                        try {
                            if (!this.f38436b.test(this.f38442h, t10)) {
                                a(cVar, cVar2);
                                this.f38435a.onSuccess(Boolean.FALSE);
                                return;
                            } else {
                                this.f38442h = null;
                                this.f38443i = null;
                            }
                        } catch (Throwable th4) {
                            Ku.a.b(th4);
                            a(cVar, cVar2);
                            this.f38435a.onError(th4);
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

    /* renamed from: Uu.d1$b */
    static final class b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f38444a;

        /* renamed from: b, reason: collision with root package name */
        final Wu.c<T> f38445b;

        /* renamed from: c, reason: collision with root package name */
        final int f38446c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f38447d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f38448e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38447d = true;
            this.f38444a.b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38448e = th2;
            this.f38447d = true;
            this.f38444a.b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38445b.offer(t10);
            this.f38444a.b();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38444a.c(bVar, this.f38446c);
        }

        b(a<T> aVar, int i10, int i11) {
            this.f38444a = aVar;
            this.f38446c = i10;
            this.f38445b = new Wu.c<>(i11);
        }
    }

    @Override // Ou.a
    public io.reactivex.l<Boolean> b() {
        return C13558a.o(new C5383c1(this.f38431a, this.f38432b, this.f38433c, this.f38434d));
    }

    @Override // io.reactivex.u
    public void p(io.reactivex.w<? super Boolean> wVar) {
        a aVar = new a(wVar, this.f38434d, this.f38431a, this.f38432b, this.f38433c);
        wVar.onSubscribe(aVar);
        aVar.d();
    }

    public C5386d1(io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Lu.d<? super T, ? super T> dVar, int i10) {
        this.f38431a = qVar;
        this.f38432b = qVar2;
        this.f38433c = dVar;
        this.f38434d = i10;
    }
}
