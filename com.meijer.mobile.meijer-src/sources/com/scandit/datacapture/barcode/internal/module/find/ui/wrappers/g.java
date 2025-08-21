package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewDefaults;
import com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategory;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13306s;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13307t;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13308u;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13309v;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class g implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenSizeCategoryHandler f123292a;

    /* renamed from: b, reason: collision with root package name */
    public final PreviewResolutionRatioHandler f123293b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f123294c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f123295d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f123296e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f123297f;

    /* renamed from: g, reason: collision with root package name */
    public final Function1 f123298g;

    /* renamed from: h, reason: collision with root package name */
    public TorchSwitchControl f123299h;

    public g(ScreenSizeCategoryHandler screenSizeHandler, PreviewResolutionRatioHandler previewResolutionHandler, C13306s isShowingProgressBar, C13307t isShowingTorchButton, C13309v isShowingFinishButton, C13308u torchButtonPosition, Function1 isTallFormFactor) {
        Intrinsics.j(screenSizeHandler, "screenSizeHandler");
        Intrinsics.j(previewResolutionHandler, "previewResolutionHandler");
        Intrinsics.j(isShowingProgressBar, "isShowingProgressBar");
        Intrinsics.j(isShowingTorchButton, "isShowingTorchButton");
        Intrinsics.j(isShowingFinishButton, "isShowingFinishButton");
        Intrinsics.j(torchButtonPosition, "torchButtonPosition");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        this.f123292a = screenSizeHandler;
        this.f123293b = previewResolutionHandler;
        this.f123294c = isShowingProgressBar;
        this.f123295d = isShowingTorchButton;
        this.f123296e = isShowingFinishButton;
        this.f123297f = torchButtonPosition;
        this.f123298g = isTallFormFactor;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        int iMin;
        int width;
        PointWithUnit PointWithUnit;
        DataCaptureView view2 = (DataCaptureView) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        boolean closeToFourByThree = this.f123293b.getCloseToFourByThree();
        float ratio = this.f123293b.getRatio();
        boolean zBooleanValue = ((Boolean) this.f123298g.invoke(parent)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.f123296e.invoke()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) this.f123294c.invoke()).booleanValue();
        boolean zBooleanValue4 = ((Boolean) this.f123295d.invoke()).booleanValue();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        if (closeToFourByThree) {
            iMin = Math.min(parent.getWidth(), parent.getHeight());
            width = (iMin <= 0 || ratio <= 0.0f) ? 0 : (int) (iMin * ratio);
            if (zBooleanValue) {
                iMin = width;
                width = iMin;
            }
        } else {
            width = parent.getWidth();
            iMin = parent.getHeight();
        }
        Size size = new Size(width, iMin);
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        this.f123292a.onPreviewSizeMeasured(size, new Size(parent.getWidth(), parent.getHeight()));
        ScreenSizeCategory screenCategory = this.f123292a.getScreenCategory();
        view2.setLogoOffset(((!closeToFourByThree && zBooleanValue && zBooleanValue2) || (closeToFourByThree && screenCategory == ScreenSizeCategory.SMALL && zBooleanValue2)) ? PointWithUnitUtilsKt.PointWithUnit(0.0f, -80.0f, MeasureUnit.DIP) : PointWithUnitUtilsKt.PointWithUnit(0.0f, 0.0f, MeasureUnit.PIXEL));
        if (closeToFourByThree) {
            if (zBooleanValue) {
                int i10 = AbstractC13316f.f123290a[screenCategory.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    Intrinsics.j(layoutParams, "<this>");
                    layoutParams.addRule(10);
                } else if (i10 == 3) {
                    Intrinsics.j(layoutParams, "<this>");
                    layoutParams.addRule(13);
                }
            } else {
                int i11 = AbstractC13316f.f123290a[screenCategory.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    Intrinsics.j(layoutParams, "<this>");
                    layoutParams.addRule(20);
                } else if (i11 == 3) {
                    Intrinsics.j(layoutParams, "<this>");
                    layoutParams.addRule(13);
                }
            }
        }
        TorchSwitchControl torchSwitchControl = this.f123299h;
        if (torchSwitchControl == null) {
            Context context = view2.getContext();
            Intrinsics.i(context, "getContext(...)");
            torchSwitchControl = new TorchSwitchControl(context);
            this.f123299h = torchSwitchControl;
        }
        view2.removeControl(torchSwitchControl);
        if (zBooleanValue4) {
            Anchor defaultTorchControlPositionLandscape$scandit_barcode_capture = (Anchor) this.f123297f.invoke();
            Map map = com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.utils.a.f123325a;
            Intrinsics.j(defaultTorchControlPositionLandscape$scandit_barcode_capture, "<this>");
            Map map2 = com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.utils.a.f123325a;
            if (!map2.containsKey(defaultTorchControlPositionLandscape$scandit_barcode_capture)) {
                defaultTorchControlPositionLandscape$scandit_barcode_capture = BarcodeFindViewDefaults.getDefaultTorchControlPosition();
            }
            if (!zBooleanValue) {
                if (zBooleanValue) {
                    throw new NoWhenBranchMatchedException();
                }
                defaultTorchControlPositionLandscape$scandit_barcode_capture = (Anchor) map2.get(defaultTorchControlPositionLandscape$scandit_barcode_capture);
                if (defaultTorchControlPositionLandscape$scandit_barcode_capture == null) {
                    defaultTorchControlPositionLandscape$scandit_barcode_capture = BarcodeFindViewDefaults.INSTANCE.getDefaultTorchControlPositionLandscape$scandit_barcode_capture();
                }
            }
            if (zBooleanValue) {
                boolean z10 = zBooleanValue3 && !(screenCategory == ScreenSizeCategory.LARGE && closeToFourByThree);
                int i12 = AbstractC13316f.f123291b[defaultTorchControlPositionLandscape$scandit_barcode_capture.ordinal()];
                if (i12 == 1) {
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(16.0f, (z10 ? 40.0f : 0.0f) + 16.0f, MeasureUnit.DIP);
                } else if (i12 == 2) {
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(0.0f, (z10 ? 40.0f : 0.0f) + 16.0f, MeasureUnit.DIP);
                } else if (i12 != 3) {
                    PointWithUnit = i12 != 4 ? PointWithUnitUtilsKt.PointWithUnit(0.0f, 0.0f, MeasureUnit.PIXEL) : PointWithUnitUtilsKt.PointWithUnit(16.0f, 34.0f, MeasureUnit.DIP);
                } else {
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(16.0f, (z10 ? 40.0f : 0.0f) + 16.0f, MeasureUnit.DIP);
                }
            } else {
                int i13 = AbstractC13316f.f123291b[defaultTorchControlPositionLandscape$scandit_barcode_capture.ordinal()];
                if (i13 != 1) {
                    PointWithUnit = i13 != 4 ? i13 != 5 ? i13 != 6 ? i13 != 7 ? PointWithUnitUtilsKt.PointWithUnit(0.0f, 0.0f, MeasureUnit.PIXEL) : PointWithUnitUtilsKt.PointWithUnit(34.0f, 36.0f, MeasureUnit.DIP) : PointWithUnitUtilsKt.PointWithUnit(0.0f, 36.0f, MeasureUnit.DIP) : PointWithUnitUtilsKt.PointWithUnit(16.0f, 0.0f, MeasureUnit.DIP) : PointWithUnitUtilsKt.PointWithUnit(16.0f, 36.0f, MeasureUnit.DIP);
                } else {
                    if (zBooleanValue3 && closeToFourByThree) {
                        f = 40.0f;
                    }
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(16.0f, f + 16.0f, MeasureUnit.DIP);
                }
            }
            view2.addControl(torchSwitchControl, defaultTorchControlPositionLandscape$scandit_barcode_capture, PointWithUnit);
        }
        view2.setLayoutParams(layoutParams);
    }
}
