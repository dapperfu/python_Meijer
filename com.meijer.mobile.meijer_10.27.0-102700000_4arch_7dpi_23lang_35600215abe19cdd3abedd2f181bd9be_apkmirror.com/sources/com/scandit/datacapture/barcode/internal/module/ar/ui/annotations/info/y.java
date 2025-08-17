package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotationDataHolder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class y extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArInfoAnnotationDataHolder f121114a;

    public y(BarcodeArInfoAnnotationDataHolder barcodeArInfoAnnotationDataHolder) {
        this.f121114a = barcodeArInfoAnnotationDataHolder;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.j(view, "view");
        Intrinsics.j(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f121114a.getWidth().toPaddingAndCornerRadius$scandit_barcode_capture());
    }
}
