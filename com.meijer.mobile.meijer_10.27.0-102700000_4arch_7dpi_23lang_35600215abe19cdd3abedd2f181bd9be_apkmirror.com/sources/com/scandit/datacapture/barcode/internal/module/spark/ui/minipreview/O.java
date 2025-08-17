package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class O extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.j(view, "view");
        Intrinsics.j(outline, "outline");
        int iFloatValue = (int) ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122983m.getValue()).floatValue();
        outline.setRoundRect(0, -iFloatValue, view.getWidth(), view.getHeight(), iFloatValue);
    }
}
