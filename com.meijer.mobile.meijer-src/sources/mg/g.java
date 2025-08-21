package mg;

import gv.InterfaceC14411a;
import jg.ApplicationInfo;
import jg.X;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class g implements InterfaceC15490b<C15716d> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<X> f151029a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<Lf.e> f151030b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC14411a<ApplicationInfo> f151031c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC14411a<InterfaceC15713a> f151032d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<l> f151033e;

    public static g a(InterfaceC14411a<X> interfaceC14411a, InterfaceC14411a<Lf.e> interfaceC14411a2, InterfaceC14411a<ApplicationInfo> interfaceC14411a3, InterfaceC14411a<InterfaceC15713a> interfaceC14411a4, InterfaceC14411a<l> interfaceC14411a5) {
        return new g(interfaceC14411a, interfaceC14411a2, interfaceC14411a3, interfaceC14411a4, interfaceC14411a5);
    }

    public static C15716d c(X x10, Lf.e eVar, ApplicationInfo applicationInfo, InterfaceC15713a interfaceC15713a, l lVar) {
        return new C15716d(x10, eVar, applicationInfo, interfaceC15713a, lVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15716d get() {
        return c(this.f151029a.get(), this.f151030b.get(), this.f151031c.get(), this.f151032d.get(), this.f151033e.get());
    }

    public g(InterfaceC14411a<X> interfaceC14411a, InterfaceC14411a<Lf.e> interfaceC14411a2, InterfaceC14411a<ApplicationInfo> interfaceC14411a3, InterfaceC14411a<InterfaceC15713a> interfaceC14411a4, InterfaceC14411a<l> interfaceC14411a5) {
        this.f151029a = interfaceC14411a;
        this.f151030b = interfaceC14411a2;
        this.f151031c = interfaceC14411a3;
        this.f151032d = interfaceC14411a4;
        this.f151033e = interfaceC14411a5;
    }
}
