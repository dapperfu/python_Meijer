package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8674kd0 extends AbstractC9529sd0 {

    /* renamed from: a, reason: collision with root package name */
    private String f76517a;

    /* renamed from: b, reason: collision with root package name */
    private byte f76518b;

    /* renamed from: c, reason: collision with root package name */
    private int f76519c;

    /* renamed from: d, reason: collision with root package name */
    private int f76520d;

    C8674kd0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9529sd0
    public final AbstractC9529sd0 a(boolean z10) {
        this.f76518b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9529sd0
    final AbstractC9529sd0 c(int i10) {
        this.f76519c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9529sd0
    public final AbstractC9529sd0 d(int i10) {
        this.f76520d = 1;
        return this;
    }

    public final AbstractC9529sd0 e(String str) {
        this.f76517a = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9529sd0
    public final AbstractC9743ud0 b() {
        if (this.f76518b == 1 && this.f76517a != null && this.f76519c != 0 && this.f76520d != 0) {
            return new C8888md0(this.f76517a, false, this.f76519c, null, null, this.f76520d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f76517a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f76518b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f76519c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f76520d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
