package F8;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f10311a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10312b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f10312b != eVar.f10312b) {
                return false;
            }
            String str = this.f10311a;
            String str2 = eVar.f10311a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        return this.f10311a;
    }

    public int hashCode() {
        String str = this.f10311a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f10312b;
    }

    public String toString() {
        return "ComponentIdentity{componentName='" + this.f10311a + "', uniqueId=" + this.f10312b + '}';
    }

    public e(String str, int i10) {
        this.f10311a = str;
        this.f10312b = i10;
    }
}
