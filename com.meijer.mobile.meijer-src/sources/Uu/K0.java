package Uu;

/* loaded from: classes10.dex */
public final class K0 extends io.reactivex.l<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final int f38013a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38014b;

    static final class a extends Pu.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Integer> f38015a;

        /* renamed from: b, reason: collision with root package name */
        final long f38016b;

        /* renamed from: c, reason: collision with root package name */
        long f38017c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38018d;

        @Override // Ou.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f38018d = true;
            return 1;
        }

        @Override // Ju.b
        public void dispose() {
            set(1);
        }

        @Override // Ou.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer poll() throws Exception {
            long j10 = this.f38017c;
            if (j10 != this.f38016b) {
                this.f38017c = 1 + j10;
                return Integer.valueOf((int) j10);
            }
            lazySet(1);
            return null;
        }

        @Override // Ou.f
        public void clear() {
            this.f38017c = this.f38016b;
            lazySet(1);
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return this.f38017c == this.f38016b;
        }

        void run() {
            if (this.f38018d) {
                return;
            }
            io.reactivex.s<? super Integer> sVar = this.f38015a;
            long j10 = this.f38016b;
            for (long j11 = this.f38017c; j11 != j10 && get() == 0; j11++) {
                sVar.onNext(Integer.valueOf((int) j11));
            }
            if (get() == 0) {
                lazySet(1);
                sVar.onComplete();
            }
        }

        a(io.reactivex.s<? super Integer> sVar, long j10, long j11) {
            this.f38015a = sVar;
            this.f38017c = j10;
            this.f38016b = j11;
        }

        @Override // Ju.b
        public boolean isDisposed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.l
    protected void subscribeActual(io.reactivex.s<? super Integer> sVar) {
        a aVar = new a(sVar, this.f38013a, this.f38014b);
        sVar.onSubscribe(aVar);
        aVar.run();
    }

    public K0(int i10, int i11) {
        this.f38013a = i10;
        this.f38014b = i10 + i11;
    }
}
