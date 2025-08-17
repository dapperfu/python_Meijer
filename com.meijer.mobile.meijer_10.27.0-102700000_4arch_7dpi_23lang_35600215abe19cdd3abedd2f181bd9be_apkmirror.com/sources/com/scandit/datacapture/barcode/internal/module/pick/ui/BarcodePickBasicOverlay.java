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

/* loaded from: classes11.dex */
public final class BarcodePickBasicOverlay extends ViewBasedDataCaptureOverlay implements DataCaptureOverlay {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ a f122468a;

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _cleanupViews() {
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _setDataCaptureView(DataCaptureView view) {
        Intrinsics.j(view, "view");
    }

    public final void a(BarcodePickViewSettings viewSettings) {
        Intrinsics.j(viewSettings, "viewSettings");
        a aVar = this.f122468a;
        aVar.getClass();
        Intrinsics.j(viewSettings, "viewSettings");
        NativeBarcodePickViewSettings f123721a = viewSettings.getF123721a();
        aVar.f122479b.put(Reflection.b(NativeBarcodePickViewSettings.class), null, f123721a, viewSettings);
        aVar.f122478a.applyViewSettings(f123721a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodePickBasicOverlay(Context context, BarcodePick mode, BarcodePickViewSettings viewSettings) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(viewSettings, "viewSettings");
        NativeBarcodePickBasicOverlay nativeBarcodePickBasicOverlayCreate = NativeBarcodePickBasicOverlay.create(mode._impl$scandit_barcode_capture(), viewSettings.getF123721a());
        Intrinsics.i(nativeBarcodePickBasicOverlayCreate, "create(...)");
        this.f122468a = new a(nativeBarcodePickBasicOverlayCreate);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getF126134c() {
        return this.f122468a.f122480c;
    }

    public final void a(BarcodePickGuidanceHandler handler) {
        Intrinsics.j(handler, "handler");
        this.f122468a.f122478a.setGuidanceHandler(new com.scandit.datacapture.barcode.internal.module.pick.ui.guidances.h(handler));
    }

    public final NativeBarcodePickBasicOverlay a() {
        return this.f122468a.f122478a;
    }
}
