package Yu;

import av.C6157a;
import gv.C14313a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jv.C15083f;

/* loaded from: classes9.dex */
public final class H1<T, B> extends AbstractC5436a<T, io.reactivex.l<T>> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<B> f40721b;

    /* renamed from: c, reason: collision with root package name */
    final int f40722c;

    static final class a<T, B> extends io.reactivex.observers.d<B> {

        /* renamed from: b, reason: collision with root package name */
        final b<T, B> f40723b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40724c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40724c) {
                return;
            }
            this.f40724c = true;
            this.f40723b.b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40724c) {
                C14313a.s(th2);
            } else {
                this.f40724c = true;
                this.f40723b.c(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(B b10) {
            if (this.f40724c) {
                return;
            }
            this.f40723b.e();
        }

        a(b<T, B> bVar) {
            this.f40723b = bVar;
        }
    }

    static final class b<T, B> extends AtomicInteger implements io.reactivex.s<T>, Nu.b, Runnable {

        /* renamed from: k, reason: collision with root package name */
        static final Object f40725k = new Object();

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super io.reactivex.l<T>> f40726a;

        /* renamed from: b, reason: collision with root package name */
        final int f40727b;

        /* renamed from: c, reason: collision with root package name */
        final a<T, B> f40728c = new a<>(this);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Nu.b> f40729d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f40730e = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        final C6157a<Object> f40731f = new C6157a<>();

        /* renamed from: g, reason: collision with root package name */
        final ev.c f40732g = new ev.c();

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f40733h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f40734i;

        /* renamed from: j, reason: collision with root package name */
        C15083f<T> f40735j;

        void b() {
            Qu.d.a(this.f40729d);
            this.f40734i = true;
            a();
        }

        void c(Throwable th2) {
            Qu.d.a(this.f40729d);
            if (!this.f40732g.a(th2)) {
                C14313a.s(th2);
            } else {
                this.f40734i = true;
                a();
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (this.f40733h.compareAndSet(false, true)) {
                this.f40728c.dispose();
                if (this.f40730e.decrementAndGet() == 0) {
                    Qu.d.a(this.f40729d);
                }
            }
        }

        void e() {
            this.f40731f.offer(f40725k);
            a();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40733h.get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40728c.dispose();
            this.f40734i = true;
            a();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40728c.dispose();
            if (!this.f40732g.a(th2)) {
                C14313a.s(th2);
            } else {
                this.f40734i = true;
                a();
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40731f.offer(t10);
            a();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.o(this.f40729d, bVar)) {
                e();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f40730e.decrementAndGet() == 0) {
                Qu.d.a(this.f40729d);
            }
        }

        b(io.reactivex.s<? super io.reactivex.l<T>> sVar, int i10) {
            this.f40726a = sVar;
            this.f40727b = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        void a() {
            boolean z10;
            if (getAndIncrement() == 0) {
                io.reactivex.s<? super io.reactivex.l<T>> sVar = this.f40726a;
                C6157a<Object> c6157a = this.f40731f;
                ev.c cVar = this.f40732g;
                int iAddAndGet = 1;
                while (this.f40730e.get() != 0) {
                    C15083f<T> c15083f = this.f40735j;
                    boolean z11 = this.f40734i;
                    if (z11 && cVar.get() != null) {
                        c6157a.clear();
                        Throwable thB = cVar.b();
                        if (c15083f != 0) {
                            this.f40735j = null;
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
                                this.f40735j = null;
                                c15083f.onComplete();
                            }
                            sVar.onComplete();
                            return;
                        }
                        if (c15083f != 0) {
                            this.f40735j = null;
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
                    } else if (objPoll != f40725k) {
                        c15083f.onNext(objPoll);
                    } else {
                        if (c15083f != 0) {
                            this.f40735j = null;
                            c15083f.onComplete();
                        }
                        if (!this.f40733h.get()) {
                            C15083f<T> c15083fF = C15083f.f(this.f40727b, this);
                            this.f40735j = c15083fF;
                            this.f40730e.getAndIncrement();
                            sVar.onNext(c15083fF);
                        }
                    }
                }
                c6157a.clear();
                this.f40735j = null;
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super io.reactivex.l<T>> sVar) {
        b bVar = new b(sVar, this.f40722c);
        sVar.onSubscribe(bVar);
        this.f40721b.subscribe(bVar.f40728c);
        this.f41135a.subscribe(bVar);
    }

    public H1(io.reactivex.q<T> qVar, io.reactivex.q<B> qVar2, int i10) {
        super(qVar);
        this.f40721b = qVar2;
        this.f40722c = i10;
    }
}
