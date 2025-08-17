package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ke0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8551ke0 extends AbstractC7028Oe0 {

    /* renamed from: a, reason: collision with root package name */
    private int f75681a;

    /* renamed from: b, reason: collision with root package name */
    private String f75682b;

    /* renamed from: c, reason: collision with root package name */
    private byte f75683c;

    C8551ke0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7028Oe0
    public final AbstractC7028Oe0 a(String str) {
        this.f75682b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7028Oe0
    public final AbstractC7028Oe0 b(int i10) {
        this.f75681a = i10;
        this.f75683c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7028Oe0
    public final AbstractC7096Qe0 c() {
        if (this.f75683c == 1) {
            return new C8765me0(this.f75681a, this.f75682b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
