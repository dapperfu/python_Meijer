package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes12.dex */
public final class y implements InterfaceC13540n {

    /* renamed from: a, reason: collision with root package name */
    public static final y f127216a = new y();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, InterfaceC13539m interfaceC13539m, InterfaceC13539m interfaceC13539m2) {
        A a10 = (A) rVar;
        z zVar = (z) interfaceC13539m;
        z zVar2 = (z) interfaceC13539m2;
        int i10 = r.f127204g;
        if (zVar.getValue() == null) {
            return null;
        }
        ReferenceQueue referenceQueue = a10.f127158h;
        z zVar3 = new z(zVar.f127189a, zVar.f127190b, zVar2);
        zVar3.f127217d = zVar.f127217d.a(referenceQueue, zVar3);
        return zVar3;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, Object obj, int i10, InterfaceC13539m interfaceC13539m) {
        return new z(obj, i10, (z) interfaceC13539m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final void a(r rVar, InterfaceC13539m interfaceC13539m, Object obj) {
        z zVar = (z) interfaceC13539m;
        ReferenceQueue referenceQueue = ((A) rVar).f127158h;
        K k10 = zVar.f127217d;
        zVar.f127217d = new L(referenceQueue, obj, zVar);
        k10.clear();
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final u a() {
        return u.f127212b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final r a(N n10, int i10) {
        return new A(n10, i10);
    }
}
