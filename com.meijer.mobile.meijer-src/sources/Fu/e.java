package Fu;

import Fu.j;

/* loaded from: classes8.dex */
final class e extends j.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f10938a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10939b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10940c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j.b) {
            j.b bVar = (j.b) obj;
            if (this.f10938a.equals(bVar.c()) && this.f10939b.equals(bVar.b()) && this.f10940c.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // Fu.j.b
    public String b() {
        return this.f10939b;
    }

    @Override // Fu.j.b
    public String c() {
        return this.f10938a;
    }

    @Override // Fu.j.b
    public String d() {
        return this.f10940c;
    }

    public int hashCode() {
        return ((((this.f10938a.hashCode() ^ 1000003) * 1000003) ^ this.f10939b.hashCode()) * 1000003) ^ this.f10940c.hashCode();
    }

    public String toString() {
        return "MeasureLong{name=" + this.f10938a + ", description=" + this.f10939b + ", unit=" + this.f10940c + "}";
    }

    e(String str, String str2, String str3) {
        if (str != null) {
            this.f10938a = str;
            if (str2 != null) {
                this.f10939b = str2;
                if (str3 != null) {
                    this.f10940c = str3;
                    return;
                }
                throw new NullPointerException("Null unit");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }
}
