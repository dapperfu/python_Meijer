package Yu;

/* renamed from: Yu.c0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5443c0<T> extends io.reactivex.l<T> {

    /* renamed from: a, reason: collision with root package name */
    final T[] f41176a;

    /* renamed from: Yu.c0$a */
    static final class a<T> extends Tu.c<T> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super T> f41177a;

        /* renamed from: b, reason: collision with root package name */
        final T[] f41178b;

        /* renamed from: c, reason: collision with root package name */
        int f41179c;

        /* renamed from: d, reason: collision with root package name */
        boolean f41180d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f41181e;

        @Override // Su.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f41180d = true;
            return 1;
        }

        @Override // Nu.b
        public void dispose() {
            this.f41181e = true;
        }

        void b() {
            T[] tArr = this.f41178b;
            int length = tArr.length;
            for (int i10 = 0; i10 < length && !isDisposed(); i10++) {
                T t10 = tArr[i10];
                if (t10 == null) {
                    this.f41177a.onError(new NullPointerException("The element at index " + i10 + " is null"));
                    return;
                }
                this.f41177a.onNext(t10);
            }
            if (isDisposed()) {
                return;
            }
            this.f41177a.onComplete();
        }

        @Override // Su.f
        public void clear() {
            this.f41179c = this.f41178b.length;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            return this.f41181e;
        }

        @Override // Su.f
        public boolean isEmpty() {
            return this.f41179c == this.f41178b.length;
        }

        @Override // Su.f
        public T poll() {
            int i10 = this.f41179c;
            T[] tArr = this.f41178b;
            if (i10 == tArr.length) {
                return null;
            }
            this.f41179c = i10 + 1;
            return (T) Ru.b.e(tArr[i10], "The array element is null");
        }

        a(io.reactivex.s<? super T> sVar, T[] tArr) {
            this.f41177a = sVar;
            this.f41178b = tArr;
        }
    }

    @Override // io.reactivex.l
    public void subscribeActual(io.reactivex.s<? super T> sVar) {
        a aVar = new a(sVar, this.f41176a);
        sVar.onSubscribe(aVar);
        if (aVar.f41180d) {
            return;
        }
        aVar.b();
    }

    public C5443c0(T[] tArr) {
        this.f41176a = tArr;
    }
}
