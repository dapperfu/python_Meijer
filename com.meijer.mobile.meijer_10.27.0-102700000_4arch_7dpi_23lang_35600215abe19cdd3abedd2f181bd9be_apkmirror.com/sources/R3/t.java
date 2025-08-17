package R3;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f31815a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31816b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31817c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31818d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31819e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31820f;

    /* renamed from: g, reason: collision with root package name */
    public final a3.t f31821g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31822h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f31823i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f31824j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31825k;

    /* renamed from: l, reason: collision with root package name */
    private final u[] f31826l;

    public t a(a3.t tVar) {
        return new t(this.f31815a, this.f31816b, this.f31817c, this.f31818d, this.f31819e, this.f31820f, tVar, this.f31822h, this.f31826l, this.f31825k, this.f31823i, this.f31824j);
    }

    public u b(int i10) {
        u[] uVarArr = this.f31826l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }

    public t(int i10, int i11, long j10, long j11, long j12, long j13, a3.t tVar, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f31815a = i10;
        this.f31816b = i11;
        this.f31817c = j10;
        this.f31818d = j11;
        this.f31819e = j12;
        this.f31820f = j13;
        this.f31821g = tVar;
        this.f31822h = i12;
        this.f31826l = uVarArr;
        this.f31825k = i13;
        this.f31823i = jArr;
        this.f31824j = jArr2;
    }
}
