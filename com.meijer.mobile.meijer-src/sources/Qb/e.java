package Qb;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Long f27981a;

    /* renamed from: b, reason: collision with root package name */
    private Long f27982b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Long l10 = this.f27981a;
        if (l10 == null) {
            if (eVar.f27981a != null) {
                return false;
            }
        } else if (!l10.equals(eVar.f27981a)) {
            return false;
        }
        Long l11 = this.f27982b;
        if (l11 == null) {
            if (eVar.f27982b != null) {
                return false;
            }
        } else if (!l11.equals(eVar.f27982b)) {
            return false;
        }
        return true;
    }

    public void a(Long l10) {
        this.f27981a = l10;
    }

    public void b(Long l10) {
        this.f27982b = l10;
    }

    public int hashCode() {
        Long l10 = this.f27981a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Long l11 = this.f27982b;
        return iHashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return String.format("InstanceStatus [enabledAt=%s, permittedAt=%s]", this.f27981a, this.f27982b);
    }
}
