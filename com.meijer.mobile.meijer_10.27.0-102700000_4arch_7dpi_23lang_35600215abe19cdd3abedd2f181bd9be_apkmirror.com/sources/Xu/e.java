package Xu;

import Pu.o;
import gv.C14313a;
import io.reactivex.i;
import io.reactivex.j;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class e<T, R> extends l<R> {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f39880a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends j<? extends R>> f39881b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f39882c;

    static final class a<T, R> extends AtomicInteger implements s<T>, Nu.b {

        /* renamed from: i, reason: collision with root package name */
        static final C0856a<Object> f39883i = new C0856a<>(null);

        /* renamed from: a, reason: collision with root package name */
        final s<? super R> f39884a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends j<? extends R>> f39885b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f39886c;

        /* renamed from: d, reason: collision with root package name */
        final ev.c f39887d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0856a<R>> f39888e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        Nu.b f39889f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f39890g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f39891h;

        /* renamed from: Xu.e$a$a, reason: collision with other inner class name */
        static final class C0856a<R> extends AtomicReference<Nu.b> implements i<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f39892a;

            /* renamed from: b, reason: collision with root package name */
            volatile R f39893b;

            @Override // io.reactivex.i
            public void onComplete() {
                this.f39892a.c(this);
            }

            @Override // io.reactivex.i
            public void onError(Throwable th2) {
                this.f39892a.d(this, th2);
            }

            @Override // io.reactivex.i
            public void onSuccess(R r10) {
                this.f39893b = r10;
                this.f39892a.b();
            }

            C0856a(a<?, R> aVar) {
                this.f39892a = aVar;
            }

            void a() {
                Qu.d.a(this);
            }

            @Override // io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f39891h = true;
            this.f39889f.dispose();
            a();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39890g = true;
            b();
        }

        void a() {
            AtomicReference<C0856a<R>> atomicReference = this.f39888e;
            C0856a<Object> c0856a = f39883i;
            C0856a<Object> c0856a2 = (C0856a) atomicReference.getAndSet(c0856a);
            if (c0856a2 == null || c0856a2 == c0856a) {
                return;
            }
            c0856a2.a();
        }

        void c(C0856a<R> c0856a) {
            if (U.d.a(this.f39888e, c0856a, null)) {
                b();
            }
        }

        void d(C0856a<R> c0856a, Throwable th2) {
            if (!U.d.a(this.f39888e, c0856a, null) || !this.f39887d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f39886c) {
                this.f39889f.dispose();
                a();
            }
            b();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f39891h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f39887d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f39886c) {
                a();
            }
            this.f39890g = true;
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C0856a<R> c0856a;
            C0856a<R> c0856a2 = this.f39888e.get();
            if (c0856a2 != null) {
                c0856a2.a();
            }
            try {
                j jVar = (j) Ru.b.e(this.f39885b.apply(t10), "The mapper returned a null MaybeSource");
                C0856a c0856a3 = new C0856a(this);
                do {
                    c0856a = this.f39888e.get();
                    if (c0856a == f39883i) {
                        return;
                    }
                } while (!U.d.a(this.f39888e, c0856a, c0856a3));
                jVar.a(c0856a3);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f39889f.dispose();
                this.f39888e.getAndSet(f39883i);
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f39889f, bVar)) {
                this.f39889f = bVar;
                this.f39884a.onSubscribe(this);
            }
        }

        a(s<? super R> sVar, o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
            this.f39884a = sVar;
            this.f39885b = oVar;
            this.f39886c = z10;
        }

        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f39884a;
                ev.c cVar = this.f39887d;
                AtomicReference<C0856a<R>> atomicReference = this.f39888e;
                int iAddAndGet = 1;
                while (!this.f39891h) {
                    if (cVar.get() != null && !this.f39886c) {
                        sVar.onError(cVar.b());
                        return;
                    }
                    boolean z11 = this.f39890g;
                    C0856a<R> c0856a = atomicReference.get();
                    if (c0856a == null) {
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
                    if (!z10 && c0856a.f39893b != null) {
                        U.d.a(atomicReference, c0856a, null);
                        sVar.onNext(c0856a.f39893b);
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
        if (g.b(this.f39880a, this.f39881b, sVar)) {
            return;
        }
        this.f39880a.subscribe(new a(sVar, this.f39881b, this.f39882c));
    }

    public e(l<T> lVar, o<? super T, ? extends j<? extends R>> oVar, boolean z10) {
        this.f39880a = lVar;
        this.f39881b = oVar;
        this.f39882c = z10;
    }
}
