package v;

import android.util.Size;
import androidx.camera.core.impl.E;
import java.util.List;
import v.M;

/* renamed from: v.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17507d extends M.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f165042a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f165043b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.w f165044c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.D<?> f165045d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f165046e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.x f165047f;

    /* renamed from: g, reason: collision with root package name */
    private final List<E.b> f165048g;

    public boolean equals(Object obj) {
        Size size;
        androidx.camera.core.impl.x xVar;
        List<E.b> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof M.k) {
            M.k kVar = (M.k) obj;
            if (this.f165042a.equals(kVar.h()) && this.f165043b.equals(kVar.i()) && this.f165044c.equals(kVar.d()) && this.f165045d.equals(kVar.g()) && ((size = this.f165046e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((xVar = this.f165047f) != null ? xVar.equals(kVar.e()) : kVar.e() == null) && ((list = this.f165048g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // v.M.k
    List<E.b> c() {
        return this.f165048g;
    }

    @Override // v.M.k
    androidx.camera.core.impl.w d() {
        return this.f165044c;
    }

    @Override // v.M.k
    androidx.camera.core.impl.x e() {
        return this.f165047f;
    }

    @Override // v.M.k
    Size f() {
        return this.f165046e;
    }

    @Override // v.M.k
    androidx.camera.core.impl.D<?> g() {
        return this.f165045d;
    }

    @Override // v.M.k
    String h() {
        return this.f165042a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f165042a.hashCode() ^ 1000003) * 1000003) ^ this.f165043b.hashCode()) * 1000003) ^ this.f165044c.hashCode()) * 1000003) ^ this.f165045d.hashCode()) * 1000003;
        Size size = this.f165046e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.x xVar = this.f165047f;
        int iHashCode3 = (iHashCode2 ^ (xVar == null ? 0 : xVar.hashCode())) * 1000003;
        List<E.b> list = this.f165048g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // v.M.k
    Class<?> i() {
        return this.f165043b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f165042a + ", useCaseType=" + this.f165043b + ", sessionConfig=" + this.f165044c + ", useCaseConfig=" + this.f165045d + ", surfaceResolution=" + this.f165046e + ", streamSpec=" + this.f165047f + ", captureTypes=" + this.f165048g + "}";
    }

    C17507d(String str, Class<?> cls, androidx.camera.core.impl.w wVar, androidx.camera.core.impl.D<?> d10, Size size, androidx.camera.core.impl.x xVar, List<E.b> list) {
        if (str != null) {
            this.f165042a = str;
            if (cls != null) {
                this.f165043b = cls;
                if (wVar != null) {
                    this.f165044c = wVar;
                    if (d10 != null) {
                        this.f165045d = d10;
                        this.f165046e = size;
                        this.f165047f = xVar;
                        this.f165048g = list;
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
