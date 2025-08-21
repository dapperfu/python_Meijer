package com.scandit.datacapture.tools.internal.module.mapmaker;

/* loaded from: classes12.dex */
public final class v implements InterfaceC13540n {

    /* renamed from: a, reason: collision with root package name */
    public static final v f127214a = new v();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, InterfaceC13539m interfaceC13539m, InterfaceC13539m interfaceC13539m2) {
        w wVar = (w) interfaceC13539m;
        w wVar2 = new w(wVar.f127189a, wVar.f127190b, (w) interfaceC13539m2);
        wVar2.f127215d = wVar.f127215d;
        return wVar2;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, Object obj, int i10, InterfaceC13539m interfaceC13539m) {
        return new w(obj, i10, (w) interfaceC13539m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final void a(r rVar, InterfaceC13539m interfaceC13539m, Object obj) {
        ((w) interfaceC13539m).f127215d = obj;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final u a() {
        return u.f127211a;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final r a(N n10, int i10) {
        return new x(n10, i10);
    }
}
