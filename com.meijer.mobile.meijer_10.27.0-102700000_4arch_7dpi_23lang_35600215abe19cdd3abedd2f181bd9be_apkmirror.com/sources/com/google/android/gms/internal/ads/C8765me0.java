package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.me0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8765me0 extends AbstractC7096Qe0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f76842a;

    /* renamed from: b, reason: collision with root package name */
    private final String f76843b;

    /* synthetic */ C8765me0(int i10, String str, C8658le0 c8658le0) {
        this.f76842a = i10;
        this.f76843b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7096Qe0
    public final int a() {
        return this.f76842a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7096Qe0
    public final String b() {
        return this.f76843b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7096Qe0) {
            AbstractC7096Qe0 abstractC7096Qe0 = (AbstractC7096Qe0) obj;
            if (this.f76842a == abstractC7096Qe0.a() && ((str = this.f76843b) != null ? str.equals(abstractC7096Qe0.b()) : abstractC7096Qe0.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f76843b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f76842a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f76842a + ", sessionToken=" + this.f76843b + "}";
    }
}
