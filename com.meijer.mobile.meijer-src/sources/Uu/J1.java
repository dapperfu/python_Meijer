package Uu;

import cv.C13558a;
import fv.C14273f;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class J1<T, B> extends AbstractC5375a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<B>> f37990b;

    /* renamed from: c, reason: collision with root package name */
    final int f37991c;

    static final class a<T, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f37992b;

        /* renamed from: c, reason: collision with root package name */
        boolean f37993c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f37993c) {
                return;
            }
            this.f37993c = true;
            this.f37992b.e();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f37993c) {
                C13558a.s(th2);
            } else {
                this.f37993c = true;
                this.f37992b.f(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            if (this.f37993c) {
                return;
            }
            this.f37993c = true;
            dispose();
            this.f37992b.g(this);
        }

        a(b<T, B> bVar) {
            this.f37992b = bVar;
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.s<T>, Ju.b, Runnable {

        /* renamed from: l, reason: collision with root package name */
        static final a<Object, Object> f37994l = new a<>(null);

        /* renamed from: m, reason: collision with root package name */
        static final Object f37995m = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f37996a;

        /* renamed from: b, reason: collision with root package name */
        final int f37997b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<a<T, B>> f37998c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f37999d = new AtomicInteger(1);

        /* renamed from: e, reason: collision with root package name */
        final Wu.a<Object> f38000e = new Wu.a<>();

        /* renamed from: f, reason: collision with root package name */
        final av.c f38001f = new av.c();

        /* renamed from: g, reason: collision with root package name */
        final AtomicBoolean f38002g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        final Callable<? extends io.reactivex.q<B>> f38003h;

        /* renamed from: i, reason: collision with root package name */
        Ju.b f38004i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f38005j;

        /* renamed from: k, reason: collision with root package name */
        C14273f<T> f38006k;

        void a() {
            AtomicReference<a<T, B>> atomicReference = this.f37998c;
            a<Object, Object> aVar = f37994l;
            Ju.b bVar = (Ju.b) atomicReference.getAndSet(aVar);
            if (bVar == null || bVar == aVar) {
                return;
            }
            bVar.dispose();
        }

        @Override // Ju.b
        public void dispose() {
            if (this.f38002g.compareAndSet(false, true)) {
                a();
                if (this.f37999d.decrementAndGet() == 0) {
                    this.f38004i.dispose();
                }
            }
        }

        void e() {
            this.f38004i.dispose();
            this.f38005j = true;
            b();
        }

        void f(Throwable th2) {
            this.f38004i.dispose();
            if (!this.f38001f.a(th2)) {
                C13558a.s(th2);
            } else {
                this.f38005j = true;
                b();
            }
        }

        void g(a<T, B> aVar) {
            U.d.a(this.f37998c, aVar, null);
            this.f38000e.offer(f37995m);
            b();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38002g.get();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38000e.offer(t10);
            b();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38004i, bVar)) {
                this.f38004i = bVar;
                this.f37996a.onSubscribe(this);
                this.f38000e.offer(f37995m);
                b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37999d.decrementAndGet() == 0) {
                this.f38004i.dispose();
            }
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, int i10, Callable<? extends io.reactivex.q<B>> callable) {
            this.f37996a = sVar;
            this.f37997b = i10;
            this.f38003h = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super io.reactivex.l<T>> sVar = this.f37996a;
                Wu.a<Object> aVar = this.f38000e;
                av.c cVar = this.f38001f;
                int iAddAndGet = 1;
                while (this.f37999d.get() != 0) {
                    C14273f<T> c14273f = this.f38006k;
                    boolean z11 = this.f38005j;
                    if (z11 && cVar.get() != null) {
                        aVar.clear();
                        Throwable thB = cVar.b();
                        if (c14273f != 0) {
                            this.f38006k = null;
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
                                this.f38006k = null;
                                c14273f.onComplete();
                            }
                            sVar.onComplete();
                            return;
                        }
                        if (c14273f != 0) {
                            this.f38006k = null;
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
                    } else if (objPoll != f37995m) {
                        c14273f.onNext(objPoll);
                    } else {
                        if (c14273f != 0) {
                            this.f38006k = null;
                            c14273f.onComplete();
                        }
                        if (!this.f38002g.get()) {
                            C14273f<T> c14273fF = C14273f.f(this.f37997b, this);
                            this.f38006k = c14273fF;
                            this.f37999d.getAndIncrement();
                            try {
                                io.reactivex.q qVar = (io.reactivex.q) Nu.b.e(this.f38003h.call(), "The other Callable returned a null ObservableSource");
                                a aVar2 = new a(this);
                                if (U.d.a(this.f37998c, null, aVar2)) {
                                    qVar.subscribe(aVar2);
                                    sVar.onNext(c14273fF);
                                }
                            } catch (Throwable th2) {
                                Ku.a.b(th2);
                                cVar.a(th2);
                                this.f38005j = true;
                            }
                        }
                    }
                }
                aVar.clear();
                this.f38006k = null;
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
            this.f38005j = true;
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            a();
            if (this.f38001f.a(th2)) {
                this.f38005j = true;
                b();
            } else {
                C13558a.s(th2);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        this.f38360a.subscribe(new b(sVar, this.f37991c, this.f37990b));
    }

    public J1(io.reactivex.q<T> qVar, Callable<? extends io.reactivex.q<B>> callable, int i10) {
        super(qVar);
        this.f37990b = callable;
        this.f37991c = i10;
    }
}
