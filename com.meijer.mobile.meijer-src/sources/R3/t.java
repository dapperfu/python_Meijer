package R3;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f31817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31818b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31819c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31820d;

    /* renamed from: e, reason: collision with root package name */
    public final long f31821e;

    /* renamed from: f, reason: collision with root package name */
    public final long f31822f;

    /* renamed from: g, reason: collision with root package name */
    public final a3.t f31823g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31824h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f31825i;

    /* renamed from: j, reason: collision with root package name */
    public final long[] f31826j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31827k;

    /* renamed from: l, reason: collision with root package name */
    private final u[] f31828l;

    public t a(a3.t tVar) {
        return new t(this.f31817a, this.f31818b, this.f31819c, this.f31820d, this.f31821e, this.f31822f, tVar, this.f31824h, this.f31828l, this.f31827k, this.f31825i, this.f31826j);
    }

    public u b(int i10) {
        u[] uVarArr = this.f31828l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i10];
    }

    public t(int i10, int i11, long j10, long j11, long j12, long j13, a3.t tVar, int i12, u[] uVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f31817a = i10;
        this.f31818b = i11;
        this.f31819c = j10;
        this.f31820d = j11;
        this.f31821e = j12;
        this.f31822f = j13;
        this.f31823g = tVar;
        this.f31824h = i12;
        this.f31828l = uVarArr;
        this.f31827k = i13;
        this.f31825i = jArr;
        this.f31826j = jArr2;
    }
}
