package Uu;

/* loaded from: classes10.dex */
public final class L0 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final long f38064a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38065b;

    static final class a extends Pu.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f38066a;

        /* renamed from: b, reason: collision with root package name */
        final long f38067b;

        /* renamed from: c, reason: collision with root package name */
        long f38068c;

        /* renamed from: d, reason: collision with root package name */
        boolean f38069d;

        @Override // Ou.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f38069d = true;
            return 1;
        }

        @Override // Ju.b
        public void dispose() {
            set(1);
        }

        @Override // Ou.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long poll() throws Exception {
            long j10 = this.f38068c;
            if (j10 != this.f38067b) {
                this.f38068c = 1 + j10;
                return Long.valueOf(j10);
            }
            lazySet(1);
            return null;
        }

        @Override // Ou.f
        public void clear() {
            this.f38068c = this.f38067b;
            lazySet(1);
        }

        @Override // Ou.f
        public boolean isEmpty() {
            return this.f38068c == this.f38067b;
        }

        void run() {
            if (this.f38069d) {
                return;
            }
            io.reactivex.s<? super Long> sVar = this.f38066a;
            long j10 = this.f38067b;
            for (long j11 = this.f38068c; j11 != j10 && get() == 0; j11++) {
                sVar.onNext(Long.valueOf(j11));
            }
            if (get() == 0) {
                lazySet(1);
                sVar.onComplete();
            }
        }

        a(io.reactivex.s<? super Long> sVar, long j10, long j11) {
            this.f38066a = sVar;
            this.f38068c = j10;
            this.f38067b = j11;
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
    protected void subscribeActual(io.reactivex.s<? super Long> sVar) {
        long j10 = this.f38064a;
        a aVar = new a(sVar, j10, this.f38065b + j10);
        sVar.onSubscribe(aVar);
        aVar.run();
    }

    public L0(long j10, long j11) {
        this.f38064a = j10;
        this.f38065b = j11;
    }
}
