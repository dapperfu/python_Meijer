package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ge0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8250ge0 extends AbstractC9531se0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f75202a;

    /* renamed from: b, reason: collision with root package name */
    private final String f75203b;

    /* synthetic */ C8250ge0(String str, String str2, C8143fe0 c8143fe0) {
        this.f75202a = str;
        this.f75203b = str2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9531se0
    public final String a() {
        return this.f75203b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9531se0
    public final String b() {
        return this.f75202a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9531se0) {
            AbstractC9531se0 abstractC9531se0 = (AbstractC9531se0) obj;
            String str = this.f75202a;
            if (str != null ? str.equals(abstractC9531se0.b()) : abstractC9531se0.b() == null) {
                String str2 = this.f75203b;
                if (str2 != null ? str2.equals(abstractC9531se0.a()) : abstractC9531se0.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f75202a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f75203b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f75202a + ", appId=" + this.f75203b + "}";
    }
}
