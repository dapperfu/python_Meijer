package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class C2 extends AbstractC11119z2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f83338a;

    /* renamed from: b, reason: collision with root package name */
    private final String f83339b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f83340c;

    @Override // com.google.android.gms.internal.pal.AbstractC11119z2
    public final String a() {
        return this.f83338a;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC11119z2
    public final String b() {
        return this.f83339b;
    }

    @Override // com.google.android.gms.internal.pal.AbstractC11119z2
    public final boolean c() {
        return this.f83340c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC11119z2) {
            AbstractC11119z2 abstractC11119z2 = (AbstractC11119z2) obj;
            if (this.f83338a.equals(abstractC11119z2.a()) && this.f83339b.equals(abstractC11119z2.b()) && this.f83340c == abstractC11119z2.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f83338a.hashCode() ^ 1000003) * 1000003) ^ this.f83339b.hashCode()) * 1000003) ^ (true != this.f83340c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdvertisingIdInfo{advertisingId=" + this.f83338a + ", advertisingIdType=" + this.f83339b + ", isLimitAdTracking=" + this.f83340c + "}";
    }

    C2(String str, String str2, boolean z10) {
        if (str != null) {
            this.f83338a = str;
            this.f83339b = str2;
            this.f83340c = z10;
            return;
        }
        throw new NullPointerException("Null advertisingId");
    }
}
