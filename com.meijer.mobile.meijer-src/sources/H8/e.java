package H8;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f13438a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13439b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f13439b != eVar.f13439b) {
                return false;
            }
            String str = this.f13438a;
            String str2 = eVar.f13438a;
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
        return this.f13438a;
    }

    public int hashCode() {
        String str = this.f13438a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f13439b;
    }

    public String toString() {
        return "ComponentIdentity{componentName='" + this.f13438a + "', uniqueId=" + this.f13439b + '}';
    }

    public e(String str, int i10) {
        this.f13438a = str;
        this.f13439b = i10;
    }
}
