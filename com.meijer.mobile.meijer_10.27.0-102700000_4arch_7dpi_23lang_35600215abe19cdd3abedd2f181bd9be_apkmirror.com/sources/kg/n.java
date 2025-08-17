package kg;

import B2.InterfaceC2943h;
import hg.X;
import jg.InterfaceC14891b;
import kotlin.coroutines.CoroutineContext;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class n implements InterfaceC14891b<m> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<CoroutineContext> f141919a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<X> f141920b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC2943h<SessionConfigs>> f141921c;

    public static n a(InterfaceC15323a<CoroutineContext> interfaceC15323a, InterfaceC15323a<X> interfaceC15323a2, InterfaceC15323a<InterfaceC2943h<SessionConfigs>> interfaceC15323a3) {
        return new n(interfaceC15323a, interfaceC15323a2, interfaceC15323a3);
    }

    public static m c(CoroutineContext coroutineContext, X x10, InterfaceC2943h<SessionConfigs> interfaceC2943h) {
        return new m(coroutineContext, x10, interfaceC2943h);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f141919a.get(), this.f141920b.get(), this.f141921c.get());
    }

    public n(InterfaceC15323a<CoroutineContext> interfaceC15323a, InterfaceC15323a<X> interfaceC15323a2, InterfaceC15323a<InterfaceC2943h<SessionConfigs>> interfaceC15323a3) {
        this.f141919a = interfaceC15323a;
        this.f141920b = interfaceC15323a2;
        this.f141921c = interfaceC15323a3;
    }
}
