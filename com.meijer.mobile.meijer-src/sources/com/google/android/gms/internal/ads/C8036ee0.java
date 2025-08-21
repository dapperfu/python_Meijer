package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ee0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8036ee0 extends AbstractC9424re0 {

    /* renamed from: a, reason: collision with root package name */
    private String f74750a;

    /* renamed from: b, reason: collision with root package name */
    private String f74751b;

    C8036ee0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9424re0
    public final AbstractC9424re0 a(String str) {
        this.f74751b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9424re0
    public final AbstractC9424re0 b(String str) {
        this.f74750a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9424re0
    public final AbstractC9531se0 c() {
        return new C8250ge0(this.f74750a, this.f74751b, null);
    }
}
