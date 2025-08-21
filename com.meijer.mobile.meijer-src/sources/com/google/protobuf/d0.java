package com.google.protobuf;

/* loaded from: classes8.dex */
final class d0 implements N {

    /* renamed from: a, reason: collision with root package name */
    private final P f91336a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91337b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f91338c;

    /* renamed from: d, reason: collision with root package name */
    private final int f91339d;

    @Override // com.google.protobuf.N
    public boolean a() {
        return (this.f91339d & 2) == 2;
    }

    @Override // com.google.protobuf.N
    public P b() {
        return this.f91336a;
    }

    @Override // com.google.protobuf.N
    public a0 c() {
        int i10 = this.f91339d;
        return (i10 & 1) != 0 ? a0.PROTO2 : (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    Object[] d() {
        return this.f91338c;
    }

    String e() {
        return this.f91337b;
    }

    d0(P p10, String str, Object[] objArr) {
        this.f91336a = p10;
        this.f91337b = str;
        this.f91338c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f91339d = cCharAt;
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
                this.f91339d = i10 | (cCharAt2 << i11);
                return;
            }
        }
    }
}
