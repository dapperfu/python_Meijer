package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final FrameSource f125064a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.e(this.f125064a, ((n) obj).f125064a);
    }

    public final int hashCode() {
        return this.f125064a.hashCode();
    }

    public final String toString() {
        return "Stopped(frameSource=" + this.f125064a + ')';
    }

    public n(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        this.f125064a = frameSource;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.dynamicresolution.o
    public final FrameSource a() {
        return this.f125064a;
    }
}
