package Uu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5434w<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.d f38954b;

    /* renamed from: Uu.w$a */
    static final class a<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, io.reactivex.c, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38955a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.d f38956b;

        /* renamed from: c, reason: collision with root package name */
        boolean f38957c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38957c) {
                this.f38955a.onComplete();
                return;
            }
            this.f38957c = true;
            Mu.d.e(this, null);
            io.reactivex.d dVar = this.f38956b;
            this.f38956b = null;
            dVar.a(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38955a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38955a.onNext(t10);
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.d dVar) {
            this.f38955a = sVar;
            this.f38956b = dVar;
        }

        @Override // Ju.b
        public void dispose() {
            Mu.d.a(this);
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return Mu.d.b(get());
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.o(this, bVar) && !this.f38957c) {
                this.f38955a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38954b));
    }

    public C5434w(io.reactivex.l<T> lVar, io.reactivex.d dVar) {
        super(lVar);
        this.f38954b = dVar;
    }
}
