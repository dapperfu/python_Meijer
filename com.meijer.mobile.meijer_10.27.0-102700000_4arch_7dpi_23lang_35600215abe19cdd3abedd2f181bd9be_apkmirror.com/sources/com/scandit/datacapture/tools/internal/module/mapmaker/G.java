package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes11.dex */
public final class G implements InterfaceC13407n {

    /* renamed from: a, reason: collision with root package name */
    public static final G f126211a = new G();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, InterfaceC13406m interfaceC13406m, InterfaceC13406m interfaceC13406m2) {
        I i10 = (I) rVar;
        H h10 = (H) interfaceC13406m;
        H h11 = (H) interfaceC13406m2;
        if (h10.get() == 0) {
            return null;
        }
        int i11 = r.f126252g;
        if (h10.f126212c.get() == null) {
            return null;
        }
        ReferenceQueue referenceQueue = i10.f126213h;
        ReferenceQueue referenceQueue2 = i10.f126214i;
        H h12 = new H(referenceQueue, h10.get(), h10.f126240a, h11);
        h12.f126212c = h10.f126212c.a(referenceQueue2, h12);
        return h12;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final InterfaceC13406m a(r rVar, Object obj, int i10, InterfaceC13406m interfaceC13406m) {
        return new H(((I) rVar).f126213h, obj, i10, (H) interfaceC13406m);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final void a(r rVar, InterfaceC13406m interfaceC13406m, Object obj) {
        H h10 = (H) interfaceC13406m;
        ReferenceQueue referenceQueue = ((I) rVar).f126214i;
        K k10 = h10.f126212c;
        h10.f126212c = new L(referenceQueue, obj, h10);
        k10.clear();
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final u a() {
        return u.f126260b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13407n
    public final r a(N n10, int i10) {
        return new I(n10, i10);
    }
}
