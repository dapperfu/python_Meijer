package kg;

import hg.ApplicationInfo;
import hg.X;
import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class g implements InterfaceC14891b<C15145d> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<X> f141883a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<Jf.e> f141884b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC15323a<ApplicationInfo> f141885c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC15323a<InterfaceC15142a> f141886d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<l> f141887e;

    public static g a(InterfaceC15323a<X> interfaceC15323a, InterfaceC15323a<Jf.e> interfaceC15323a2, InterfaceC15323a<ApplicationInfo> interfaceC15323a3, InterfaceC15323a<InterfaceC15142a> interfaceC15323a4, InterfaceC15323a<l> interfaceC15323a5) {
        return new g(interfaceC15323a, interfaceC15323a2, interfaceC15323a3, interfaceC15323a4, interfaceC15323a5);
    }

    public static C15145d c(X x10, Jf.e eVar, ApplicationInfo applicationInfo, InterfaceC15142a interfaceC15142a, l lVar) {
        return new C15145d(x10, eVar, applicationInfo, interfaceC15142a, lVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C15145d get() {
        return c(this.f141883a.get(), this.f141884b.get(), this.f141885c.get(), this.f141886d.get(), this.f141887e.get());
    }

    public g(InterfaceC15323a<X> interfaceC15323a, InterfaceC15323a<Jf.e> interfaceC15323a2, InterfaceC15323a<ApplicationInfo> interfaceC15323a3, InterfaceC15323a<InterfaceC15142a> interfaceC15323a4, InterfaceC15323a<l> interfaceC15323a5) {
        this.f141883a = interfaceC15323a;
        this.f141884b = interfaceC15323a2;
        this.f141885c = interfaceC15323a3;
        this.f141886d = interfaceC15323a4;
        this.f141887e = interfaceC15323a5;
    }
}
