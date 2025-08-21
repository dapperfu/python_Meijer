package kt;

import java.io.Serializable;

/* renamed from: kt.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C15418d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private C15421g f148871a = new C15421g();

    /* renamed from: b, reason: collision with root package name */
    private Integer f148872b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15418d c15418d = (C15418d) obj;
        C15421g c15421g = this.f148871a;
        if (c15421g == null) {
            if (c15418d.f148871a != null) {
                return false;
            }
        } else if (!c15421g.equals(c15418d.f148871a)) {
            return false;
        }
        Integer num = this.f148872b;
        if (num == null) {
            if (c15418d.f148872b != null) {
                return false;
            }
        } else if (!num.equals(c15418d.f148872b)) {
            return false;
        }
        return true;
    }

    public C15421g a() {
        return this.f148871a;
    }

    public Integer b() {
        return this.f148872b;
    }

    public int hashCode() {
        C15421g c15421g = this.f148871a;
        int iHashCode = ((c15421g == null ? 0 : c15421g.hashCode()) + 31) * 31;
        Integer num = this.f148872b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "GeoCircle [location=" + this.f148871a + ", radius=" + this.f148872b + "]";
    }
}
