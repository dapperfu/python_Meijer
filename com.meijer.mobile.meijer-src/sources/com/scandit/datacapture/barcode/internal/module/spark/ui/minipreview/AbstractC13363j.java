package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.spark.ui.SparkScanMiniPreviewSize;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13363j extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f124154a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13363j(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        ImageView imageView = new ImageView(context);
        this.f124154a = imageView;
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123919B;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams.addRule(13);
        Unit unit = Unit.f143329a;
        addView(imageView, layoutParams);
    }

    public final void a(SparkScanMiniPreviewSize miniPreviewSize) {
        int iIntValue;
        Intrinsics.j(miniPreviewSize, "miniPreviewSize");
        int i10 = AbstractC13362i.f124153a[miniPreviewSize.ordinal()];
        if (i10 == 1) {
            iIntValue = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123920C.getValue()).intValue();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123919B.getValue()).intValue();
        }
        ViewGroup.LayoutParams layoutParams = this.f124154a.getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f124154a.setEnabled(z10);
    }
}
