package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArPopoverAnnotation f121318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArPopoverAnnotationButton f121319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f121320c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BarcodeArPopoverAnnotation barcodeArPopoverAnnotation, BarcodeArPopoverAnnotationButton barcodeArPopoverAnnotationButton, int i10) {
        super(0);
        this.f121318a = barcodeArPopoverAnnotation;
        this.f121319b = barcodeArPopoverAnnotationButton;
        this.f121320c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArPopoverAnnotationListener listener = this.f121318a.getListener();
        if (listener != null) {
            listener.onPopoverButtonTapped(this.f121318a, this.f121319b, this.f121320c);
        }
        Function0<Unit> onAnnotationOrElementTap$scandit_barcode_capture = this.f121318a.getOnAnnotationOrElementTap$scandit_barcode_capture();
        if (onAnnotationOrElementTap$scandit_barcode_capture != null) {
            onAnnotationOrElementTap$scandit_barcode_capture.invoke();
        }
        return Unit.f143329a;
    }
}
