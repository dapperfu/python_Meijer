package Ob;

import java.util.List;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private Long f23495a;

    /* renamed from: b, reason: collision with root package name */
    private String f23496b;

    /* renamed from: c, reason: collision with root package name */
    private String f23497c;

    /* renamed from: d, reason: collision with root package name */
    private List<h> f23498d;

    /* renamed from: e, reason: collision with root package name */
    private f f23499e;

    /* renamed from: f, reason: collision with root package name */
    private String f23500f;

    /* renamed from: g, reason: collision with root package name */
    private int f23501g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        Long l10 = this.f23495a;
        if (l10 == null) {
            if (gVar.f23495a != null) {
                return false;
            }
        } else if (!l10.equals(gVar.f23495a)) {
            return false;
        }
        return true;
    }

    public List<h> a() {
        return this.f23498d;
    }

    public f b() {
        return this.f23499e;
    }

    public String c() {
        return this.f23500f;
    }

    public int d() {
        return this.f23501g;
    }

    public Long e() {
        return this.f23495a;
    }

    public String f() {
        return this.f23497c;
    }

    public String g() {
        return this.f23496b;
    }

    public void h(List<h> list) {
        this.f23498d = list;
    }

    public int hashCode() {
        Long l10 = this.f23495a;
        return (l10 == null ? 0 : l10.hashCode()) + 31;
    }

    public void i(f fVar) {
        this.f23499e = fVar;
    }

    public void j(String str) {
        this.f23500f = str;
    }

    public void k(int i10) {
        this.f23501g = i10;
    }

    public void l(Long l10) {
        this.f23495a = l10;
    }

    public void m(String str) {
        this.f23497c = str;
    }

    public void n(String str) {
        this.f23496b = str;
    }
}
