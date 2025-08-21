package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13355b extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13355b(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123935m.getValue()).floatValue());
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123921D);
        setBackground(gradientDrawable);
    }
}
