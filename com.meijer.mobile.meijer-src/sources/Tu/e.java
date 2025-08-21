package Tu;

import Lu.o;
import cv.C13558a;
import io.reactivex.i;
import io.reactivex.j;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class e<T, R> extends l<R> {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f36856a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends j<? extends R>> f36857b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f36858c;

    static final class a<T, R> extends AtomicInteger implements s<T>, Ju.b {

        /* renamed from: i, reason: collision with root package name */
        static final C0809a<Object> f36859i = new C0809a<>(null);

        /* renamed from: a, reason: collision with root package name */
        final s<? super R> f36860a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends j<? extends R>> f36861b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f36862c;

        /* renamed from: d, reason: collision with root package name */
        final av.c f36863d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0809a<R>> f36864e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        Ju.b f36865f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f36866g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f36867h;

        /* renamed from: Tu.e$a$a, reason: collision with other inner class name */
        static final class C0809a<R> extends AtomicReference<Ju.b> implements i<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f36868a;

            /* renamed from: b, reason: collision with root package name */
            volatile R f36869b;

            @Override // io.reactivex.i
            public void onComplete() {
                this.f36868a.c(this);
            }

            @Override // io.reactivex.i
            public void onError(Throwable th2) {
                this.f36868a.d(this, th2);
            }

            @Override // io.reactivex.i
            public void onSuccess(R r10) {
                this.f36869b = r10;
                this.f36868a.b();
            }

            C0809a(a<?, R> aVar) {
                this.f36868a = aVar;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.o(this, bVar);
            }
        }

        @Override // Ju.b
        public void dispose() {
            this.f36867h = true;
            this.f36865f.dispose();
            a();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f36866g = true;
            b();
        }

        void a() {
            AtomicReference<C0809a<R>> atomicReference = this.f36864e;
            C0809a<Object> c0809a = f36859i;
            C0809a<Object> c0809a2 = (C0809a) atomicReference.getAndSet(c0809a);
            if (c0809a2 == null || c0809a2 == c0809a) {
                return;
            }
            c0809a2.a();
        }

        void c(C0809a<R> c0809a) {
            if (U.d.a(this.f36864e, c0809a, null)) {
                b();
            }
        }

        void d(C0809a<R> c0809a, Throwable th2) {
            if (!U.d.a(this.f36864e, c0809a, null) || !this.f36863d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f36862c) {
                this.f36865f.dispose();
                a();
            }
            b();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f36867h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f36863d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (!this.f36862c) {
                a();
            }
            this.f36866g = true;
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C0809a<R> c0809a;
            C0809a<R> c0809a2 = this.f36864e.get();
            if (c0809a2 != null) {
                c0809a2.a();
            }
            try {
                j jVar = (j) Nu.b.e(this.f36861b.apply(t10), "The mapper returned a null MaybeSource");
                C0809a c0809a3 = new C0809a(this);
                do {
                    c0809a = this.f36864e.get();
                    if (c0809a == f36859i) {
                        return;
                    }
                } while (!U.d.a(this.f36864e, c0809a, c0809a3));
                jVar.a(c0809a3);
            } catch (Throwable th2) {
                Ku.a.b(th2);
                this.f36865f.dispose();
                this.f36864e.getAndSet(f36859i);
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f36865f, bVar)) {
                this.f36865f = bVar;
                this.f36860a.onSubscribe(this);
            }
        }

        a(s<? super R> sVar, o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
            this.f36860a = sVar;
            this.f36861b = oVar;
            this.f36862c = z10;
        }

        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f36860a;
                av.c cVar = this.f36863d;
                AtomicReference<C0809a<R>> atomicReference = this.f36864e;
                int iAddAndGet = 1;
                while (!this.f36867h) {
                    if (cVar.get() != null && !this.f36862c) {
                        sVar.onError(cVar.b());
                        return;
                    }
                    boolean z11 = this.f36866g;
                    C0809a<R> c0809a = atomicReference.get();
                    if (c0809a == null) {
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
                    if (!z10 && c0809a.f36869b != null) {
                        U.d.a(atomicReference, c0809a, null);
                        sVar.onNext(c0809a.f36869b);
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
        if (g.b(this.f36856a, this.f36857b, sVar)) {
            return;
        }
        this.f36856a.subscribe(new a(sVar, this.f36857b, this.f36858c));
    }

    public e(l<T> lVar, o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
        this.f36856a = lVar;
        this.f36857b = oVar;
        this.f36858c = z10;
    }
}
