package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.internal.sdk.extensions.BrushExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.count.ui.overlay.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13193d implements BarcodeCountBasicOverlayListener, BarcodeCountBasicOverlayUiListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121736a;

    public C13193d(BarcodeCountBasicOverlay owner) {
        Intrinsics.j(owner, "owner");
        this.f121736a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForAcceptedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForAcceptedBarcode;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getListener();
        if (listener != null && (brushBrushForAcceptedBarcode = listener.brushForAcceptedBarcode(overlay, trackedBarcode)) != null) {
            return brushBrushForAcceptedBarcode;
        }
        NativeBrush acceptedBrush = overlay.getF121725a().getAcceptedBrush();
        if (acceptedBrush == null) {
            return null;
        }
        Intrinsics.g(acceptedBrush);
        return BrushExtensionsKt.of(Brush.INSTANCE, acceptedBrush);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForRecognizedBarcode;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getListener();
        if (listener != null && (brushBrushForRecognizedBarcode = listener.brushForRecognizedBarcode(overlay, trackedBarcode)) != null) {
            return brushBrushForRecognizedBarcode;
        }
        NativeBrush scannedBrush = overlay.getF121725a().getScannedBrush();
        if (scannedBrush == null) {
            return null;
        }
        Intrinsics.g(scannedBrush);
        return BrushExtensionsKt.of(Brush.INSTANCE, scannedBrush);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcodeNotInList(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForRecognizedBarcodeNotInList;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getListener();
        if (listener != null && (brushBrushForRecognizedBarcodeNotInList = listener.brushForRecognizedBarcodeNotInList(overlay, trackedBarcode)) != null) {
            return brushBrushForRecognizedBarcodeNotInList;
        }
        NativeBrush notInListBrush = overlay.getF121725a().getNotInListBrush();
        if (notInListBrush == null) {
            return null;
        }
        Intrinsics.g(notInListBrush);
        return BrushExtensionsKt.of(Brush.INSTANCE, notInListBrush);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRejectedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForRejectedBarcode;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getListener();
        if (listener != null && (brushBrushForRejectedBarcode = listener.brushForRejectedBarcode(overlay, trackedBarcode)) != null) {
            return brushBrushForRejectedBarcode;
        }
        NativeBrush rejectedBrush = overlay.getF121725a().getRejectedBrush();
        if (rejectedBrush == null) {
            return null;
        }
        Intrinsics.g(rejectedBrush);
        return BrushExtensionsKt.of(Brush.INSTANCE, rejectedBrush);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForUnrecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Brush brushBrushForUnrecognizedBarcode;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null) {
            return null;
        }
        BarcodeCountBasicOverlayListener listener = barcodeCountBasicOverlay.getListener();
        if (listener != null && (brushBrushForUnrecognizedBarcode = listener.brushForUnrecognizedBarcode(overlay, trackedBarcode)) != null) {
            return brushBrushForUnrecognizedBarcode;
        }
        NativeBrush unscannedBrush = overlay.getF121725a().getUnscannedBrush();
        if (unscannedBrush == null) {
            return null;
        }
        Intrinsics.g(unscannedBrush);
        return BrushExtensionsKt.of(Brush.INSTANCE, unscannedBrush);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onAcceptedTrackedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getListener()) == null) {
            return;
        }
        listener.onAcceptedTrackedBarcodeTapped(overlay, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onExitButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountBasicOverlayUiListener uiListener;
        Intrinsics.j(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (uiListener = barcodeCountBasicOverlay.getUiListener()) == null) {
            return;
        }
        uiListener.onExitButtonTapped(barcodeCountBasicOverlay);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onFilteredBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode filteredBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(filteredBarcode, "filteredBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getListener()) == null) {
            return;
        }
        listener.onFilteredBarcodeTapped(overlay, filteredBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayUiListener
    public final void onListButtonTapped(BarcodeCountBasicOverlay overlay) {
        BarcodeCountBasicOverlayUiListener uiListener;
        Intrinsics.j(overlay, "overlay");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (uiListener = barcodeCountBasicOverlay.getUiListener()) == null) {
            return;
        }
        uiListener.onListButtonTapped(barcodeCountBasicOverlay);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeNotInListTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getListener()) == null) {
            return;
        }
        listener.onRecognizedBarcodeNotInListTapped(overlay, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getListener()) == null) {
            return;
        }
        listener.onRecognizedBarcodeTapped(overlay, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRejectedTrackedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getListener()) == null) {
            return;
        }
        listener.onRejectedTrackedBarcodeTapped(overlay, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onUnrecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121736a.get();
        if (barcodeCountBasicOverlay == null || (listener = barcodeCountBasicOverlay.getListener()) == null) {
            return;
        }
        listener.onUnrecognizedBarcodeTapped(overlay, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onClusterTapped(BarcodeCountBasicOverlay barcodeCountBasicOverlay, NativeCluster nativeCluster) {
        BarcodeCountBasicOverlayListener.DefaultImpls.onClusterTapped(this, barcodeCountBasicOverlay, nativeCluster);
    }
}
