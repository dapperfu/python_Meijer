package jg;

import gv.InterfaceC14411a;
import kotlin.coroutines.CoroutineContext;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class M implements InterfaceC15490b<L> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<com.google.firebase.f> f140468a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Lf.e> f140469b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<mg.j> f140470c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC15014h> f140471d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<CoroutineContext> f140472e;

    public static M a(InterfaceC14411a<com.google.firebase.f> interfaceC14411a, InterfaceC14411a<Lf.e> interfaceC14411a2, InterfaceC14411a<mg.j> interfaceC14411a3, InterfaceC14411a<InterfaceC15014h> interfaceC14411a4, InterfaceC14411a<CoroutineContext> interfaceC14411a5) {
        return new M(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5);
    }

    public static L c(com.google.firebase.f fVar, Lf.e eVar, mg.j jVar, InterfaceC15014h interfaceC15014h, CoroutineContext coroutineContext) {
        return new L(fVar, eVar, jVar, interfaceC15014h, coroutineContext);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public L get() {
        return c(this.f140468a.get(), this.f140469b.get(), this.f140470c.get(), this.f140471d.get(), this.f140472e.get());
    }

    public M(InterfaceC14411a<com.google.firebase.f> interfaceC14411a, InterfaceC14411a<Lf.e> interfaceC14411a2, InterfaceC14411a<mg.j> interfaceC14411a3, InterfaceC14411a<InterfaceC15014h> interfaceC14411a4, InterfaceC14411a<CoroutineContext> interfaceC14411a5) {
        this.f140468a = interfaceC14411a;
        this.f140469b = interfaceC14411a2;
        this.f140470c = interfaceC14411a3;
        this.f140471d = interfaceC14411a4;
        this.f140472e = interfaceC14411a5;
    }
}
