package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final FrameSource f126016a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.e(this.f126016a, ((n) obj).f126016a);
    }

    public final int hashCode() {
        return this.f126016a.hashCode();
    }

    public final String toString() {
        return "Stopped(frameSource=" + this.f126016a + ')';
    }

    public n(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        this.f126016a = frameSource;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.dynamicresolution.o
    public final FrameSource a() {
        return this.f126016a;
    }
}
