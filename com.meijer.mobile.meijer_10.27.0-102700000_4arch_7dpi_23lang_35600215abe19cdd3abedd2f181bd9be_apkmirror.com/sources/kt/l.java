package kt;

import java.io.Serializable;

/* loaded from: classes11.dex */
public class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private Long f147977a;

    /* renamed from: b, reason: collision with root package name */
    private String f147978b;

    /* renamed from: c, reason: collision with root package name */
    private String f147979c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        Long l10 = this.f147977a;
        if (l10 == null) {
            if (lVar.f147977a != null) {
                return false;
            }
        } else if (!l10.equals(lVar.f147977a)) {
            return false;
        }
        String str = this.f147978b;
        if (str == null) {
            if (lVar.f147978b != null) {
                return false;
            }
        } else if (!str.equals(lVar.f147978b)) {
            return false;
        }
        String str2 = this.f147979c;
        if (str2 == null) {
            if (lVar.f147979c != null) {
                return false;
            }
        } else if (!str2.equals(lVar.f147979c)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f147978b;
    }

    public String b() {
        return this.f147979c;
    }

    public int hashCode() {
        Long l10 = this.f147977a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        String str = this.f147978b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f147979c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PlaceAttribute [id=" + this.f147977a + ", key=" + this.f147978b + ", value=" + this.f147979c + "]";
    }
}
