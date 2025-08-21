package Bc;

import gv.InterfaceC14411a;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class N implements InterfaceC17653b<M> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f2651a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f2652b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<AbstractC2923e> f2653c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<W> f2654d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<String> f2655e;

    public static N a(InterfaceC14411a<Dc.a> interfaceC14411a, InterfaceC14411a<Dc.a> interfaceC14411a2, InterfaceC14411a<AbstractC2923e> interfaceC14411a3, InterfaceC14411a<W> interfaceC14411a4, InterfaceC14411a<String> interfaceC14411a5) {
        return new N(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5);
    }

    public static M c(Dc.a aVar, Dc.a aVar2, Object obj, Object obj2, InterfaceC14411a<String> interfaceC14411a) {
        return new M(aVar, aVar2, (AbstractC2923e) obj, (W) obj2, interfaceC14411a);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c(this.f2651a.get(), this.f2652b.get(), this.f2653c.get(), this.f2654d.get(), this.f2655e);
    }

    public N(InterfaceC14411a<Dc.a> interfaceC14411a, InterfaceC14411a<Dc.a> interfaceC14411a2, InterfaceC14411a<AbstractC2923e> interfaceC14411a3, InterfaceC14411a<W> interfaceC14411a4, InterfaceC14411a<String> interfaceC14411a5) {
        this.f2651a = interfaceC14411a;
        this.f2652b = interfaceC14411a2;
        this.f2653c = interfaceC14411a3;
        this.f2654d = interfaceC14411a4;
        this.f2655e = interfaceC14411a5;
    }
}
