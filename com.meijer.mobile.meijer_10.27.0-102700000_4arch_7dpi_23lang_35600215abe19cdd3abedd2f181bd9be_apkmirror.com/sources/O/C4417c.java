package O;

import O.W;
import java.util.List;

/* renamed from: O.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4417c extends W.b {

    /* renamed from: a, reason: collision with root package name */
    private final N f22875a;

    /* renamed from: b, reason: collision with root package name */
    private final List<Q.f> f22876b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W.b) {
            W.b bVar = (W.b) obj;
            if (this.f22875a.equals(bVar.b()) && this.f22876b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // O.W.b
    public List<Q.f> a() {
        return this.f22876b;
    }

    @Override // O.W.b
    public N b() {
        return this.f22875a;
    }

    public int hashCode() {
        return ((this.f22875a.hashCode() ^ 1000003) * 1000003) ^ this.f22876b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f22875a + ", outConfigs=" + this.f22876b + "}";
    }

    C4417c(N n10, List<Q.f> list) {
        if (n10 != null) {
            this.f22875a = n10;
            if (list != null) {
                this.f22876b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }
}
