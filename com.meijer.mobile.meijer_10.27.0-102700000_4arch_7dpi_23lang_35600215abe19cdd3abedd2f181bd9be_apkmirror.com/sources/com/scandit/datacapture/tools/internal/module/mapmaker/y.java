package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes11.dex */
public final class y implements InterfaceC13407n {

    /* renamed from: a, reason: collision with root package name */
    public static final y f126264a = new y();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, InterfaceC13406m interfaceC13406m, InterfaceC13406m interfaceC13406m2) {
        A a10 = (A) rVar;
        z zVar = (z) interfaceC13406m;
        z zVar2 = (z) interfaceC13406m2;
        int i10 = r.f126252g;
        if (zVar.getValue() == null) {
            return null;
        }
        ReferenceQueue referenceQueue = a10.f126206h;
        z zVar3 = new z(zVar.f126237a, zVar.f126238b, zVar2);
        zVar3.f126265d = zVar.f126265d.a(referenceQueue, zVar3);
        return zVar3;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, Object obj, int i10, InterfaceC13406m interfaceC13406m) {
        return new z(obj, i10, (z) interfaceC13406m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final void a(r rVar, InterfaceC13406m interfaceC13406m, Object obj) {
        z zVar = (z) interfaceC13406m;
        ReferenceQueue referenceQueue = ((A) rVar).f126206h;
        K k10 = zVar.f126265d;
        zVar.f126265d = new L(referenceQueue, obj, zVar);
        k10.clear();
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final u a() {
        return u.f126260b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final r a(N n10, int i10) {
        return new A(n10, i10);
    }
}
