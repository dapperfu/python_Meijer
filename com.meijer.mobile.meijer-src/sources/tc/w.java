package tc;

import gv.InterfaceC14411a;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class w implements InterfaceC17653b<u> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f162489a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f162490b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<zc.e> f162491c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<Ac.r> f162492d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<Ac.v> f162493e;

    public static w a(InterfaceC14411a<Dc.a> interfaceC14411a, InterfaceC14411a<Dc.a> interfaceC14411a2, InterfaceC14411a<zc.e> interfaceC14411a3, InterfaceC14411a<Ac.r> interfaceC14411a4, InterfaceC14411a<Ac.v> interfaceC14411a5) {
        return new w(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5);
    }

    public static u c(Dc.a aVar, Dc.a aVar2, zc.e eVar, Ac.r rVar, Ac.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f162489a.get(), this.f162490b.get(), this.f162491c.get(), this.f162492d.get(), this.f162493e.get());
    }

    public w(InterfaceC14411a<Dc.a> interfaceC14411a, InterfaceC14411a<Dc.a> interfaceC14411a2, InterfaceC14411a<zc.e> interfaceC14411a3, InterfaceC14411a<Ac.r> interfaceC14411a4, InterfaceC14411a<Ac.v> interfaceC14411a5) {
        this.f162489a = interfaceC14411a;
        this.f162490b = interfaceC14411a2;
        this.f162491c = interfaceC14411a3;
        this.f162492d = interfaceC14411a4;
        this.f162493e = interfaceC14411a5;
    }
}
