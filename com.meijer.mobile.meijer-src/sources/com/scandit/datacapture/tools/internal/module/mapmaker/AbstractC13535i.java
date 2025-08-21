package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13535i extends WeakReference implements InterfaceC13539m {

    /* renamed from: a, reason: collision with root package name */
    public final int f127192a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC13539m f127193b;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m
    public final InterfaceC13539m b() {
        return this.f127193b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m
    public final int c() {
        return this.f127192a;
    }

    public AbstractC13535i(ReferenceQueue referenceQueue, Object obj, int i10, InterfaceC13539m interfaceC13539m) {
        super(obj, referenceQueue);
        this.f127192a = i10;
        this.f127193b = interfaceC13539m;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m
    public final Object getKey() {
        return get();
    }
}
