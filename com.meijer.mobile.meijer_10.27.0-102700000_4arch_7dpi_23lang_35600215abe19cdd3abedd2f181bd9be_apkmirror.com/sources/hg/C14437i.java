package hg;

import jg.InterfaceC14891b;
import kv.InterfaceC15323a;
import pc.InterfaceC16286j;

/* renamed from: hg.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14437i implements InterfaceC14891b<C14435g> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<If.b<InterfaceC16286j>> f134908a;

    public static C14437i a(InterfaceC15323a<If.b<InterfaceC16286j>> interfaceC15323a) {
        return new C14437i(interfaceC15323a);
    }

    public static C14435g c(If.b<InterfaceC16286j> bVar) {
        return new C14435g(bVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C14435g get() {
        return c(this.f134908a.get());
    }

    public C14437i(InterfaceC15323a<If.b<InterfaceC16286j>> interfaceC15323a) {
        this.f134908a = interfaceC15323a;
    }
}
