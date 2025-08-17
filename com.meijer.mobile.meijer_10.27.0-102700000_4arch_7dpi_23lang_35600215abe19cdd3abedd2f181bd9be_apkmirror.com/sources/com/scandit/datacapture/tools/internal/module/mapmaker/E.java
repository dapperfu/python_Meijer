package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes11.dex */
public final class E extends AbstractC13402i {

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f126209c;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final Object getValue() {
        return this.f126209c;
    }

    public E(ReferenceQueue referenceQueue, Object obj, int i10, E e10) {
        super(referenceQueue, obj, i10, e10);
        this.f126209c = null;
    }
}
