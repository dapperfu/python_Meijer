package kt;

import java.io.Serializable;

/* renamed from: kt.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15315d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private C15318g f147961a = new C15318g();

    /* renamed from: b, reason: collision with root package name */
    private Integer f147962b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15315d c15315d = (C15315d) obj;
        C15318g c15318g = this.f147961a;
        if (c15318g == null) {
            if (c15315d.f147961a != null) {
                return false;
            }
        } else if (!c15318g.equals(c15315d.f147961a)) {
            return false;
        }
        Integer num = this.f147962b;
        if (num == null) {
            if (c15315d.f147962b != null) {
                return false;
            }
        } else if (!num.equals(c15315d.f147962b)) {
            return false;
        }
        return true;
    }

    public C15318g a() {
        return this.f147961a;
    }

    public Integer b() {
        return this.f147962b;
    }

    public int hashCode() {
        C15318g c15318g = this.f147961a;
        int iHashCode = ((c15318g == null ? 0 : c15318g.hashCode()) + 31) * 31;
        Integer num = this.f147962b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "GeoCircle [location=" + this.f147961a + ", radius=" + this.f147962b + "]";
    }
}
