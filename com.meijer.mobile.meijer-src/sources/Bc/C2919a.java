package Bc;

import Bc.AbstractC2923e;

/* renamed from: Bc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2919a extends AbstractC2923e {

    /* renamed from: b, reason: collision with root package name */
    private final long f2671b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2672c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2673d;

    /* renamed from: e, reason: collision with root package name */
    private final long f2674e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2675f;

    /* renamed from: Bc.a$b */
    static final class b extends AbstractC2923e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f2676a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f2677b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f2678c;

        /* renamed from: d, reason: collision with root package name */
        private Long f2679d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f2680e;

        @Override // Bc.AbstractC2923e.a
        AbstractC2923e a() {
            String str = "";
            if (this.f2676a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f2677b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f2678c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f2679d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f2680e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C2919a(this.f2676a.longValue(), this.f2677b.intValue(), this.f2678c.intValue(), this.f2679d.longValue(), this.f2680e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        b() {
        }

        @Override // Bc.AbstractC2923e.a
        AbstractC2923e.a b(int i10) {
            this.f2678c = Integer.valueOf(i10);
            return this;
        }

        @Override // Bc.AbstractC2923e.a
        AbstractC2923e.a c(long j10) {
            this.f2679d = Long.valueOf(j10);
            return this;
        }

        @Override // Bc.AbstractC2923e.a
        AbstractC2923e.a d(int i10) {
            this.f2677b = Integer.valueOf(i10);
            return this;
        }

        @Override // Bc.AbstractC2923e.a
        AbstractC2923e.a e(int i10) {
            this.f2680e = Integer.valueOf(i10);
            return this;
        }

        @Override // Bc.AbstractC2923e.a
        AbstractC2923e.a f(long j10) {
            this.f2676a = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2923e) {
            AbstractC2923e abstractC2923e = (AbstractC2923e) obj;
            if (this.f2671b == abstractC2923e.f() && this.f2672c == abstractC2923e.d() && this.f2673d == abstractC2923e.b() && this.f2674e == abstractC2923e.c() && this.f2675f == abstractC2923e.e()) {
                return true;
            }
        }
        return false;
    }

    private C2919a(long j10, int i10, int i11, long j11, int i12) {
        this.f2671b = j10;
        this.f2672c = i10;
        this.f2673d = i11;
        this.f2674e = j11;
        this.f2675f = i12;
    }

    @Override // Bc.AbstractC2923e
    int b() {
        return this.f2673d;
    }

    @Override // Bc.AbstractC2923e
    long c() {
        return this.f2674e;
    }

    @Override // Bc.AbstractC2923e
    int d() {
        return this.f2672c;
    }

    @Override // Bc.AbstractC2923e
    int e() {
        return this.f2675f;
    }

    @Override // Bc.AbstractC2923e
    long f() {
        return this.f2671b;
    }

    public int hashCode() {
        long j10 = this.f2671b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f2672c) * 1000003) ^ this.f2673d) * 1000003;
        long j11 = this.f2674e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f2675f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2671b + ", loadBatchSize=" + this.f2672c + ", criticalSectionEnterTimeoutMs=" + this.f2673d + ", eventCleanUpAge=" + this.f2674e + ", maxBlobByteSizePerRow=" + this.f2675f + "}";
    }
}
