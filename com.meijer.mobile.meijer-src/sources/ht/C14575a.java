package ht;

import ab.AbstractC5677b;
import bb.C6346c;
import bb.e;
import pt.InterfaceC16543c;
import tb.C17216a;

/* renamed from: ht.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14575a extends AbstractC5677b {

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC16543c f136155n;

    public C14575a(C6346c c6346c, e eVar, InterfaceC16543c interfaceC16543c) {
        super(c6346c, eVar, null);
        this.f136155n = interfaceC16543c;
    }

    @Override // ab.AbstractC5678c, bb.d
    public final String e() {
        return "UpdateOrganizationPlacesJob";
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C17216a c17216a = new C17216a();
        this.f136155n.k(c17216a);
        c17216a.b();
    }
}
