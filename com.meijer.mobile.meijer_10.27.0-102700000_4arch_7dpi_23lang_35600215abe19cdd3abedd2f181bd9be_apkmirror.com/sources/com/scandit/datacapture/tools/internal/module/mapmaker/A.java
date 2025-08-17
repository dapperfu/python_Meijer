package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes11.dex */
public final class A extends r {

    /* renamed from: h, reason: collision with root package name */
    public final ReferenceQueue f126206h;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final r f() {
        return this;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void b() {
        while (this.f126206h.poll() != null) {
        }
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void c() {
        b(this.f126206h);
    }

    public A(N n10, int i10) {
        super(n10, i10);
        this.f126206h = new ReferenceQueue();
    }
}
