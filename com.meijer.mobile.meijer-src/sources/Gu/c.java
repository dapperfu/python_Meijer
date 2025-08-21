package Gu;

/* loaded from: classes8.dex */
final class c extends j {

    /* renamed from: a, reason: collision with root package name */
    private final String f13247a;

    @Override // Gu.j
    public String a() {
        return this.f13247a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f13247a.equals(((j) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f13247a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagValue{asString=" + this.f13247a + "}";
    }

    c(String str) {
        if (str != null) {
            this.f13247a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }
}
