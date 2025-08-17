package Yu;

import gv.C14313a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class C<T, U> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super T, ? extends io.reactivex.q<U>> f40576b;

    static final class a<T, U> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40577a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super T, ? extends io.reactivex.q<U>> f40578b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f40579c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference<Nu.b> f40580d = new AtomicReference<>();

        /* renamed from: e, reason: collision with root package name */
        volatile long f40581e;

        /* renamed from: f, reason: collision with root package name */
        boolean f40582f;

        /* renamed from: Yu.C$a$a, reason: collision with other inner class name */
        static final class C0873a<T, U> extends io.reactivex.observers.d<U> {

            /* renamed from: b, reason: collision with root package name */
            final a<T, U> f40583b;

            /* renamed from: c, reason: collision with root package name */
            final long f40584c;

            /* renamed from: d, reason: collision with root package name */
            final T f40585d;

            /* renamed from: e, reason: collision with root package name */
            boolean f40586e;

            /* renamed from: f, reason: collision with root package name */
            final AtomicBoolean f40587f = new AtomicBoolean();

            void c() {
                if (this.f40587f.compareAndSet(false, true)) {
                    this.f40583b.a(this.f40584c, this.f40585d);
                }
            }

            @Override // io.reactivex.s
            public void onComplete() {
                if (this.f40586e) {
                    return;
                }
                this.f40586e = true;
                c();
            }

            @Override // io.reactivex.s
            public void onError(Throwable th2) {
                if (this.f40586e) {
                    C14313a.s(th2);
                } else {
                    this.f40586e = true;
                    this.f40583b.onError(th2);
                }
            }

            @Override // io.reactivex.s
            public void onNext(U u10) {
                if (this.f40586e) {
                    return;
                }
                this.f40586e = true;
                dispose();
                c();
            }

            C0873a(a<T, U> aVar, long j10, T t10) {
                this.f40583b = aVar;
                this.f40584c = j10;
                this.f40585d = t10;
            }
        }

        void a(long j10, T t10) {
            if (j10 == this.f40581e) {
                this.f40577a.onNext(t10);
            }
        }

        @Override // Nu.b
        public void dispose() {
            this.f40579c.dispose();
            Qu.d.a(this.f40580d);
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40579c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40582f) {
                return;
            }
            this.f40582f = true;
            Nu.b bVar = this.f40580d.get();
            if (bVar != Qu.d.DISPOSED) {
                C0873a c0873a = (C0873a) bVar;
                if (c0873a != null) {
                    c0873a.c();
                }
                Qu.d.a(this.f40580d);
                this.f40577a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            Qu.d.a(this.f40580d);
            this.f40577a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40582f) {
                return;
            }
            long j10 = this.f40581e + 1;
            this.f40581e = j10;
            Nu.b bVar = this.f40580d.get();
            if (bVar != null) {
                bVar.dispose();
            }
            try {
                io.reactivex.q qVar = (io.reactivex.q) Ru.b.e(this.f40578b.apply(t10), "The ObservableSource supplied is null");
                C0873a c0873a = new C0873a(this, j10, t10);
                if (U.d.a(this.f40580d, bVar, c0873a)) {
                    qVar.subscribe(c0873a);
                }
            } catch (Throwable th2) {
                Ou.a.b(th2);
                dispose();
                this.f40577a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40579c, bVar)) {
                this.f40579c = bVar;
                this.f40577a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, Pu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
            this.f40577a = sVar;
            this.f40578b = oVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(new io.reactivex.observers.f(sVar), this.f40576b));
    }

    public C(io.reactivex.q<T> qVar, Pu.o<? super T, ? extends io.reactivex.q<U>> oVar) {
        super(qVar);
        this.f40576b = oVar;
    }
}
