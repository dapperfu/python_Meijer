package Uu;

import cv.C13558a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.o1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5419o1<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38708b;

    /* renamed from: c, reason: collision with root package name */
    final int f38709c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f38710d;

    /* renamed from: Uu.o1$a */
    static final class a<T, R> extends AtomicReference<Ju.b> implements io.reactivex.s<R> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, R> f38711a;

        /* renamed from: b, reason: collision with root package name */
        final long f38712b;

        /* renamed from: c, reason: collision with root package name */
        final int f38713c;

        /* renamed from: d, reason: collision with root package name */
        volatile Ou.f<R> f38714d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f38715e;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38712b == this.f38711a.f38726j) {
                this.f38715e = true;
                this.f38711a.b();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38711a.c(this, th2);
        }

        @Override // io.reactivex.s
        public void onNext(R r10) {
            if (this.f38712b == this.f38711a.f38726j) {
                if (r10 != null) {
                    this.f38714d.offer(r10);
                }
                this.f38711a.b();
            }
        }

        a(b<T, R> bVar, long j10, int i10) {
            this.f38711a = bVar;
            this.f38712b = j10;
            this.f38713c = i10;
        }

        public void a() {
            Mu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this, bVar)) {
                if (bVar instanceof Ou.b) {
                    Ou.b bVar2 = (Ou.b) bVar;
                    int iA = bVar2.a(7);
                    if (iA == 1) {
                        this.f38714d = bVar2;
                        this.f38715e = true;
                        this.f38711a.b();
                        return;
                    } else if (iA == 2) {
                        this.f38714d = bVar2;
                        return;
                    }
                }
                this.f38714d = new Wu.c(this.f38713c);
            }
        }
    }

    /* renamed from: Uu.o1$b */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: k, reason: collision with root package name */
        static final a<Object, Object> f38716k;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38717a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38718b;

        /* renamed from: c, reason: collision with root package name */
        final int f38719c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f38720d;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f38722f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f38723g;

        /* renamed from: h, reason: collision with root package name */
        Ju.b f38724h;

        /* renamed from: j, reason: collision with root package name */
        volatile long f38726j;

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<a<T, R>> f38725i = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        final av.c f38721e = new av.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f38716k = aVar;
            aVar.a();
        }

        void a() {
            a<Object, Object> aVar;
            a<T, R> aVar2 = this.f38725i.get();
            a<Object, Object> aVar3 = f38716k;
            if (aVar2 == aVar3 || (aVar = (a) this.f38725i.getAndSet(aVar3)) == aVar3 || aVar == null) {
                return;
            }
            aVar.a();
        }

        void c(a<T, R> aVar, Throwable th2) {
            if (aVar.f38712b != this.f38726j || !this.f38721e.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f38720d) {
                this.f38724h.dispose();
                this.f38722f = true;
            }
            aVar.f38715e = true;
            b();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38723g) {
                return;
            }
            this.f38723g = true;
            this.f38724h.dispose();
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38723g;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38722f) {
                return;
            }
            this.f38722f = true;
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f38722f || !this.f38721e.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f38720d) {
                a();
            }
            this.f38722f = true;
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            a<T, R> aVar;
            long j10 = this.f38726j + 1;
            this.f38726j = j10;
            a<T, R> aVar2 = this.f38725i.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38718b.apply(t10), "The ObservableSource returned is null");
                a aVar3 = new a(this, j10, this.f38719c);
                do {
                    aVar = this.f38725i.get();
                    if (aVar == f38716k) {
                        return;
                    }
                } while (!U.d.a(this.f38725i, aVar, aVar3));
                qVar.subscribe(aVar3);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f38724h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38724h, bVar)) {
                this.f38724h = bVar;
                this.f38717a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, boolean z10) {
            this.f38717a = sVar;
            this.f38718b = oVar;
            this.f38719c = i10;
            this.f38720d = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0010 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00ee A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void b() {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Uu.C5419o1.b.b():void");
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        if (Z0.b(this.f38360a, sVar, this.f38708b)) {
            return;
        }
        this.f38360a.subscribe(new b(sVar, this.f38708b, this.f38709c, this.f38710d));
    }

    public C5419o1(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, boolean z10) {
        super(qVar);
        this.f38708b = oVar;
        this.f38709c = i10;
        this.f38710d = z10;
    }
}
