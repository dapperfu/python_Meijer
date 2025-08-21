package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.behaviour;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class l implements k {
    public final j a(BarcodePickViewHighlightStyle highlightStyle) {
        Intrinsics.j(highlightStyle, "highlightStyle");
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Rectangular) {
            throw new IllegalStateException("Status icons are not supported in BarcodePickViewHighlightStyle.RectangularBarcodePickViewHighlightStyle.RectangularWithIcons should be used instead.");
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
            return new i(((BarcodePickViewHighlightStyle.RectangularWithIcons) highlightStyle).getStatusIconSettings());
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.CustomView) {
            return new i(((BarcodePickViewHighlightStyle.CustomView) highlightStyle).getStatusIconSettings());
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.Dot) {
            throw new IllegalStateException("Status icons are not supported in BarcodePickViewHighlightStyle.Dot.BarcodePickViewHighlightStyle.DotWithIcons should be used instead.");
        }
        if (highlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
            return new b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
