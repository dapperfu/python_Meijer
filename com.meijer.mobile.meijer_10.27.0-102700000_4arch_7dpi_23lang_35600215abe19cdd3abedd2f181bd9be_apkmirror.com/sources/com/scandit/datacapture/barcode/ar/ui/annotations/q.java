package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArPopoverAnnotation f120366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeArPopoverAnnotationButton f120367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f120368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BarcodeArPopoverAnnotation barcodeArPopoverAnnotation, BarcodeArPopoverAnnotationButton barcodeArPopoverAnnotationButton, int i10) {
        super(0);
        this.f120366a = barcodeArPopoverAnnotation;
        this.f120367b = barcodeArPopoverAnnotationButton;
        this.f120368c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArPopoverAnnotationListener listener = this.f120366a.getListener();
        if (listener != null) {
            listener.onPopoverButtonTapped(this.f120366a, this.f120367b, this.f120368c);
        }
        Function0<Unit> onAnnotationOrElementTap$scandit_barcode_capture = this.f120366a.getOnAnnotationOrElementTap$scandit_barcode_capture();
        if (onAnnotationOrElementTap$scandit_barcode_capture != null) {
            onAnnotationOrElementTap$scandit_barcode_capture.invoke();
        }
        return Unit.f142422a;
    }
}
