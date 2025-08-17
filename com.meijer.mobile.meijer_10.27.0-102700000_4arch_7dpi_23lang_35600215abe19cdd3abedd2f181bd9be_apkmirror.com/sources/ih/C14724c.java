package ih;

import ih.InterfaceC14722a;

/* renamed from: ih.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14724c {

    /* renamed from: a, reason: collision with root package name */
    private final String f137763a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC14722a f137764b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14722a.InterfaceC2175a f137765c;

    public static C14724c r(InterfaceC14722a interfaceC14722a, String str) {
        return new C14724c(str, interfaceC14722a, interfaceC14722a.a(str));
    }

    public void a(Object obj) {
        this.f137765c.e(EnumC14723b.DEBUG, obj);
    }

    public void b(String str, Object obj) {
        this.f137765c.c(EnumC14723b.DEBUG, str, obj);
    }

    public void c(String str, Object obj, Object obj2) {
        this.f137765c.a(EnumC14723b.DEBUG, str, obj, obj2);
    }

    public void d(String str, Object... objArr) {
        this.f137765c.b(EnumC14723b.DEBUG, str, objArr);
    }

    public void e(Object obj) {
        this.f137765c.e(EnumC14723b.ERROR, obj);
    }

    public void f(String str, Object obj) {
        this.f137765c.c(EnumC14723b.ERROR, str, obj);
    }

    public void g(String str, Object obj, Object obj2) {
        this.f137765c.a(EnumC14723b.ERROR, str, obj, obj2);
    }

    public void h(String str, Object... objArr) {
        this.f137765c.b(EnumC14723b.ERROR, str, objArr);
    }

    public void i(Object obj) {
        this.f137765c.e(EnumC14723b.INFO, obj);
    }

    public void j(String str, Object obj) {
        this.f137765c.c(EnumC14723b.INFO, str, obj);
    }

    public void k(String str, Object obj, Object obj2) {
        this.f137765c.a(EnumC14723b.INFO, str, obj, obj2);
    }

    public boolean l(EnumC14723b enumC14723b) {
        return this.f137765c.d(enumC14723b);
    }

    public void n(Object obj) {
        this.f137765c.e(EnumC14723b.WARN, obj);
    }

    public void o(String str, Object obj) {
        this.f137765c.c(EnumC14723b.WARN, str, obj);
    }

    public void p(String str, Object obj, Object obj2) {
        this.f137765c.a(EnumC14723b.WARN, str, obj, obj2);
    }

    public void q(String str, Object... objArr) {
        this.f137765c.b(EnumC14723b.WARN, str, objArr);
    }

    C14724c(String str, InterfaceC14722a interfaceC14722a, InterfaceC14722a.InterfaceC2175a interfaceC2175a) {
        this.f137763a = str;
        this.f137764b = interfaceC14722a;
        this.f137765c = interfaceC2175a;
    }

    public static C14724c m() {
        return r(AbstractC14727f.b(), "");
    }
}
