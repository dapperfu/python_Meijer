package hg;

import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class G implements InterfaceC14891b<F> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<N> f134742a;

    public static G a(InterfaceC15323a<N> interfaceC15323a) {
        return new G(interfaceC15323a);
    }

    public static F c(N n10) {
        return new F(n10);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public F get() {
        return c(this.f134742a.get());
    }

    public G(InterfaceC15323a<N> interfaceC15323a) {
        this.f134742a = interfaceC15323a;
    }
}
