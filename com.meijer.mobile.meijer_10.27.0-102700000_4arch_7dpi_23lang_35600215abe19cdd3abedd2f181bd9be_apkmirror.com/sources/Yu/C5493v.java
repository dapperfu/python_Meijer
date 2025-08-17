package Yu;

import av.C6159c;
import gv.C14313a;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Yu.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5493v<T, R> extends AbstractC5436a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41706b;

    /* renamed from: c, reason: collision with root package name */
    final ev.i f41707c;

    /* renamed from: d, reason: collision with root package name */
    final int f41708d;

    /* renamed from: e, reason: collision with root package name */
    final int f41709e;

    /* renamed from: Yu.v$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Nu.b, Tu.p<R> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f41710a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<? extends R>> f41711b;

        /* renamed from: c, reason: collision with root package name */
        final int f41712c;

        /* renamed from: d, reason: collision with root package name */
        final int f41713d;

        /* renamed from: e, reason: collision with root package name */
        final ev.i f41714e;

        /* renamed from: f, reason: collision with root package name */
        final ev.c f41715f = new ev.c();

        /* renamed from: g, reason: collision with root package name */
        final ArrayDeque<Tu.o<R>> f41716g = new ArrayDeque<>();

        /* renamed from: h, reason: collision with root package name */
        Su.f<T> f41717h;

        /* renamed from: i, reason: collision with root package name */
        Nu.b f41718i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f41719j;

        /* renamed from: k, reason: collision with root package name */
        int f41720k;

        /* renamed from: l, reason: collision with root package name */
        volatile boolean f41721l;

        /* renamed from: m, reason: collision with root package name */
        Tu.o<R> f41722m;

        /* renamed from: n, reason: collision with root package name */
        int f41723n;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f41719j = true;
            d();
        }

        @Override // Tu.p
        public void b(Tu.o<R> oVar, Throwable th2) {
            if (!this.f41715f.a(th2)) {
                C14313a.s(th2);
                return;
            }
            if (this.f41714e == ev.i.IMMEDIATE) {
                this.f41718i.dispose();
            }
            oVar.c();
            d();
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f41721l) {
                return;
            }
            this.f41721l = true;
            this.f41718i.dispose();
            f();
        }

        void e() {
            Tu.o<R> oVar = this.f41722m;
            if (oVar != null) {
                oVar.dispose();
            }
            while (true) {
                Tu.o<R> oVarPoll = this.f41716g.poll();
                if (oVarPoll == null) {
                    return;
                } else {
                    oVarPoll.dispose();
                }
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41721l;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f41715f.a(th2)) {
                C14313a.s(th2);
            } else {
                this.f41719j = true;
                d();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41720k == 0) {
                this.f41717h.offer(t10);
            }
            d();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41718i, bVar)) {
                this.f41718i = bVar;
                if (bVar instanceof Su.b) {
                    Su.b bVar2 = (Su.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f41720k = iA;
                        this.f41717h = bVar2;
                        this.f41719j = true;
                        this.f41710a.onSubscribe(this);
                        d();
                        return;
                    }
                    if (iA == 2) {
                        this.f41720k = iA;
                        this.f41717h = bVar2;
                        this.f41710a.onSubscribe(this);
                        return;
                    }
                }
                this.f41717h = new C6159c(this.f41713d);
                this.f41710a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, int i11, ev.i iVar) {
            this.f41710a = sVar;
            this.f41711b = oVar;
            this.f41712c = i10;
            this.f41713d = i11;
            this.f41714e = iVar;
        }

        @Override // Tu.p
        public void a(Tu.o<R> oVar) {
            oVar.c();
            d();
        }

        @Override // Tu.p
        public void c(Tu.o<R> oVar, R r10) {
            oVar.b().offer(r10);
            d();
        }

        @Override // Tu.p
        public void d() {
            R rPoll;
            boolean z10;
            boolean z11;
            if (getAndIncrement() == 0) {
                Su.f<T> fVar = this.f41717h;
                ArrayDeque<Tu.o<R>> arrayDeque = this.f41716g;
                io.reactivex.s<? super R> sVar = this.f41710a;
                ev.i iVar = this.f41714e;
                int iAddAndGet = 1;
                while (true) {
                    int i10 = this.f41723n;
                    while (i10 != this.f41712c) {
                        if (this.f41721l) {
                            fVar.clear();
                            e();
                            return;
                        }
                        if (iVar == ev.i.IMMEDIATE && this.f41715f.get() != null) {
                            fVar.clear();
                            e();
                            sVar.onError(this.f41715f.b());
                            return;
                        }
                        try {
                            T tPoll = fVar.poll();
                            if (tPoll == null) {
                                break;
                            }
                            io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f41711b.apply(tPoll), "The mapper returned a null ObservableSource");
                            Tu.o<R> oVar = new Tu.o<>(this, this.f41713d);
                            arrayDeque.offer(oVar);
                            qVar.subscribe(oVar);
                            i10++;
                        } catch (Throwable th2) {
                            Ou.a.b(th2);
                            this.f41718i.dispose();
                            fVar.clear();
                            e();
                            this.f41715f.a(th2);
                            sVar.onError(this.f41715f.b());
                            return;
                        }
                    }
                    this.f41723n = i10;
                    if (this.f41721l) {
                        fVar.clear();
                        e();
                        return;
                    }
                    if (iVar == ev.i.IMMEDIATE && this.f41715f.get() != null) {
                        fVar.clear();
                        e();
                        sVar.onError(this.f41715f.b());
                        return;
                    }
                    Tu.o<R> oVar2 = this.f41722m;
                    if (oVar2 == null) {
                        if (iVar == ev.i.BOUNDARY && this.f41715f.get() != null) {
                            fVar.clear();
                            e();
                            sVar.onError(this.f41715f.b());
                            return;
                        }
                        boolean z12 = this.f41719j;
                        Tu.o<R> oVarPoll = arrayDeque.poll();
                        if (oVarPoll == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 && z11) {
                            if (this.f41715f.get() != null) {
                                fVar.clear();
                                e();
                                sVar.onError(this.f41715f.b());
                                return;
                            }
                            sVar.onComplete();
                            return;
                        }
                        if (!z11) {
                            this.f41722m = oVarPoll;
                        }
                        oVar2 = oVarPoll;
                    }
                    if (oVar2 != null) {
                        Su.f<R> fVarB = oVar2.b();
                        while (!this.f41721l) {
                            boolean zA = oVar2.a();
                            if (iVar == ev.i.IMMEDIATE && this.f41715f.get() != null) {
                                fVar.clear();
                                e();
                                sVar.onError(this.f41715f.b());
                                return;
                            }
                            try {
                                rPoll = fVarB.poll();
                                if (rPoll == null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            } catch (Throwable th3) {
                                Ou.a.b(th3);
                                this.f41715f.a(th3);
                                this.f41722m = null;
                                this.f41723n--;
                            }
                            if (zA && z10) {
                                this.f41722m = null;
                                this.f41723n--;
                            } else if (!z10) {
                                sVar.onNext(rPoll);
                            }
                        }
                        fVar.clear();
                        e();
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        void f() {
            if (getAndIncrement() == 0) {
                do {
                    this.f41717h.clear();
                    e();
                } while (decrementAndGet() != 0);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f41706b, this.f41708d, this.f41709e, this.f41707c));
    }

    public C5493v(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, ev.i iVar, int i10, int i11) {
        super(qVar);
        this.f41706b = oVar;
        this.f41707c = iVar;
        this.f41708d = i10;
        this.f41709e = i11;
    }
}
