package Uu;

import cv.C13558a;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Uu.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5432v<T, R> extends AbstractC5375a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38931b;

    /* renamed from: c, reason: collision with root package name */
    final av.i f38932c;

    /* renamed from: d, reason: collision with root package name */
    final int f38933d;

    /* renamed from: e, reason: collision with root package name */
    final int f38934e;

    /* renamed from: Uu.v$a */
    static final class a<T, R> extends AtomicInteger implements io.reactivex.s<T>, Ju.b, Pu.p<R> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super R> f38935a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.o<? super T, ? extends io.reactivex.q<? extends R>> f38936b;

        /* renamed from: c, reason: collision with root package name */
        final int f38937c;

        /* renamed from: d, reason: collision with root package name */
        final int f38938d;

        /* renamed from: e, reason: collision with root package name */
        final av.i f38939e;

        /* renamed from: f, reason: collision with root package name */
        final av.c f38940f = new av.c();

        /* renamed from: g, reason: collision with root package name */
        final ArrayDeque<Pu.o<R>> f38941g = new ArrayDeque<>();

        /* renamed from: h, reason: collision with root package name */
        Ou.f<T> f38942h;

        /* renamed from: i, reason: collision with root package name */
        Ju.b f38943i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f38944j;

        /* renamed from: k, reason: collision with root package name */
        int f38945k;

        /* renamed from: l, reason: collision with root package name */
        volatile boolean f38946l;

        /* renamed from: m, reason: collision with root package name */
        Pu.o<R> f38947m;

        /* renamed from: n, reason: collision with root package name */
        int f38948n;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38944j = true;
            b();
        }

        @Override // Pu.p
        public void d(Pu.o<R> oVar, Throwable th2) {
            if (!this.f38940f.a(th2)) {
                C13558a.s(th2);
                return;
            }
            if (this.f38939e == av.i.IMMEDIATE) {
                this.f38943i.dispose();
            }
            oVar.c();
            b();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38946l) {
                return;
            }
            this.f38946l = true;
            this.f38943i.dispose();
            f();
        }

        void e() {
            Pu.o<R> oVar = this.f38947m;
            if (oVar != null) {
                oVar.dispose();
            }
            while (true) {
                Pu.o<R> oVarPoll = this.f38941g.poll();
                if (oVarPoll == null) {
                    return;
                } else {
                    oVarPoll.dispose();
                }
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38946l;
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (!this.f38940f.a(th2)) {
                C13558a.s(th2);
            } else {
                this.f38944j = true;
                b();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38945k == 0) {
                this.f38942h.offer(t10);
            }
            b();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38943i, bVar)) {
                this.f38943i = bVar;
                if (bVar instanceof Ou.b) {
                    Ou.b bVar2 = (Ou.b) bVar;
                    int iA = bVar2.a(3);
                    if (iA == 1) {
                        this.f38945k = iA;
                        this.f38942h = bVar2;
                        this.f38944j = true;
                        this.f38935a.onSubscribe(this);
                        b();
                        return;
                    }
                    if (iA == 2) {
                        this.f38945k = iA;
                        this.f38942h = bVar2;
                        this.f38935a.onSubscribe(this);
                        return;
                    }
                }
                this.f38942h = new Wu.c(this.f38938d);
                this.f38935a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super R> sVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, int i10, int i11, av.i iVar) {
            this.f38935a = sVar;
            this.f38936b = oVar;
            this.f38937c = i10;
            this.f38938d = i11;
            this.f38939e = iVar;
        }

        @Override // Pu.p
        public void a(Pu.o<R> oVar) {
            oVar.c();
            b();
        }

        @Override // Pu.p
        public void b() {
            R rPoll;
            boolean z10;
            boolean z11;
            if (getAndIncrement() == 0) {
                Ou.f<T> fVar = this.f38942h;
                ArrayDeque<Pu.o<R>> arrayDeque = this.f38941g;
                io.reactivex.s<? super R> sVar = this.f38935a;
                av.i iVar = this.f38939e;
                int iAddAndGet = 1;
                while (true) {
                    int i10 = this.f38948n;
                    while (i10 != this.f38937c) {
                        if (this.f38946l) {
                            fVar.clear();
                            e();
                            return;
                        }
                        if (iVar == av.i.IMMEDIATE && this.f38940f.get() != null) {
                            fVar.clear();
                            e();
                            sVar.onError(this.f38940f.b());
                            return;
                        }
                        try {
                            T tPoll = fVar.poll();
                            if (tPoll == null) {
                                break;
                            }
                            io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38936b.apply(tPoll), "The mapper returned a null ObservableSource");
                            Pu.o<R> oVar = new Pu.o<>(this, this.f38938d);
                            arrayDeque.offer(oVar);
                            qVar.subscribe(oVar);
                            i10++;
                        } catch (Throwable th2) {
                            Ku.a.b(th2);
                            this.f38943i.dispose();
                            fVar.clear();
                            e();
                            this.f38940f.a(th2);
                            sVar.onError(this.f38940f.b());
                            return;
                        }
                    }
                    this.f38948n = i10;
                    if (this.f38946l) {
                        fVar.clear();
                        e();
                        return;
                    }
                    if (iVar == av.i.IMMEDIATE && this.f38940f.get() != null) {
                        fVar.clear();
                        e();
                        sVar.onError(this.f38940f.b());
                        return;
                    }
                    Pu.o<R> oVar2 = this.f38947m;
                    if (oVar2 == null) {
                        if (iVar == av.i.BOUNDARY && this.f38940f.get() != null) {
                            fVar.clear();
                            e();
                            sVar.onError(this.f38940f.b());
                            return;
                        }
                        boolean z12 = this.f38944j;
                        Pu.o<R> oVarPoll = arrayDeque.poll();
                        if (oVarPoll == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 && z11) {
                            if (this.f38940f.get() != null) {
                                fVar.clear();
                                e();
                                sVar.onError(this.f38940f.b());
                                return;
                            }
                            sVar.onComplete();
                            return;
                        }
                        if (!z11) {
                            this.f38947m = oVarPoll;
                        }
                        oVar2 = oVarPoll;
                    }
                    if (oVar2 != null) {
                        Ou.f<R> fVarB = oVar2.b();
                        while (!this.f38946l) {
                            boolean zA = oVar2.a();
                            if (iVar == av.i.IMMEDIATE && this.f38940f.get() != null) {
                                fVar.clear();
                                e();
                                sVar.onError(this.f38940f.b());
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
                                Ku.a.b(th3);
                                this.f38940f.a(th3);
                                this.f38947m = null;
                                this.f38948n--;
                            }
                            if (zA && z10) {
                                this.f38947m = null;
                                this.f38948n--;
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

        @Override // Pu.p
        public void c(Pu.o<R> oVar, R r10) {
            oVar.b().offer(r10);
            b();
        }

        void f() {
            if (getAndIncrement() == 0) {
                do {
                    this.f38942h.clear();
                    e();
                } while (decrementAndGet() != 0);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super R> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38931b, this.f38933d, this.f38934e, this.f38932c));
    }

    public C5432v(io.reactivex.q<T> qVar, Lu.o<? super T, ? extends io.reactivex.q<? extends R>> oVar, av.i iVar, int i10, int i11) {
        super(qVar);
        this.f38931b = oVar;
        this.f38932c = iVar;
        this.f38933d = i10;
        this.f38934e = i11;
    }
}
