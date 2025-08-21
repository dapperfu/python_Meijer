package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements BarcodeSelectionBrushProvider {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124808a;

    public d(BarcodeSelectionBasicOverlay owner) {
        Intrinsics.j(owner, "owner");
        this.f124808a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider
    public final Brush brushForBarcode(Barcode barcode) {
        BarcodeSelectionBrushProvider trackedBarcodeBrushProvider;
        Intrinsics.j(barcode, "barcode");
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = (BarcodeSelectionBasicOverlay) this.f124808a.get();
        if (barcodeSelectionBasicOverlay == null || (trackedBarcodeBrushProvider = barcodeSelectionBasicOverlay.getTrackedBarcodeBrushProvider()) == null) {
            return null;
        }
        return trackedBarcodeBrushProvider.brushForBarcode(barcode);
    }
}
