package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final FrameSource f125063a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.e(this.f125063a, ((m) obj).f125063a);
    }

    public final int hashCode() {
        return this.f125063a.hashCode();
    }

    public final String toString() {
        return "Started(frameSource=" + this.f125063a + ')';
    }

    public m(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        this.f125063a = frameSource;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.dynamicresolution.o
    public final FrameSource a() {
        return this.f125063a;
    }
}
