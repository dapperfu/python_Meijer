package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13354a extends RelativeLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13354a(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123935m.getValue()).floatValue());
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        setBackground(gradientDrawable);
        setId(com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123926d);
        setClipToOutline(true);
    }
}
