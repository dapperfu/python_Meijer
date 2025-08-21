package sf;

/* renamed from: sf.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17071b extends j {

    /* renamed from: b, reason: collision with root package name */
    private final String f160330b;

    /* renamed from: c, reason: collision with root package name */
    private final String f160331c;

    /* renamed from: d, reason: collision with root package name */
    private final String f160332d;

    /* renamed from: e, reason: collision with root package name */
    private final String f160333e;

    /* renamed from: f, reason: collision with root package name */
    private final long f160334f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f160330b.equals(jVar.e()) && this.f160331c.equals(jVar.c()) && this.f160332d.equals(jVar.d()) && this.f160333e.equals(jVar.g()) && this.f160334f == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // sf.j
    public String c() {
        return this.f160331c;
    }

    @Override // sf.j
    public String d() {
        return this.f160332d;
    }

    @Override // sf.j
    public String e() {
        return this.f160330b;
    }

    @Override // sf.j
    public long f() {
        return this.f160334f;
    }

    @Override // sf.j
    public String g() {
        return this.f160333e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f160330b.hashCode() ^ 1000003) * 1000003) ^ this.f160331c.hashCode()) * 1000003) ^ this.f160332d.hashCode()) * 1000003) ^ this.f160333e.hashCode()) * 1000003;
        long j10 = this.f160334f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f160330b + ", parameterKey=" + this.f160331c + ", parameterValue=" + this.f160332d + ", variantId=" + this.f160333e + ", templateVersion=" + this.f160334f + "}";
    }

    C17071b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f160330b = str;
            if (str2 != null) {
                this.f160331c = str2;
                if (str3 != null) {
                    this.f160332d = str3;
                    if (str4 != null) {
                        this.f160333e = str4;
                        this.f160334f = j10;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }
}
