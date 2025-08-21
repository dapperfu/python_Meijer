package zc;

import Ac.x;
import Bc.InterfaceC2922d;
import gv.InterfaceC14411a;
import java.util.concurrent.Executor;
import uc.InterfaceC17372e;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class d implements InterfaceC17653b<C18469c> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Executor> f172694a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC17372e> f172695b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<x> f172696c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC2922d> f172697d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<Cc.a> f172698e;

    public static d a(InterfaceC14411a<Executor> interfaceC14411a, InterfaceC14411a<InterfaceC17372e> interfaceC14411a2, InterfaceC14411a<x> interfaceC14411a3, InterfaceC14411a<InterfaceC2922d> interfaceC14411a4, InterfaceC14411a<Cc.a> interfaceC14411a5) {
        return new d(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5);
    }

    public static C18469c c(Executor executor, InterfaceC17372e interfaceC17372e, x xVar, InterfaceC2922d interfaceC2922d, Cc.a aVar) {
        return new C18469c(executor, interfaceC17372e, xVar, interfaceC2922d, aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C18469c get() {
        return c(this.f172694a.get(), this.f172695b.get(), this.f172696c.get(), this.f172697d.get(), this.f172698e.get());
    }

    public d(InterfaceC14411a<Executor> interfaceC14411a, InterfaceC14411a<InterfaceC17372e> interfaceC14411a2, InterfaceC14411a<x> interfaceC14411a3, InterfaceC14411a<InterfaceC2922d> interfaceC14411a4, InterfaceC14411a<Cc.a> interfaceC14411a5) {
        this.f172694a = interfaceC14411a;
        this.f172695b = interfaceC14411a2;
        this.f172696c = interfaceC14411a3;
        this.f172697d = interfaceC14411a4;
        this.f172698e = interfaceC14411a5;
    }
}
