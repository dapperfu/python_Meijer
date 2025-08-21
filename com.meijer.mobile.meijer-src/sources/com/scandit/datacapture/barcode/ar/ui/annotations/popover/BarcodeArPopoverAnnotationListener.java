package com.scandit.datacapture.barcode.ar.ui.annotations.popover;

import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationListener;", "", "onPopoverButtonTapped", "", "popover", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArPopoverAnnotation;", "button", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationButton;", "buttonIndex", "", "onPopoverTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodeArPopoverAnnotationListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onPopoverButtonTapped(BarcodeArPopoverAnnotationListener barcodeArPopoverAnnotationListener, BarcodeArPopoverAnnotation popover, BarcodeArPopoverAnnotationButton button, int i10) {
            Intrinsics.j(popover, "popover");
            Intrinsics.j(button, "button");
        }

        public static void onPopoverTapped(BarcodeArPopoverAnnotationListener barcodeArPopoverAnnotationListener, BarcodeArPopoverAnnotation popover) {
            Intrinsics.j(popover, "popover");
        }
    }

    void onPopoverButtonTapped(BarcodeArPopoverAnnotation popover, BarcodeArPopoverAnnotationButton button, int buttonIndex);

    void onPopoverTapped(BarcodeArPopoverAnnotation popover);
}
