package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ne0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8872ne0 extends AbstractC7164Se0 {

    /* renamed from: a, reason: collision with root package name */
    private String f77113a;

    /* renamed from: b, reason: collision with root package name */
    private String f77114b;

    C8872ne0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7164Se0
    public final AbstractC7164Se0 a(String str) {
        this.f77114b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7164Se0
    public final AbstractC7164Se0 b(String str) {
        this.f77113a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7164Se0
    public final AbstractC7198Te0 c() {
        return new C9193qe0(this.f77113a, this.f77114b, null);
    }
}
