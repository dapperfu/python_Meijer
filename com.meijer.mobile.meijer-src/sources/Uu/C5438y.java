package Uu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5438y<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.y<? extends T> f38998b;

    /* renamed from: Uu.y$a */
    static final class a<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, io.reactivex.w<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38999a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.y<? extends T> f39000b;

        /* renamed from: c, reason: collision with root package name */
        boolean f39001c;

        @Override // io.reactivex.s
        public void onComplete() {
            this.f39001c = true;
            Mu.d.e(this, null);
            io.reactivex.y<? extends T> yVar = this.f39000b;
            this.f39000b = null;
            yVar.a(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38999a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38999a.onNext(t10);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f38999a.onNext(t10);
            this.f38999a.onComplete();
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.y<? extends T> yVar) {
            this.f38999a = sVar;
            this.f39000b = yVar;
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
            if (Mu.d.o(this, bVar) && !this.f39001c) {
                this.f38999a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38998b));
    }

    public C5438y(io.reactivex.l<T> lVar, io.reactivex.y<? extends T> yVar) {
        super(lVar);
        this.f38998b = yVar;
    }
}
