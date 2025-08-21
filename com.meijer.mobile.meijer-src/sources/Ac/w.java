package Ac;

import Bc.InterfaceC2922d;
import gv.InterfaceC14411a;
import java.util.concurrent.Executor;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class w implements InterfaceC17653b<v> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Executor> f301a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC2922d> f302b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<x> f303c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<Cc.a> f304d;

    public static w a(InterfaceC14411a<Executor> interfaceC14411a, InterfaceC14411a<InterfaceC2922d> interfaceC14411a2, InterfaceC14411a<x> interfaceC14411a3, InterfaceC14411a<Cc.a> interfaceC14411a4) {
        return new w(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4);
    }

    public static v c(Executor executor, InterfaceC2922d interfaceC2922d, x xVar, Cc.a aVar) {
        return new v(executor, interfaceC2922d, xVar, aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f301a.get(), this.f302b.get(), this.f303c.get(), this.f304d.get());
    }

    public w(InterfaceC14411a<Executor> interfaceC14411a, InterfaceC14411a<InterfaceC2922d> interfaceC14411a2, InterfaceC14411a<x> interfaceC14411a3, InterfaceC14411a<Cc.a> interfaceC14411a4) {
        this.f301a = interfaceC14411a;
        this.f302b = interfaceC14411a2;
        this.f303c = interfaceC14411a3;
        this.f304d = interfaceC14411a4;
    }
}
