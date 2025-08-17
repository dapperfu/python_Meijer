package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13402i extends WeakReference implements InterfaceC13406m {

    /* renamed from: a, reason: collision with root package name */
    public final int f126240a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC13406m f126241b;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final InterfaceC13406m b() {
        return this.f126241b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final int c() {
        return this.f126240a;
    }

    public AbstractC13402i(ReferenceQueue referenceQueue, Object obj, int i10, InterfaceC13406m interfaceC13406m) {
        super(obj, referenceQueue);
        this.f126240a = i10;
        this.f126241b = interfaceC13406m;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final Object getKey() {
        return get();
    }
}
