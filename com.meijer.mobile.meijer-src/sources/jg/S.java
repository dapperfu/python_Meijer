package jg;

import gv.InterfaceC14411a;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class S implements InterfaceC15490b<Q> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<T> f140486a;

    public static S a(InterfaceC14411a<T> interfaceC14411a) {
        return new S(interfaceC14411a);
    }

    public static Q c(T t10) {
        return new Q(t10);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Q get() {
        return c(this.f140486a.get());
    }

    public S(InterfaceC14411a<T> interfaceC14411a) {
        this.f140486a = interfaceC14411a;
    }
}
