package zc;

import Ac.x;
import Bc.InterfaceC2922d;
import android.content.Context;
import gv.InterfaceC14411a;
import vc.C17655d;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class i implements InterfaceC17653b<x> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Context> f172700a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC2922d> f172701b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<Ac.f> f172702c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f172703d;

    public static i a(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<InterfaceC2922d> interfaceC14411a2, InterfaceC14411a<Ac.f> interfaceC14411a3, InterfaceC14411a<Dc.a> interfaceC14411a4) {
        return new i(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f172700a.get(), this.f172701b.get(), this.f172702c.get(), this.f172703d.get());
    }

    public i(InterfaceC14411a<Context> interfaceC14411a, InterfaceC14411a<InterfaceC2922d> interfaceC14411a2, InterfaceC14411a<Ac.f> interfaceC14411a3, InterfaceC14411a<Dc.a> interfaceC14411a4) {
        this.f172700a = interfaceC14411a;
        this.f172701b = interfaceC14411a2;
        this.f172702c = interfaceC14411a3;
        this.f172703d = interfaceC14411a4;
    }

    public static x c(Context context, InterfaceC2922d interfaceC2922d, Ac.f fVar, Dc.a aVar) {
        return (x) C17655d.d(h.a(context, interfaceC2922d, fVar, aVar));
    }
}
