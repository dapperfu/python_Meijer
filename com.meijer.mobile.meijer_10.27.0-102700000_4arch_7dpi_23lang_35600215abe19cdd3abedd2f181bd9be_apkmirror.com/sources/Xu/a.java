package Xu;

import Pu.o;
import av.C6159c;
import ev.i;
import ev.j;
import gv.C14313a;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class a<T> extends io.reactivex.b {

    /* renamed from: a, reason: collision with root package name */
    final l<T> f39820a;

    /* renamed from: b, reason: collision with root package name */
    final o<? super T, ? extends io.reactivex.d> f39821b;

    /* renamed from: c, reason: collision with root package name */
    final i f39822c;

    /* renamed from: d, reason: collision with root package name */
    final int f39823d;

    /* renamed from: Xu.a$a, reason: collision with other inner class name */
    static final class C0851a<T> extends AtomicInteger implements s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.c f39824a;

        /* renamed from: b, reason: collision with root package name */
        final o<? super T, ? extends io.reactivex.d> f39825b;

        /* renamed from: c, reason: collision with root package name */
        final i f39826c;

        /* renamed from: d, reason: collision with root package name */
        final ev.c f39827d = new ev.c();

        /* renamed from: e, reason: collision with root package name */
        final C0852a f39828e = new C0852a(this);

        /* renamed from: f, reason: collision with root package name */
        final int f39829f;

        /* renamed from: g, reason: collision with root package name */
        Su.f<T> f39830g;

        /* renamed from: h, reason: collision with root package name */
        Nu.b f39831h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f39832i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f39833j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f39834k;

        /* renamed from: Xu.a$a$a, reason: collision with other inner class name */
        static final class C0852a extends AtomicReference<Nu.b> implements io.reactivex.c {

            /* renamed from: a, reason: collision with root package name */
            final C0851a<?> f39835a;

            @Override // io.reactivex.c, io.reactivex.i
            public void onComplete() {
                this.f39835a.b();
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onError(Throwable th2) {
                this.f39835a.c(th2);
            }

            C0852a(C0851a<?> c0851a) {
                this.f39835a = c0851a;
            }

            void a() {
                Qu.d.a(this);
            }

            @Override // io.reactivex.c, io.reactivex.i
            public void onSubscribe(Nu.b bVar) {
                Qu.d.e(this, bVar);
            }
        }

        void b() {
            this.f39832i = false;
            a();
        }

        @Override // Nu.b
        public void dispose() {
            this.f39834k = true;
            this.f39831h.dispose();
            this.f39828e.a();
            if (getAndIncrement() == 0) {
                this.f39830g.clear();
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39833j = true;
            a();
        }

        void c(Throwable th2) {
            if (!this.f39827d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f39826c != i.IMMEDIATE) {
                this.f39832i = false;
                a();
                return;
            }
            this.f39834k = true;
            this.f39831h.dispose();
            Throwable thB = this.f39827d.b();
            if (thB != j.f130072a) {
                this.f39824a.onError(thB);
            }
            if (getAndIncrement() == 0) {
                this.f39830g.clear();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f39834k;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f39827d.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f39826c != i.IMMEDIATE) {
                this.f39833j = true;
                a();
                return;
            }
            this.f39834k = true;
            this.f39828e.a();
            Throwable thB = this.f39827d.b();
            if (thB != j.f130072a) {
                this.f39824a.onError(thB);
            }
            if (getAndIncrement() == 0) {
                this.f39830g.clear();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (t10 != null) {
                this.f39830g.offer(t10);
            }
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f39831h, bVar)) {
                this.f39831h = bVar;
                if (bVar instanceof Su.b) {
                    Su.b bVar2 = (Su.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f39830g = bVar2;
                        this.f39833j = true;
                        this.f39824a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.f39830g = bVar2;
                        this.f39824a.onSubscribe(this);
                        return;
                    }
                }
                this.f39830g = new C6159c(this.f39829f);
                this.f39824a.onSubscribe(this);
            }
        }

        C0851a(io.reactivex.c cVar, o<? super T, ? extends io.reactivex.d> oVar, i iVar, int i10) {
            this.f39824a = cVar;
            this.f39825b = oVar;
            this.f39826c = iVar;
            this.f39829f = i10;
        }

        void a() {
            io.reactivex.d dVar;
            boolean z10;
            if (getAndIncrement() == 0) {
                ev.c cVar = this.f39827d;
                i iVar = this.f39826c;
                while (!this.f39834k) {
                    if (!this.f39832i) {
                        if (iVar == i.BOUNDARY && cVar.get() != null) {
                            this.f39834k = true;
                            this.f39830g.clear();
                            this.f39824a.onError(cVar.b());
                            return;
                        }
                        boolean z11 = this.f39833j;
                        try {
                            T tPoll = this.f39830g.poll();
                            if (tPoll != null) {
                                dVar = (io.reactivex.d) Ru.b.e(this.f39825b.apply(tPoll), "The mapper returned a null CompletableSource");
                                z10 = false;
                            } else {
                                dVar = null;
                                z10 = true;
                            }
                            if (z11 && z10) {
                                this.f39834k = true;
                                Throwable thB = cVar.b();
                                if (thB != null) {
                                    this.f39824a.onError(thB);
                                    return;
                                } else {
                                    this.f39824a.onComplete();
                                    return;
                                }
                            }
                            if (!z10) {
                                this.f39832i = true;
                                dVar.a(this.f39828e);
                            }
                        } catch (Throwable th2) {
                            Ou.a.b(th2);
                            this.f39834k = true;
                            this.f39830g.clear();
                            this.f39831h.dispose();
                            cVar.a(th2);
                            this.f39824a.onError(cVar.b());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.f39830g.clear();
            }
        }
    }

    @Override // io.reactivex.b
    protected void h(io.reactivex.c cVar) {
        if (g.a(this.f39820a, this.f39821b, cVar)) {
            return;
        }
        this.f39820a.subscribe(new C0851a(cVar, this.f39821b, this.f39822c, this.f39823d));
    }

    public a(l<T> lVar, o<? super T, ? extends io.reactivex.d> oVar, i iVar, int i10) {
        this.f39820a = lVar;
        this.f39821b = oVar;
        this.f39822c = iVar;
        this.f39823d = i10;
    }
}
