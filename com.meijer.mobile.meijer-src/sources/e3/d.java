package e3;

import a3.y;
import d3.C13599a;

/* loaded from: classes.dex */
public final class d implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f129415a;

    /* renamed from: b, reason: collision with root package name */
    public final float f129416b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f129415a == dVar.f129415a && this.f129416b == dVar.f129416b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Je.c.a(this.f129415a)) * 31) + Je.c.a(this.f129416b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f129415a + ", longitude=" + this.f129416b;
    }

    public d(float f10, float f11) {
        boolean z10;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.b(z10, "Invalid latitude or longitude");
        this.f129415a = f10;
        this.f129416b = f11;
    }
}
