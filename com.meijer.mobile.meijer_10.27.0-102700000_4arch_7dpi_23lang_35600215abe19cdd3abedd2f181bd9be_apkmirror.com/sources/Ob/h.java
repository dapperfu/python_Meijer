package Ob;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private String f23502a;

    /* renamed from: b, reason: collision with root package name */
    private String f23503b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f23502a;
        if (str == null) {
            if (hVar.f23502a != null) {
                return false;
            }
        } else if (!str.equals(hVar.f23502a)) {
            return false;
        }
        String str2 = this.f23503b;
        if (str2 == null) {
            if (hVar.f23503b != null) {
                return false;
            }
        } else if (!str2.equals(hVar.f23503b)) {
            return false;
        }
        return true;
    }

    public String a() {
        return this.f23502a;
    }

    public String b() {
        return this.f23503b;
    }

    public void c(String str) {
        this.f23502a = str;
    }

    public void d(String str) {
        this.f23503b = str;
    }

    public int hashCode() {
        String str = this.f23502a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f23503b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
