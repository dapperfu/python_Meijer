package com.scandit.datacapture.tools.internal.module.mapmaker;

/* loaded from: classes11.dex */
public final class v implements InterfaceC13407n {

    /* renamed from: a, reason: collision with root package name */
    public static final v f126262a = new v();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, InterfaceC13406m interfaceC13406m, InterfaceC13406m interfaceC13406m2) {
        w wVar = (w) interfaceC13406m;
        w wVar2 = new w(wVar.f126237a, wVar.f126238b, (w) interfaceC13406m2);
        wVar2.f126263d = wVar.f126263d;
        return wVar2;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, Object obj, int i10, InterfaceC13406m interfaceC13406m) {
        return new w(obj, i10, (w) interfaceC13406m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final void a(r rVar, InterfaceC13406m interfaceC13406m, Object obj) {
        ((w) interfaceC13406m).f126263d = obj;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final u a() {
        return u.f126259a;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final r a(N n10, int i10) {
        return new x(n10, i10);
    }
}
