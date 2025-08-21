package io.reactivex.observers;

import io.reactivex.i;
import io.reactivex.s;
import io.reactivex.w;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public class g<T> extends io.reactivex.observers.a<T, g<T>> implements s<T>, Ju.b, i<T>, w<T>, io.reactivex.c {

    /* renamed from: i, reason: collision with root package name */
    private final s<? super T> f138901i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<Ju.b> f138902j;

    /* renamed from: k, reason: collision with root package name */
    private Ou.b<T> f138903k;

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
        public void onSubscribe(Ju.b bVar) {
        }
    }

    public g() {
        this(a.INSTANCE);
    }

    public g(s<? super T> sVar) {
        this.f138902j = new AtomicReference<>();
        this.f138901i = sVar;
    }

    @Override // Ju.b
    public final void dispose() {
        Mu.d.a(this.f138902j);
    }

    @Override // Ju.b
    public final boolean isDisposed() {
        return Mu.d.b(this.f138902j.get());
    }

    @Override // io.reactivex.s
    public void onComplete() {
        if (!this.f138886f) {
            this.f138886f = true;
            if (this.f138902j.get() == null) {
                this.f138883c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f138885e = Thread.currentThread();
            this.f138884d++;
            this.f138901i.onComplete();
        } finally {
            this.f138881a.countDown();
        }
    }

    @Override // io.reactivex.s
    public void onError(Throwable th2) {
        if (!this.f138886f) {
            this.f138886f = true;
            if (this.f138902j.get() == null) {
                this.f138883c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f138885e = Thread.currentThread();
            if (th2 == null) {
                this.f138883c.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f138883c.add(th2);
            }
            this.f138901i.onError(th2);
            this.f138881a.countDown();
        } catch (Throwable th3) {
            this.f138881a.countDown();
            throw th3;
        }
    }

    @Override // io.reactivex.s
    public void onNext(T t10) {
        if (!this.f138886f) {
            this.f138886f = true;
            if (this.f138902j.get() == null) {
                this.f138883c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f138885e = Thread.currentThread();
        if (this.f138888h != 2) {
            this.f138882b.add(t10);
            if (t10 == null) {
                this.f138883c.add(new NullPointerException("onNext received a null value"));
            }
            this.f138901i.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f138903k.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f138882b.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f138883c.add(th2);
                this.f138903k.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.s
    public void onSubscribe(Ju.b bVar) {
        this.f138885e = Thread.currentThread();
        if (bVar == null) {
            this.f138883c.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!U.d.a(this.f138902j, null, bVar)) {
            bVar.dispose();
            if (this.f138902j.get() != Mu.d.DISPOSED) {
                this.f138883c.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + bVar));
                return;
            }
            return;
        }
        int i10 = this.f138887g;
        if (i10 != 0 && (bVar instanceof Ou.b)) {
            Ou.b<T> bVar2 = (Ou.b) bVar;
            this.f138903k = bVar2;
            int iA = bVar2.a(i10);
            this.f138888h = iA;
            if (iA == 1) {
                this.f138886f = true;
                this.f138885e = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f138903k.poll();
                        if (tPoll != null) {
                            this.f138882b.add(tPoll);
                        } else {
                            this.f138884d++;
                            this.f138902j.lazySet(Mu.d.DISPOSED);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.f138883c.add(th2);
                        return;
                    }
                }
            }
        }
        this.f138901i.onSubscribe(bVar);
    }

    @Override // io.reactivex.i
    public void onSuccess(T t10) {
        onNext(t10);
        onComplete();
    }
}
