package kt;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private C15315d f147980a;

    /* renamed from: b, reason: collision with root package name */
    private List<C15319h> f147981b = new ArrayList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        C15315d c15315d = this.f147980a;
        if (c15315d == null) {
            if (mVar.f147980a != null) {
                return false;
            }
        } else if (!c15315d.equals(mVar.f147980a)) {
            return false;
        }
        List<C15319h> list = this.f147981b;
        if (list == null) {
            if (mVar.f147981b != null) {
                return false;
            }
        } else if (!list.equals(mVar.f147981b)) {
            return false;
        }
        return true;
    }

    public C15315d a() {
        return this.f147980a;
    }

    public List<C15319h> b() {
        return this.f147981b;
    }

    public int hashCode() {
        C15315d c15315d = this.f147980a;
        int iHashCode = ((c15315d == null ? 0 : c15315d.hashCode()) + 31) * 31;
        List<C15319h> list = this.f147981b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "PlaceBubble [boundary=" + this.f147980a + ", organizationPlaces=" + this.f147981b + "]";
    }
}
