package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes11.dex */
public final class F extends r {

    /* renamed from: h, reason: collision with root package name */
    public final ReferenceQueue f126210h;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final r f() {
        return this;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void b() {
        while (this.f126210h.poll() != null) {
        }
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void c() {
        a(this.f126210h);
    }

    public F(N n10, int i10) {
        super(n10, i10);
        this.f126210h = new ReferenceQueue();
    }
}
