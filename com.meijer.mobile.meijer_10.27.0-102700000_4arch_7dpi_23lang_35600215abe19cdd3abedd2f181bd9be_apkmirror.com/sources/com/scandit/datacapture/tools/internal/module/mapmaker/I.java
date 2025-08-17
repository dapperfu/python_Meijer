package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes11.dex */
public final class I extends r {

    /* renamed from: h, reason: collision with root package name */
    public final ReferenceQueue f126213h;

    /* renamed from: i, reason: collision with root package name */
    public final ReferenceQueue f126214i;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final r f() {
        return this;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void b() {
        while (this.f126213h.poll() != null) {
        }
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void c() {
        a(this.f126213h);
        b(this.f126214i);
    }

    public I(N n10, int i10) {
        super(n10, i10);
        this.f126213h = new ReferenceQueue();
        this.f126214i = new ReferenceQueue();
    }
}
