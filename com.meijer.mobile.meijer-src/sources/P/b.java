package P;

import O.N;
import P.r;
import java.util.List;

/* loaded from: classes.dex */
final class b extends r.b {

    /* renamed from: a, reason: collision with root package name */
    private final N f25117a;

    /* renamed from: b, reason: collision with root package name */
    private final N f25118b;

    /* renamed from: c, reason: collision with root package name */
    private final List<d> f25119c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f25117a.equals(bVar.b()) && this.f25118b.equals(bVar.c()) && this.f25119c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // P.r.b
    public List<d> a() {
        return this.f25119c;
    }

    @Override // P.r.b
    public N b() {
        return this.f25117a;
    }

    @Override // P.r.b
    public N c() {
        return this.f25118b;
    }

    public int hashCode() {
        return ((((this.f25117a.hashCode() ^ 1000003) * 1000003) ^ this.f25118b.hashCode()) * 1000003) ^ this.f25119c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f25117a + ", secondarySurfaceEdge=" + this.f25118b + ", outConfigs=" + this.f25119c + "}";
    }

    b(N n10, N n11, List<d> list) {
        if (n10 != null) {
            this.f25117a = n10;
            if (n11 != null) {
                this.f25118b = n11;
                if (list != null) {
                    this.f25119c = list;
                    return;
                }
                throw new NullPointerException("Null outConfigs");
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }
}
