package Yu;

import gv.C14313a;
import io.reactivex.exceptions.CompositeException;

/* loaded from: classes9.dex */
public final class E0<T> extends AbstractC5436a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final Pu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> f40628b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f40629c;

    static final class a<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f40630a;

        /* renamed from: b, reason: collision with root package name */
        final Pu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> f40631b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f40632c;

        /* renamed from: d, reason: collision with root package name */
        final Qu.h f40633d = new Qu.h();

        /* renamed from: e, reason: collision with root package name */
        boolean f40634e;

        /* renamed from: f, reason: collision with root package name */
        boolean f40635f;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f40635f) {
                return;
            }
            this.f40635f = true;
            this.f40634e = true;
            this.f40630a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            if (this.f40634e) {
                if (this.f40635f) {
                    C14313a.s(th2);
                    return;
                } else {
                    this.f40630a.onError(th2);
                    return;
                }
            }
            this.f40634e = true;
            if (this.f40632c && !(th2 instanceof Exception)) {
                this.f40630a.onError(th2);
                return;
            }
            try {
                io.reactivex.q<? extends T> qVarApply = this.f40631b.apply(th2);
                if (qVarApply != null) {
                    qVarApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                this.f40630a.onError(nullPointerException);
            } catch (Throwable th3) {
                Ou.a.b(th3);
                this.f40630a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f40635f) {
                return;
            }
            this.f40630a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b bVar) {
            this.f40633d.a(bVar);
        }

        a(io.reactivex.s<? super T> sVar, Pu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> oVar, boolean z10) {
            this.f40630a = sVar;
            this.f40631b = oVar;
            this.f40632c = z10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar, this.f40628b, this.f40629c);
        sVar.onSubscribe(aVar.f40633d);
        this.f41135a.subscribe(aVar);
    }

    public E0(io.reactivex.q<T> qVar, Pu.o<? super Throwable, ? extends io.reactivex.q<? extends T>> oVar, boolean z10) {
        super(qVar);
        this.f40628b = oVar;
        this.f40629c = z10;
    }
}
