package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class M<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.a f40853b;

    static final class a<T> extends Tu.b<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40854a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.a f40855b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f40856c;

        /* renamed from: d, reason: collision with root package name */
        Su.b<T> f40857d;

        /* renamed from: e, reason: collision with root package name */
        boolean f40858e;

        void b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f40855b.run();
                } catch (Throwable th2) {
                    Ou.a.b(th2);
                    C14313a.s(th2);
                }
            }
        }

        @Override // Su.c
        public int a(int i10) {
            Su.b<T> bVar = this.f40857d;
            if (bVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iA = bVar.a(i10);
            if (iA != 0) {
                this.f40858e = iA == 1;
            }
            return iA;
        }

        @Override // Su.f
        public void clear() {
            this.f40857d.clear();
        }

        @Override // Nu.b
        public void dispose() {
            this.f40856c.dispose();
            b();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40856c.isDisposed();
        }

        @Override // Su.f
        public boolean isEmpty() {
            return this.f40857d.isEmpty();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f40854a.onComplete();
            b();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f40854a.onError(th2);
            b();
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f40854a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40856c, bVar)) {
                this.f40856c = bVar;
                if (bVar instanceof Su.b) {
                    this.f40857d = (Su.b) bVar;
                }
                this.f40854a.onSubscribe(this);
            }
        }

        @Override // Su.f
        public T poll() throws Exception {
            T tPoll = this.f40857d.poll();
            if (tPoll == null && this.f40858e) {
                b();
            }
            return tPoll;
        }

        a(io.reactivex.s<? super T> sVar, Pu.a aVar) {
            this.f40854a = sVar;
            this.f40855b = aVar;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f41135a.subscribe(new a(sVar, this.f40853b));
    }

    public M(io.reactivex.q<T> qVar, Pu.a aVar) {
        super(qVar);
        this.f40853b = aVar;
    }
}
