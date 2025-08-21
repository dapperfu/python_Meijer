package jg;

import B2.InterfaceC2911h;
import gv.InterfaceC14411a;
import kotlin.coroutines.CoroutineContext;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class V implements InterfaceC15490b<U> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<mg.j> f140527a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<N> f140528b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<K> f140529c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<X> f140530d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC2911h<SessionData>> f140531e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC15028w> f140532f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14411a<CoroutineContext> f140533g;

    public static V a(InterfaceC14411a<mg.j> interfaceC14411a, InterfaceC14411a<N> interfaceC14411a2, InterfaceC14411a<K> interfaceC14411a3, InterfaceC14411a<X> interfaceC14411a4, InterfaceC14411a<InterfaceC2911h<SessionData>> interfaceC14411a5, InterfaceC14411a<InterfaceC15028w> interfaceC14411a6, InterfaceC14411a<CoroutineContext> interfaceC14411a7) {
        return new V(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5, interfaceC14411a6, interfaceC14411a7);
    }

    public static U c(mg.j jVar, N n10, K k10, X x10, InterfaceC2911h<SessionData> interfaceC2911h, InterfaceC15028w interfaceC15028w, CoroutineContext coroutineContext) {
        return new U(jVar, n10, k10, x10, interfaceC2911h, interfaceC15028w, coroutineContext);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c(this.f140527a.get(), this.f140528b.get(), this.f140529c.get(), this.f140530d.get(), this.f140531e.get(), this.f140532f.get(), this.f140533g.get());
    }

    public V(InterfaceC14411a<mg.j> interfaceC14411a, InterfaceC14411a<N> interfaceC14411a2, InterfaceC14411a<K> interfaceC14411a3, InterfaceC14411a<X> interfaceC14411a4, InterfaceC14411a<InterfaceC2911h<SessionData>> interfaceC14411a5, InterfaceC14411a<InterfaceC15028w> interfaceC14411a6, InterfaceC14411a<CoroutineContext> interfaceC14411a7) {
        this.f140527a = interfaceC14411a;
        this.f140528b = interfaceC14411a2;
        this.f140529c = interfaceC14411a3;
        this.f140530d = interfaceC14411a4;
        this.f140531e = interfaceC14411a5;
        this.f140532f = interfaceC14411a6;
        this.f140533g = interfaceC14411a7;
    }
}
