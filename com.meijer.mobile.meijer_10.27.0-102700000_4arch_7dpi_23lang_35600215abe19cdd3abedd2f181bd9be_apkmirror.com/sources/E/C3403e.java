package E;

import E.N;
import O.C4434u;

/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3403e extends N.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4434u<N.b> f7511a;

    /* renamed from: b, reason: collision with root package name */
    private final C4434u<N.b> f7512b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7513c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7514d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N.a) {
            N.a aVar = (N.a) obj;
            if (this.f7511a.equals(aVar.a()) && this.f7512b.equals(aVar.d()) && this.f7513c == aVar.b() && this.f7514d == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.N.a
    C4434u<N.b> a() {
        return this.f7511a;
    }

    @Override // E.N.a
    int b() {
        return this.f7513c;
    }

    @Override // E.N.a
    int c() {
        return this.f7514d;
    }

    @Override // E.N.a
    C4434u<N.b> d() {
        return this.f7512b;
    }

    public int hashCode() {
        return ((((((this.f7511a.hashCode() ^ 1000003) * 1000003) ^ this.f7512b.hashCode()) * 1000003) ^ this.f7513c) * 1000003) ^ this.f7514d;
    }

    public String toString() {
        return "In{edge=" + this.f7511a + ", postviewEdge=" + this.f7512b + ", inputFormat=" + this.f7513c + ", outputFormat=" + this.f7514d + "}";
    }

    C3403e(C4434u<N.b> c4434u, C4434u<N.b> c4434u2, int i10, int i11) {
        if (c4434u != null) {
            this.f7511a = c4434u;
            if (c4434u2 != null) {
                this.f7512b = c4434u2;
                this.f7513c = i10;
                this.f7514d = i11;
                return;
            }
            throw new NullPointerException("Null postviewEdge");
        }
        throw new NullPointerException("Null edge");
    }
}
