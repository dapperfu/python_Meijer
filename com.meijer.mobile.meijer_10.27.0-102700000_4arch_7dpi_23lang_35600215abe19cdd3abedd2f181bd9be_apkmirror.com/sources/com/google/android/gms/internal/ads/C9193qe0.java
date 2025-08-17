package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qe0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9193qe0 extends AbstractC7198Te0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f77816a;

    /* renamed from: b, reason: collision with root package name */
    private final String f77817b;

    /* synthetic */ C9193qe0(String str, String str2, C9086pe0 c9086pe0) {
        this.f77816a = str;
        this.f77817b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7198Te0
    public final String a() {
        return this.f77817b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7198Te0
    public final String b() {
        return this.f77816a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7198Te0) {
            AbstractC7198Te0 abstractC7198Te0 = (AbstractC7198Te0) obj;
            String str = this.f77816a;
            if (str != null ? str.equals(abstractC7198Te0.b()) : abstractC7198Te0.b() == null) {
                String str2 = this.f77817b;
                if (str2 != null ? str2.equals(abstractC7198Te0.a()) : abstractC7198Te0.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f77816a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f77817b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f77816a + ", appId=" + this.f77817b + "}";
    }
}
