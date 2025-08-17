package jv;

import av.C6159c;
import gv.C14313a;
import io.reactivex.l;
import io.reactivex.s;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jv.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15083f<T> extends AbstractC15082e<T> {

    /* renamed from: a, reason: collision with root package name */
    final C6159c<T> f141096a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<s<? super T>> f141097b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Runnable> f141098c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f141099d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f141100e;

    /* renamed from: f, reason: collision with root package name */
    volatile boolean f141101f;

    /* renamed from: g, reason: collision with root package name */
    Throwable f141102g;

    /* renamed from: h, reason: collision with root package name */
    final AtomicBoolean f141103h;

    /* renamed from: i, reason: collision with root package name */
    final Tu.b<T> f141104i;

    /* renamed from: j, reason: collision with root package name */
    boolean f141105j;

    /* renamed from: jv.f$a */
    final class a extends Tu.b<T> {
        @Override // Su.c
        public int a(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            C15083f.this.f141105j = true;
            return 2;
        }

        a() {
        }

        @Override // Su.f
        public void clear() {
            C15083f.this.f141096a.clear();
        }

        @Override // Nu.b
        public void dispose() {
            if (C15083f.this.f141100e) {
                return;
            }
            C15083f.this.f141100e = true;
            C15083f.this.g();
            C15083f.this.f141097b.lazySet(null);
            if (C15083f.this.f141104i.getAndIncrement() == 0) {
                C15083f.this.f141097b.lazySet(null);
                C15083f c15083f = C15083f.this;
                if (c15083f.f141105j) {
                    return;
                }
                c15083f.f141096a.clear();
            }
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return C15083f.this.f141100e;
        }

        @Override // Su.f
        public boolean isEmpty() {
            return C15083f.this.f141096a.isEmpty();
        }

        @Override // Su.f
        public T poll() throws Exception {
            return C15083f.this.f141096a.poll();
        }
    }

    C15083f(int i10, boolean z10) {
        this.f141096a = new C6159c<>(Ru.b.f(i10, "capacityHint"));
        this.f141098c = new AtomicReference<>();
        this.f141099d = z10;
        this.f141097b = new AtomicReference<>();
        this.f141103h = new AtomicBoolean();
        this.f141104i = new a();
    }

    public static <T> C15083f<T> d() {
        return new C15083f<>(l.bufferSize(), true);
    }

    public static <T> C15083f<T> e(int i10) {
        return new C15083f<>(i10, true);
    }

    public static <T> C15083f<T> f(int i10, Runnable runnable) {
        return new C15083f<>(i10, runnable, true);
    }

    void g() {
        Runnable runnable = this.f141098c.get();
        if (runnable == null || !U.d.a(this.f141098c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    void h() {
        if (this.f141104i.getAndIncrement() != 0) {
            return;
        }
        s<? super T> sVar = this.f141097b.get();
        int iAddAndGet = 1;
        while (sVar == null) {
            iAddAndGet = this.f141104i.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                sVar = this.f141097b.get();
            }
        }
        if (this.f141105j) {
            i(sVar);
        } else {
            j(sVar);
        }
    }

    void i(s<? super T> sVar) {
        C6159c<T> c6159c = this.f141096a;
        boolean z10 = this.f141099d;
        int iAddAndGet = 1;
        while (!this.f141100e) {
            boolean z11 = this.f141101f;
            if (!z10 && z11 && l(c6159c, sVar)) {
                return;
            }
            sVar.onNext(null);
            if (z11) {
                k(sVar);
                return;
            } else {
                iAddAndGet = this.f141104i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f141097b.lazySet(null);
    }

    void j(s<? super T> sVar) {
        C6159c<T> c6159c = this.f141096a;
        boolean z10 = this.f141099d;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f141100e) {
            boolean z12 = this.f141101f;
            T tPoll = this.f141096a.poll();
            boolean z13 = tPoll == null;
            if (z12) {
                if (!z10 && z11) {
                    if (l(c6159c, sVar)) {
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
                iAddAndGet = this.f141104i.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                sVar.onNext(tPoll);
            }
        }
        this.f141097b.lazySet(null);
        c6159c.clear();
    }

    void k(s<? super T> sVar) {
        this.f141097b.lazySet(null);
        Throwable th2 = this.f141102g;
        if (th2 != null) {
            sVar.onError(th2);
        } else {
            sVar.onComplete();
        }
    }

    boolean l(Su.f<T> fVar, s<? super T> sVar) {
        Throwable th2 = this.f141102g;
        if (th2 == null) {
            return false;
        }
        this.f141097b.lazySet(null);
        fVar.clear();
        sVar.onError(th2);
        return true;
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (this.f141101f || this.f141100e) {
            return;
        }
        this.f141101f = true;
        g();
        h();
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        Ru.b.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f141101f || this.f141100e) {
            C14313a.s(th2);
            return;
        }
        this.f141102g = th2;
        this.f141101f = true;
        g();
        h();
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        Ru.b.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f141101f || this.f141100e) {
            return;
        }
        this.f141096a.offer(t10);
        h();
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        if (this.f141101f || this.f141100e) {
            bVar.dispose();
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(s<? super T> sVar) {
        if (this.f141103h.get() || !this.f141103h.compareAndSet(false, true)) {
            Qu.e.m(new IllegalStateException("Only a single observer allowed."), sVar);
            return;
        }
        sVar.onSubscribe(this.f141104i);
        this.f141097b.lazySet(sVar);
        if (this.f141100e) {
            this.f141097b.lazySet(null);
        } else {
            h();
        }
    }

    C15083f(int i10, Runnable runnable, boolean z10) {
        this.f141096a = new C6159c<>(Ru.b.f(i10, "capacityHint"));
        this.f141098c = new AtomicReference<>(Ru.b.e(runnable, "onTerminate"));
        this.f141099d = z10;
        this.f141097b = new AtomicReference<>();
        this.f141103h = new AtomicBoolean();
        this.f141104i = new a();
    }
}
