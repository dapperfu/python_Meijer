package hg;

import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class S implements InterfaceC14891b<Q> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<T> f134791a;

    public static S a(InterfaceC15323a<T> interfaceC15323a) {
        return new S(interfaceC15323a);
    }

    public static Q c(T t10) {
        return new Q(t10);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Q get() {
        return c(this.f134791a.get());
    }

    public S(InterfaceC15323a<T> interfaceC15323a) {
        this.f134791a = interfaceC15323a;
    }
}
