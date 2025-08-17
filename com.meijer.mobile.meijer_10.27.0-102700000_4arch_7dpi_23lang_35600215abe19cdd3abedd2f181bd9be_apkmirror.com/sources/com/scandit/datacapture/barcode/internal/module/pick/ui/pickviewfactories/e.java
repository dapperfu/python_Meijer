package com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories;

import android.content.Context;
import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.pick.capture.A;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.BarcodePickDrawer;
import com.scandit.datacapture.barcode.internal.sdk.pick.ui.BarcodePickViewSettingsDefaults;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickView;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class e {
    public static BarcodePickView a(ViewGroup viewGroup, DataCaptureContext dataCaptureContext, BarcodePick barcodePick, BarcodePickViewSettings viewSettings, CameraSettings cameraSettings, BarcodePickViewHighlightStyle barcodePickViewHighlightStyle, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j brushProvider) {
        Context context = viewGroup.getContext();
        Intrinsics.g(context);
        BarcodePickBasicOverlay barcodePickBasicOverlay = new BarcodePickBasicOverlay(context, barcodePick, viewSettings);
        com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview.j jVarA = a.a(context, viewSettings);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.e iconProvider = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.e.f122776b;
        Intrinsics.j(brushProvider, "brushProvider");
        Intrinsics.j(iconProvider, "iconProvider");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c cVar = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.c(null, brushProvider, iconProvider, false);
        CameraPosition cameraPosition = CameraPosition.WORLD_FACING;
        Intrinsics.j(cameraPosition, "cameraPosition");
        Intrinsics.j(cameraSettings, "cameraSettings");
        A a10 = new A(cameraPosition, cameraSettings);
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a aVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.a.f122546a;
        b bVar = new b(barcodePick);
        c cVar2 = new c(jVarA);
        Intrinsics.j(viewSettings, "settings");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.n nVarA = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.s.a(barcodePickBasicOverlay, bVar, barcodePickViewHighlightStyle, cVar2, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.j(viewSettings.getDrawDebugInfo(), new Size2(BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), BarcodePickViewSettingsDefaults.getHighlightSizeToTapAreaFactor() * viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), PixelExtensionsKt.pxFromDp$default(viewSettings.maxIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(viewSettings.minIconSize$scandit_barcode_capture(), (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(BarcodePickViewSettingsDefaults.getIconPadding(), (Context) null, 1, (Object) null), new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture())), cVar, null, 4032);
        d dVar = new d(jVarA);
        Intrinsics.j(viewSettings, "settings");
        BarcodePickDrawer[] drawers = {nVarA, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.e.a(barcodePickBasicOverlay, dVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered.f(new Size2(viewSettings.getMinimumHighlightWidthPx$scandit_barcode_capture(), viewSettings.getMinimumHighlightHeightPx$scandit_barcode_capture()), viewSettings.getFilterHighlightSettings()))};
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(drawers, "drawers");
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a aVar2 = new com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.combined.a(ArraysKt.i1(drawers));
        Context context2 = viewGroup.getContext();
        Intrinsics.i(context2, "getContext(...)");
        Intrinsics.j(context2, "context");
        com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b factory = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.b(context2);
        com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c cVar3 = com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f123427a;
        Intrinsics.j(cVar3, "<this>");
        Intrinsics.j(viewSettings, "viewSettings");
        com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d positioner = new com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton.d(viewSettings.getUiButtonsOffset());
        Intrinsics.j(factory, "factory");
        Intrinsics.j(positioner, "positioner");
        com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i iVar = new com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.i(factory, positioner);
        Context context3 = viewGroup.getContext();
        Intrinsics.i(context3, "getContext(...)");
        Intrinsics.j(context3, "context");
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b factory2 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.b(context3);
        Intrinsics.j(cVar3, "<this>");
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i positioner2 = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.i();
        Intrinsics.j(factory2, "factory");
        Intrinsics.j(positioner2, "positioner");
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f fVar = new com.scandit.datacapture.barcode.internal.module.ui.exitbutton.f(factory2, positioner2);
        Context context4 = viewGroup.getContext();
        Intrinsics.i(context4, "getContext(...)");
        com.scandit.datacapture.barcode.internal.module.pick.ui.f loadingViewFactory = a.b(context, viewSettings);
        Context context5 = viewGroup.getContext();
        Intrinsics.i(context5, "getContext(...)");
        Intrinsics.j(context5, "context");
        com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k guidanceViewFactory = new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.k(context5);
        Intrinsics.j(context4, "context");
        Intrinsics.j(loadingViewFactory, "loadingViewFactory");
        Intrinsics.j(guidanceViewFactory, "guidanceViewFactory");
        return new BarcodePickView(context, viewGroup, dataCaptureContext, barcodePick, viewSettings, a10, cVar, aVar2, jVarA, iVar, fVar, new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.g(context4, loadingViewFactory, guidanceViewFactory), barcodePickBasicOverlay);
    }
}
