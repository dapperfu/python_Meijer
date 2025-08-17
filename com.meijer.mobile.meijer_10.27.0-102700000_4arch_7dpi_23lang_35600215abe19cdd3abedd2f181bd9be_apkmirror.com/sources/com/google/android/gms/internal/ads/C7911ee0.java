package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ee0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7911ee0 extends AbstractC9299re0 {

    /* renamed from: a, reason: collision with root package name */
    private String f73910a;

    /* renamed from: b, reason: collision with root package name */
    private String f73911b;

    C7911ee0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9299re0
    public final AbstractC9299re0 a(String str) {
        this.f73911b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9299re0
    public final AbstractC9299re0 b(String str) {
        this.f73910a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9299re0
    public final AbstractC9406se0 c() {
        return new C8125ge0(this.f73910a, this.f73911b, null);
    }
}
