package M3;

import a3.y;

/* loaded from: classes4.dex */
public final class d implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f19652a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19653b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f19652a == dVar.f19652a && this.f19653b == dVar.f19653b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Je.c.a(this.f19652a)) * 31) + this.f19653b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f19652a + ", svcTemporalLayerCount=" + this.f19653b;
    }

    public d(float f10, int i10) {
        this.f19652a = f10;
        this.f19653b = i10;
    }
}
