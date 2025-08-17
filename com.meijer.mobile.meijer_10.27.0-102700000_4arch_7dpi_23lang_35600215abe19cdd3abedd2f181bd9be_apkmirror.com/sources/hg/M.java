package hg;

import jg.InterfaceC14891b;
import kotlin.coroutines.CoroutineContext;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class M implements InterfaceC14891b<L> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<com.google.firebase.f> f134773a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Jf.e> f134774b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<kg.j> f134775c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC14436h> f134776d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<CoroutineContext> f134777e;

    public static M a(InterfaceC15323a<com.google.firebase.f> interfaceC15323a, InterfaceC15323a<Jf.e> interfaceC15323a2, InterfaceC15323a<kg.j> interfaceC15323a3, InterfaceC15323a<InterfaceC14436h> interfaceC15323a4, InterfaceC15323a<CoroutineContext> interfaceC15323a5) {
        return new M(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5);
    }

    public static L c(com.google.firebase.f fVar, Jf.e eVar, kg.j jVar, InterfaceC14436h interfaceC14436h, CoroutineContext coroutineContext) {
        return new L(fVar, eVar, jVar, interfaceC14436h, coroutineContext);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public L get() {
        return c(this.f134773a.get(), this.f134774b.get(), this.f134775c.get(), this.f134776d.get(), this.f134777e.get());
    }

    public M(InterfaceC15323a<com.google.firebase.f> interfaceC15323a, InterfaceC15323a<Jf.e> interfaceC15323a2, InterfaceC15323a<kg.j> interfaceC15323a3, InterfaceC15323a<InterfaceC14436h> interfaceC15323a4, InterfaceC15323a<CoroutineContext> interfaceC15323a5) {
        this.f134773a = interfaceC15323a;
        this.f134774b = interfaceC15323a2;
        this.f134775c = interfaceC15323a3;
        this.f134776d = interfaceC15323a4;
        this.f134777e = interfaceC15323a5;
    }
}
