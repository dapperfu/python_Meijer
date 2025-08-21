package Uu;

/* renamed from: Uu.c0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5382c0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final T[] f38401a;

    /* renamed from: Uu.c0$a */
    static final class a<T> extends Pu.c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f38402a;

        /* renamed from: b, reason: collision with root package name */
        final T[] f38403b;

        /* renamed from: c, reason: collision with root package name */
        int f38404c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38405d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f38406e;

        @Override // Ou.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f38405d = true;
            return 1;
        }

        @Override // Ju.b
        public void dispose() {
            this.f38406e = true;
        }

        void b() {
            T[] tArr = this.f38403b;
            int length = tArr.length;
            for (int i10 = 0; i10 < length && !isDisposed(); i10++) {
                T t10 = tArr[i10];
                if (t10 == null) {
                    this.f38402a.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                this.f38402a.onNext(t10);
            }
            if (isDisposed()) {
                return;
            }
            this.f38402a.onComplete();
        }

        @Override // Ou.f
        public void clear() {
            this.f38404c = this.f38403b.length;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            return this.f38406e;
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return this.f38404c == this.f38403b.length;
        }

        @Override // Ou.f
        public T poll() {
            int i10 = this.f38404c;
            T[] tArr = this.f38403b;
            if (i10 == tArr.length) {
                return null;
            }
            this.f38404c = i10 + 1;
            return (T) Nu.b.e(tArr[i10], "The array element is null");
        }

        a(io.reactivex.s<? super T> sVar, T[] tArr) {
            this.f38402a = sVar;
            this.f38403b = tArr;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar, this.f38401a);
        sVar.onSubscribe(aVar);
        if (aVar.f38405d) {
            return;
        }
        aVar.b();
    }

    public C5382c0(T[] tArr) {
        this.f38401a = tArr;
    }
}
