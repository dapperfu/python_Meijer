package Ju;

import Ju.p;
import java.util.List;

/* loaded from: classes7.dex */
final class f extends p {

    /* renamed from: b, reason: collision with root package name */
    private final p.c f16142b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16143c;

    /* renamed from: d, reason: collision with root package name */
    private final j f16144d;

    /* renamed from: e, reason: collision with root package name */
    private final a f16145e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Ku.h> f16146f;

    /* renamed from: g, reason: collision with root package name */
    private final p.b f16147g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f16142b.equals(pVar.g()) && this.f16143c.equals(pVar.e()) && this.f16144d.equals(pVar.f()) && this.f16145e.equals(pVar.c()) && this.f16146f.equals(pVar.d()) && this.f16147g.equals(pVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // Ju.p
    public a c() {
        return this.f16145e;
    }

    @Override // Ju.p
    public List<Ku.h> d() {
        return this.f16146f;
    }

    @Override // Ju.p
    public String e() {
        return this.f16143c;
    }

    @Override // Ju.p
    public j f() {
        return this.f16144d;
    }

    @Override // Ju.p
    public p.c g() {
        return this.f16142b;
    }

    @Override // Ju.p
    @Deprecated
    public p.b h() {
        return this.f16147g;
    }

    public int hashCode() {
        return ((((((((((this.f16142b.hashCode() ^ 1000003) * 1000003) ^ this.f16143c.hashCode()) * 1000003) ^ this.f16144d.hashCode()) * 1000003) ^ this.f16145e.hashCode()) * 1000003) ^ this.f16146f.hashCode()) * 1000003) ^ this.f16147g.hashCode();
    }

    public String toString() {
        return "View{name=" + this.f16142b + ", description=" + this.f16143c + ", measure=" + this.f16144d + ", aggregation=" + this.f16145e + ", columns=" + this.f16146f + ", window=" + this.f16147g + "}";
    }

    f(p.c cVar, String str, j jVar, a aVar, List<Ku.h> list, p.b bVar) {
        if (cVar != null) {
            this.f16142b = cVar;
            if (str != null) {
                this.f16143c = str;
                if (jVar != null) {
                    this.f16144d = jVar;
                    if (aVar != null) {
                        this.f16145e = aVar;
                        if (list != null) {
                            this.f16146f = list;
                            if (bVar != null) {
                                this.f16147g = bVar;
                                return;
                            }
                            throw new NullPointerException("Null window");
                        }
                        throw new NullPointerException("Null columns");
                    }
                    throw new NullPointerException("Null aggregation");
                }
                throw new NullPointerException("Null measure");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }
}
