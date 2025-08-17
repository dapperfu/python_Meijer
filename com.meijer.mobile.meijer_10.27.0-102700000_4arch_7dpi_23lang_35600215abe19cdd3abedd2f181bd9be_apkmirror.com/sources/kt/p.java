package kt;

/* loaded from: classes11.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private Long f147987a;

    /* renamed from: b, reason: collision with root package name */
    private String f147988b;

    /* renamed from: c, reason: collision with root package name */
    private String f147989c;

    /* renamed from: d, reason: collision with root package name */
    private String f147990d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f147988b;
        if (str == null) {
            if (pVar.f147988b != null) {
                return false;
            }
        } else if (!str.equals(pVar.f147988b)) {
            return false;
        }
        Long l10 = this.f147987a;
        if (l10 == null) {
            if (pVar.f147987a != null) {
                return false;
            }
        } else if (!l10.equals(pVar.f147987a)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f147988b;
    }

    public String b() {
        return this.f147989c;
    }

    public int hashCode() {
        String str = this.f147988b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Long l10 = this.f147987a;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return String.format("User [id=%s, email=%s, password=%s, role=%s]", this.f147987a, this.f147988b, this.f147989c, this.f147990d);
    }
}
