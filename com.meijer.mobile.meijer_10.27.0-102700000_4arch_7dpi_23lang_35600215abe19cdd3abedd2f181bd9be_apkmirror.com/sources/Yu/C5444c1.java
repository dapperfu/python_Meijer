package Yu;

import av.C6159c;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Yu.c1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5444c1<T> extends io.reactivex.l<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41182a;

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends T> f41183b;

    /* renamed from: c, reason: collision with root package name */
    final Pu.d<? super T, ? super T> f41184c;

    /* renamed from: d, reason: collision with root package name */
    final int f41185d;

    /* renamed from: Yu.c1$a */
    static final class a<T> extends AtomicInteger implements Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Boolean> f41186a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.d<? super T, ? super T> f41187b;

        /* renamed from: c, reason: collision with root package name */
        final Qu.a f41188c = new Qu.a(2);

        /* renamed from: d, reason: collision with root package name */
        final io.reactivex.q<? extends T> f41189d;

        /* renamed from: e, reason: collision with root package name */
        final io.reactivex.q<? extends T> f41190e;

        /* renamed from: f, reason: collision with root package name */
        final b<T>[] f41191f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41192g;

        /* renamed from: h, reason: collision with root package name */
        T f41193h;

        /* renamed from: i, reason: collision with root package name */
        T f41194i;

        void a(C6159c<T> c6159c, C6159c<T> c6159c2) {
            this.f41192g = true;
            c6159c.clear();
            c6159c2.clear();
        }

        boolean c(Nu.b bVar, int i10) {
            return this.f41188c.a(i10, bVar);
        }

        void d() {
            b<T>[] bVarArr = this.f41191f;
            this.f41189d.subscribe(bVarArr[0]);
            this.f41190e.subscribe(bVarArr[1]);
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41192g) {
                return;
            }
            this.f41192g = true;
            this.f41188c.dispose();
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f41191f;
                bVarArr[0].f41196b.clear();
                bVarArr[1].f41196b.clear();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41192g;
        }

        a(io.reactivex.s<? super Boolean> sVar, int i10, io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Pu.d<? super T, ? super T> dVar) {
            this.f41186a = sVar;
            this.f41189d = qVar;
            this.f41190e = qVar2;
            this.f41187b = dVar;
            this.f41191f = new b[]{new b<>(this, 0, i10), new b<>(this, 1, i10)};
        }

        void b() {
            boolean z10;
            boolean z11;
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() == 0) {
                b<T>[] bVarArr = this.f41191f;
                b<T> bVar = bVarArr[0];
                C6159c<T> c6159c = bVar.f41196b;
                b<T> bVar2 = bVarArr[1];
                C6159c<T> c6159c2 = bVar2.f41196b;
                int iAddAndGet = 1;
                while (!this.f41192g) {
                    boolean z12 = bVar.f41198d;
                    if (z12 && (th3 = bVar.f41199e) != null) {
                        a(c6159c, c6159c2);
                        this.f41186a.onError(th3);
                        return;
                    }
                    boolean z13 = bVar2.f41198d;
                    if (z13 && (th2 = bVar2.f41199e) != null) {
                        a(c6159c, c6159c2);
                        this.f41186a.onError(th2);
                        return;
                    }
                    if (this.f41193h == null) {
                        this.f41193h = c6159c.poll();
                    }
                    if (this.f41193h == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f41194i == null) {
                        this.f41194i = c6159c2.poll();
                    }
                    T t10 = this.f41194i;
                    if (t10 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z13 && z10 && z11) {
                        this.f41186a.onNext(Boolean.TRUE);
                        this.f41186a.onComplete();
                        return;
                    }
                    if (z12 && z13 && z10 != z11) {
                        a(c6159c, c6159c2);
                        this.f41186a.onNext(Boolean.FALSE);
                        this.f41186a.onComplete();
                        return;
                    }
                    if (!z10 && !z11) {
                        try {
                            if (!this.f41187b.test(this.f41193h, t10)) {
                                a(c6159c, c6159c2);
                                this.f41186a.onNext(Boolean.FALSE);
                                this.f41186a.onComplete();
                                return;
                            }
                            this.f41193h = null;
                            this.f41194i = null;
                        } catch (Throwable th4) {
                            Ou.a.b(th4);
                            a(c6159c, c6159c2);
                            this.f41186a.onError(th4);
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

    /* renamed from: Yu.c1$b */
    static final class b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final a<T> f41195a;

        /* renamed from: b, reason: collision with root package name */
        final C6159c<T> f41196b;

        /* renamed from: c, reason: collision with root package name */
        final int f41197c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f41198d;

        /* renamed from: e, reason: collision with root package name */
        Throwable f41199e;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41198d = true;
            this.f41195a.b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41199e = th2;
            this.f41198d = true;
            this.f41195a.b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f41196b.offer(t10);
            this.f41195a.b();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f41195a.c(bVar, this.f41197c);
        }

        b(a<T> aVar, int i10, int i11) {
            this.f41195a = aVar;
            this.f41197c = i10;
            this.f41196b = new C6159c<>(i11);
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super Boolean> sVar) {
        a aVar = new a(sVar, this.f41185d, this.f41182a, this.f41183b, this.f41184c);
        sVar.onSubscribe(aVar);
        aVar.d();
    }

    public C5444c1(io.reactivex.q<? extends T> qVar, io.reactivex.q<? extends T> qVar2, Pu.d<? super T, ? super T> dVar, int i10) {
        this.f41182a = qVar;
        this.f41183b = qVar2;
        this.f41184c = dVar;
        this.f41185d = i10;
    }
}
