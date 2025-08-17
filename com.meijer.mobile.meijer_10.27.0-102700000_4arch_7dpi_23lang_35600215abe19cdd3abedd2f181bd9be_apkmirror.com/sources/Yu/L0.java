package Yu;

/* loaded from: classes9.dex */
public final class L0 extends io.reactivex.l<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final long f40839a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40840b;

    static final class a extends Tu.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        final io.reactivex.s<? super Long> f40841a;

        /* renamed from: b, reason: collision with root package name */
        final long f40842b;

        /* renamed from: c, reason: collision with root package name */
        long f40843c;

        /* renamed from: d, reason: collision with root package name */
        boolean f40844d;

        @Override // Su.c
        public int a(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f40844d = true;
            return 1;
        }

        @Override // Nu.b
        public void dispose() {
            set(1);
        }

        @Override // Su.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long poll() throws Exception {
            long j10 = this.f40843c;
            if (j10 != this.f40842b) {
                this.f40843c = 1 + j10;
                return Long.valueOf(j10);
            }
            lazySet(1);
            return null;
        }

        @Override // Su.f
        public void clear() {
            this.f40843c = this.f40842b;
            lazySet(1);
        }

        @Override // Su.f
        public boolean isEmpty() {
            return this.f40843c == this.f40842b;
        }

        void run() {
            if (this.f40844d) {
                return;
            }
            io.reactivex.s<? super Long> sVar = this.f40841a;
            long j10 = this.f40842b;
            for (long j11 = this.f40843c; j11 != j10 && get() == 0; j11++) {
                sVar.onNext(Long.valueOf(j11));
            }
            if (get() == 0) {
                lazySet(1);
                sVar.onComplete();
            }
        }

        a(io.reactivex.s<? super Long> sVar, long j10, long j11) {
            this.f40841a = sVar;
            this.f40843c = j10;
            this.f40842b = j11;
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
    protected void subscribeActual(io.reactivex.s<? super Long> sVar) {
        long j10 = this.f40839a;
        a aVar = new a(sVar, j10, this.f40840b + j10);
        sVar.onSubscribe(aVar);
        aVar.run();
    }

    public L0(long j10, long j11) {
        this.f40839a = j10;
        this.f40840b = j11;
    }
}
