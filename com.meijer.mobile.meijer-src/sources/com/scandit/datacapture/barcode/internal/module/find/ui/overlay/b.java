package com.scandit.datacapture.barcode.internal.module.find.ui.overlay;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b extends ViewBasedDataCaptureOverlay implements c, BarcodeFindBasicOverlay {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f123207a;

    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.ViewBasedDataCaptureOverlay
    public final void _setDataCaptureView(DataCaptureView view) {
        Intrinsics.j(view, "view");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.BarcodeFindBasicOverlay
    public final void a(BarcodeFindGuidanceHandler handler) {
        Intrinsics.j(handler, "handler");
        this.f123207a.f123208a.setGuidanceHandler(new g(handler, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, BarcodeFind barcodeFind) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(barcodeFind, "barcodeFind");
        NativeBarcodeFindBasicOverlay nativeBarcodeFindBasicOverlayCreate = NativeBarcodeFindBasicOverlay.create(barcodeFind.getF121904a());
        Intrinsics.i(nativeBarcodeFindBasicOverlayCreate, "create(...)");
        this.f123207a = new d(nativeBarcodeFindBasicOverlayCreate);
    }

    @Override // com.scandit.datacapture.core.ui.overlay.DataCaptureOverlay, com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchAdvancedOverlayProxy
    /* renamed from: _dataCaptureOverlayImpl */
    public final NativeDataCaptureOverlay getF124960c() {
        return this.f123207a.f123209b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void b(String text) {
        Intrinsics.j(text, "text");
        d dVar = this.f123207a;
        dVar.getClass();
        Intrinsics.j(text, "text");
        dVar.f123208a.setTextForItemListUpdatedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void c(String text) {
        Intrinsics.j(text, "text");
        d dVar = this.f123207a;
        dVar.getClass();
        Intrinsics.j(text, "text");
        dVar.f123208a.setTextForTapShutterToResumeScreenHint(text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void d(String text) {
        Intrinsics.j(text, "text");
        d dVar = this.f123207a;
        dVar.getClass();
        Intrinsics.j(text, "text");
        dVar.f123208a.setTextForPointAtBarcodesToSearchHint(text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void e(String text) {
        Intrinsics.j(text, "text");
        d dVar = this.f123207a;
        dVar.getClass();
        Intrinsics.j(text, "text");
        dVar.f123208a.setTextForAllItemsFoundSuccessfullyHint(text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void f(String text) {
        Intrinsics.j(text, "text");
        d dVar = this.f123207a;
        dVar.getClass();
        Intrinsics.j(text, "text");
        dVar.f123208a.setTextForTapShutterToPauseScreenHint(text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void g(String text) {
        Intrinsics.j(text, "text");
        d dVar = this.f123207a;
        dVar.getClass();
        Intrinsics.j(text, "text");
        dVar.f123208a.setTextForItemListUpdatedWhenPausedHint(text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.c
    public final void a(String text) {
        Intrinsics.j(text, "text");
        d dVar = this.f123207a;
        dVar.getClass();
        Intrinsics.j(text, "text");
        dVar.f123208a.setTextForMoveCloserToBarcodesHint(text);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.overlay.a
    public final void a(View view) {
        Intrinsics.j(view, "view");
        addView(view);
    }
}
