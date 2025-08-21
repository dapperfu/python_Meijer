package com.scandit.datacapture.barcode.internal.module.count.ui.mode;

import com.scandit.datacapture.barcode.count.capture.map.BarcodeCountMappingFlowSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements BarcodeCountInternalMode {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountMappingFlowSettings f122699a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a f122700b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.e(this.f122699a, bVar.f122699a) && this.f122700b == bVar.f122700b;
    }

    public final int hashCode() {
        return this.f122700b.hashCode() + (this.f122699a.hashCode() * 31);
    }

    public final String toString() {
        return "MappingFlow(mappingFlowSettings=" + this.f122699a + ", screen=" + this.f122700b + ')';
    }

    public b(BarcodeCountMappingFlowSettings mappingFlowSettings, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a screen) {
        Intrinsics.j(mappingFlowSettings, "mappingFlowSettings");
        Intrinsics.j(screen, "screen");
        this.f122699a = mappingFlowSettings;
        this.f122700b = screen;
    }
}
