package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class C2 extends AbstractC10994z2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f82498a;

    /* renamed from: b, reason: collision with root package name */
    private final String f82499b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f82500c;

    @Override // com.google.android.gms.internal.pal.AbstractC10994z2
    public final String a() {
        return this.f82498a;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10994z2
    public final String b() {
        return this.f82499b;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC10994z2
    public final boolean c() {
        return this.f82500c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10994z2) {
            AbstractC10994z2 abstractC10994z2 = (AbstractC10994z2) obj;
            if (this.f82498a.equals(abstractC10994z2.a()) && this.f82499b.equals(abstractC10994z2.b()) && this.f82500c == abstractC10994z2.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f82498a.hashCode() ^ 1000003) * 1000003) ^ this.f82499b.hashCode()) * 1000003) ^ (true != this.f82500c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdvertisingIdInfo{advertisingId=" + this.f82498a + ", advertisingIdType=" + this.f82499b + ", isLimitAdTracking=" + this.f82500c + "}";
    }

    C2(String str, String str2, boolean z10) {
        if (str != null) {
            this.f82498a = str;
            this.f82499b = str2;
            this.f82500c = z10;
            return;
        }
        throw new NullPointerException("Null advertisingId");
    }
}
