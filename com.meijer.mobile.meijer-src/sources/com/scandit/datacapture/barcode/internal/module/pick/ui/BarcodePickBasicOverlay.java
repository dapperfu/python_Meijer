package com.scandit.datacapture.barcode.internal.module.pick.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.BarcodePickGuidanceHandler;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes12.dex */
public final class BarcodePickBasicOverlay extends ViewBasedDataCaptureOverlay implements DataCaptureOverlay {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a f123420a;

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _cleanupViews() {
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _setDataCaptureView(DataCaptureView view) {
        Intrinsics.j(view, "view");
    }

    public final void a(BarcodePickViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        a aVar = this.f123420a;
        aVar.getClass();
        Intrinsics.j(viewSettings, "viewSettings");
        NativeBarcodePickViewSettings f124673a = viewSettings.getF124673a();
        aVar.f123431b.put(Reflection.b(NativeBarcodePickViewSettings.class), null, f124673a, viewSettings);
        aVar.f123430a.applyViewSettings(f124673a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodePickBasicOverlay(Context context, BarcodePick mode, BarcodePickViewSettings viewSettings) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(viewSettings, "viewSettings");
        NativeBarcodePickBasicOverlay nativeBarcodePickBasicOverlayCreate = NativeBarcodePickBasicOverlay.create(mode._impl$scandit_barcode_capture(), viewSettings.getF124673a());
        Intrinsics.i(nativeBarcodePickBasicOverlayCreate, "create(...)");
        this.f123420a = new a(nativeBarcodePickBasicOverlayCreate);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getF127086c() {
        return this.f123420a.f123432c;
    }

    public final void a(BarcodePickGuidanceHandler handler) {
        Intrinsics.j(handler, "handler");
        this.f123420a.f123430a.setGuidanceHandler(new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.h(handler));
    }

    public final NativeBarcodePickBasicOverlay a() {
        return this.f123420a.f123430a;
    }
}
