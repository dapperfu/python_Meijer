package zc;

import gv.InterfaceC14411a;
import vc.C17655d;
import vc.InterfaceC17653b;

/* loaded from: classes4.dex */
public final class g implements InterfaceC17653b<Ac.f> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<Dc.a> f172699a;

    public static g b(InterfaceC14411a<Dc.a> interfaceC14411a) {
        return new g(interfaceC14411a);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Ac.f get() {
        return a(this.f172699a.get());
    }

    public g(InterfaceC14411a<Dc.a> interfaceC14411a) {
        this.f172699a = interfaceC14411a;
    }

    public static Ac.f a(Dc.a aVar) {
        return (Ac.f) C17655d.d(f.a(aVar));
    }
}
