package jg;

import gv.InterfaceC14411a;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class G implements InterfaceC15490b<F> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<N> f140437a;

    public static G a(InterfaceC14411a<N> interfaceC14411a) {
        return new G(interfaceC14411a);
    }

    public static F c(N n10) {
        return new F(n10);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public F get() {
        return c(this.f140437a.get());
    }

    public G(InterfaceC14411a<N> interfaceC14411a) {
        this.f140437a = interfaceC14411a;
    }
}
