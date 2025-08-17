package Xu;

import Pu.o;
import gv.C14313a;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class f<T, R> extends l<R> {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f39894a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends y<? extends R>> f39895b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f39896c;

    static final class a<T, R> extends AtomicInteger implements s<T>, Nu.b {

        /* renamed from: i, reason: collision with root package name */
        static final C0857a<Object> f39897i = new C0857a<>(null);

        /* renamed from: a, reason: collision with root package name */
        final s<? super R> f39898a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends y<? extends R>> f39899b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f39900c;

        /* renamed from: d, reason: collision with root package name */
        final ev.c f39901d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference<C0857a<R>> f39902e = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        Nu.b f39903f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f39904g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f39905h;

        /* renamed from: Xu.f$a$a, reason: collision with other inner class name */
        static final class C0857a<R> extends AtomicReference<Nu.b> implements w<R> {

            /* renamed from: a, reason: collision with root package name */
            final a<?, R> f39906a;

            /* renamed from: b, reason: collision with root package name */
            volatile R f39907b;

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f39906a.c(this, th2);
            }

            @Override // io.reactivex.w, io.reactivex.i
            public void onSuccess(R r10) {
                this.f39907b = r10;
                this.f39906a.b();
            }

            C0857a(a<?, R> aVar) {
                this.f39906a = aVar;
            }

            void a() {
                Qu.d.a(this);
            }

            @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.o(this, bVar);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f39905h = true;
            this.f39903f.dispose();
            a();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39904g = true;
            b();
        }

        void a() {
            AtomicReference<C0857a<R>> atomicReference = this.f39902e;
            C0857a<Object> c0857a = f39897i;
            C0857a<Object> c0857a2 = (C0857a) atomicReference.getAndSet(c0857a);
            if (c0857a2 == null || c0857a2 == c0857a) {
                return;
            }
            c0857a2.a();
        }

        void c(C0857a<R> c0857a, Throwable th2) {
            if (!U.d.a(this.f39902e, c0857a, null) || !this.f39901d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f39900c) {
                this.f39903f.dispose();
                a();
            }
            b();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f39905h;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f39901d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (!this.f39900c) {
                a();
            }
            this.f39904g = true;
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            C0857a<R> c0857a;
            C0857a<R> c0857a2 = this.f39902e.get();
            if (c0857a2 != null) {
                c0857a2.a();
            }
            try {
                y yVar = (y) Ru.b.e(this.f39899b.apply(t10), "The mapper returned a null SingleSource");
                C0857a c0857a3 = new C0857a(this);
                do {
                    c0857a = this.f39902e.get();
                    if (c0857a == f39897i) {
                        return;
                    }
                } while (!U.d.a(this.f39902e, c0857a, c0857a3));
                yVar.a(c0857a3);
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f39903f.dispose();
                this.f39902e.getAndSet(f39897i);
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f39903f, bVar)) {
                this.f39903f = bVar;
                this.f39898a.onSubscribe(this);
            }
        }

        a(s<? super R> sVar, o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
            this.f39898a = sVar;
            this.f39899b = oVar;
            this.f39900c = z10;
        }

        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                s<? super R> sVar = this.f39898a;
                ev.c cVar = this.f39901d;
                AtomicReference<C0857a<R>> atomicReference = this.f39902e;
                int iAddAndGet = 1;
                while (!this.f39905h) {
                    if (cVar.get() != null && !this.f39900c) {
                        sVar.onError(cVar.b());
                        return;
                    }
                    boolean z11 = this.f39904g;
                    C0857a<R> c0857a = atomicReference.get();
                    if (c0857a == null) {
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
                    if (!z10 && c0857a.f39907b != null) {
                        U.d.a(atomicReference, c0857a, null);
                        sVar.onNext(c0857a.f39907b);
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
        if (g.c(this.f39894a, this.f39895b, sVar)) {
            return;
        }
        this.f39894a.subscribe(new a(sVar, this.f39895b, this.f39896c));
    }

    public f(l<T> lVar, o<? super T, ? extends y<? extends R>> oVar, boolean z10) {
        this.f39894a = lVar;
        this.f39895b = oVar;
        this.f39896c = z10;
    }
}
