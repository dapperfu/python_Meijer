package E;

import E.C3417t;
import E.Y;
import O.C4434u;
import android.util.Size;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3400b extends C3417t.c {

    /* renamed from: d, reason: collision with root package name */
    private final Size f7492d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7493e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7494f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7495g;

    /* renamed from: h, reason: collision with root package name */
    private final C.M f7496h;

    /* renamed from: i, reason: collision with root package name */
    private final Size f7497i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7498j;

    /* renamed from: k, reason: collision with root package name */
    private final C4434u<O> f7499k;

    /* renamed from: l, reason: collision with root package name */
    private final C4434u<Y.b> f7500l;

    public boolean equals(Object obj) {
        C.M m10;
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3417t.c) {
            C3417t.c cVar = (C3417t.c) obj;
            if (this.f7492d.equals(cVar.j()) && this.f7493e == cVar.d() && this.f7494f == cVar.e() && this.f7495g == cVar.l() && ((m10 = this.f7496h) != null ? m10.equals(cVar.c()) : cVar.c() == null) && ((size = this.f7497i) != null ? size.equals(cVar.g()) : cVar.g() == null) && this.f7498j == cVar.f() && this.f7499k.equals(cVar.i()) && this.f7500l.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3417t.c
    C4434u<Y.b> b() {
        return this.f7500l;
    }

    @Override // E.C3417t.c
    C.M c() {
        return this.f7496h;
    }

    @Override // E.C3417t.c
    int d() {
        return this.f7493e;
    }

    @Override // E.C3417t.c
    int e() {
        return this.f7494f;
    }

    @Override // E.C3417t.c
    int f() {
        return this.f7498j;
    }

    @Override // E.C3417t.c
    Size g() {
        return this.f7497i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f7492d.hashCode() ^ 1000003) * 1000003) ^ this.f7493e) * 1000003) ^ this.f7494f) * 1000003) ^ (this.f7495g ? 1231 : 1237)) * 1000003;
        C.M m10 = this.f7496h;
        int iHashCode2 = (iHashCode ^ (m10 == null ? 0 : m10.hashCode())) * 1000003;
        Size size = this.f7497i;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f7498j) * 1000003) ^ this.f7499k.hashCode()) * 1000003) ^ this.f7500l.hashCode();
    }

    @Override // E.C3417t.c
    C4434u<O> i() {
        return this.f7499k;
    }

    @Override // E.C3417t.c
    Size j() {
        return this.f7492d;
    }

    @Override // E.C3417t.c
    boolean l() {
        return this.f7495g;
    }

    public String toString() {
        return "In{size=" + this.f7492d + ", inputFormat=" + this.f7493e + ", outputFormat=" + this.f7494f + ", virtualCamera=" + this.f7495g + ", imageReaderProxyProvider=" + this.f7496h + ", postviewSize=" + this.f7497i + ", postviewImageFormat=" + this.f7498j + ", requestEdge=" + this.f7499k + ", errorEdge=" + this.f7500l + "}";
    }

    C3400b(Size size, int i10, int i11, boolean z10, C.M m10, Size size2, int i12, C4434u<O> c4434u, C4434u<Y.b> c4434u2) {
        if (size != null) {
            this.f7492d = size;
            this.f7493e = i10;
            this.f7494f = i11;
            this.f7495g = z10;
            this.f7496h = m10;
            this.f7497i = size2;
            this.f7498j = i12;
            if (c4434u != null) {
                this.f7499k = c4434u;
                if (c4434u2 != null) {
                    this.f7500l = c4434u2;
                    return;
                }
                throw new NullPointerException("Null errorEdge");
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null size");
    }
}
