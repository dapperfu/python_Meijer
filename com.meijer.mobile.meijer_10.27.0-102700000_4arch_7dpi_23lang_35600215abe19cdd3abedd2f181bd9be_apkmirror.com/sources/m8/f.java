package m8;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f149977a;

    /* renamed from: b, reason: collision with root package name */
    private final String f149978b;

    /* renamed from: c, reason: collision with root package name */
    private final String f149979c;

    /* renamed from: d, reason: collision with root package name */
    private final d f149980d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            String str = this.f149977a;
            if (str == null ? fVar.f149977a != null : !str.equals(fVar.f149977a)) {
                return false;
            }
            String str2 = this.f149978b;
            if (str2 == null ? fVar.f149978b != null : !str2.equals(fVar.f149978b)) {
                return false;
            }
            String str3 = this.f149979c;
            if (str3 == null ? fVar.f149979c != null : !str3.equals(fVar.f149979c)) {
                return false;
            }
            if (this.f149980d == fVar.f149980d) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        return this.f149977a;
    }

    public String b() {
        return this.f149978b;
    }

    public String c() {
        return this.f149979c;
    }

    public d d() {
        return this.f149980d;
    }

    public int hashCode() {
        String str = this.f149977a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149978b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f149979c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        d dVar = this.f149980d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "StacktraceData{name='" + this.f149977a + "', reason='" + this.f149978b + "', stacktrace='" + this.f149979c + "', type=" + this.f149980d + '}';
    }

    public f(String str, String str2, String str3, d dVar) {
        this.f149977a = str;
        this.f149978b = str2;
        this.f149979c = str3;
        this.f149980d = dVar;
    }
}
