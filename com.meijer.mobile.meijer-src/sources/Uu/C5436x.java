package Uu;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Uu.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5436x<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final io.reactivex.j<? extends T> f38970b;

    /* renamed from: Uu.x$a */
    static final class a<T> extends AtomicReference<Ju.b> implements io.reactivex.s<T>, io.reactivex.i<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38971a;

        /* renamed from: b, reason: collision with root package name */
        io.reactivex.j<? extends T> f38972b;

        /* renamed from: c, reason: collision with root package name */
        boolean f38973c;

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.f38973c) {
                this.f38971a.onComplete();
                return;
            }
            this.f38973c = true;
            Mu.d.e(this, null);
            io.reactivex.j<? extends T> jVar = this.f38972b;
            this.f38972b = null;
            jVar.a(this);
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38971a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            this.f38971a.onNext(t10);
        }

        @Override // io.reactivex.i
        public void onSuccess(T t10) {
            this.f38971a.onNext(t10);
            this.f38971a.onComplete();
        }

        a(io.reactivex.s<? super T> sVar, io.reactivex.j<? extends T> jVar) {
            this.f38971a = sVar;
            this.f38972b = jVar;
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
            if (Mu.d.o(this, bVar) && !this.f38973c) {
                this.f38971a.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38970b));
    }

    public C5436x(io.reactivex.l<T> lVar, io.reactivex.j<? extends T> jVar) {
        super(lVar);
        this.f38970b = jVar;
    }
}
