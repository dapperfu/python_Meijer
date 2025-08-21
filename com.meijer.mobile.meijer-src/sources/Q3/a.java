package Q3;

import x3.C18069h;
import x3.F;

/* loaded from: classes4.dex */
final class a extends C18069h implements g {

    /* renamed from: h, reason: collision with root package name */
    private final long f27712h;

    /* renamed from: i, reason: collision with root package name */
    private final int f27713i;

    /* renamed from: j, reason: collision with root package name */
    private final int f27714j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f27715k;

    /* renamed from: l, reason: collision with root package name */
    private final long f27716l;

    public a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f170163f, aVar.f170160c, z10);
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f27712h = j11;
        this.f27713i = i10;
        this.f27714j = i11;
        this.f27715k = z10;
        this.f27716l = j12 == -1 ? -1L : j12;
    }

    public a e(long j10) {
        return new a(j10, this.f27712h, this.f27713i, this.f27714j, this.f27715k);
    }

    @Override // Q3.g
    public long f() {
        return this.f27716l;
    }

    @Override // Q3.g
    public int k() {
        return this.f27713i;
    }

    @Override // Q3.g
    public long h(long j10) {
        return b(j10);
    }
}
