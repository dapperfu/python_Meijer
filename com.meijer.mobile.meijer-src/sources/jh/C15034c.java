package jh;

import jh.InterfaceC15032a;

/* renamed from: jh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15034c {

    /* renamed from: a, reason: collision with root package name */
    private final String f140649a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC15032a f140650b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15032a.InterfaceC2226a f140651c;

    public static C15034c r(InterfaceC15032a interfaceC15032a, String str) {
        return new C15034c(str, interfaceC15032a, interfaceC15032a.a(str));
    }

    public void a(Object obj) {
        this.f140651c.e(EnumC15033b.DEBUG, obj);
    }

    public void b(String str, Object obj) {
        this.f140651c.b(EnumC15033b.DEBUG, str, obj);
    }

    public void c(String str, Object obj, Object obj2) {
        this.f140651c.d(EnumC15033b.DEBUG, str, obj, obj2);
    }

    public void d(String str, Object... objArr) {
        this.f140651c.c(EnumC15033b.DEBUG, str, objArr);
    }

    public void e(Object obj) {
        this.f140651c.e(EnumC15033b.ERROR, obj);
    }

    public void f(String str, Object obj) {
        this.f140651c.b(EnumC15033b.ERROR, str, obj);
    }

    public void g(String str, Object obj, Object obj2) {
        this.f140651c.d(EnumC15033b.ERROR, str, obj, obj2);
    }

    public void h(String str, Object... objArr) {
        this.f140651c.c(EnumC15033b.ERROR, str, objArr);
    }

    public void i(Object obj) {
        this.f140651c.e(EnumC15033b.INFO, obj);
    }

    public void j(String str, Object obj) {
        this.f140651c.b(EnumC15033b.INFO, str, obj);
    }

    public void k(String str, Object obj, Object obj2) {
        this.f140651c.d(EnumC15033b.INFO, str, obj, obj2);
    }

    public boolean l(EnumC15033b enumC15033b) {
        return this.f140651c.a(enumC15033b);
    }

    public void n(Object obj) {
        this.f140651c.e(EnumC15033b.WARN, obj);
    }

    public void o(String str, Object obj) {
        this.f140651c.b(EnumC15033b.WARN, str, obj);
    }

    public void p(String str, Object obj, Object obj2) {
        this.f140651c.d(EnumC15033b.WARN, str, obj, obj2);
    }

    public void q(String str, Object... objArr) {
        this.f140651c.c(EnumC15033b.WARN, str, objArr);
    }

    C15034c(String str, InterfaceC15032a interfaceC15032a, InterfaceC15032a.InterfaceC2226a interfaceC2226a) {
        this.f140649a = str;
        this.f140650b = interfaceC15032a;
        this.f140651c = interfaceC2226a;
    }

    public static C15034c m() {
        return r(AbstractC15037f.b(), "");
    }
}
