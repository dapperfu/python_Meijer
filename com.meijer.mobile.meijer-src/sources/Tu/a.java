package Tu;

import Lu.o;
import av.i;
import av.j;
import cv.C13558a;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class a<T> extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f36796a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends io.reactivex.d> f36797b;

    /* renamed from: c, reason: collision with root package name */
    final i f36798c;

    /* renamed from: d, reason: collision with root package name */
    final int f36799d;

    /* renamed from: Tu.a$a, reason: collision with other inner class name */
    static final class C0804a<T> extends AtomicInteger implements s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f36800a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends io.reactivex.d> f36801b;

        /* renamed from: c, reason: collision with root package name */
        final i f36802c;

        /* renamed from: d, reason: collision with root package name */
        final av.c f36803d = new av.c();

        /* renamed from: e, reason: collision with root package name */
        final C0805a f36804e = new C0805a(this);

        /* renamed from: f, reason: collision with root package name */
        final int f36805f;

        /* renamed from: g, reason: collision with root package name */
        Ou.f<T> f36806g;

        /* renamed from: h, reason: collision with root package name */
        Ju.b f36807h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f36808i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f36809j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f36810k;

        /* renamed from: Tu.a$a$a, reason: collision with other inner class name */
        static final class C0805a extends AtomicReference<Ju.b> implements io.reactivex.c {

            /* renamed from: a, reason: collision with root package name */
            final C0804a<?> f36811a;

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                this.f36811a.b();
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f36811a.c(th2);
            }

            C0805a(C0804a<?> c0804a) {
                this.f36811a = c0804a;
            }

            void a() {
                Mu.d.a(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Ju.b bVar) {
                Mu.d.e(this, bVar);
            }
        }

        void b() {
            this.f36808i = false;
            a();
        }

        @Override // Ju.b
        public void dispose() {
            this.f36810k = true;
            this.f36807h.dispose();
            this.f36804e.a();
            if (getAndIncrement() == 0) {
                this.f36806g.clear();
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f36809j = true;
            a();
        }

        void c(Throwable th2) {
            if (!this.f36803d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36802c != i.IMMEDIATE) {
                this.f36808i = false;
                a();
                return;
            }
            this.f36810k = true;
            this.f36807h.dispose();
            Throwable thB = this.f36803d.b();
            if (thB != j.f59694a) {
                this.f36800a.onError(thB);
            }
            if (getAndIncrement() == 0) {
                this.f36806g.clear();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f36810k;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f36803d.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f36802c != i.IMMEDIATE) {
                this.f36809j = true;
                a();
                return;
            }
            this.f36810k = true;
            this.f36804e.a();
            Throwable thB = this.f36803d.b();
            if (thB != j.f59694a) {
                this.f36800a.onError(thB);
            }
            if (getAndIncrement() == 0) {
                this.f36806g.clear();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (t10 != null) {
                this.f36806g.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f36807h, bVar)) {
                this.f36807h = bVar;
                if (bVar instanceof Ou.b) {
                    Ou.b bVar2 = (Ou.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f36806g = bVar2;
                        this.f36809j = true;
                        this.f36800a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.f36806g = bVar2;
                        this.f36800a.onSubscribe(this);
                        return;
                    }
                }
                this.f36806g = new Wu.c(this.f36805f);
                this.f36800a.onSubscribe(this);
            }
        }

        C0804a(io.reactivex.c cVar, o<? super T, ? extends io.reactivex.d> oVar, i iVar, int i10) {
            this.f36800a = cVar;
            this.f36801b = oVar;
            this.f36802c = iVar;
            this.f36805f = i10;
        }

        void a() {
            io.reactivex.d dVar;
            boolean z10;
            if (getAndIncrement() == 0) {
                av.c cVar = this.f36803d;
                i iVar = this.f36802c;
                while (!this.f36810k) {
                    if (!this.f36808i) {
                        if (iVar == i.BOUNDARY && cVar.get() != null) {
                            this.f36810k = true;
                            this.f36806g.clear();
                            this.f36800a.onError(cVar.b());
                            return;
                        }
                        boolean z11 = this.f36809j;
                        try {
                            T tPoll = this.f36806g.poll();
                            if (tPoll != null) {
                                dVar = (io.reactivex.d) Nu.b.e(this.f36801b.apply(tPoll), "The mapper returned a null CompletableSource");
                                z10 = false;
                            } else {
                                dVar = null;
                                z10 = true;
                            }
                            if (z11 && z10) {
                                this.f36810k = true;
                                Throwable thB = cVar.b();
                                if (thB != null) {
                                    this.f36800a.onError(thB);
                                    return;
                                } else {
                                    this.f36800a.onComplete();
                                    return;
                                }
                            }
                            if (!z10) {
                                this.f36808i = true;
                                dVar.a(this.f36804e);
                            }
                        } catch (Throwable th2) {
                            Ku.a.b(th2);
                            this.f36810k = true;
                            this.f36806g.clear();
                            this.f36807h.dispose();
                            cVar.a(th2);
                            this.f36800a.onError(cVar.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f36806g.clear();
            }
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        if (g.a(this.f36796a, this.f36797b, cVar)) {
            return;
        }
        this.f36796a.subscribe(new C0804a(cVar, this.f36797b, this.f36798c, this.f36799d));
    }

    public a(l<T> lVar, o<? super T, ? extends io.reactivex.d> oVar, i iVar, int i10) {
        this.f36796a = lVar;
        this.f36797b = oVar;
        this.f36798c = iVar;
        this.f36799d = i10;
    }
}
