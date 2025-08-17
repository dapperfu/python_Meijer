package P;

import O.N;
import P.r;
import java.util.List;

/* loaded from: classes.dex */
final class b extends r.b {

    /* renamed from: a, reason: collision with root package name */
    private final N f24419a;

    /* renamed from: b, reason: collision with root package name */
    private final N f24420b;

    /* renamed from: c, reason: collision with root package name */
    private final List<d> f24421c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f24419a.equals(bVar.b()) && this.f24420b.equals(bVar.c()) && this.f24421c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // P.r.b
    public List<d> a() {
        return this.f24421c;
    }

    @Override // P.r.b
    public N b() {
        return this.f24419a;
    }

    @Override // P.r.b
    public N c() {
        return this.f24420b;
    }

    public int hashCode() {
        return ((((this.f24419a.hashCode() ^ 1000003) * 1000003) ^ this.f24420b.hashCode()) * 1000003) ^ this.f24421c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f24419a + ", secondarySurfaceEdge=" + this.f24420b + ", outConfigs=" + this.f24421c + "}";
    }

    b(N n10, N n11, List<d> list) {
        if (n10 != null) {
            this.f24419a = n10;
            if (n11 != null) {
                this.f24420b = n11;
                if (list != null) {
                    this.f24421c = list;
                    return;
                }
                throw new NullPointerException("Null outConfigs");
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }
}
