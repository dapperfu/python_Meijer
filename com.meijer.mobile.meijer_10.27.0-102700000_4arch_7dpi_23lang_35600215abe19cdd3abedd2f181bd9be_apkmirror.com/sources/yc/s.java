package yc;

import android.content.Context;
import java.util.concurrent.Executor;
import kv.InterfaceC15323a;
import sc.InterfaceC16925e;
import tc.InterfaceC17078b;
import zc.InterfaceC18421c;
import zc.InterfaceC18422d;

/* loaded from: classes4.dex */
public final class s implements InterfaceC17078b<r> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f170437a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC16925e> f170438b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC18422d> f170439c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<x> f170440d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<Executor> f170441e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC15323a<Ac.a> f170442f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f170443g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f170444h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC18421c> f170445i;

    public static s a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<InterfaceC16925e> interfaceC15323a2, InterfaceC15323a<InterfaceC18422d> interfaceC15323a3, InterfaceC15323a<x> interfaceC15323a4, InterfaceC15323a<Executor> interfaceC15323a5, InterfaceC15323a<Ac.a> interfaceC15323a6, InterfaceC15323a<Bc.a> interfaceC15323a7, InterfaceC15323a<Bc.a> interfaceC15323a8, InterfaceC15323a<InterfaceC18421c> interfaceC15323a9) {
        return new s(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5, interfaceC15323a6, interfaceC15323a7, interfaceC15323a8, interfaceC15323a9);
    }

    public static r c(Context context, InterfaceC16925e interfaceC16925e, InterfaceC18422d interfaceC18422d, x xVar, Executor executor, Ac.a aVar, Bc.a aVar2, Bc.a aVar3, InterfaceC18421c interfaceC18421c) {
        return new r(context, interfaceC16925e, interfaceC18422d, xVar, executor, aVar, aVar2, aVar3, interfaceC18421c);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f170437a.get(), this.f170438b.get(), this.f170439c.get(), this.f170440d.get(), this.f170441e.get(), this.f170442f.get(), this.f170443g.get(), this.f170444h.get(), this.f170445i.get());
    }

    public s(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<InterfaceC16925e> interfaceC15323a2, InterfaceC15323a<InterfaceC18422d> interfaceC15323a3, InterfaceC15323a<x> interfaceC15323a4, InterfaceC15323a<Executor> interfaceC15323a5, InterfaceC15323a<Ac.a> interfaceC15323a6, InterfaceC15323a<Bc.a> interfaceC15323a7, InterfaceC15323a<Bc.a> interfaceC15323a8, InterfaceC15323a<InterfaceC18421c> interfaceC15323a9) {
        this.f170437a = interfaceC15323a;
        this.f170438b = interfaceC15323a2;
        this.f170439c = interfaceC15323a3;
        this.f170440d = interfaceC15323a4;
        this.f170441e = interfaceC15323a5;
        this.f170442f = interfaceC15323a6;
        this.f170443g = interfaceC15323a7;
        this.f170444h = interfaceC15323a8;
        this.f170445i = interfaceC15323a9;
    }
}
