package jg;

import gv.InterfaceC14411a;
import lg.InterfaceC15490b;
import rc.InterfaceC16890j;

/* renamed from: jg.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15015i implements InterfaceC15490b<C15013g> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Kf.b<InterfaceC16890j>> f140603a;

    public static C15015i a(InterfaceC14411a<Kf.b<InterfaceC16890j>> interfaceC14411a) {
        return new C15015i(interfaceC14411a);
    }

    public static C15013g c(Kf.b<InterfaceC16890j> bVar) {
        return new C15013g(bVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15013g get() {
        return c(this.f140603a.get());
    }

    public C15015i(InterfaceC14411a<Kf.b<InterfaceC16890j>> interfaceC14411a) {
        this.f140603a = interfaceC14411a;
    }
}
