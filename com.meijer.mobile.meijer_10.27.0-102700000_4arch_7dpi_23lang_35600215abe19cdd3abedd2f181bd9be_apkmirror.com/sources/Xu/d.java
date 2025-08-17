package Xu;

import Pu.o;
import ev.j;
import gv.C14313a;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class d<T> extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f39868a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends io.reactivex.d> f39869b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f39870c;

    static final class a<T> implements s<T>, Nu.b {

        /* renamed from: h, reason: collision with root package name */
        static final C0855a f39871h = new C0855a(null);

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f39872a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends io.reactivex.d> f39873b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f39874c;

        /* renamed from: d, reason: collision with root package name */
        final ev.c f39875d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0855a> f39876e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f39877f;

        /* renamed from: g, reason: collision with root package name */
        Nu.b f39878g;

        /* renamed from: Xu.d$a$a, reason: collision with other inner class name */
        static final class C0855a extends AtomicReference<Nu.b> implements io.reactivex.c {

            /* renamed from: a, reason: collision with root package name */
            final a<?> f39879a;

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                this.f39879a.b(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f39879a.c(this, th2);
            }

            C0855a(a<?> aVar) {
                this.f39879a = aVar;
            }

            void a() {
                Qu.d.a(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39877f = true;
            if (this.f39876e.get() == null) {
                Throwable thB = this.f39875d.b();
                if (thB == null) {
                    this.f39872a.onComplete();
                } else {
                    this.f39872a.onError(thB);
                }
            }
        }

        void a() {
            AtomicReference<C0855a> atomicReference = this.f39876e;
            C0855a c0855a = f39871h;
            C0855a andSet = atomicReference.getAndSet(c0855a);
            if (andSet == null || andSet == c0855a) {
                return;
            }
            andSet.a();
        }

        void b(C0855a c0855a) {
            if (U.d.a(this.f39876e, c0855a, null) && this.f39877f) {
                Throwable thB = this.f39875d.b();
                if (thB == null) {
                    this.f39872a.onComplete();
                } else {
                    this.f39872a.onError(thB);
                }
            }
        }

        void c(C0855a c0855a, Throwable th2) {
            if (!U.d.a(this.f39876e, c0855a, null) || !this.f39875d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f39874c) {
                if (this.f39877f) {
                    this.f39872a.onError(this.f39875d.b());
                    return;
                }
                return;
            }
            dispose();
            Throwable thB = this.f39875d.b();
            if (thB != j.f130072a) {
                this.f39872a.onError(thB);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f39878g.dispose();
            a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f39876e.get() == f39871h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f39875d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f39874c) {
                onComplete();
                return;
            }
            a();
            Throwable thB = this.f39875d.b();
            if (thB != j.f130072a) {
                this.f39872a.onError(thB);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C0855a c0855a;
            try {
                io.reactivex.d dVar = (io.reactivex.d) Ru.b.e(this.f39873b.apply(t10), "The mapper returned a null CompletableSource");
                C0855a c0855a2 = new C0855a(this);
                do {
                    c0855a = this.f39876e.get();
                    if (c0855a == f39871h) {
                        return;
                    }
                } while (!U.d.a(this.f39876e, c0855a, c0855a2));
                if (c0855a != null) {
                    c0855a.a();
                }
                dVar.a(c0855a2);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f39878g.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f39878g, bVar)) {
                this.f39878g = bVar;
                this.f39872a.onSubscribe(this);
            }
        }

        a(io.reactivex.c cVar, o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
            this.f39872a = cVar;
            this.f39873b = oVar;
            this.f39874c = z10;
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        if (g.a(this.f39868a, this.f39869b, cVar)) {
            return;
        }
        this.f39868a.subscribe(new a(cVar, this.f39869b, this.f39870c));
    }

    public d(l<T> lVar, o<? super T, ? extends io.reactivex.d> oVar, boolean z10) {
        this.f39868a = lVar;
        this.f39869b = oVar;
        this.f39870c = z10;
    }
}
