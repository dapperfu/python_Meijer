package Yu;

/* loaded from: classes9.dex */
public final class K0 extends io.reactivex.l<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final int f40788a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40789b;

    static final class a extends Tu.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Integer> f40790a;

        /* renamed from: b, reason: collision with root package name */
        final long f40791b;

        /* renamed from: c, reason: collision with root package name */
        long f40792c;

        /* renamed from: d, reason: collision with root package name */
        boolean f40793d;

        @Override // Su.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f40793d = true;
            return 1;
        }

        @Override // Nu.b
        public void dispose() {
            set(1);
        }

        @Override // Su.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer poll() throws Exception {
            long j10 = this.f40792c;
            if (j10 != this.f40791b) {
                this.f40792c = 1 + j10;
                return Integer.valueOf((int) j10);
            }
            lazySet(1);
            return null;
        }

        @Override // Su.f
        public void clear() {
            this.f40792c = this.f40791b;
            lazySet(1);
        }

        @Override // Su.f
        public boolean isEmpty() {
            return this.f40792c == this.f40791b;
        }

        void run() {
            if (this.f40793d) {
                return;
            }
            io.reactivex.s<? super Integer> sVar = this.f40790a;
            long j10 = this.f40791b;
            for (long j11 = this.f40792c; j11 != j10 && get() == 0; j11++) {
                sVar.onNext(Integer.valueOf((int) j11));
            }
            if (get() == 0) {
                lazySet(1);
                sVar.onComplete();
            }
        }

        a(io.reactivex.s<? super Integer> sVar, long j10, long j11) {
            this.f40790a = sVar;
            this.f40792c = j10;
            this.f40791b = j11;
        }

        @Override // Nu.b
        public boolean isDisposed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super Integer> sVar) {
        a aVar = new a(sVar, this.f40788a, this.f40789b);
        sVar.onSubscribe(aVar);
        aVar.run();
    }

    public K0(int i10, int i11) {
        this.f40788a = i10;
        this.f40789b = i10 + i11;
    }
}
