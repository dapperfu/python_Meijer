package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ic0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8460ic0 extends AbstractC8032ec0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f75825a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f75826b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f75827c;

    /* renamed from: d, reason: collision with root package name */
    private final long f75828d;

    /* renamed from: e, reason: collision with root package name */
    private final long f75829e;

    /* synthetic */ C8460ic0(String str, boolean z10, boolean z11, boolean z12, long j10, boolean z13, long j11, C8353hc0 c8353hc0) {
        this.f75825a = str;
        this.f75826b = z10;
        this.f75827c = z11;
        this.f75828d = j10;
        this.f75829e = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8032ec0
    public final long a() {
        return this.f75829e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8032ec0
    public final long b() {
        return this.f75828d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8032ec0
    public final String d() {
        return this.f75825a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8032ec0
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8032ec0) {
            AbstractC8032ec0 abstractC8032ec0 = (AbstractC8032ec0) obj;
            if (this.f75825a.equals(abstractC8032ec0.d()) && this.f75826b == abstractC8032ec0.h() && this.f75827c == abstractC8032ec0.g()) {
                abstractC8032ec0.f();
                if (this.f75828d == abstractC8032ec0.b()) {
                    abstractC8032ec0.e();
                    if (this.f75829e == abstractC8032ec0.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8032ec0
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8032ec0
    public final boolean g() {
        return this.f75827c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8032ec0
    public final boolean h() {
        return this.f75826b;
    }

    public final int hashCode() {
        return ((((((((((((this.f75825a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f75826b ? 1237 : 1231)) * 1000003) ^ (true != this.f75827c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f75828d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f75829e);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f75825a + ", shouldGetAdvertisingId=" + this.f75826b + ", isGooglePlayServicesAvailable=" + this.f75827c + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.f75828d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.f75829e + "}";
    }
}
