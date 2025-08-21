package fv;

import cv.C13558a;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fv.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14273f<T> extends AbstractC14272e<T> {

    /* renamed from: a, reason: collision with root package name */
    final Wu.c<T> f133700a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<s<? super T>> f133701b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f133702c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f133703d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f133704e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f133705f;

    /* renamed from: g, reason: collision with root package name */
    Throwable f133706g;

    /* renamed from: h, reason: collision with root package name */
    final AtomicBoolean f133707h;

    /* renamed from: i, reason: collision with root package name */
    final Pu.b<T> f133708i;

    /* renamed from: j, reason: collision with root package name */
    boolean f133709j;

    /* renamed from: fv.f$a */
    final class a extends Pu.b<T> {
        @Override // Ou.c
        public int a(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            C14273f.this.f133709j = true;
            return 2;
        }

        a() {
        }

        @Override // Ou.f
        public void clear() {
            C14273f.this.f133700a.clear();
        }

        @Override // Ju.b
        public void dispose() {
            if (C14273f.this.f133704e) {
                return;
            }
            C14273f.this.f133704e = true;
            C14273f.this.g();
            C14273f.this.f133701b.lazySet(null);
            if (C14273f.this.f133708i.getAndIncrement() == 0) {
                C14273f.this.f133701b.lazySet(null);
                C14273f c14273f = C14273f.this;
                if (c14273f.f133709j) {
                    return;
                }
                c14273f.f133700a.clear();
            }
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return C14273f.this.f133704e;
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return C14273f.this.f133700a.isEmpty();
        }

        @Override // Ou.f
        public T poll() throws Exception {
            return C14273f.this.f133700a.poll();
        }
    }

    C14273f(int i10, boolean z10) {
        this.f133700a = new Wu.c<>(Nu.b.f(i10, "capacityHint"));
        this.f133702c = new AtomicReference<>();
        this.f133703d = z10;
        this.f133701b = new AtomicReference<>();
        this.f133707h = new AtomicBoolean();
        this.f133708i = new a();
    }

    public static <T> C14273f<T> d() {
        return new C14273f<>(l.bufferSize(), true);
    }

    public static <T> C14273f<T> e(int i10) {
        return new C14273f<>(i10, true);
    }

    public static <T> C14273f<T> f(int i10, Runnable runnable) {
        return new C14273f<>(i10, runnable, true);
    }

    void g() {
        Runnable runnable = this.f133702c.get();
        if (runnable == null || !U.d.a(this.f133702c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    void h() {
        if (this.f133708i.getAndIncrement() != 0) {
            return;
        }
        s<? super T> sVar = this.f133701b.get();
        int iAddAndGet = 1;
        while (sVar == null) {
            iAddAndGet = this.f133708i.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                sVar = this.f133701b.get();
            }
        }
        if (this.f133709j) {
            i(sVar);
        } else {
            j(sVar);
        }
    }

    void i(s<? super T> sVar) {
        Wu.c<T> cVar = this.f133700a;
        boolean z10 = this.f133703d;
        int iAddAndGet = 1;
        while (!this.f133704e) {
            boolean z11 = this.f133705f;
            if (!z10 && z11 && l(cVar, sVar)) {
                return;
            }
            sVar.onNext(null);
            if (z11) {
                k(sVar);
                return;
            } else {
                iAddAndGet = this.f133708i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f133701b.lazySet(null);
    }

    void j(s<? super T> sVar) {
        Wu.c<T> cVar = this.f133700a;
        boolean z10 = this.f133703d;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f133704e) {
            boolean z12 = this.f133705f;
            T tPoll = this.f133700a.poll();
            boolean z13 = tPoll == null;
            if (z12) {
                if (!z10 && z11) {
                    if (l(cVar, sVar)) {
                        return;
                    } else {
                        z11 = false;
                    }
                }
                if (z13) {
                    k(sVar);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = this.f133708i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                sVar.onNext(tPoll);
            }
        }
        this.f133701b.lazySet(null);
        cVar.clear();
    }

    void k(s<? super T> sVar) {
        this.f133701b.lazySet(null);
        Throwable th2 = this.f133706g;
        if (th2 != null) {
            sVar.onError(th2);
        } else {
            sVar.onComplete();
        }
    }

    boolean l(Ou.f<T> fVar, s<? super T> sVar) {
        Throwable th2 = this.f133706g;
        if (th2 == null) {
            return false;
        }
        this.f133701b.lazySet(null);
        fVar.clear();
        sVar.onError(th2);
        return true;
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f133705f || this.f133704e) {
            return;
        }
        this.f133705f = true;
        g();
        h();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Nu.b.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f133705f || this.f133704e) {
            C13558a.s(th2);
            return;
        }
        this.f133706g = th2;
        this.f133705f = true;
        g();
        h();
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        Nu.b.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f133705f || this.f133704e) {
            return;
        }
        this.f133700a.offer(t10);
        h();
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        if (this.f133705f || this.f133704e) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        if (this.f133707h.get() || !this.f133707h.compareAndSet(false, true)) {
            Mu.e.m(new IllegalStateException("Only a single observer allowed."), sVar);
            return;
        }
        sVar.onSubscribe(this.f133708i);
        this.f133701b.lazySet(sVar);
        if (this.f133704e) {
            this.f133701b.lazySet(null);
        } else {
            h();
        }
    }

    C14273f(int i10, Runnable runnable, boolean z10) {
        this.f133700a = new Wu.c<>(Nu.b.f(i10, "capacityHint"));
        this.f133702c = new AtomicReference<>(Nu.b.e(runnable, "onTerminate"));
        this.f133703d = z10;
        this.f133701b = new AtomicReference<>();
        this.f133707h = new AtomicBoolean();
        this.f133708i = new a();
    }
}
