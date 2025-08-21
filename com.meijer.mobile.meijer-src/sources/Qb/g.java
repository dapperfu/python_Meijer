package Qb;

import java.util.List;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private Long f27983a;

    /* renamed from: b, reason: collision with root package name */
    private String f27984b;

    /* renamed from: c, reason: collision with root package name */
    private String f27985c;

    /* renamed from: d, reason: collision with root package name */
    private List<h> f27986d;

    /* renamed from: e, reason: collision with root package name */
    private f f27987e;

    /* renamed from: f, reason: collision with root package name */
    private String f27988f;

    /* renamed from: g, reason: collision with root package name */
    private int f27989g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Long l10 = this.f27983a;
        if (l10 == null) {
            if (gVar.f27983a != null) {
                return false;
            }
        } else if (!l10.equals(gVar.f27983a)) {
            return false;
        }
        return true;
    }

    public List<h> a() {
        return this.f27986d;
    }

    public f b() {
        return this.f27987e;
    }

    public String c() {
        return this.f27988f;
    }

    public int d() {
        return this.f27989g;
    }

    public Long e() {
        return this.f27983a;
    }

    public String f() {
        return this.f27985c;
    }

    public String g() {
        return this.f27984b;
    }

    public void h(List<h> list) {
        this.f27986d = list;
    }

    public int hashCode() {
        Long l10 = this.f27983a;
        return (l10 == null ? 0 : l10.hashCode()) + 31;
    }

    public void i(f fVar) {
        this.f27987e = fVar;
    }

    public void j(String str) {
        this.f27988f = str;
    }

    public void k(int i10) {
        this.f27989g = i10;
    }

    public void l(Long l10) {
        this.f27983a = l10;
    }

    public void m(String str) {
        this.f27985c = str;
    }

    public void n(String str) {
        this.f27984b = str;
    }
}
