package Qb;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private String f27990a;

    /* renamed from: b, reason: collision with root package name */
    private String f27991b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f27990a;
        if (str == null) {
            if (hVar.f27990a != null) {
                return false;
            }
        } else if (!str.equals(hVar.f27990a)) {
            return false;
        }
        String str2 = this.f27991b;
        if (str2 == null) {
            if (hVar.f27991b != null) {
                return false;
            }
        } else if (!str2.equals(hVar.f27991b)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f27990a;
    }

    public String b() {
        return this.f27991b;
    }

    public void c(String str) {
        this.f27990a = str;
    }

    public void d(String str) {
        this.f27991b = str;
    }

    public int hashCode() {
        String str = this.f27990a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f27991b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
