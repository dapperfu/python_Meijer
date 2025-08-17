package hg;

import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class O implements InterfaceC14891b<N> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<X> f134780a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Z> f134781b;

    public static O a(InterfaceC15323a<X> interfaceC15323a, InterfaceC15323a<Z> interfaceC15323a2) {
        return new O(interfaceC15323a, interfaceC15323a2);
    }

    public static N c(X x10, Z z10) {
        return new N(x10, z10);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public N get() {
        return c(this.f134780a.get(), this.f134781b.get());
    }

    public O(InterfaceC15323a<X> interfaceC15323a, InterfaceC15323a<Z> interfaceC15323a2) {
        this.f134780a = interfaceC15323a;
        this.f134781b = interfaceC15323a2;
    }
}
