package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategory;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class q implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f122359f = LazyKt.b(o.f122358a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122360a;

    /* renamed from: b, reason: collision with root package name */
    public final ScreenSizeCategoryHandler f122361b;

    /* renamed from: c, reason: collision with root package name */
    public final PreviewResolutionRatioHandler f122362c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f122363d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f122364e;

    public q(com.scandit.datacapture.barcode.internal.module.find.ui.E shouldShow, ScreenSizeCategoryHandler sizeCategoryHandler, PreviewResolutionRatioHandler previewResolutionHandler, Function1 isTallFormFactor, com.scandit.datacapture.barcode.internal.module.find.ui.F dataCaptureViewGetter) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(sizeCategoryHandler, "sizeCategoryHandler");
        Intrinsics.j(previewResolutionHandler, "previewResolutionHandler");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        Intrinsics.j(dataCaptureViewGetter, "dataCaptureViewGetter");
        this.f122360a = shouldShow;
        this.f122361b = sizeCategoryHandler;
        this.f122362c = previewResolutionHandler;
        this.f122363d = isTallFormFactor;
        this.f122364e = dataCaptureViewGetter;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        FrameLayout view2 = (FrameLayout) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        boolean zBooleanValue = ((Boolean) this.f122360a.invoke()).booleanValue();
        boolean closeToFourByThree = this.f122362c.getCloseToFourByThree();
        boolean zBooleanValue2 = ((Boolean) this.f122363d.invoke(parent)).booleanValue();
        ScreenSizeCategory screenCategory = this.f122361b.getScreenCategory();
        int id2 = ((View) this.f122364e.invoke()).getId();
        if (zBooleanValue2) {
            if (!closeToFourByThree || screenCategory == ScreenSizeCategory.SMALL) {
                Intrinsics.j(layoutParams, "<this>");
                layoutParams.addRule(8, id2);
                layoutParams.bottomMargin = ((Number) f122359f.getValue()).intValue();
                Intrinsics.j(layoutParams, "<this>");
                layoutParams.addRule(14);
            } else {
                Intrinsics.j(layoutParams, "<this>");
                layoutParams.addRule(12);
                Intrinsics.j(layoutParams, "<this>");
                layoutParams.addRule(3, id2);
                Intrinsics.j(layoutParams, "<this>");
                layoutParams.addRule(14);
            }
        } else if (!closeToFourByThree || screenCategory == ScreenSizeCategory.SMALL) {
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(19, id2);
            layoutParams.setMarginEnd(((Number) f122359f.getValue()).intValue());
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(15);
        } else {
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(21);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(1, id2);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(15);
        }
        view2.setVisibility(!zBooleanValue ? 4 : 0);
        view2.setLayoutParams(layoutParams);
    }
}
