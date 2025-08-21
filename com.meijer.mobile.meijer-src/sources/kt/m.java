package kt;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private C15418d f148890a;

    /* renamed from: b, reason: collision with root package name */
    private List<C15422h> f148891b = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        C15418d c15418d = this.f148890a;
        if (c15418d == null) {
            if (mVar.f148890a != null) {
                return false;
            }
        } else if (!c15418d.equals(mVar.f148890a)) {
            return false;
        }
        List<C15422h> list = this.f148891b;
        if (list == null) {
            if (mVar.f148891b != null) {
                return false;
            }
        } else if (!list.equals(mVar.f148891b)) {
            return false;
        }
        return true;
    }

    public C15418d a() {
        return this.f148890a;
    }

    public List<C15422h> b() {
        return this.f148891b;
    }

    public int hashCode() {
        C15418d c15418d = this.f148890a;
        int iHashCode = ((c15418d == null ? 0 : c15418d.hashCode()) + 31) * 31;
        List<C15422h> list = this.f148891b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PlaceBubble [boundary=" + this.f148890a + ", organizationPlaces=" + this.f148891b + "]";
    }
}
