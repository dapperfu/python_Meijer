package hg;

import B2.InterfaceC2943h;
import jg.InterfaceC14891b;
import kotlin.coroutines.CoroutineContext;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class V implements InterfaceC14891b<U> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<kg.j> f134832a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<N> f134833b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<K> f134834c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<X> f134835d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC2943h<SessionData>> f134836e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC14450w> f134837f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC15323a<CoroutineContext> f134838g;

    public static V a(InterfaceC15323a<kg.j> interfaceC15323a, InterfaceC15323a<N> interfaceC15323a2, InterfaceC15323a<K> interfaceC15323a3, InterfaceC15323a<X> interfaceC15323a4, InterfaceC15323a<InterfaceC2943h<SessionData>> interfaceC15323a5, InterfaceC15323a<InterfaceC14450w> interfaceC15323a6, InterfaceC15323a<CoroutineContext> interfaceC15323a7) {
        return new V(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5, interfaceC15323a6, interfaceC15323a7);
    }

    public static U c(kg.j jVar, N n10, K k10, X x10, InterfaceC2943h<SessionData> interfaceC2943h, InterfaceC14450w interfaceC14450w, CoroutineContext coroutineContext) {
        return new U(jVar, n10, k10, x10, interfaceC2943h, interfaceC14450w, coroutineContext);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public U get() {
        return c(this.f134832a.get(), this.f134833b.get(), this.f134834c.get(), this.f134835d.get(), this.f134836e.get(), this.f134837f.get(), this.f134838g.get());
    }

    public V(InterfaceC15323a<kg.j> interfaceC15323a, InterfaceC15323a<N> interfaceC15323a2, InterfaceC15323a<K> interfaceC15323a3, InterfaceC15323a<X> interfaceC15323a4, InterfaceC15323a<InterfaceC2943h<SessionData>> interfaceC15323a5, InterfaceC15323a<InterfaceC14450w> interfaceC15323a6, InterfaceC15323a<CoroutineContext> interfaceC15323a7) {
        this.f134832a = interfaceC15323a;
        this.f134833b = interfaceC15323a2;
        this.f134834c = interfaceC15323a3;
        this.f134835d = interfaceC15323a4;
        this.f134836e = interfaceC15323a5;
        this.f134837f = interfaceC15323a6;
        this.f134838g = interfaceC15323a7;
    }
}
