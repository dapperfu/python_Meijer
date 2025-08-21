package Tu;

import Lu.o;
import av.j;
import cv.C13558a;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class d<T> extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f36844a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends io.reactivex.d> f36845b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f36846c;

    static final class a<T> implements s<T>, Ju.b {

        /* renamed from: h, reason: collision with root package name */
        static final C0808a f36847h = new C0808a(null);

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f36848a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends io.reactivex.d> f36849b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f36850c;

        /* renamed from: d, reason: collision with root package name */
        final av.c f36851d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0808a> f36852e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f36853f;

        /* renamed from: g, reason: collision with root package name */
        Ju.b f36854g;

        /* renamed from: Tu.d$a$a, reason: collision with other inner class name */
        static final class C0808a extends AtomicReference<Ju.b> implements io.reactivex.c {

            /* renamed from: a, reason: collision with root package name */
            final a<?> f36855a;

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                this.f36855a.b(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f36855a.c(this, th2);
            }

            C0808a(a<?> aVar) {
                this.f36855a = aVar;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f36853f = true;
            if (this.f36852e.get() == null) {
                Throwable thB = this.f36851d.b();
                if (thB == null) {
                    this.f36848a.onComplete();
                } else {
                    this.f36848a.onError(thB);
                }
            }
        }

        void a() {
            AtomicReference<C0808a> atomicReference = this.f36852e;
            C0808a c0808a = f36847h;
            C0808a andSet = atomicReference.getAndSet(c0808a);
            if (andSet == null || andSet == c0808a) {
                return;
            }
            andSet.a();
        }

        void b(C0808a c0808a) {
            if (U.d.a(this.f36852e, c0808a, null) && this.f36853f) {
                Throwable thB = this.f36851d.b();
                if (thB == null) {
                    this.f36848a.onComplete();
                } else {
                    this.f36848a.onError(thB);
                }
            }
        }

        void c(C0808a c0808a, Throwable th2) {
            if (!U.d.a(this.f36852e, c0808a, null) || !this.f36851d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36850c) {
                if (this.f36853f) {
                    this.f36848a.onError(this.f36851d.b());
                    return;
                }
                return;
            }
            dispose();
            Throwable thB = this.f36851d.b();
            if (thB != j.f59694a) {
                this.f36848a.onError(thB);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f36854g.dispose();
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f36852e.get() == f36847h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f36851d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36850c) {
                onComplete();
                return;
            }
            a();
            Throwable thB = this.f36851d.b();
            if (thB != j.f59694a) {
                this.f36848a.onError(thB);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C0808a c0808a;
            try {
                io.reactivex.d dVar = (io.reactivex.d) Nu.b.e(this.f36849b.apply(t10), "The mapper returned a null CompletableSource");
                C0808a c0808a2 = new C0808a(this);
                do {
                    c0808a = this.f36852e.get();
                    if (c0808a == f36847h) {
                        return;
                    }
                } while (!U.d.a(this.f36852e, c0808a, c0808a2));
                if (c0808a != null) {
                    c0808a.a();
                }
                dVar.a(c0808a2);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f36854g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f36854g, bVar)) {
                this.f36854g = bVar;
                this.f36848a.onSubscribe(this);
            }
        }

        a(io.reactivex.c cVar, o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
            this.f36848a = cVar;
            this.f36849b = oVar;
            this.f36850c = z10;
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        if (g.a(this.f36844a, this.f36845b, cVar)) {
            return;
        }
        this.f36844a.subscribe(new a(cVar, this.f36845b, this.f36846c));
    }

    public d(l<T> lVar, o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
        this.f36844a = lVar;
        this.f36845b = oVar;
        this.f36846c = z10;
    }
}
