package yc;

import java.util.concurrent.Executor;
import kv.InterfaceC15323a;
import tc.InterfaceC17078b;
import zc.InterfaceC18422d;

/* loaded from: classes4.dex */
public final class w implements InterfaceC17078b<v> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Executor> f170452a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC18422d> f170453b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<x> f170454c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<Ac.a> f170455d;

    public static w a(InterfaceC15323a<Executor> interfaceC15323a, InterfaceC15323a<InterfaceC18422d> interfaceC15323a2, InterfaceC15323a<x> interfaceC15323a3, InterfaceC15323a<Ac.a> interfaceC15323a4) {
        return new w(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4);
    }

    public static v c(Executor executor, InterfaceC18422d interfaceC18422d, x xVar, Ac.a aVar) {
        return new v(executor, interfaceC18422d, xVar, aVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f170452a.get(), this.f170453b.get(), this.f170454c.get(), this.f170455d.get());
    }

    public w(InterfaceC15323a<Executor> interfaceC15323a, InterfaceC15323a<InterfaceC18422d> interfaceC15323a2, InterfaceC15323a<x> interfaceC15323a3, InterfaceC15323a<Ac.a> interfaceC15323a4) {
        this.f170452a = interfaceC15323a;
        this.f170453b = interfaceC15323a2;
        this.f170454c = interfaceC15323a3;
        this.f170455d = interfaceC15323a4;
    }
}
