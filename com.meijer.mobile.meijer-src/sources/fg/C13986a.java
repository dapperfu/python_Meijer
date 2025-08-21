package fg;

import java.util.Set;

/* renamed from: fg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C13986a extends AbstractC13987b {

    /* renamed from: a, reason: collision with root package name */
    private final Set<String> f131706a;

    @Override // fg.AbstractC13987b
    public Set<String> b() {
        return this.f131706a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13987b) {
            return this.f131706a.equals(((AbstractC13987b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f131706a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f131706a + "}";
    }

    C13986a(Set<String> set) {
        if (set != null) {
            this.f131706a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }
}
