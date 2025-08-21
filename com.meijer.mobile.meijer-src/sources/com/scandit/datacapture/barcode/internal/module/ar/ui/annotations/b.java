package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.statusicon.BarcodeArStatusIconAnnotationAnchor;
import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class b {
    public static final /* synthetic */ Anchor a(BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor) {
        Intrinsics.j(barcodeArInfoAnnotationAnchor, "<this>");
        int i10 = a.f122032a[barcodeArInfoAnnotationAnchor.ordinal()];
        if (i10 == 1) {
            return Anchor.TOP_CENTER;
        }
        if (i10 == 2) {
            return Anchor.BOTTOM_CENTER;
        }
        if (i10 == 3) {
            return Anchor.CENTER_LEFT;
        }
        if (i10 == 4) {
            return Anchor.CENTER_RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Anchor a(BarcodeArStatusIconAnnotationAnchor barcodeArStatusIconAnnotationAnchor) {
        Intrinsics.j(barcodeArStatusIconAnnotationAnchor, "<this>");
        int i10 = a.f122033b[barcodeArStatusIconAnnotationAnchor.ordinal()];
        if (i10 == 1) {
            return Anchor.TOP_CENTER;
        }
        if (i10 == 2) {
            return Anchor.BOTTOM_CENTER;
        }
        if (i10 == 3) {
            return Anchor.CENTER_LEFT;
        }
        if (i10 == 4) {
            return Anchor.CENTER_RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
