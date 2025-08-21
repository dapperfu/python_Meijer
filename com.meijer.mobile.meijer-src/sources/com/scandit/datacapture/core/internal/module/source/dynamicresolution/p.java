package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureContext f126017a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.e(this.f126017a, ((p) obj).f126017a);
    }

    public final int hashCode() {
        return this.f126017a.hashCode();
    }

    public final String toString() {
        return "Attached(context=" + this.f126017a + ')';
    }

    public p(DataCaptureContext context) {
        Intrinsics.j(context, "context");
        this.f126017a = context;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.dynamicresolution.s
    public final DataCaptureContext a() {
        return this.f126017a;
    }
}
