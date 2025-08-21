package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes12.dex */
public final class H extends AbstractC13535i implements J {

    /* renamed from: c, reason: collision with root package name */
    public volatile K f127164c;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.J
    public final K a() {
        return this.f127164c;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m
    public final Object getValue() {
        return this.f127164c.get();
    }

    public H(ReferenceQueue referenceQueue, Object obj, int i10, H h10) {
        super(referenceQueue, obj, i10, h10);
        this.f127164c = N.f127171j;
    }
}
