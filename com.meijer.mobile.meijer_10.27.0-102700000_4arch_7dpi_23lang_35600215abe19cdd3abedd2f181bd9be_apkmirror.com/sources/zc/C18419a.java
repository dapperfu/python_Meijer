package zc;

import zc.AbstractC18423e;

/* renamed from: zc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18419a extends AbstractC18423e {

    /* renamed from: b, reason: collision with root package name */
    private final long f171757b;

    /* renamed from: c, reason: collision with root package name */
    private final int f171758c;

    /* renamed from: d, reason: collision with root package name */
    private final int f171759d;

    /* renamed from: e, reason: collision with root package name */
    private final long f171760e;

    /* renamed from: f, reason: collision with root package name */
    private final int f171761f;

    /* renamed from: zc.a$b */
    static final class b extends AbstractC18423e.a {

        /* renamed from: a, reason: collision with root package name */
        private Long f171762a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f171763b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f171764c;

        /* renamed from: d, reason: collision with root package name */
        private Long f171765d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f171766e;

        @Override // zc.AbstractC18423e.a
        AbstractC18423e a() {
            String str = "";
            if (this.f171762a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f171763b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f171764c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f171765d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f171766e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C18419a(this.f171762a.longValue(), this.f171763b.intValue(), this.f171764c.intValue(), this.f171765d.longValue(), this.f171766e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        b() {
        }

        @Override // zc.AbstractC18423e.a
        AbstractC18423e.a b(int i10) {
            this.f171764c = Integer.valueOf(i10);
            return this;
        }

        @Override // zc.AbstractC18423e.a
        AbstractC18423e.a c(long j10) {
            this.f171765d = Long.valueOf(j10);
            return this;
        }

        @Override // zc.AbstractC18423e.a
        AbstractC18423e.a d(int i10) {
            this.f171763b = Integer.valueOf(i10);
            return this;
        }

        @Override // zc.AbstractC18423e.a
        AbstractC18423e.a e(int i10) {
            this.f171766e = Integer.valueOf(i10);
            return this;
        }

        @Override // zc.AbstractC18423e.a
        AbstractC18423e.a f(long j10) {
            this.f171762a = Long.valueOf(j10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC18423e) {
            AbstractC18423e abstractC18423e = (AbstractC18423e) obj;
            if (this.f171757b == abstractC18423e.f() && this.f171758c == abstractC18423e.d() && this.f171759d == abstractC18423e.b() && this.f171760e == abstractC18423e.c() && this.f171761f == abstractC18423e.e()) {
                return true;
            }
        }
        return false;
    }

    private C18419a(long j10, int i10, int i11, long j11, int i12) {
        this.f171757b = j10;
        this.f171758c = i10;
        this.f171759d = i11;
        this.f171760e = j11;
        this.f171761f = i12;
    }

    @Override // zc.AbstractC18423e
    int b() {
        return this.f171759d;
    }

    @Override // zc.AbstractC18423e
    long c() {
        return this.f171760e;
    }

    @Override // zc.AbstractC18423e
    int d() {
        return this.f171758c;
    }

    @Override // zc.AbstractC18423e
    int e() {
        return this.f171761f;
    }

    @Override // zc.AbstractC18423e
    long f() {
        return this.f171757b;
    }

    public int hashCode() {
        long j10 = this.f171757b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f171758c) * 1000003) ^ this.f171759d) * 1000003;
        long j11 = this.f171760e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f171761f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f171757b + ", loadBatchSize=" + this.f171758c + ", criticalSectionEnterTimeoutMs=" + this.f171759d + ", eventCleanUpAge=" + this.f171760e + ", maxBlobByteSizePerRow=" + this.f171761f + "}";
    }
}
