package Yu;

import gv.C14313a;

/* renamed from: Yu.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5463j<T> extends io.reactivex.u<Boolean> implements Su.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final io.reactivex.q<T> f41303a;

    /* renamed from: b, reason: collision with root package name */
    final Pu.q<? super T> f41304b;

    /* renamed from: Yu.j$a */
    static final class a<T> implements io.reactivex.s<T>, Nu.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.w<? super Boolean> f41305a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.q<? super T> f41306b;

        /* renamed from: c, reason: collision with root package name */
        Nu.b f41307c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41308d;

        @Override // Nu.b
        public void dispose() {
            this.f41307c.dispose();
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41307c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f41308d) {
                return;
            }
            this.f41308d = true;
            this.f41305a.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f41308d) {
                C14313a.s(th2);
            } else {
                this.f41308d = true;
                this.f41305a.onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f41308d) {
                return;
            }
            try {
                if (this.f41306b.test(t10)) {
                    this.f41308d = true;
                    this.f41307c.dispose();
                    this.f41305a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Ou.a.b(th2);
                this.f41307c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            if (Qu.d.t(this.f41307c, bVar)) {
                this.f41307c = bVar;
                this.f41305a.onSubscribe(this);
            }
        }

        a(io.reactivex.w<? super Boolean> wVar, Pu.q<? super T> qVar) {
            this.f41305a = wVar;
            this.f41306b = qVar;
        }
    }

    @Override // Su.a
    public io.reactivex.l<Boolean> b() {
        return C14313a.o(new C5460i(this.f41303a, this.f41304b));
    }

    @Override // io.reactivex.u
    protected void p(io.reactivex.w<? super Boolean> wVar) {
        this.f41303a.subscribe(new a(wVar, this.f41304b));
    }

    public C5463j(io.reactivex.q<T> qVar, Pu.q<? super T> qVar2) {
        this.f41303a = qVar;
        this.f41304b = qVar2;
    }
}
