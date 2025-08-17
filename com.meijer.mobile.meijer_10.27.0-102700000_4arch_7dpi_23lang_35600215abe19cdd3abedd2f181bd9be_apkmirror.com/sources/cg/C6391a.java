package cg;

/* renamed from: cg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6391a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f61775a;

    /* renamed from: b, reason: collision with root package name */
    private final String f61776b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f61775a.equals(fVar.b()) && this.f61776b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // cg.f
    public String b() {
        return this.f61775a;
    }

    @Override // cg.f
    public String c() {
        return this.f61776b;
    }

    public int hashCode() {
        return ((this.f61775a.hashCode() ^ 1000003) * 1000003) ^ this.f61776b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f61775a + ", version=" + this.f61776b + "}";
    }

    C6391a(String str, String str2) {
        if (str != null) {
            this.f61775a = str;
            if (str2 != null) {
                this.f61776b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }
}
