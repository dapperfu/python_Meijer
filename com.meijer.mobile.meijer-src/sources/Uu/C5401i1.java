package Uu;

import java.util.ArrayDeque;

/* renamed from: Uu.i1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5401i1<T> extends AbstractC5375a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final int f38524b;

    /* renamed from: Uu.i1$a */
    static final class a<T> extends ArrayDeque<T> implements io.reactivex.s<T>, Ju.b {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38525a;

        /* renamed from: b, reason: collision with root package name */
        final int f38526b;

        /* renamed from: c, reason: collision with root package name */
        Ju.b f38527c;

        @Override // Ju.b
        public void dispose() {
            this.f38527c.dispose();
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38527c.isDisposed();
        }

        @Override // io.reactivex.s
        public void onComplete() {
            this.f38525a.onComplete();
        }

        @Override // io.reactivex.s
        public void onError(Throwable th2) {
            this.f38525a.onError(th2);
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            if (this.f38526b == size()) {
                this.f38525a.onNext(poll());
            }
            offer(t10);
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b bVar) {
            if (Mu.d.t(this.f38527c, bVar)) {
                this.f38527c = bVar;
                this.f38525a.onSubscribe(this);
            }
        }

        a(io.reactivex.s<? super T> sVar, int i10) {
            super(i10);
            this.f38525a = sVar;
            this.f38526b = i10;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        this.f38360a.subscribe(new a(sVar, this.f38524b));
    }

    public C5401i1(io.reactivex.q<T> qVar, int i10) {
        super(qVar);
        this.f38524b = i10;
    }
}
