package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qe0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9318qe0 extends AbstractC7323Te0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78656a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78657b;

    /* synthetic */ C9318qe0(String str, String str2, C9211pe0 c9211pe0) {
        this.f78656a = str;
        this.f78657b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7323Te0
    public final String a() {
        return this.f78657b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7323Te0
    public final String b() {
        return this.f78656a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7323Te0) {
            AbstractC7323Te0 abstractC7323Te0 = (AbstractC7323Te0) obj;
            String str = this.f78656a;
            if (str != null ? str.equals(abstractC7323Te0.b()) : abstractC7323Te0.b() == null) {
                String str2 = this.f78657b;
                if (str2 != null ? str2.equals(abstractC7323Te0.a()) : abstractC7323Te0.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f78656a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f78657b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f78656a + ", appId=" + this.f78657b + "}";
    }
}
