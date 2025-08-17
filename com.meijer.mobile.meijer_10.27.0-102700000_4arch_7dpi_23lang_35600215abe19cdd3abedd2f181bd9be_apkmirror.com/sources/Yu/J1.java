package Yu;

import av.C6157a;
import gv.C14313a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jv.C15083f;

/* loaded from: classes9.dex */
public final class J1<T, B> extends AbstractC5436a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final Callable<? extends io.reactivex.q<B>> f40765b;

    /* renamed from: c, reason: collision with root package name */
    final int f40766c;

    static final class a<T, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f40767b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40768c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40768c) {
                return;
            }
            this.f40768c = true;
            this.f40767b.e();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40768c) {
                C14313a.s(th2);
            } else {
                this.f40768c = true;
                this.f40767b.f(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            if (this.f40768c) {
                return;
            }
            this.f40768c = true;
            dispose();
            this.f40767b.g(this);
        }

        a(b<T, B> bVar) {
            this.f40767b = bVar;
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: l, reason: collision with root package name */
        static final a<Object, Object> f40769l = new a<>(null);

        /* renamed from: m, reason: collision with root package name */
        static final Object f40770m = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f40771a;

        /* renamed from: b, reason: collision with root package name */
        final int f40772b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference<a<T, B>> f40773c = new AtomicReference<>();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f40774d = new AtomicInteger(1);

        /* renamed from: e, reason: collision with root package name */
        final C6157a<Object> f40775e = new C6157a<>();

        /* renamed from: f, reason: collision with root package name */
        final ev.c f40776f = new ev.c();

        /* renamed from: g, reason: collision with root package name */
        final AtomicBoolean f40777g = new AtomicBoolean();

        /* renamed from: h, reason: collision with root package name */
        final Callable<? extends io.reactivex.q<B>> f40778h;

        /* renamed from: i, reason: collision with root package name */
        Nu.b f40779i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f40780j;

        /* renamed from: k, reason: collision with root package name */
        C15083f<T> f40781k;

        void a() {
            AtomicReference<a<T, B>> atomicReference = this.f40773c;
            a<Object, Object> aVar = f40769l;
            Nu.b bVar = (Nu.b) atomicReference.getAndSet(aVar);
            if (bVar == null || bVar == aVar) {
                return;
            }
            bVar.dispose();
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f40777g.compareAndSet(false, true)) {
                a();
                if (this.f40774d.decrementAndGet() == 0) {
                    this.f40779i.dispose();
                }
            }
        }

        void e() {
            this.f40779i.dispose();
            this.f40780j = true;
            b();
        }

        void f(Throwable th2) {
            this.f40779i.dispose();
            if (!this.f40776f.a(th2)) {
                C14313a.s(th2);
            } else {
                this.f40780j = true;
                b();
            }
        }

        void g(a<T, B> aVar) {
            U.d.a(this.f40773c, aVar, null);
            this.f40775e.offer(f40770m);
            b();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40777g.get();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40775e.offer(t10);
            b();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40779i, bVar)) {
                this.f40779i = bVar;
                this.f40771a.onSubscribe(this);
                this.f40775e.offer(f40770m);
                b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40774d.decrementAndGet() == 0) {
                this.f40779i.dispose();
            }
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, int i10, Callable<? extends io.reactivex.q<B>> callable) {
            this.f40771a = sVar;
            this.f40772b = i10;
            this.f40778h = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void b() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super io.reactivex.l<T>> sVar = this.f40771a;
                C6157a<Object> c6157a = this.f40775e;
                ev.c cVar = this.f40776f;
                int iAddAndGet = 1;
                while (this.f40774d.get() != 0) {
                    C15083f<T> c15083f = this.f40781k;
                    boolean z11 = this.f40780j;
                    if (z11 && cVar.get() != null) {
                        c6157a.clear();
                        Throwable thB = cVar.b();
                        if (c15083f != 0) {
                            this.f40781k = null;
                            c15083f.onError(thB);
                        }
                        sVar.onError(thB);
                        return;
                    }
                    Object objPoll = c6157a.poll();
                    if (objPoll == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z11 && z10) {
                        Throwable thB2 = cVar.b();
                        if (thB2 == null) {
                            if (c15083f != 0) {
                                this.f40781k = null;
                                c15083f.onComplete();
                            }
                            sVar.onComplete();
                            return;
                        }
                        if (c15083f != 0) {
                            this.f40781k = null;
                            c15083f.onError(thB2);
                        }
                        sVar.onError(thB2);
                        return;
                    }
                    if (z10) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (objPoll != f40770m) {
                        c15083f.onNext(objPoll);
                    } else {
                        if (c15083f != 0) {
                            this.f40781k = null;
                            c15083f.onComplete();
                        }
                        if (!this.f40777g.get()) {
                            C15083f<T> c15083fF = C15083f.f(this.f40772b, this);
                            this.f40781k = c15083fF;
                            this.f40774d.getAndIncrement();
                            try {
                                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f40778h.call(), "The other Callable returned a null ObservableSource");
                                a aVar = new a(this);
                                if (U.d.a(this.f40773c, null, aVar)) {
                                    qVar.subscribe(aVar);
                                    sVar.onNext(c15083fF);
                                }
                            } catch (Throwable th2) {
                                Ou.a.b(th2);
                                cVar.a(th2);
                                this.f40780j = true;
                            }
                        }
                    }
                }
                c6157a.clear();
                this.f40781k = null;
            }
        }

        @Override // io.reactivex.s
        public void onComplete() {
            a();
            this.f40780j = true;
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            a();
            if (this.f40776f.a(th2)) {
                this.f40780j = true;
                b();
            } else {
                C14313a.s(th2);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        this.f41135a.subscribe(new b(sVar, this.f40766c, this.f40765b));
    }

    public J1(io.reactivex.q<T> qVar, Callable<? extends io.reactivex.q<B>> callable, int i10) {
        super(qVar);
        this.f40765b = callable;
        this.f40766c = i10;
    }
}
