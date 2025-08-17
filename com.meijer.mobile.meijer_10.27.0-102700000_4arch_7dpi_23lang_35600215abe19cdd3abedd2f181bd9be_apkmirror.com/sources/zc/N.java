package zc;

import kv.InterfaceC15323a;
import tc.InterfaceC17078b;

/* loaded from: classes4.dex */
public final class N implements InterfaceC17078b<M> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f171737a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f171738b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<AbstractC18423e> f171739c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<W> f171740d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<String> f171741e;

    public static N a(InterfaceC15323a<Bc.a> interfaceC15323a, InterfaceC15323a<Bc.a> interfaceC15323a2, InterfaceC15323a<AbstractC18423e> interfaceC15323a3, InterfaceC15323a<W> interfaceC15323a4, InterfaceC15323a<String> interfaceC15323a5) {
        return new N(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5);
    }

    public static M c(Bc.a aVar, Bc.a aVar2, Object obj, Object obj2, InterfaceC15323a<String> interfaceC15323a) {
        return new M(aVar, aVar2, (AbstractC18423e) obj, (W) obj2, interfaceC15323a);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c(this.f171737a.get(), this.f171738b.get(), this.f171739c.get(), this.f171740d.get(), this.f171741e);
    }

    public N(InterfaceC15323a<Bc.a> interfaceC15323a, InterfaceC15323a<Bc.a> interfaceC15323a2, InterfaceC15323a<AbstractC18423e> interfaceC15323a3, InterfaceC15323a<W> interfaceC15323a4, InterfaceC15323a<String> interfaceC15323a5) {
        this.f171737a = interfaceC15323a;
        this.f171738b = interfaceC15323a2;
        this.f171739c = interfaceC15323a3;
        this.f171740d = interfaceC15323a4;
        this.f171741e = interfaceC15323a5;
    }
}
