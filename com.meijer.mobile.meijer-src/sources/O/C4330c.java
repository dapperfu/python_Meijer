package O;

import O.W;
import java.util.List;

/* renamed from: O.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4330c extends W.b {

    /* renamed from: a, reason: collision with root package name */
    private final N f22868a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Q.f> f22869b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W.b) {
            W.b bVar = (W.b) obj;
            if (this.f22868a.equals(bVar.b()) && this.f22869b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // O.W.b
    public List<Q.f> a() {
        return this.f22869b;
    }

    @Override // O.W.b
    public N b() {
        return this.f22868a;
    }

    public int hashCode() {
        return ((this.f22868a.hashCode() ^ 1000003) * 1000003) ^ this.f22869b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f22868a + ", outConfigs=" + this.f22869b + "}";
    }

    C4330c(N n10, List<Q.f> list) {
        if (n10 != null) {
            this.f22868a = n10;
            if (list != null) {
                this.f22869b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }
}
