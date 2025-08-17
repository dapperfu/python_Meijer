package e3;

import a3.y;
import d3.C13466a;

/* loaded from: classes.dex */
public final class d implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f128079a;

    /* renamed from: b, reason: collision with root package name */
    public final float f128080b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f128079a == dVar.f128079a && this.f128080b == dVar.f128080b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + He.c.a(this.f128079a)) * 31) + He.c.a(this.f128080b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f128079a + ", longitude=" + this.f128080b;
    }

    public d(float f10, float f11) {
        boolean z10;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.b(z10, "Invalid latitude or longitude");
        this.f128079a = f10;
        this.f128080b = f11;
    }
}
