package Ju;

import Ju.p;

/* loaded from: classes7.dex */
final class h extends p.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16148a;

    @Override // Ju.p.c
    public String a() {
        return this.f16148a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p.c) {
            return this.f16148a.equals(((p.c) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f16148a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Name{asString=" + this.f16148a + "}";
    }

    h(String str) {
        if (str != null) {
            this.f16148a = str;
            return;
        }
        throw new NullPointerException("Null asString");
    }
}
