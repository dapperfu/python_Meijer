package Uu;

import cv.C13558a;
import fv.C14273f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class H1<T, B> extends AbstractC5375a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<B> f37946b;

    /* renamed from: c, reason: collision with root package name */
    final int f37947c;

    static final class a<T, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f37948b;

        /* renamed from: c, reason: collision with root package name */
        boolean f37949c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37949c) {
                return;
            }
            this.f37949c = true;
            this.f37948b.b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37949c) {
                C13558a.s(th2);
            } else {
                this.f37949c = true;
                this.f37948b.c(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            if (this.f37949c) {
                return;
            }
            this.f37948b.e();
        }

        a(b<T, B> bVar) {
            this.f37948b = bVar;
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: k, reason: collision with root package name */
        static final Object f37950k = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f37951a;

        /* renamed from: b, reason: collision with root package name */
        final int f37952b;

        /* renamed from: c, reason: collision with root package name */
        final a<T, B> f37953c = new a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Ju.b> f37954d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f37955e = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        final Wu.a<Object> f37956f = new Wu.a<>();

        /* renamed from: g, reason: collision with root package name */
        final av.c f37957g = new av.c();

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f37958h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f37959i;

        /* renamed from: j, reason: collision with root package name */
        C14273f<T> f37960j;

        void b() {
            Mu.d.a(this.f37954d);
            this.f37959i = true;
            a();
        }

        void c(Throwable th2) {
            Mu.d.a(this.f37954d);
            if (!this.f37957g.a(th2)) {
                C13558a.s(th2);
            } else {
                this.f37959i = true;
                a();
            }
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f37958h.compareAndSet(false, true)) {
                this.f37953c.dispose();
                if (this.f37955e.decrementAndGet() == 0) {
                    Mu.d.a(this.f37954d);
                }
            }
        }

        void e() {
            this.f37956f.offer(f37950k);
            a();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f37958h.get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f37953c.dispose();
            this.f37959i = true;
            a();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f37953c.dispose();
            if (!this.f37957g.a(th2)) {
                C13558a.s(th2);
            } else {
                this.f37959i = true;
                a();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f37956f.offer(t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this.f37954d, bVar)) {
                e();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37955e.decrementAndGet() == 0) {
                Mu.d.a(this.f37954d);
            }
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, int i10) {
            this.f37951a = sVar;
            this.f37952b = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super io.reactivex.l<T>> sVar = this.f37951a;
                Wu.a<Object> aVar = this.f37956f;
                av.c cVar = this.f37957g;
                int iAddAndGet = 1;
                while (this.f37955e.get() != 0) {
                    C14273f<T> c14273f = this.f37960j;
                    boolean z11 = this.f37959i;
                    if (z11 && cVar.get() != null) {
                        aVar.clear();
                        Throwable thB = cVar.b();
                        if (c14273f != 0) {
                            this.f37960j = null;
                            c14273f.onError(thB);
                        }
                        sVar.onError(thB);
                        return;
                    }
                    Object objPoll = aVar.poll();
                    if (objPoll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11 && z10) {
                        Throwable thB2 = cVar.b();
                        if (thB2 == null) {
                            if (c14273f != 0) {
                                this.f37960j = null;
                                c14273f.onComplete();
                            }
                            sVar.onComplete();
                            return;
                        }
                        if (c14273f != 0) {
                            this.f37960j = null;
                            c14273f.onError(thB2);
                        }
                        sVar.onError(thB2);
                        return;
                    }
                    if (z10) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (objPoll != f37950k) {
                        c14273f.onNext(objPoll);
                    } else {
                        if (c14273f != 0) {
                            this.f37960j = null;
                            c14273f.onComplete();
                        }
                        if (!this.f37958h.get()) {
                            C14273f<T> c14273fF = C14273f.f(this.f37952b, this);
                            this.f37960j = c14273fF;
                            this.f37955e.getAndIncrement();
                            sVar.onNext(c14273fF);
                        }
                    }
                }
                aVar.clear();
                this.f37960j = null;
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        b bVar = new b(sVar, this.f37947c);
        sVar.onSubscribe(bVar);
        this.f37946b.subscribe(bVar.f37953c);
        this.f38360a.subscribe(bVar);
    }

    public H1(io.reactivex.q<T> qVar, io.reactivex.q<B> qVar2, int i10) {
        super(qVar);
        this.f37946b = qVar2;
        this.f37947c = i10;
    }
}
