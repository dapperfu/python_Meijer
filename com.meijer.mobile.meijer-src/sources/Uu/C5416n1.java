package Uu;

/* renamed from: Uu.n1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5416n1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.q<? extends T> f38669b;

    /* renamed from: Uu.n1$a */
    static final class a<T> implements io.reactivex.s<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38670a;

        /* renamed from: b, reason: collision with root package name */
        final io.reactivex.q<? extends T> f38671b;

        /* renamed from: d, reason: collision with root package name */
        boolean f38673d = true;

        /* renamed from: c, reason: collision with root package name */
        final Mu.h f38672c = new Mu.h();

        @Override // io.reactivex.s
        public void onComplete() {
            if (!this.f38673d) {
                this.f38670a.onComplete();
            } else {
                this.f38673d = false;
                this.f38671b.subscribe(this);
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38670a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38673d) {
                this.f38673d = false;
            }
            this.f38670a.onNext(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            this.f38672c.b(bVar);
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.q<? extends T> qVar) {
            this.f38670a = sVar;
            this.f38671b = qVar;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar, this.f38669b);
        sVar.onSubscribe(aVar.f38672c);
        this.f38360a.subscribe(aVar);
    }

    public C5416n1(io.reactivex.q<T> qVar, io.reactivex.q<? extends T> qVar2) {
        super(qVar);
        this.f38669b = qVar2;
    }
}
