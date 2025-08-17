package com.radiusnetworks.flybuy.sdk.pickup.data;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f119988a;

    /* renamed from: b, reason: collision with root package name */
    public final float f119989b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119990c;

    /* renamed from: d, reason: collision with root package name */
    public final float f119991d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f119988a == aVar.f119988a && Float.compare(this.f119989b, aVar.f119989b) == 0 && this.f119990c == aVar.f119990c && Float.compare(this.f119991d, aVar.f119991d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f119991d) + ((Integer.hashCode(this.f119990c) + ((Float.hashCode(this.f119989b) + (Integer.hashCode(this.f119988a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LocationFilter(proximityToSite=" + this.f119988a + ", intervalSeconds=" + this.f119989b + ", priority=" + this.f119990c + ", smallestDisplacement=" + this.f119991d + ')';
    }

    public a(int i10, float f10, int i11, float f11) {
        this.f119988a = i10;
        this.f119989b = f10;
        this.f119990c = i11;
        this.f119991d = f11;
    }
}
