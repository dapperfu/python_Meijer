package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class L extends WeakReference implements K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13406m f126215a;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.K
    public final InterfaceC13406m a() {
        return this.f126215a;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.K
    public final K a(ReferenceQueue referenceQueue, J j10) {
        return new L(referenceQueue, get(), j10);
    }

    public L(ReferenceQueue referenceQueue, Object obj, InterfaceC13406m interfaceC13406m) {
        super(obj, referenceQueue);
        this.f126215a = interfaceC13406m;
    }
}
