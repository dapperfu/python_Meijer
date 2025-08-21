package com.scandit.datacapture.barcode.selection.ui.overlay;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements BarcodeSelectionBrushProvider {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124805a;

    public a(BarcodeSelectionBasicOverlay owner) {
        Intrinsics.j(owner, "owner");
        this.f124805a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionBrushProvider
    public final Brush brushForBarcode(Barcode barcode) {
        BarcodeSelectionBrushProvider aimedBarcodeBrushProvider;
        Intrinsics.j(barcode, "barcode");
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = (BarcodeSelectionBasicOverlay) this.f124805a.get();
        if (barcodeSelectionBasicOverlay == null || (aimedBarcodeBrushProvider = barcodeSelectionBasicOverlay.getAimedBarcodeBrushProvider()) == null) {
            return null;
        }
        return aimedBarcodeBrushProvider.brushForBarcode(barcode);
    }
}
