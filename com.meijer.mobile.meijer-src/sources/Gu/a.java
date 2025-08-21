package Gu;

/* loaded from: classes8.dex */
final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    private final String f13245a;

    @Override // Gu.h
    public String b() {
        return this.f13245a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f13245a.equals(((h) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f13245a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagKey{name=" + this.f13245a + "}";
    }

    a(String str) {
        if (str != null) {
            this.f13245a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }
}
