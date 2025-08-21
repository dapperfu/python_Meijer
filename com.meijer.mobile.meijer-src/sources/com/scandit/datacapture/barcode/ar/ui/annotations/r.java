package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArPopoverAnnotation f121321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(BarcodeArPopoverAnnotation barcodeArPopoverAnnotation) {
        super(0);
        this.f121321a = barcodeArPopoverAnnotation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArPopoverAnnotationListener listener = this.f121321a.getListener();
        if (listener != null) {
            listener.onPopoverTapped(this.f121321a);
        }
        Function0<Unit> onAnnotationOrElementTap$scandit_barcode_capture = this.f121321a.getOnAnnotationOrElementTap$scandit_barcode_capture();
        if (onAnnotationOrElementTap$scandit_barcode_capture != null) {
            onAnnotationOrElementTap$scandit_barcode_capture.invoke();
        }
        return Unit.f143329a;
    }
}
