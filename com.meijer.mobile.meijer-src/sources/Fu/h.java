package Fu;

import Fu.p;

/* loaded from: classes8.dex */
final class h extends p.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f10947a;

    @Override // Fu.p.c
    public String a() {
        return this.f10947a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p.c) {
            return this.f10947a.equals(((p.c) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f10947a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Name{asString=" + this.f10947a + "}";
    }

    h(String str) {
        if (str != null) {
            this.f10947a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }
}
