package eg;

/* renamed from: eg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C13795a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f130157a;

    /* renamed from: b, reason: collision with root package name */
    private final String f130158b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f130157a.equals(fVar.b()) && this.f130158b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // eg.f
    public String b() {
        return this.f130157a;
    }

    @Override // eg.f
    public String c() {
        return this.f130158b;
    }

    public int hashCode() {
        return ((this.f130157a.hashCode() ^ 1000003) * 1000003) ^ this.f130158b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f130157a + ", version=" + this.f130158b + "}";
    }

    C13795a(String str, String str2) {
        if (str != null) {
            this.f130157a = str;
            if (str2 != null) {
                this.f130158b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }
}
