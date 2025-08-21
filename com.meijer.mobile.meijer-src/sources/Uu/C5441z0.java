package Uu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.z0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5441z0<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.d f39014b;

    /* renamed from: Uu.z0$a */
    static final class a<T> extends AtomicInteger implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f39015a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference<Ju.b> f39016b = new AtomicReference<>();

        /* renamed from: c, reason: collision with root package name */
        final C0845a f39017c = new C0845a(this);

        /* renamed from: d, reason: collision with root package name */
        final av.c f39018d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f39019e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f39020f;

        /* renamed from: Uu.z0$a$a, reason: collision with other inner class name */
        static final class C0845a extends AtomicReference<Ju.b> implements io.reactivex.c {

            /* renamed from: a, reason: collision with root package name */
            final a<?> f39021a;

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                this.f39021a.a();
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f39021a.b(th2);
            }

            C0845a(a<?> aVar) {
                this.f39021a = aVar;
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        void a() {
            this.f39020f = true;
            if (this.f39019e) {
                av.k.a(this.f39015a, this, this.f39018d);
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39019e = true;
            if (this.f39020f) {
                av.k.a(this.f39015a, this, this.f39018d);
            }
        }

        void b(Throwable th2) {
            Mu.d.a(this.f39016b);
            av.k.c(this.f39015a, th2, this, this.f39018d);
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this.f39016b);
            Mu.d.a(this.f39017c);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(this.f39016b.get());
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Mu.d.a(this.f39017c);
            av.k.c(this.f39015a, th2, this, this.f39018d);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            av.k.e(this.f39015a, t10, this, this.f39018d);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            Mu.d.o(this.f39016b, bVar);
        }

        a(io.reactivex.s<? super T> sVar) {
            this.f39015a = sVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar);
        sVar.onSubscribe(aVar);
        this.f38360a.subscribe(aVar);
        this.f39014b.a(aVar.f39017c);
    }

    public C5441z0(io.reactivex.l<T> lVar, io.reactivex.d dVar) {
        super(lVar);
        this.f39014b = dVar;
    }
}
