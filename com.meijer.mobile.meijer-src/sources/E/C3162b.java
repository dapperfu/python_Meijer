package E;

import E.C3179t;
import E.Y;
import O.C4347u;
import android.util.Size;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3162b extends C3179t.c {

    /* renamed from: d, reason: collision with root package name */
    private final Size f6899d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6900e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6901f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6902g;

    /* renamed from: h, reason: collision with root package name */
    private final C.M f6903h;

    /* renamed from: i, reason: collision with root package name */
    private final Size f6904i;

    /* renamed from: j, reason: collision with root package name */
    private final int f6905j;

    /* renamed from: k, reason: collision with root package name */
    private final C4347u<O> f6906k;

    /* renamed from: l, reason: collision with root package name */
    private final C4347u<Y.b> f6907l;

    public boolean equals(Object obj) {
        C.M m10;
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3179t.c) {
            C3179t.c cVar = (C3179t.c) obj;
            if (this.f6899d.equals(cVar.j()) && this.f6900e == cVar.d() && this.f6901f == cVar.e() && this.f6902g == cVar.l() && ((m10 = this.f6903h) != null ? m10.equals(cVar.c()) : cVar.c() == null) && ((size = this.f6904i) != null ? size.equals(cVar.g()) : cVar.g() == null) && this.f6905j == cVar.f() && this.f6906k.equals(cVar.i()) && this.f6907l.equals(cVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3179t.c
    C4347u<Y.b> b() {
        return this.f6907l;
    }

    @Override // E.C3179t.c
    C.M c() {
        return this.f6903h;
    }

    @Override // E.C3179t.c
    int d() {
        return this.f6900e;
    }

    @Override // E.C3179t.c
    int e() {
        return this.f6901f;
    }

    @Override // E.C3179t.c
    int f() {
        return this.f6905j;
    }

    @Override // E.C3179t.c
    Size g() {
        return this.f6904i;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f6899d.hashCode() ^ 1000003) * 1000003) ^ this.f6900e) * 1000003) ^ this.f6901f) * 1000003) ^ (this.f6902g ? 1231 : 1237)) * 1000003;
        C.M m10 = this.f6903h;
        int iHashCode2 = (iHashCode ^ (m10 == null ? 0 : m10.hashCode())) * 1000003;
        Size size = this.f6904i;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.f6905j) * 1000003) ^ this.f6906k.hashCode()) * 1000003) ^ this.f6907l.hashCode();
    }

    @Override // E.C3179t.c
    C4347u<O> i() {
        return this.f6906k;
    }

    @Override // E.C3179t.c
    Size j() {
        return this.f6899d;
    }

    @Override // E.C3179t.c
    boolean l() {
        return this.f6902g;
    }

    public String toString() {
        return "In{size=" + this.f6899d + ", inputFormat=" + this.f6900e + ", outputFormat=" + this.f6901f + ", virtualCamera=" + this.f6902g + ", imageReaderProxyProvider=" + this.f6903h + ", postviewSize=" + this.f6904i + ", postviewImageFormat=" + this.f6905j + ", requestEdge=" + this.f6906k + ", errorEdge=" + this.f6907l + "}";
    }

    C3162b(Size size, int i10, int i11, boolean z10, C.M m10, Size size2, int i12, C4347u<O> c4347u, C4347u<Y.b> c4347u2) {
        if (size != null) {
            this.f6899d = size;
            this.f6900e = i10;
            this.f6901f = i11;
            this.f6902g = z10;
            this.f6903h = m10;
            this.f6904i = size2;
            this.f6905j = i12;
            if (c4347u != null) {
                this.f6906k = c4347u;
                if (c4347u2 != null) {
                    this.f6907l = c4347u2;
                    return;
                }
                throw new NullPointerException("Null errorEdge");
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null size");
    }
}
