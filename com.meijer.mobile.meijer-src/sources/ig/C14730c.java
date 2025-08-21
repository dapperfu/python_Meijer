package ig;

import java.util.Set;

/* renamed from: ig.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C14730c extends AbstractC14732e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<AbstractC14731d> f137586a;

    @Override // ig.AbstractC14732e
    public Set<AbstractC14731d> b() {
        return this.f137586a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC14732e) {
            return this.f137586a.equals(((AbstractC14732e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f137586a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f137586a + "}";
    }

    C14730c(Set<AbstractC14731d> set) {
        if (set != null) {
            this.f137586a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }
}
