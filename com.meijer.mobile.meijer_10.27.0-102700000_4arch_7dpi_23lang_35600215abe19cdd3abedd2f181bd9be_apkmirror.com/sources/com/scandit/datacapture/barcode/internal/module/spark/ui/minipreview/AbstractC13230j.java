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
/* loaded from: classes11.dex */
public abstract class AbstractC13230j extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f123202a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13230j(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        ImageView imageView = new ImageView(context);
        this.f123202a = imageView;
        Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122967B;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue());
        layoutParams.addRule(13);
        Unit unit = Unit.f142422a;
        addView(imageView, layoutParams);
    }

    public final void a(SparkScanMiniPreviewSize miniPreviewSize) {
        int iIntValue;
        Intrinsics.j(miniPreviewSize, "miniPreviewSize");
        int i10 = AbstractC13229i.f123201a[miniPreviewSize.ordinal()];
        if (i10 == 1) {
            iIntValue = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122968C.getValue()).intValue();
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f122967B.getValue()).intValue();
        }
        ViewGroup.LayoutParams layoutParams = this.f123202a.getLayoutParams();
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f123202a.setEnabled(z10);
    }
}
