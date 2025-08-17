package M3;

import a3.y;

/* loaded from: classes4.dex */
public final class d implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f18911a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18912b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f18911a == dVar.f18911a && this.f18912b == dVar.f18912b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + He.c.a(this.f18911a)) * 31) + this.f18912b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f18911a + ", svcTemporalLayerCount=" + this.f18912b;
    }

    public d(float f10, int i10) {
        this.f18911a = f10;
        this.f18912b = i10;
    }
}
