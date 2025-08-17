package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ge0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8125ge0 extends AbstractC9406se0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f74362a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74363b;

    /* synthetic */ C8125ge0(String str, String str2, C8018fe0 c8018fe0) {
        this.f74362a = str;
        this.f74363b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9406se0
    public final String a() {
        return this.f74363b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9406se0
    public final String b() {
        return this.f74362a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9406se0) {
            AbstractC9406se0 abstractC9406se0 = (AbstractC9406se0) obj;
            String str = this.f74362a;
            if (str != null ? str.equals(abstractC9406se0.b()) : abstractC9406se0.b() == null) {
                String str2 = this.f74363b;
                if (str2 != null ? str2.equals(abstractC9406se0.a()) : abstractC9406se0.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f74362a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f74363b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f74362a + ", appId=" + this.f74363b + "}";
    }
}
