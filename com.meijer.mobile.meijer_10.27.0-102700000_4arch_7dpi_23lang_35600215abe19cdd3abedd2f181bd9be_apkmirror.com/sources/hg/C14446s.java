package hg;

import jg.InterfaceC14891b;
import kotlin.coroutines.CoroutineContext;
import kv.InterfaceC15323a;

/* renamed from: hg.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14446s implements InterfaceC14891b<C14440l> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<com.google.firebase.f> f134924a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<kg.j> f134925b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<CoroutineContext> f134926c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<Q> f134927d;

    public static C14446s a(InterfaceC15323a<com.google.firebase.f> interfaceC15323a, InterfaceC15323a<kg.j> interfaceC15323a2, InterfaceC15323a<CoroutineContext> interfaceC15323a3, InterfaceC15323a<Q> interfaceC15323a4) {
        return new C14446s(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4);
    }

    public static C14440l c(com.google.firebase.f fVar, kg.j jVar, CoroutineContext coroutineContext, Q q10) {
        return new C14440l(fVar, jVar, coroutineContext, q10);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C14440l get() {
        return c(this.f134924a.get(), this.f134925b.get(), this.f134926c.get(), this.f134927d.get());
    }

    public C14446s(InterfaceC15323a<com.google.firebase.f> interfaceC15323a, InterfaceC15323a<kg.j> interfaceC15323a2, InterfaceC15323a<CoroutineContext> interfaceC15323a3, InterfaceC15323a<Q> interfaceC15323a4) {
        this.f134924a = interfaceC15323a;
        this.f134925b = interfaceC15323a2;
        this.f134926c = interfaceC15323a3;
        this.f134927d = interfaceC15323a4;
    }
}
