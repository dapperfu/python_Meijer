package o8;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f153764a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153765b;

    /* renamed from: c, reason: collision with root package name */
    private final String f153766c;

    /* renamed from: d, reason: collision with root package name */
    private final d f153767d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            f fVar = (f) obj;
            String str = this.f153764a;
            if (str == null ? fVar.f153764a != null : !str.equals(fVar.f153764a)) {
                return false;
            }
            String str2 = this.f153765b;
            if (str2 == null ? fVar.f153765b != null : !str2.equals(fVar.f153765b)) {
                return false;
            }
            String str3 = this.f153766c;
            if (str3 == null ? fVar.f153766c != null : !str3.equals(fVar.f153766c)) {
                return false;
            }
            if (this.f153767d == fVar.f153767d) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        return this.f153764a;
    }

    public String b() {
        return this.f153765b;
    }

    public String c() {
        return this.f153766c;
    }

    public d d() {
        return this.f153767d;
    }

    public int hashCode() {
        String str = this.f153764a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f153765b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f153766c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        d dVar = this.f153767d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "StacktraceData{name='" + this.f153764a + "', reason='" + this.f153765b + "', stacktrace='" + this.f153766c + "', type=" + this.f153767d + '}';
    }

    public f(String str, String str2, String str3, d dVar) {
        this.f153764a = str;
        this.f153765b = str2;
        this.f153766c = str3;
        this.f153767d = dVar;
    }
}
