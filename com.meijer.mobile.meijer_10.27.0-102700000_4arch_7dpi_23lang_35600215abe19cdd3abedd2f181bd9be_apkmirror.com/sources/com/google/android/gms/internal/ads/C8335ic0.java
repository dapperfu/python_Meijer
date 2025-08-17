package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ic0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8335ic0 extends AbstractC7907ec0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f74985a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f74986b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f74987c;

    /* renamed from: d, reason: collision with root package name */
    private final long f74988d;

    /* renamed from: e, reason: collision with root package name */
    private final long f74989e;

    /* synthetic */ C8335ic0(String str, boolean z10, boolean z11, boolean z12, long j10, boolean z13, long j11, C8228hc0 c8228hc0) {
        this.f74985a = str;
        this.f74986b = z10;
        this.f74987c = z11;
        this.f74988d = j10;
        this.f74989e = j11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7907ec0
    public final long a() {
        return this.f74989e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7907ec0
    public final long b() {
        return this.f74988d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7907ec0
    public final String d() {
        return this.f74985a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7907ec0
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7907ec0) {
            AbstractC7907ec0 abstractC7907ec0 = (AbstractC7907ec0) obj;
            if (this.f74985a.equals(abstractC7907ec0.d()) && this.f74986b == abstractC7907ec0.h() && this.f74987c == abstractC7907ec0.g()) {
                abstractC7907ec0.f();
                if (this.f74988d == abstractC7907ec0.b()) {
                    abstractC7907ec0.e();
                    if (this.f74989e == abstractC7907ec0.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7907ec0
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7907ec0
    public final boolean g() {
        return this.f74987c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7907ec0
    public final boolean h() {
        return this.f74986b;
    }

    public final int hashCode() {
        return ((((((((((((this.f74985a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f74986b ? 1237 : 1231)) * 1000003) ^ (true != this.f74987c ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f74988d)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.f74989e);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f74985a + ", shouldGetAdvertisingId=" + this.f74986b + ", isGooglePlayServicesAvailable=" + this.f74987c + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.f74988d + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.f74989e + "}";
    }
}
