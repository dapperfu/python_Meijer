package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes12.dex */
public final class G implements InterfaceC13540n {

    /* renamed from: a, reason: collision with root package name */
    public static final G f127163a = new G();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, InterfaceC13539m interfaceC13539m, InterfaceC13539m interfaceC13539m2) {
        I i10 = (I) rVar;
        H h10 = (H) interfaceC13539m;
        H h11 = (H) interfaceC13539m2;
        if (h10.get() == 0) {
            return null;
        }
        int i11 = r.f127204g;
        if (h10.f127164c.get() == null) {
            return null;
        }
        ReferenceQueue referenceQueue = i10.f127165h;
        ReferenceQueue referenceQueue2 = i10.f127166i;
        H h12 = new H(referenceQueue, h10.get(), h10.f127192a, h11);
        h12.f127164c = h10.f127164c.a(referenceQueue2, h12);
        return h12;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final InterfaceC13539m a(r rVar, Object obj, int i10, InterfaceC13539m interfaceC13539m) {
        return new H(((I) rVar).f127165h, obj, i10, (H) interfaceC13539m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final void a(r rVar, InterfaceC13539m interfaceC13539m, Object obj) {
        H h10 = (H) interfaceC13539m;
        ReferenceQueue referenceQueue = ((I) rVar).f127166i;
        K k10 = h10.f127164c;
        h10.f127164c = new L(referenceQueue, obj, h10);
        k10.clear();
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final u a() {
        return u.f127212b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13540n
    public final r a(N n10, int i10) {
        return new I(n10, i10);
    }
}
