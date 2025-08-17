package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8549kd0 extends AbstractC9404sd0 {

    /* renamed from: a, reason: collision with root package name */
    private String f75677a;

    /* renamed from: b, reason: collision with root package name */
    private byte f75678b;

    /* renamed from: c, reason: collision with root package name */
    private int f75679c;

    /* renamed from: d, reason: collision with root package name */
    private int f75680d;

    C8549kd0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9404sd0
    public final AbstractC9404sd0 a(boolean z10) {
        this.f75678b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9404sd0
    final AbstractC9404sd0 c(int i10) {
        this.f75679c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9404sd0
    public final AbstractC9404sd0 d(int i10) {
        this.f75680d = 1;
        return this;
    }

    public final AbstractC9404sd0 e(String str) {
        this.f75677a = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9404sd0
    public final AbstractC9618ud0 b() {
        if (this.f75678b == 1 && this.f75677a != null && this.f75679c != 0 && this.f75680d != 0) {
            return new C8763md0(this.f75677a, false, this.f75679c, null, null, this.f75680d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f75677a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f75678b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f75679c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f75680d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
