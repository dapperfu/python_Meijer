package com.scandit.datacapture.tools.internal.module.mapmaker;

/* loaded from: classes12.dex */
public final class D implements InterfaceC13540n {

    /* renamed from: a, reason: collision with root package name */
    public static final D f127160a = new D();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, InterfaceC13539m interfaceC13539m, InterfaceC13539m interfaceC13539m2) {
        F f10 = (F) rVar;
        E e10 = (E) interfaceC13539m;
        E e11 = (E) interfaceC13539m2;
        if (e10.get() == 0) {
            return null;
        }
        E e12 = new E(f10.f127162h, e10.get(), e10.f127192a, e11);
        e12.f127161c = e10.f127161c;
        return e12;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, Object obj, int i10, InterfaceC13539m interfaceC13539m) {
        return new E(((F) rVar).f127162h, obj, i10, (E) interfaceC13539m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final void a(r rVar, InterfaceC13539m interfaceC13539m, Object obj) {
        ((E) interfaceC13539m).f127161c = obj;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final u a() {
        return u.f127211a;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final r a(N n10, int i10) {
        return new F(n10, i10);
    }
}
