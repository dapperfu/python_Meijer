package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    private final P f54225a;

    /* renamed from: b, reason: collision with root package name */
    private final String f54226b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f54227c;

    /* renamed from: d, reason: collision with root package name */
    private final int f54228d;

    @Override // androidx.datastore.preferences.protobuf.N
    public boolean a() {
        return (this.f54228d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public P b() {
        return this.f54225a;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public a0 c() {
        int i10 = this.f54228d;
        return (i10 & 1) != 0 ? a0.PROTO2 : (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    Object[] d() {
        return this.f54227c;
    }

    String e() {
        return this.f54226b;
    }

    d0(P p10, String str, Object[] objArr) {
        this.f54225a = p10;
        this.f54226b = str;
        this.f54227c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f54228d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 >= 55296) {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            } else {
                this.f54228d = i10 | (cCharAt2 << i11);
                return;
            }
        }
    }
}
