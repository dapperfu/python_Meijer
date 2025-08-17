package gg;

import java.util.Set;

/* renamed from: gg.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C14256c extends AbstractC14258e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<AbstractC14257d> f133376a;

    @Override // gg.AbstractC14258e
    public Set<AbstractC14257d> b() {
        return this.f133376a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC14258e) {
            return this.f133376a.equals(((AbstractC14258e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f133376a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f133376a + "}";
    }

    C14256c(Set<AbstractC14257d> set) {
        if (set != null) {
            this.f133376a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }
}
