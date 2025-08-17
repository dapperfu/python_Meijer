package Q3;

import x3.C18003h;
import x3.F;

/* loaded from: classes4.dex */
final class a extends C18003h implements g {

    /* renamed from: h, reason: collision with root package name */
    private final long f29699h;

    /* renamed from: i, reason: collision with root package name */
    private final int f29700i;

    /* renamed from: j, reason: collision with root package name */
    private final int f29701j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f29702k;

    /* renamed from: l, reason: collision with root package name */
    private final long f29703l;

    public a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f169075f, aVar.f169072c, z10);
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        long j12 = j10;
        this.f29699h = j11;
        this.f29700i = i10;
        this.f29701j = i11;
        this.f29702k = z10;
        this.f29703l = j12 == -1 ? -1L : j12;
    }

    public a e(long j10) {
        return new a(j10, this.f29699h, this.f29700i, this.f29701j, this.f29702k);
    }

    @Override // Q3.g
    public long f() {
        return this.f29703l;
    }

    @Override // Q3.g
    public int k() {
        return this.f29700i;
    }

    @Override // Q3.g
    public long h(long j10) {
        return b(j10);
    }
}
