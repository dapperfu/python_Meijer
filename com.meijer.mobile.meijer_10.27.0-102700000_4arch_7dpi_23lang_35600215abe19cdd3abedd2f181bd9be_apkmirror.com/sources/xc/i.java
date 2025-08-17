package xc;

import android.content.Context;
import kv.InterfaceC15323a;
import tc.C17080d;
import tc.InterfaceC17078b;
import yc.x;
import zc.InterfaceC18422d;

/* loaded from: classes4.dex */
public final class i implements InterfaceC17078b<x> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Context> f169551a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC18422d> f169552b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<yc.f> f169553c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f169554d;

    public static i a(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<InterfaceC18422d> interfaceC15323a2, InterfaceC15323a<yc.f> interfaceC15323a3, InterfaceC15323a<Bc.a> interfaceC15323a4) {
        return new i(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f169551a.get(), this.f169552b.get(), this.f169553c.get(), this.f169554d.get());
    }

    public i(InterfaceC15323a<Context> interfaceC15323a, InterfaceC15323a<InterfaceC18422d> interfaceC15323a2, InterfaceC15323a<yc.f> interfaceC15323a3, InterfaceC15323a<Bc.a> interfaceC15323a4) {
        this.f169551a = interfaceC15323a;
        this.f169552b = interfaceC15323a2;
        this.f169553c = interfaceC15323a3;
        this.f169554d = interfaceC15323a4;
    }

    public static x c(Context context, InterfaceC18422d interfaceC18422d, yc.f fVar, Bc.a aVar) {
        return (x) C17080d.d(h.a(context, interfaceC18422d, fVar, aVar));
    }
}
