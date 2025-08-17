package Yu;

import gv.C14313a;

/* loaded from: classes9.dex */
public final class M0<T> extends io.reactivex.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f40859a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.c<T, T, T> f40860b;

    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.i<? super T> f40861a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.c<T, T, T> f40862b;

        /* renamed from: c, reason: collision with root package name */
        boolean f40863c;

        /* renamed from: d, reason: collision with root package name */
        T f40864d;

        /* renamed from: e, reason: collision with root package name */
        Nu.b f40865e;

        @Override // Nu.b
        public void dispose() {
            this.f40865e.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f40865e.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40863c) {
                return;
            }
            this.f40863c = true;
            T t10 = this.f40864d;
            this.f40864d = null;
            if (t10 != null) {
                this.f40861a.onSuccess(t10);
            } else {
                this.f40861a.onComplete();
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40863c) {
                C14313a.s(th2);
                return;
            }
            this.f40863c = true;
            this.f40864d = null;
            this.f40861a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40863c) {
                return;
            }
            T t11 = this.f40864d;
            if (t11 == null) {
                this.f40864d = t10;
                return;
            }
            try {
                this.f40864d = (T) Ru.b.e(this.f40862b.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f40865e.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f40865e, bVar)) {
                this.f40865e = bVar;
                this.f40861a.onSubscribe(this);
            }
        }

        a(io.reactivex.i<? super T> iVar, Pu.c<T, T, T> cVar) {
            this.f40861a = iVar;
            this.f40862b = cVar;
        }
    }

    @Override // io.reactivex.h
    protected void d(io.reactivex.i<? super T> iVar) {
        this.f40859a.subscribe(new a(iVar, this.f40860b));
    }

    public M0(io.reactivex.q<T> qVar, Pu.c<T, T, T> cVar) {
        this.f40859a = qVar;
        this.f40860b = cVar;
    }
}
