package Ku;

/* loaded from: classes7.dex */
final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    private final String f17562a;

    @Override // Ku.h
    public String b() {
        return this.f17562a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            return this.f17562a.equals(((h) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f17562a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "TagKey{name=" + this.f17562a + "}";
    }

    a(String str) {
        if (str != null) {
            this.f17562a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }
}
