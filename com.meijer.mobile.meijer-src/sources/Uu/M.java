package Uu;

import cv.C13558a;

/* loaded from: classes10.dex */
public final class M<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Lu.a f38078b;

    static final class a<T> extends Pu.b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38079a;

        /* renamed from: b, reason: collision with root package name */
        final Lu.a f38080b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38081c;

        /* renamed from: d, reason: collision with root package name */
        Ou.b<T> f38082d;

        /* renamed from: e, reason: collision with root package name */
        boolean f38083e;

        void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f38080b.run();
                } catch (Throwable th2) {
                    Ku.a.b(th2);
                    C13558a.s(th2);
                }
            }
        }

        @Override // Ou.c
        public int a(int i10) {
            Ou.b<T> bVar = this.f38082d;
            if (bVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iA = bVar.a(i10);
            if (iA != 0) {
                this.f38083e = iA == 1;
            }
            return iA;
        }

        @Override // Ou.f
        public void clear() {
            this.f38082d.clear();
        }

        @Override // Ju.b
        public void dispose() {
            this.f38081c.dispose();
            b();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38081c.isDisposed();
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return this.f38082d.isEmpty();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38079a.onComplete();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38079a.onError(th2);
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38079a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38081c, bVar)) {
                this.f38081c = bVar;
                if (bVar instanceof Ou.b) {
                    this.f38082d = (Ou.b) bVar;
                }
                this.f38079a.onSubscribe(this);
            }
        }

        @Override // Ou.f
        public T poll() throws Exception {
            T tPoll = this.f38082d.poll();
            if (tPoll == null && this.f38083e) {
                b();
            }
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Lu.a aVar) {
            this.f38079a = sVar;
            this.f38080b = aVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38078b));
    }

    public M(io.reactivex.q<T> qVar, Lu.a aVar) {
        super(qVar);
        this.f38078b = aVar;
    }
}
