package kt;

import java.io.Serializable;

/* renamed from: kt.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15318g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f147963a;

    /* renamed from: b, reason: collision with root package name */
    private Double f147964b;

    /* renamed from: c, reason: collision with root package name */
    private Double f147965c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15318g c15318g = (C15318g) obj;
        Long l10 = this.f147963a;
        if (l10 == null) {
            if (c15318g.f147963a != null) {
                return false;
            }
        } else if (!l10.equals(c15318g.f147963a)) {
            return false;
        }
        Double d10 = this.f147964b;
        if (d10 == null) {
            if (c15318g.f147964b != null) {
                return false;
            }
        } else if (!d10.equals(c15318g.f147964b)) {
            return false;
        }
        Double d11 = this.f147965c;
        if (d11 == null) {
            if (c15318g.f147965c != null) {
                return false;
            }
        } else if (!d11.equals(c15318g.f147965c)) {
            return false;
        }
        return true;
    }

    public Double a() {
        return this.f147964b;
    }

    public Double b() {
        return this.f147965c;
    }

    public int hashCode() {
        Long l10 = this.f147963a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Double d10 = this.f147964b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f147965c;
        return iHashCode2 + (d11 != null ? d11.hashCode() : 0);
    }

    public String toString() {
        return String.format("Location [id=%s, latitude=%s, longitude=%s]", this.f147963a, this.f147964b, this.f147965c);
    }
}
