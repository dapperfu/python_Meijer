package of;

import ig.InterfaceC14721c;

/* renamed from: of.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16045m implements InterfaceC14721c {

    /* renamed from: a, reason: collision with root package name */
    private final F f153526a;

    /* renamed from: b, reason: collision with root package name */
    private final C16044l f153527b;

    @Override // ig.InterfaceC14721c
    public boolean b() {
        return this.f153526a.d();
    }

    @Override // ig.InterfaceC14721c
    public InterfaceC14721c.a c() {
        return InterfaceC14721c.a.f137751a;
    }

    public String d(String str) {
        return this.f153527b.c(str);
    }

    public void e(String str) {
        this.f153527b.g(str);
    }

    public C16045m(F f10, uf.g gVar) {
        this.f153526a = f10;
        this.f153527b = new C16044l(gVar);
    }

    @Override // ig.InterfaceC14721c
    public void a(InterfaceC14721c.SessionDetails sessionDetails) {
        lf.g.f().b("App Quality Sessions session changed: " + sessionDetails);
        this.f153527b.f(sessionDetails.getSessionId());
    }
}
