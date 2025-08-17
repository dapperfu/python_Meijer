package com.scandit.datacapture.tools.internal.module.mapmaker;

/* loaded from: classes11.dex */
public final class D implements InterfaceC13407n {

    /* renamed from: a, reason: collision with root package name */
    public static final D f126208a = new D();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, InterfaceC13406m interfaceC13406m, InterfaceC13406m interfaceC13406m2) {
        F f10 = (F) rVar;
        E e10 = (E) interfaceC13406m;
        E e11 = (E) interfaceC13406m2;
        if (e10.get() == 0) {
            return null;
        }
        E e12 = new E(f10.f126210h, e10.get(), e10.f126240a, e11);
        e12.f126209c = e10.f126209c;
        return e12;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, Object obj, int i10, InterfaceC13406m interfaceC13406m) {
        return new E(((F) rVar).f126210h, obj, i10, (E) interfaceC13406m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final void a(r rVar, InterfaceC13406m interfaceC13406m, Object obj) {
        ((E) interfaceC13406m).f126209c = obj;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final u a() {
        return u.f126259a;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final r a(N n10, int i10) {
        return new F(n10, i10);
    }
}
