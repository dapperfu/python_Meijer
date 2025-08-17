package com.scandit.datacapture.barcode.internal.module.count.ui.mode;

import com.scandit.datacapture.barcode.count.capture.map.BarcodeCountMappingFlowSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements BarcodeCountInternalMode {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountMappingFlowSettings f121747a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a f121748b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.e(this.f121747a, bVar.f121747a) && this.f121748b == bVar.f121748b;
    }

    public final int hashCode() {
        return this.f121748b.hashCode() + (this.f121747a.hashCode() * 31);
    }

    public final String toString() {
        return "MappingFlow(mappingFlowSettings=" + this.f121747a + ", screen=" + this.f121748b + ')';
    }

    public b(BarcodeCountMappingFlowSettings mappingFlowSettings, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a screen) {
        Intrinsics.j(mappingFlowSettings, "mappingFlowSettings");
        Intrinsics.j(screen, "screen");
        this.f121747a = mappingFlowSettings;
        this.f121748b = screen;
    }
}
