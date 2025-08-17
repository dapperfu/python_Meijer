package io.reactivex.observers;

import io.reactivex.i;
import io.reactivex.s;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public class g<T> extends io.reactivex.observers.a<T, g<T>> implements s<T>, Nu.b, i<T>, w<T>, io.reactivex.c {

    /* renamed from: i, reason: collision with root package name */
    private final s<? super T> f138259i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<Nu.b> f138260j;

    /* renamed from: k, reason: collision with root package name */
    private Su.b<T> f138261k;

    enum a implements s<Object> {
        INSTANCE;

        @Override // io.reactivex.s
        public void onComplete() {
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
        }

        @Override // io.reactivex.s
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
        }
    }

    public g() {
        this(a.INSTANCE);
    }

    public g(s<? super T> sVar) {
        this.f138260j = new AtomicReference<>();
        this.f138259i = sVar;
    }

    @Override // Nu.b
    public final void dispose() {
        Qu.d.a(this.f138260j);
    }

    @Override // Nu.b
    public final boolean isDisposed() {
        return Qu.d.b(this.f138260j.get());
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (!this.f138244f) {
            this.f138244f = true;
            if (this.f138260j.get() == null) {
                this.f138241c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f138243e = Thread.currentThread();
            this.f138242d++;
            this.f138259i.onComplete();
        } finally {
            this.f138239a.countDown();
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (!this.f138244f) {
            this.f138244f = true;
            if (this.f138260j.get() == null) {
                this.f138241c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f138243e = Thread.currentThread();
            if (th2 == null) {
                this.f138241c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f138241c.add(th2);
            }
            this.f138259i.onError(th2);
            this.f138239a.countDown();
        } catch (Throwable th3) {
            this.f138239a.countDown();
            throw th3;
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (!this.f138244f) {
            this.f138244f = true;
            if (this.f138260j.get() == null) {
                this.f138241c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f138243e = Thread.currentThread();
        if (this.f138246h != 2) {
            this.f138240b.add(t10);
            if (t10 == null) {
                this.f138241c.add(new NullPointerException("onNext received a null value"));
            }
            this.f138259i.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f138261k.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f138240b.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f138241c.add(th2);
                this.f138261k.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Nu.b bVar) {
        this.f138243e = Thread.currentThread();
        if (bVar == null) {
            this.f138241c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!U.d.a(this.f138260j, null, bVar)) {
            bVar.dispose();
            if (this.f138260j.get() != Qu.d.DISPOSED) {
                this.f138241c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + bVar));
                return;
            }
            return;
        }
        int i10 = this.f138245g;
        if (i10 != 0 && (bVar instanceof Su.b)) {
            Su.b<T> bVar2 = (Su.b) bVar;
            this.f138261k = bVar2;
            int iA = bVar2.a(i10);
            this.f138246h = iA;
            if (iA == 1) {
                this.f138244f = true;
                this.f138243e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f138261k.poll();
                        if (tPoll != null) {
                            this.f138240b.add(tPoll);
                        } else {
                            this.f138242d++;
                            this.f138260j.lazySet(Qu.d.DISPOSED);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.f138241c.add(th2);
                        return;
                    }
                }
            }
        }
        this.f138259i.onSubscribe(bVar);
    }

    @Override // io.reactivex.i
    public void onSuccess(T t10) {
        onNext(t10);
        onComplete();
    }
}
