package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ne0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8997ne0 extends AbstractC7289Se0 {

    /* renamed from: a, reason: collision with root package name */
    private String f77953a;

    /* renamed from: b, reason: collision with root package name */
    private String f77954b;

    C8997ne0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7289Se0
    public final AbstractC7289Se0 a(String str) {
        this.f77954b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7289Se0
    public final AbstractC7289Se0 b(String str) {
        this.f77953a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7289Se0
    public final AbstractC7323Te0 c() {
        return new C9318qe0(this.f77953a, this.f77954b, null);
    }
}
