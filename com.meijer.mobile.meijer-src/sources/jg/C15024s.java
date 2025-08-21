package jg;

import gv.InterfaceC14411a;
import kotlin.coroutines.CoroutineContext;
import lg.InterfaceC15490b;

/* renamed from: jg.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15024s implements InterfaceC15490b<C15018l> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<com.google.firebase.f> f140619a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<mg.j> f140620b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<CoroutineContext> f140621c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<Q> f140622d;

    public static C15024s a(InterfaceC14411a<com.google.firebase.f> interfaceC14411a, InterfaceC14411a<mg.j> interfaceC14411a2, InterfaceC14411a<CoroutineContext> interfaceC14411a3, InterfaceC14411a<Q> interfaceC14411a4) {
        return new C15024s(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4);
    }

    public static C15018l c(com.google.firebase.f fVar, mg.j jVar, CoroutineContext coroutineContext, Q q10) {
        return new C15018l(fVar, jVar, coroutineContext, q10);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15018l get() {
        return c(this.f140619a.get(), this.f140620b.get(), this.f140621c.get(), this.f140622d.get());
    }

    public C15024s(InterfaceC14411a<com.google.firebase.f> interfaceC14411a, InterfaceC14411a<mg.j> interfaceC14411a2, InterfaceC14411a<CoroutineContext> interfaceC14411a3, InterfaceC14411a<Q> interfaceC14411a4) {
        this.f140619a = interfaceC14411a;
        this.f140620b = interfaceC14411a2;
        this.f140621c = interfaceC14411a3;
        this.f140622d = interfaceC14411a4;
    }
}
