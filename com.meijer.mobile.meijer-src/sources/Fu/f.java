package Fu;

import Fu.p;
import java.util.List;

/* loaded from: classes8.dex */
final class f extends p {

    /* renamed from: b, reason: collision with root package name */
    private final p.c f10941b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10942c;

    /* renamed from: d, reason: collision with root package name */
    private final j f10943d;

    /* renamed from: e, reason: collision with root package name */
    private final a f10944e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Gu.h> f10945f;

    /* renamed from: g, reason: collision with root package name */
    private final p.b f10946g;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f10941b.equals(pVar.g()) && this.f10942c.equals(pVar.e()) && this.f10943d.equals(pVar.f()) && this.f10944e.equals(pVar.c()) && this.f10945f.equals(pVar.d()) && this.f10946g.equals(pVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // Fu.p
    public a c() {
        return this.f10944e;
    }

    @Override // Fu.p
    public List<Gu.h> d() {
        return this.f10945f;
    }

    @Override // Fu.p
    public String e() {
        return this.f10942c;
    }

    @Override // Fu.p
    public j f() {
        return this.f10943d;
    }

    @Override // Fu.p
    public p.c g() {
        return this.f10941b;
    }

    @Override // Fu.p
    @Deprecated
    public p.b h() {
        return this.f10946g;
    }

    public int hashCode() {
        return ((((((((((this.f10941b.hashCode() ^ 1000003) * 1000003) ^ this.f10942c.hashCode()) * 1000003) ^ this.f10943d.hashCode()) * 1000003) ^ this.f10944e.hashCode()) * 1000003) ^ this.f10945f.hashCode()) * 1000003) ^ this.f10946g.hashCode();
    }

    public String toString() {
        return "View{name=" + this.f10941b + ", description=" + this.f10942c + ", measure=" + this.f10943d + ", aggregation=" + this.f10944e + ", columns=" + this.f10945f + ", window=" + this.f10946g + "}";
    }

    f(p.c cVar, String str, j jVar, a aVar, List<Gu.h> list, p.b bVar) {
        if (cVar != null) {
            this.f10941b = cVar;
            if (str != null) {
                this.f10942c = str;
                if (jVar != null) {
                    this.f10943d = jVar;
                    if (aVar != null) {
                        this.f10944e = aVar;
                        if (list != null) {
                            this.f10945f = list;
                            if (bVar != null) {
                                this.f10946g = bVar;
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
