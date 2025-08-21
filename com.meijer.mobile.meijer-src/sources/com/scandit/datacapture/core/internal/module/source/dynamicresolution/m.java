package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final FrameSource f126015a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.e(this.f126015a, ((m) obj).f126015a);
    }

    public final int hashCode() {
        return this.f126015a.hashCode();
    }

    public final String toString() {
        return "Started(frameSource=" + this.f126015a + ')';
    }

    public m(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        this.f126015a = frameSource;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.dynamicresolution.o
    public final FrameSource a() {
        return this.f126015a;
    }
}
