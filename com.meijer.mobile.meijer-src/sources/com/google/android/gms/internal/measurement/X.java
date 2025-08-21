package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class X extends AbstractC10507d0 {

    /* renamed from: a, reason: collision with root package name */
    private String f82928a;

    /* renamed from: b, reason: collision with root package name */
    private byte f82929b;

    /* renamed from: c, reason: collision with root package name */
    private int f82930c;

    /* renamed from: d, reason: collision with root package name */
    private int f82931d;

    X() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10507d0
    public final AbstractC10507d0 a(boolean z10) {
        this.f82929b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10507d0
    final AbstractC10507d0 c(int i10) {
        this.f82930c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10507d0
    public final AbstractC10507d0 d(int i10) {
        this.f82931d = 1;
        return this;
    }

    public final AbstractC10507d0 e(String str) {
        this.f82928a = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10507d0
    public final AbstractC10525f0 b() {
        if (this.f82929b == 1 && this.f82928a != null && this.f82930c != 0 && this.f82931d != 0) {
            return new Y(this.f82928a, false, this.f82930c, null, null, this.f82931d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f82928a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f82929b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f82930c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f82931d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
