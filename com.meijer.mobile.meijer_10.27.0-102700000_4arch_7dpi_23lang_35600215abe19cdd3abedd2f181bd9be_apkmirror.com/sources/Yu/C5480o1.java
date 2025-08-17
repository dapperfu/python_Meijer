package Yu;

import av.C6159c;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.o1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5480o1<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41483b;

    /* renamed from: c, reason: collision with root package name */
    final int f41484c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f41485d;

    /* renamed from: Yu.o1$a */
    static final class a<T, R> extends AtomicReference<Nu.b> implements io.reactivex.s<R> {

        /* renamed from: a, reason: collision with root package name */
        final b<T, R> f41486a;

        /* renamed from: b, reason: collision with root package name */
        final long f41487b;

        /* renamed from: c, reason: collision with root package name */
        final int f41488c;

        /* renamed from: d, reason: collision with root package name */
        volatile Su.f<R> f41489d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f41490e;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41487b == this.f41486a.f41501j) {
                this.f41490e = true;
                this.f41486a.b();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f41486a.c(this, th2);
        }

        @Override // io.reactivex.s
        public void onNext(R r10) {
            if (this.f41487b == this.f41486a.f41501j) {
                if (r10 != null) {
                    this.f41489d.offer(r10);
                }
                this.f41486a.b();
            }
        }

        a(b<T, R> bVar, long j10, int i10) {
            this.f41486a = bVar;
            this.f41487b = j10;
            this.f41488c = i10;
        }

        public void a() {
            Qu.d.a(this);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this, bVar)) {
                if (bVar instanceof Su.b) {
                    Su.b bVar2 = (Su.b) bVar;
                    int iA = bVar2.a(7);
                    if (iA == 1) {
                        this.f41489d = bVar2;
                        this.f41490e = true;
                        this.f41486a.b();
                        return;
                    } else if (iA == 2) {
                        this.f41489d = bVar2;
                        return;
                    }
                }
                this.f41489d = new C6159c(this.f41488c);
            }
        }
    }

    /* renamed from: Yu.o1$b */
    static final class b<T, R> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: k, reason: collision with root package name */
        static final a<Object, Object> f41491k;

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41492a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41493b;

        /* renamed from: c, reason: collision with root package name */
        final int f41494c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f41495d;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f41497f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f41498g;

        /* renamed from: h, reason: collision with root package name */
        Nu.b f41499h;

        /* renamed from: j, reason: collision with root package name */
        volatile long f41501j;

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference<a<T, R>> f41500i = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        final ev.c f41496e = new ev.c();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f41491k = aVar;
            aVar.a();
        }

        void a() {
            a<Object, Object> aVar;
            a<T, R> aVar2 = this.f41500i.get();
            a<Object, Object> aVar3 = f41491k;
            if (aVar2 == aVar3 || (aVar = (a) this.f41500i.getAndSet(aVar3)) == aVar3 || aVar == null) {
                return;
            }
            aVar.a();
        }

        void c(a<T, R> aVar, Throwable th2) {
            if (aVar.f41487b != this.f41501j || !this.f41496e.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f41495d) {
                this.f41499h.dispose();
                this.f41497f = true;
            }
            aVar.f41490e = true;
            b();
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41498g) {
                return;
            }
            this.f41498g = true;
            this.f41499h.dispose();
            a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41498g;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41497f) {
                return;
            }
            this.f41497f = true;
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41497f || !this.f41496e.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f41495d) {
                a();
            }
            this.f41497f = true;
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            a<T, R> aVar;
            long j10 = this.f41501j + 1;
            this.f41501j = j10;
            a<T, R> aVar2 = this.f41500i.get();
            if (aVar2 != null) {
                aVar2.a();
            }
            try {
                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41493b.apply(t10), "The ObservableSource returned is null");
                a aVar3 = new a(this, j10, this.f41494c);
                do {
                    aVar = this.f41500i.get();
                    if (aVar == f41491k) {
                        return;
                    }
                } while (!U.d.a(this.f41500i, aVar, aVar3));
                qVar.subscribe(aVar3);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41499h.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41499h, bVar)) {
                this.f41499h = bVar;
                this.f41492a.onSubscribe(this);
            }
        }

        b(io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, boolean z10) {
            this.f41492a = sVar;
            this.f41493b = oVar;
            this.f41494c = i10;
            this.f41495d = z10;
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
            throw new UnsupportedOperationException("Method not decompiled: Yu.C5480o1.b.b():void");
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super R> sVar) {
        if (Z0.b(this.f41135a, sVar, this.f41483b)) {
            return;
        }
        this.f41135a.subscribe(new b(sVar, this.f41483b, this.f41484c, this.f41485d));
    }

    public C5480o1(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, boolean z10) {
        super(qVar);
        this.f41483b = oVar;
        this.f41484c = i10;
        this.f41485d = z10;
    }
}
