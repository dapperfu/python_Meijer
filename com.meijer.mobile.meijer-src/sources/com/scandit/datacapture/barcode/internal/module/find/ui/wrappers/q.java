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

/* loaded from: classes12.dex */
public final class q implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f123311f = LazyKt.b(o.f123310a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123312a;

    /* renamed from: b, reason: collision with root package name */
    public final ScreenSizeCategoryHandler f123313b;

    /* renamed from: c, reason: collision with root package name */
    public final PreviewResolutionRatioHandler f123314c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f123315d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f123316e;

    public q(com.scandit.datacapture.barcode.internal.module.find.ui.E shouldShow, ScreenSizeCategoryHandler sizeCategoryHandler, PreviewResolutionRatioHandler previewResolutionHandler, Function1 isTallFormFactor, com.scandit.datacapture.barcode.internal.module.find.ui.F dataCaptureViewGetter) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(sizeCategoryHandler, "sizeCategoryHandler");
        Intrinsics.j(previewResolutionHandler, "previewResolutionHandler");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        Intrinsics.j(dataCaptureViewGetter, "dataCaptureViewGetter");
        this.f123312a = shouldShow;
        this.f123313b = sizeCategoryHandler;
        this.f123314c = previewResolutionHandler;
        this.f123315d = isTallFormFactor;
        this.f123316e = dataCaptureViewGetter;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        FrameLayout view2 = (FrameLayout) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        boolean zBooleanValue = ((Boolean) this.f123312a.invoke()).booleanValue();
        boolean closeToFourByThree = this.f123314c.getCloseToFourByThree();
        boolean zBooleanValue2 = ((Boolean) this.f123315d.invoke(parent)).booleanValue();
        ScreenSizeCategory screenCategory = this.f123313b.getScreenCategory();
        int id2 = ((View) this.f123316e.invoke()).getId();
        if (zBooleanValue2) {
            if (!closeToFourByThree || screenCategory == ScreenSizeCategory.SMALL) {
                Intrinsics.j(layoutParams, "<this>");
                layoutParams.addRule(8, id2);
                layoutParams.bottomMargin = ((Number) f123311f.getValue()).intValue();
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
            layoutParams.setMarginEnd(((Number) f123311f.getValue()).intValue());
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
