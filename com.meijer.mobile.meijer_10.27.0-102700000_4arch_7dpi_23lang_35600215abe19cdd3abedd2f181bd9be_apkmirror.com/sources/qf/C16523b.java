package qf;

/* renamed from: qf.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16523b extends j {

    /* renamed from: b, reason: collision with root package name */
    private final String f157215b;

    /* renamed from: c, reason: collision with root package name */
    private final String f157216c;

    /* renamed from: d, reason: collision with root package name */
    private final String f157217d;

    /* renamed from: e, reason: collision with root package name */
    private final String f157218e;

    /* renamed from: f, reason: collision with root package name */
    private final long f157219f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f157215b.equals(jVar.e()) && this.f157216c.equals(jVar.c()) && this.f157217d.equals(jVar.d()) && this.f157218e.equals(jVar.g()) && this.f157219f == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // qf.j
    public String c() {
        return this.f157216c;
    }

    @Override // qf.j
    public String d() {
        return this.f157217d;
    }

    @Override // qf.j
    public String e() {
        return this.f157215b;
    }

    @Override // qf.j
    public long f() {
        return this.f157219f;
    }

    @Override // qf.j
    public String g() {
        return this.f157218e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f157215b.hashCode() ^ 1000003) * 1000003) ^ this.f157216c.hashCode()) * 1000003) ^ this.f157217d.hashCode()) * 1000003) ^ this.f157218e.hashCode()) * 1000003;
        long j10 = this.f157219f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f157215b + ", parameterKey=" + this.f157216c + ", parameterValue=" + this.f157217d + ", variantId=" + this.f157218e + ", templateVersion=" + this.f157219f + "}";
    }

    C16523b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f157215b = str;
            if (str2 != null) {
                this.f157216c = str2;
                if (str3 != null) {
                    this.f157217d = str3;
                    if (str4 != null) {
                        this.f157218e = str4;
                        this.f157219f = j10;
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
