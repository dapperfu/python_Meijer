package Ku;

/* loaded from: classes7.dex */
final class c extends j {

    /* renamed from: a, reason: collision with root package name */
    private final String f17564a;

    @Override // Ku.j
    public String a() {
        return this.f17564a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f17564a.equals(((j) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f17564a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagValue{asString=" + this.f17564a + "}";
    }

    c(String str) {
        if (str != null) {
            this.f17564a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }
}
