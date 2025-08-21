package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered;

import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Size2 f123601a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeFilterHighlightSettings f123602b;

    public f(Size2 minSize, BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        Intrinsics.j(minSize, "minSize");
        this.f123601a = minSize;
        this.f123602b = barcodeFilterHighlightSettings;
    }
}
