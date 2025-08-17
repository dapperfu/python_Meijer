package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered;

import com.scandit.datacapture.barcode.filter.ui.overlay.BarcodeFilterHighlightSettings;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Size2 f122649a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeFilterHighlightSettings f122650b;

    public f(Size2 minSize, BarcodeFilterHighlightSettings barcodeFilterHighlightSettings) {
        Intrinsics.j(minSize, "minSize");
        this.f122649a = minSize;
        this.f122650b = barcodeFilterHighlightSettings;
    }
}
