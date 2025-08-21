package jg;

import gv.InterfaceC14411a;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class O implements InterfaceC15490b<N> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<X> f140475a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Z> f140476b;

    public static O a(InterfaceC14411a<X> interfaceC14411a, InterfaceC14411a<Z> interfaceC14411a2) {
        return new O(interfaceC14411a, interfaceC14411a2);
    }

    public static N c(X x10, Z z10) {
        return new N(x10, z10);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public N get() {
        return c(this.f140475a.get(), this.f140476b.get());
    }

    public O(InterfaceC14411a<X> interfaceC14411a, InterfaceC14411a<Z> interfaceC14411a2) {
        this.f140475a = interfaceC14411a;
        this.f140476b = interfaceC14411a2;
    }
}
