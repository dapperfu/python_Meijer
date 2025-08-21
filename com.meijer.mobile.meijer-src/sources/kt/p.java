package kt;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private Long f148897a;

    /* renamed from: b, reason: collision with root package name */
    private String f148898b;

    /* renamed from: c, reason: collision with root package name */
    private String f148899c;

    /* renamed from: d, reason: collision with root package name */
    private String f148900d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        String str = this.f148898b;
        if (str == null) {
            if (pVar.f148898b != null) {
                return false;
            }
        } else if (!str.equals(pVar.f148898b)) {
            return false;
        }
        Long l10 = this.f148897a;
        if (l10 == null) {
            if (pVar.f148897a != null) {
                return false;
            }
        } else if (!l10.equals(pVar.f148897a)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f148898b;
    }

    public String b() {
        return this.f148899c;
    }

    public int hashCode() {
        String str = this.f148898b;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Long l10 = this.f148897a;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return String.format("User [id=%s, email=%s, password=%s, role=%s]", this.f148897a, this.f148898b, this.f148899c, this.f148900d);
    }
}
