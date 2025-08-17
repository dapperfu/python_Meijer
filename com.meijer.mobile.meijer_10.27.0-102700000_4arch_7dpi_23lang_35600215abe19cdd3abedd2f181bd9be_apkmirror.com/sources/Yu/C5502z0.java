package Yu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Yu.z0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5502z0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.d f41789b;

    /* renamed from: Yu.z0$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41790a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Nu.b> f41791b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C0888a f41792c = new C0888a(this);

        /* renamed from: d, reason: collision with root package name */
        final ev.c f41793d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f41794e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f41795f;

        /* renamed from: Yu.z0$a$a, reason: collision with other inner class name */
        static final class C0888a extends AtomicReference<Nu.b> implements io.reactivex.c {

            /* renamed from: a, reason: collision with root package name */
            final a<?> f41796a;

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                this.f41796a.a();
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f41796a.b(th2);
            }

            C0888a(a<?> aVar) {
                this.f41796a = aVar;
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        void a() {
            this.f41795f = true;
            if (this.f41794e) {
                ev.k.a(this.f41790a, this, this.f41793d);
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41794e = true;
            if (this.f41795f) {
                ev.k.a(this.f41790a, this, this.f41793d);
            }
        }

        void b(Throwable th2) {
            Qu.d.a(this.f41791b);
            ev.k.c(this.f41790a, th2, this, this.f41793d);
        }

        @Override // Nu.b
        public void dispose() {
            Qu.d.a(this.f41791b);
            Qu.d.a(this.f41792c);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return Qu.d.b(this.f41791b.get());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.a(this.f41792c);
            ev.k.c(this.f41790a, th2, this, this.f41793d);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            ev.k.e(this.f41790a, t10, this, this.f41793d);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            Qu.d.o(this.f41791b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f41790a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f41135a.subscribe(aVar);
        this.f41789b.a(aVar.f41792c);
    }

    public C5502z0(io.reactivex.l<T> lVar, io.reactivex.d dVar) {
        super(lVar);
        this.f41789b = dVar;
    }
}
