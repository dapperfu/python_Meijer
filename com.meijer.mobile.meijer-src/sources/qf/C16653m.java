package qf;

import kg.InterfaceC15125c;

/* renamed from: qf.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16653m implements InterfaceC15125c {

    /* renamed from: a, reason: collision with root package name */
    private final F f158378a;

    /* renamed from: b, reason: collision with root package name */
    private final C16652l f158379b;

    @Override // kg.InterfaceC15125c
    public boolean b() {
        return this.f158378a.d();
    }

    @Override // kg.InterfaceC15125c
    public InterfaceC15125c.a c() {
        return InterfaceC15125c.a.f141840a;
    }

    public String d(String str) {
        return this.f158379b.c(str);
    }

    public void e(String str) {
        this.f158379b.g(str);
    }

    public C16653m(F f10, wf.g gVar) {
        this.f158378a = f10;
        this.f158379b = new C16652l(gVar);
    }

    @Override // kg.InterfaceC15125c
    public void a(InterfaceC15125c.SessionDetails sessionDetails) {
        nf.g.f().b("App Quality Sessions session changed: " + sessionDetails);
        this.f158379b.f(sessionDetails.getSessionId());
    }
}
