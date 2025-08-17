package dg;

import java.util.Set;

/* renamed from: dg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C13513a extends AbstractC13514b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f127377a;

    @Override // dg.AbstractC13514b
    public Set<String> b() {
        return this.f127377a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13514b) {
            return this.f127377a.equals(((AbstractC13514b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f127377a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f127377a + "}";
    }

    C13513a(Set<String> set) {
        if (set != null) {
            this.f127377a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }
}
