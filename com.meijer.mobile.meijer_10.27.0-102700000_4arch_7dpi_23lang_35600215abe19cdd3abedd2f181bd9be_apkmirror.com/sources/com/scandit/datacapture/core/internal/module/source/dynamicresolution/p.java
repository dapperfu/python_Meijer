package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureContext f125065a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.e(this.f125065a, ((p) obj).f125065a);
    }

    public final int hashCode() {
        return this.f125065a.hashCode();
    }

    public final String toString() {
        return "Attached(context=" + this.f125065a + ')';
    }

    public p(DataCaptureContext context) {
        Intrinsics.j(context, "context");
        this.f125065a = context;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.dynamicresolution.s
    public final DataCaptureContext a() {
        return this.f125065a;
    }
}
