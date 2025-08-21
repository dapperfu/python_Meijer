package E;

import E.N;
import O.C4347u;

/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3165e extends N.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4347u<N.b> f6918a;

    /* renamed from: b, reason: collision with root package name */
    private final C4347u<N.b> f6919b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6920c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6921d;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N.a) {
            N.a aVar = (N.a) obj;
            if (this.f6918a.equals(aVar.a()) && this.f6919b.equals(aVar.d()) && this.f6920c == aVar.b() && this.f6921d == aVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // E.N.a
    C4347u<N.b> a() {
        return this.f6918a;
    }

    @Override // E.N.a
    int b() {
        return this.f6920c;
    }

    @Override // E.N.a
    int c() {
        return this.f6921d;
    }

    @Override // E.N.a
    C4347u<N.b> d() {
        return this.f6919b;
    }

    public int hashCode() {
        return ((((((this.f6918a.hashCode() ^ 1000003) * 1000003) ^ this.f6919b.hashCode()) * 1000003) ^ this.f6920c) * 1000003) ^ this.f6921d;
    }

    public String toString() {
        return "In{edge=" + this.f6918a + ", postviewEdge=" + this.f6919b + ", inputFormat=" + this.f6920c + ", outputFormat=" + this.f6921d + "}";
    }

    C3165e(C4347u<N.b> c4347u, C4347u<N.b> c4347u2, int i10, int i11) {
        if (c4347u != null) {
            this.f6918a = c4347u;
            if (c4347u2 != null) {
                this.f6919b = c4347u2;
                this.f6920c = i10;
                this.f6921d = i11;
                return;
            }
            throw new NullPointerException("Null postviewEdge");
        }
        throw new NullPointerException("Null edge");
    }
}
