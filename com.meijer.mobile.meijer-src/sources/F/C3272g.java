package F;

import android.util.Size;
import java.util.Map;

/* renamed from: F.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3272g extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f8714a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Size> f8715b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f8716c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size> f8717d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f8718e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, Size> f8719f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Size> f8720g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w0) {
            w0 w0Var = (w0) obj;
            if (this.f8714a.equals(w0Var.b()) && this.f8715b.equals(w0Var.j()) && this.f8716c.equals(w0Var.e()) && this.f8717d.equals(w0Var.h()) && this.f8718e.equals(w0Var.f()) && this.f8719f.equals(w0Var.d()) && this.f8720g.equals(w0Var.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // F.w0
    public Size b() {
        return this.f8714a;
    }

    @Override // F.w0
    public Map<Integer, Size> d() {
        return this.f8719f;
    }

    @Override // F.w0
    public Size e() {
        return this.f8716c;
    }

    @Override // F.w0
    public Size f() {
        return this.f8718e;
    }

    @Override // F.w0
    public Map<Integer, Size> h() {
        return this.f8717d;
    }

    public int hashCode() {
        return ((((((((((((this.f8714a.hashCode() ^ 1000003) * 1000003) ^ this.f8715b.hashCode()) * 1000003) ^ this.f8716c.hashCode()) * 1000003) ^ this.f8717d.hashCode()) * 1000003) ^ this.f8718e.hashCode()) * 1000003) ^ this.f8719f.hashCode()) * 1000003) ^ this.f8720g.hashCode();
    }

    @Override // F.w0
    public Map<Integer, Size> j() {
        return this.f8715b;
    }

    @Override // F.w0
    public Map<Integer, Size> l() {
        return this.f8720g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f8714a + ", s720pSizeMap=" + this.f8715b + ", previewSize=" + this.f8716c + ", s1440pSizeMap=" + this.f8717d + ", recordSize=" + this.f8718e + ", maximumSizeMap=" + this.f8719f + ", ultraMaximumSizeMap=" + this.f8720g + "}";
    }

    C3272g(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size != null) {
            this.f8714a = size;
            if (map != null) {
                this.f8715b = map;
                if (size2 != null) {
                    this.f8716c = size2;
                    if (map2 != null) {
                        this.f8717d = map2;
                        if (size3 != null) {
                            this.f8718e = size3;
                            if (map3 != null) {
                                this.f8719f = map3;
                                if (map4 != null) {
                                    this.f8720g = map4;
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
