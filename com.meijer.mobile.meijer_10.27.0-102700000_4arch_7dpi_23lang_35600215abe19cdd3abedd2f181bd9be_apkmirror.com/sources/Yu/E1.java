package Yu;

import gv.C14313a;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class E1<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.t f40636b;

    static final class a<T> extends AtomicBoolean implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40637a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.t f40638b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f40639c;

        /* renamed from: Yu.E1$a$a, reason: collision with other inner class name */
        final class RunnableC0874a implements Runnable {
            RunnableC0874a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f40639c.dispose();
            }
        }

        @Override // Nu.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f40638b.d(new RunnableC0874a());
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40639c, bVar)) {
                this.f40639c = bVar;
                this.f40637a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.t tVar) {
            this.f40637a = sVar;
            this.f40638b = tVar;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (!get()) {
                this.f40637a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (get()) {
                C14313a.s(th2);
            } else {
                this.f40637a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (!get()) {
                this.f40637a.onNext(t10);
            }
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40636b));
    }

    public E1(io.reactivex.q<T> qVar, io.reactivex.t tVar) {
        super(qVar);
        this.f40636b = tVar;
    }
}
