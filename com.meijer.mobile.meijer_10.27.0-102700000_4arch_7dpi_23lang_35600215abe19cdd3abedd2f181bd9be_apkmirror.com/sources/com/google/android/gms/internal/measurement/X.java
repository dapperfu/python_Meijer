package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
final class X extends AbstractC10382d0 {

    /* renamed from: a, reason: collision with root package name */
    private String f82088a;

    /* renamed from: b, reason: collision with root package name */
    private byte f82089b;

    /* renamed from: c, reason: collision with root package name */
    private int f82090c;

    /* renamed from: d, reason: collision with root package name */
    private int f82091d;

    X() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10382d0
    public final AbstractC10382d0 a(boolean z10) {
        this.f82089b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10382d0
    final AbstractC10382d0 c(int i10) {
        this.f82090c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10382d0
    public final AbstractC10382d0 d(int i10) {
        this.f82091d = 1;
        return this;
    }

    public final AbstractC10382d0 e(String str) {
        this.f82088a = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10382d0
    public final AbstractC10400f0 b() {
        if (this.f82089b == 1 && this.f82088a != null && this.f82090c != 0 && this.f82091d != 0) {
            return new Y(this.f82088a, false, this.f82090c, null, null, this.f82091d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f82088a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f82089b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f82090c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f82091d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
