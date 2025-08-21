package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategory;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler;
import com.scandit.datacapture.barcode.internal.module.find.ui.AbstractC13305q;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13319z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123301a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f123302b;

    /* renamed from: c, reason: collision with root package name */
    public final ScreenSizeCategoryHandler f123303c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f123304d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f123305e;

    public j(C13319z shouldShow, Function1 isTallFormFactor, ScreenSizeCategoryHandler screenSizeHandler, com.scandit.datacapture.barcode.internal.module.find.ui.A isShowingProgressBar, com.scandit.datacapture.barcode.internal.module.find.ui.B shutterButtonViewGetter) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        Intrinsics.j(screenSizeHandler, "screenSizeHandler");
        Intrinsics.j(isShowingProgressBar, "isShowingProgressBar");
        Intrinsics.j(shutterButtonViewGetter, "shutterButtonViewGetter");
        this.f123301a = shouldShow;
        this.f123302b = isTallFormFactor;
        this.f123303c = screenSizeHandler;
        this.f123304d = isShowingProgressBar;
        this.f123305e = shutterButtonViewGetter;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        FrameLayout view2 = (FrameLayout) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        boolean zBooleanValue = ((Boolean) this.f123301a.invoke()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.f123302b.invoke(parent)).booleanValue();
        ScreenSizeCategory screenCategory = this.f123303c.getScreenCategory();
        boolean zBooleanValue3 = ((Boolean) this.f123304d.invoke()).booleanValue();
        int id2 = ((View) this.f123305e.invoke()).getId();
        if (zBooleanValue2) {
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(1, id2);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(21);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(8, id2);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(6, id2);
        } else {
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(18, id2);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(19, id2);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(2, id2);
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(10);
            if (zBooleanValue3 && screenCategory == ScreenSizeCategory.SMALL) {
                layoutParams.topMargin = (int) ((Number) AbstractC13305q.f123221a.getValue()).floatValue();
            }
        }
        view2.setVisibility(zBooleanValue ? 0 : 4);
        view2.setLayoutParams(layoutParams);
    }
}
