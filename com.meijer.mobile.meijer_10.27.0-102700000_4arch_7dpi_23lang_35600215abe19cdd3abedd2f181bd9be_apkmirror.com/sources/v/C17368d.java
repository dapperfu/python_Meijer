package v;

import android.util.Size;
import androidx.camera.core.impl.E;
import java.util.List;
import v.M;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17368d extends M.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f164008a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f164009b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.w f164010c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.D<?> f164011d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f164012e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.x f164013f;

    /* renamed from: g, reason: collision with root package name */
    private final List<E.b> f164014g;

    public boolean equals(Object obj) {
        Size size;
        androidx.camera.core.impl.x xVar;
        List<E.b> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof M.k) {
            M.k kVar = (M.k) obj;
            if (this.f164008a.equals(kVar.h()) && this.f164009b.equals(kVar.i()) && this.f164010c.equals(kVar.d()) && this.f164011d.equals(kVar.g()) && ((size = this.f164012e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((xVar = this.f164013f) != null ? xVar.equals(kVar.e()) : kVar.e() == null) && ((list = this.f164014g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // v.M.k
    List<E.b> c() {
        return this.f164014g;
    }

    @Override // v.M.k
    androidx.camera.core.impl.w d() {
        return this.f164010c;
    }

    @Override // v.M.k
    androidx.camera.core.impl.x e() {
        return this.f164013f;
    }

    @Override // v.M.k
    Size f() {
        return this.f164012e;
    }

    @Override // v.M.k
    androidx.camera.core.impl.D<?> g() {
        return this.f164011d;
    }

    @Override // v.M.k
    String h() {
        return this.f164008a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f164008a.hashCode() ^ 1000003) * 1000003) ^ this.f164009b.hashCode()) * 1000003) ^ this.f164010c.hashCode()) * 1000003) ^ this.f164011d.hashCode()) * 1000003;
        Size size = this.f164012e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.x xVar = this.f164013f;
        int iHashCode3 = (iHashCode2 ^ (xVar == null ? 0 : xVar.hashCode())) * 1000003;
        List<E.b> list = this.f164014g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // v.M.k
    Class<?> i() {
        return this.f164009b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f164008a + ", useCaseType=" + this.f164009b + ", sessionConfig=" + this.f164010c + ", useCaseConfig=" + this.f164011d + ", surfaceResolution=" + this.f164012e + ", streamSpec=" + this.f164013f + ", captureTypes=" + this.f164014g + "}";
    }

    C17368d(String str, Class<?> cls, androidx.camera.core.impl.w wVar, androidx.camera.core.impl.D<?> d10, Size size, androidx.camera.core.impl.x xVar, List<E.b> list) {
        if (str != null) {
            this.f164008a = str;
            if (cls != null) {
                this.f164009b = cls;
                if (wVar != null) {
                    this.f164010c = wVar;
                    if (d10 != null) {
                        this.f164011d = d10;
                        this.f164012e = size;
                        this.f164013f = xVar;
                        this.f164014g = list;
                        return;
                    }
                    throw new NullPointerException("Null useCaseConfig");
                }
                throw new NullPointerException("Null sessionConfig");
            }
            throw new NullPointerException("Null useCaseType");
        }
        throw new NullPointerException("Null useCaseId");
    }
}
