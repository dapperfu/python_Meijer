package rc;

import kv.InterfaceC15323a;
import tc.InterfaceC17078b;

/* loaded from: classes4.dex */
public final class w implements InterfaceC17078b<u> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f157999a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f158000b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<xc.e> f158001c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<yc.r> f158002d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<yc.v> f158003e;

    public static w a(InterfaceC15323a<Bc.a> interfaceC15323a, InterfaceC15323a<Bc.a> interfaceC15323a2, InterfaceC15323a<xc.e> interfaceC15323a3, InterfaceC15323a<yc.r> interfaceC15323a4, InterfaceC15323a<yc.v> interfaceC15323a5) {
        return new w(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5);
    }

    public static u c(Bc.a aVar, Bc.a aVar2, xc.e eVar, yc.r rVar, yc.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f157999a.get(), this.f158000b.get(), this.f158001c.get(), this.f158002d.get(), this.f158003e.get());
    }

    public w(InterfaceC15323a<Bc.a> interfaceC15323a, InterfaceC15323a<Bc.a> interfaceC15323a2, InterfaceC15323a<xc.e> interfaceC15323a3, InterfaceC15323a<yc.r> interfaceC15323a4, InterfaceC15323a<yc.v> interfaceC15323a5) {
        this.f157999a = interfaceC15323a;
        this.f158000b = interfaceC15323a2;
        this.f158001c = interfaceC15323a3;
        this.f158002d = interfaceC15323a4;
        this.f158003e = interfaceC15323a5;
    }
}
