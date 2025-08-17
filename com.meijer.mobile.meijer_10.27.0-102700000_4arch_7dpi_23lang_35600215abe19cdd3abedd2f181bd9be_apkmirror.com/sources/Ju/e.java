package Ju;

import Ju.j;

/* loaded from: classes7.dex */
final class e extends j.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f16139a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16140b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16141c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j.b) {
            j.b bVar = (j.b) obj;
            if (this.f16139a.equals(bVar.c()) && this.f16140b.equals(bVar.b()) && this.f16141c.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // Ju.j.b
    public String b() {
        return this.f16140b;
    }

    @Override // Ju.j.b
    public String c() {
        return this.f16139a;
    }

    @Override // Ju.j.b
    public String d() {
        return this.f16141c;
    }

    public int hashCode() {
        return ((((this.f16139a.hashCode() ^ 1000003) * 1000003) ^ this.f16140b.hashCode()) * 1000003) ^ this.f16141c.hashCode();
    }

    public String toString() {
        return "MeasureLong{name=" + this.f16139a + ", description=" + this.f16140b + ", unit=" + this.f16141c + "}";
    }

    e(String str, String str2, String str3) {
        if (str != null) {
            this.f16139a = str;
            if (str2 != null) {
                this.f16140b = str2;
                if (str3 != null) {
                    this.f16141c = str3;
                    return;
                }
                throw new NullPointerException("Null unit");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }
}
