package Ac;

import Bc.InterfaceC2921c;
import Bc.InterfaceC2922d;
import android.content.Context;
import gv.InterfaceC14411a;
import java.util.concurrent.Executor;
import uc.InterfaceC17372e;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class s implements InterfaceC17653b<r> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f286a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC17372e> f287b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC2922d> f288c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<x> f289d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<Executor> f290e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC14411a<Cc.a> f291f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f292g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f293h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC2921c> f294i;

    public static s a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<InterfaceC17372e> interfaceC14411a2, InterfaceC14411a<InterfaceC2922d> interfaceC14411a3, InterfaceC14411a<x> interfaceC14411a4, InterfaceC14411a<Executor> interfaceC14411a5, InterfaceC14411a<Cc.a> interfaceC14411a6, InterfaceC14411a<Dc.a> interfaceC14411a7, InterfaceC14411a<Dc.a> interfaceC14411a8, InterfaceC14411a<InterfaceC2921c> interfaceC14411a9) {
        return new s(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5, interfaceC14411a6, interfaceC14411a7, interfaceC14411a8, interfaceC14411a9);
    }

    public static r c(Context context, InterfaceC17372e interfaceC17372e, InterfaceC2922d interfaceC2922d, x xVar, Executor executor, Cc.a aVar, Dc.a aVar2, Dc.a aVar3, InterfaceC2921c interfaceC2921c) {
        return new r(context, interfaceC17372e, interfaceC2922d, xVar, executor, aVar, aVar2, aVar3, interfaceC2921c);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f286a.get(), this.f287b.get(), this.f288c.get(), this.f289d.get(), this.f290e.get(), this.f291f.get(), this.f292g.get(), this.f293h.get(), this.f294i.get());
    }

    public s(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<InterfaceC17372e> interfaceC14411a2, InterfaceC14411a<InterfaceC2922d> interfaceC14411a3, InterfaceC14411a<x> interfaceC14411a4, InterfaceC14411a<Executor> interfaceC14411a5, InterfaceC14411a<Cc.a> interfaceC14411a6, InterfaceC14411a<Dc.a> interfaceC14411a7, InterfaceC14411a<Dc.a> interfaceC14411a8, InterfaceC14411a<InterfaceC2921c> interfaceC14411a9) {
        this.f286a = interfaceC14411a;
        this.f287b = interfaceC14411a2;
        this.f288c = interfaceC14411a3;
        this.f289d = interfaceC14411a4;
        this.f290e = interfaceC14411a5;
        this.f291f = interfaceC14411a6;
        this.f292g = interfaceC14411a7;
        this.f293h = interfaceC14411a8;
        this.f294i = interfaceC14411a9;
    }
}
