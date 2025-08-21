package Tu;

import Lu.o;
import cv.C13558a;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class f<T, R> extends l<R> {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f36870a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends y<? extends R>> f36871b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f36872c;

    static final class a<T, R> extends AtomicInteger implements s<T>, Ju.b {

        /* renamed from: i, reason: collision with root package name */
        static final C0810a<Object> f36873i = new C0810a<>(null);

        /* renamed from: a, reason: collision with root package name */
        final s<? super R> f36874a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends y<? extends R>> f36875b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f36876c;

        /* renamed from: d, reason: collision with root package name */
        final av.c f36877d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0810a<R>> f36878e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        Ju.b f36879f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f36880g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f36881h;

        /* renamed from: Tu.f$a$a, reason: collision with other inner class name */
        static final class C0810a<R> extends AtomicReference<Ju.b> implements w<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f36882a;

            /* renamed from: b, reason: collision with root package name */
            volatile R f36883b;

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f36882a.c(this, th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(R r10) {
                this.f36883b = r10;
                this.f36882a.b();
            }

            C0810a(a<?, R> aVar) {
                this.f36882a = aVar;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f36881h = true;
            this.f36879f.dispose();
            a();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f36880g = true;
            b();
        }

        void a() {
            AtomicReference<C0810a<R>> atomicReference = this.f36878e;
            C0810a<Object> c0810a = f36873i;
            C0810a<Object> c0810a2 = (C0810a) atomicReference.getAndSet(c0810a);
            if (c0810a2 == null || c0810a2 == c0810a) {
                return;
            }
            c0810a2.a();
        }

        void c(C0810a<R> c0810a, Throwable th2) {
            if (!U.d.a(this.f36878e, c0810a, null) || !this.f36877d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f36876c) {
                this.f36879f.dispose();
                a();
            }
            b();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f36881h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f36877d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f36876c) {
                a();
            }
            this.f36880g = true;
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C0810a<R> c0810a;
            C0810a<R> c0810a2 = this.f36878e.get();
            if (c0810a2 != null) {
                c0810a2.a();
            }
            try {
                y yVar = (y) Nu.b.e(this.f36875b.apply(t10), "The mapper returned a null SingleSource");
                C0810a c0810a3 = new C0810a(this);
                do {
                    c0810a = this.f36878e.get();
                    if (c0810a == f36873i) {
                        return;
                    }
                } while (!U.d.a(this.f36878e, c0810a, c0810a3));
                yVar.a(c0810a3);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f36879f.dispose();
                this.f36878e.getAndSet(f36873i);
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f36879f, bVar)) {
                this.f36879f = bVar;
                this.f36874a.onSubscribe(this);
            }
        }

        a(s<? super R> sVar, o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
            this.f36874a = sVar;
            this.f36875b = oVar;
            this.f36876c = z10;
        }

        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f36874a;
                av.c cVar = this.f36877d;
                AtomicReference<C0810a<R>> atomicReference = this.f36878e;
                int iAddAndGet = 1;
                while (!this.f36881h) {
                    if (cVar.get() != null && !this.f36876c) {
                        sVar.onError(cVar.b());
                        return;
                    }
                    boolean z11 = this.f36880g;
                    C0810a<R> c0810a = atomicReference.get();
                    if (c0810a == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11 && z10) {
                        Throwable thB = cVar.b();
                        if (thB != null) {
                            sVar.onError(thB);
                            return;
                        } else {
                            sVar.onComplete();
                            return;
                        }
                    }
                    if (!z10 && c0810a.f36883b != null) {
                        U.d.a(atomicReference, c0810a, null);
                        sVar.onNext(c0810a.f36883b);
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super R> sVar) {
        if (g.c(this.f36870a, this.f36871b, sVar)) {
            return;
        }
        this.f36870a.subscribe(new a(sVar, this.f36871b, this.f36872c));
    }

    public f(l<T> lVar, o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        this.f36870a = lVar;
        this.f36871b = oVar;
        this.f36872c = z10;
    }
}
