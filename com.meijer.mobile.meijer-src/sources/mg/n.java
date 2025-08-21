package mg;

import B2.InterfaceC2911h;
import gv.InterfaceC14411a;
import jg.X;
import kotlin.coroutines.CoroutineContext;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class n implements InterfaceC15490b<m> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<CoroutineContext> f151065a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<X> f151066b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC2911h<SessionConfigs>> f151067c;

    public static n a(InterfaceC14411a<CoroutineContext> interfaceC14411a, InterfaceC14411a<X> interfaceC14411a2, InterfaceC14411a<InterfaceC2911h<SessionConfigs>> interfaceC14411a3) {
        return new n(interfaceC14411a, interfaceC14411a2, interfaceC14411a3);
    }

    public static m c(CoroutineContext coroutineContext, X x10, InterfaceC2911h<SessionConfigs> interfaceC2911h) {
        return new m(coroutineContext, x10, interfaceC2911h);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c(this.f151065a.get(), this.f151066b.get(), this.f151067c.get());
    }

    public n(InterfaceC14411a<CoroutineContext> interfaceC14411a, InterfaceC14411a<X> interfaceC14411a2, InterfaceC14411a<InterfaceC2911h<SessionConfigs>> interfaceC14411a3) {
        this.f151065a = interfaceC14411a;
        this.f151066b = interfaceC14411a2;
        this.f151067c = interfaceC14411a3;
    }
}
