package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
final class d0 implements O {

    /* renamed from: a, reason: collision with root package name */
    private final Q f88328a;

    /* renamed from: b, reason: collision with root package name */
    private final String f88329b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f88330c;

    /* renamed from: d, reason: collision with root package name */
    private final int f88331d;

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public boolean a() {
        return (this.f88331d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public Q b() {
        return this.f88328a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public a0 c() {
        int i10 = this.f88331d;
        return (i10 & 1) != 0 ? a0.PROTO2 : (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    Object[] d() {
        return this.f88330c;
    }

    String e() {
        return this.f88329b;
    }

    d0(Q q10, String str, Object[] objArr) {
        this.f88328a = q10;
        this.f88329b = str;
        this.f88330c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f88331d = cCharAt;
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
                this.f88331d = i10 | (cCharAt2 << i11);
                return;
            }
        }
    }
}
