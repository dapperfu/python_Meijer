package F;

import android.util.Size;
import java.util.Map;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3610g extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f9947a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Size> f9948b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f9949c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size> f9950d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f9951e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, Size> f9952f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Size> f9953g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f9947a.equals(w0Var.b()) && this.f9948b.equals(w0Var.j()) && this.f9949c.equals(w0Var.e()) && this.f9950d.equals(w0Var.h()) && this.f9951e.equals(w0Var.f()) && this.f9952f.equals(w0Var.d()) && this.f9953g.equals(w0Var.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // F.w0
    public Size b() {
        return this.f9947a;
    }

    @Override // F.w0
    public Map<Integer, Size> d() {
        return this.f9952f;
    }

    @Override // F.w0
    public Size e() {
        return this.f9949c;
    }

    @Override // F.w0
    public Size f() {
        return this.f9951e;
    }

    @Override // F.w0
    public Map<Integer, Size> h() {
        return this.f9950d;
    }

    public int hashCode() {
        return ((((((((((((this.f9947a.hashCode() ^ 1000003) * 1000003) ^ this.f9948b.hashCode()) * 1000003) ^ this.f9949c.hashCode()) * 1000003) ^ this.f9950d.hashCode()) * 1000003) ^ this.f9951e.hashCode()) * 1000003) ^ this.f9952f.hashCode()) * 1000003) ^ this.f9953g.hashCode();
    }

    @Override // F.w0
    public Map<Integer, Size> j() {
        return this.f9948b;
    }

    @Override // F.w0
    public Map<Integer, Size> l() {
        return this.f9953g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f9947a + ", s720pSizeMap=" + this.f9948b + ", previewSize=" + this.f9949c + ", s1440pSizeMap=" + this.f9950d + ", recordSize=" + this.f9951e + ", maximumSizeMap=" + this.f9952f + ", ultraMaximumSizeMap=" + this.f9953g + "}";
    }

    C3610g(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size != null) {
            this.f9947a = size;
            if (map != null) {
                this.f9948b = map;
                if (size2 != null) {
                    this.f9949c = size2;
                    if (map2 != null) {
                        this.f9950d = map2;
                        if (size3 != null) {
                            this.f9951e = size3;
                            if (map3 != null) {
                                this.f9952f = map3;
                                if (map4 != null) {
                                    this.f9953g = map4;
                                    return;
                                }
                                throw new NullPointerException("Null ultraMaximumSizeMap");
                            }
                            throw new NullPointerException("Null maximumSizeMap");
                        }
                        throw new NullPointerException("Null recordSize");
                    }
                    throw new NullPointerException("Null s1440pSizeMap");
                }
                throw new NullPointerException("Null previewSize");
            }
            throw new NullPointerException("Null s720pSizeMap");
        }
        throw new NullPointerException("Null analysisSize");
    }
}
