package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes12.dex */
public final class I extends r {

    /* renamed from: h, reason: collision with root package name */
    public final ReferenceQueue f127165h;

    /* renamed from: i, reason: collision with root package name */
    public final ReferenceQueue f127166i;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final r f() {
        return this;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void b() {
        while (this.f127165h.poll() != null) {
        }
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.r
    public final void c() {
        a(this.f127165h);
        b(this.f127166i);
    }

    public I(N n10, int i10) {
        super(n10, i10);
        this.f127165h = new ReferenceQueue();
        this.f127166i = new ReferenceQueue();
    }
}
