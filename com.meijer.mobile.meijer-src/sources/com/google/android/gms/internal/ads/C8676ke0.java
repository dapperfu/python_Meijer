package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ke0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8676ke0 extends AbstractC7153Oe0 {

    /* renamed from: a, reason: collision with root package name */
    private int f76521a;

    /* renamed from: b, reason: collision with root package name */
    private String f76522b;

    /* renamed from: c, reason: collision with root package name */
    private byte f76523c;

    C8676ke0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7153Oe0
    public final AbstractC7153Oe0 a(String str) {
        this.f76522b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7153Oe0
    public final AbstractC7153Oe0 b(int i10) {
        this.f76521a = i10;
        this.f76523c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7153Oe0
    public final AbstractC7221Qe0 c() {
        if (this.f76523c == 1) {
            return new C8890me0(this.f76521a, this.f76522b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
