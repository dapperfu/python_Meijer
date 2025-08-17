package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes11.dex */
public final class H extends AbstractC13402i implements J {

    /* renamed from: c, reason: collision with root package name */
    public volatile K f126212c;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.J
    public final K a() {
        return this.f126212c;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final Object getValue() {
        return this.f126212c.get();
    }

    public H(ReferenceQueue referenceQueue, Object obj, int i10, H h10) {
        super(referenceQueue, obj, i10, h10);
        this.f126212c = N.f126219j;
    }
}
