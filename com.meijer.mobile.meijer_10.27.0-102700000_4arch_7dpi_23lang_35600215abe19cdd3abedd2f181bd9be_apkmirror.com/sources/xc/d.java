package xc;

import java.util.concurrent.Executor;
import kv.InterfaceC15323a;
import sc.InterfaceC16925e;
import tc.InterfaceC17078b;
import yc.x;
import zc.InterfaceC18422d;

/* loaded from: classes4.dex */
public final class d implements InterfaceC17078b<C18032c> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Executor> f169545a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC16925e> f169546b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<x> f169547c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC18422d> f169548d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<Ac.a> f169549e;

    public static d a(InterfaceC15323a<Executor> interfaceC15323a, InterfaceC15323a<InterfaceC16925e> interfaceC15323a2, InterfaceC15323a<x> interfaceC15323a3, InterfaceC15323a<InterfaceC18422d> interfaceC15323a4, InterfaceC15323a<Ac.a> interfaceC15323a5) {
        return new d(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5);
    }

    public static C18032c c(Executor executor, InterfaceC16925e interfaceC16925e, x xVar, InterfaceC18422d interfaceC18422d, Ac.a aVar) {
        return new C18032c(executor, interfaceC16925e, xVar, interfaceC18422d, aVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C18032c get() {
        return c(this.f169545a.get(), this.f169546b.get(), this.f169547c.get(), this.f169548d.get(), this.f169549e.get());
    }

    public d(InterfaceC15323a<Executor> interfaceC15323a, InterfaceC15323a<InterfaceC16925e> interfaceC15323a2, InterfaceC15323a<x> interfaceC15323a3, InterfaceC15323a<InterfaceC18422d> interfaceC15323a4, InterfaceC15323a<Ac.a> interfaceC15323a5) {
        this.f169545a = interfaceC15323a;
        this.f169546b = interfaceC15323a2;
        this.f169547c = interfaceC15323a3;
        this.f169548d = interfaceC15323a4;
        this.f169549e = interfaceC15323a5;
    }
}
