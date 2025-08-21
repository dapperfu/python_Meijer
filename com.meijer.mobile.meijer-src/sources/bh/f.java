package bh;

/* loaded from: classes8.dex */
public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* renamed from: f, reason: collision with root package name */
    private static final f[] f60393f;

    /* renamed from: a, reason: collision with root package name */
    private final int f60395a;

    static {
        f fVar = L;
        f fVar2 = M;
        f fVar3 = Q;
        f60393f = new f[]{fVar2, fVar, H, fVar3};
    }

    public static f a(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = f60393f;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return this.f60395a;
    }

    f(int i10) {
        this.f60395a = i10;
    }
}
