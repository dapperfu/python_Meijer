package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import android.view.View;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArInfoAnnotation;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArStatusIconAnnotation;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArCircleHighlight;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArRectangleHighlight;

/* loaded from: classes12.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f122157a = {BarcodeArRectangleHighlight.class, BarcodeArCircleHighlight.class};

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f122158b = {BarcodeArInfoAnnotation.class, BarcodeArPopoverAnnotation.class, BarcodeArStatusIconAnnotation.class};

    public static final boolean a(View view) {
        if (view.getParent() != null && view.isAttachedToWindow() && view.getWidth() > 0 && view.getHeight() > 0) {
            return true;
        }
        return false;
    }
}
