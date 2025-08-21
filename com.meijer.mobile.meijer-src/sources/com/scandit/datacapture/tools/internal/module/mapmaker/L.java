package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final class L extends WeakReference implements K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13539m f127167a;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.K
    public final InterfaceC13539m a() {
        return this.f127167a;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.K
    public final K a(ReferenceQueue referenceQueue, J j10) {
        return new L(referenceQueue, get(), j10);
    }

    public L(ReferenceQueue referenceQueue, Object obj, InterfaceC13539m interfaceC13539m) {
        super(obj, referenceQueue);
        this.f127167a = interfaceC13539m;
    }
}
