package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements BarcodeCountBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120851a;

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForUnrecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onUnrecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
    }

    public c(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f120851a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForAcceptedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return null;
        }
        return listener.brushForAcceptedBarcode(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return null;
        }
        return listener.brushForRecognizedBarcode(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRecognizedBarcodeNotInList(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return null;
        }
        return listener.brushForRecognizedBarcodeNotInList(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final Brush brushForRejectedBarcode(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return null;
        }
        return listener.brushForRejectedBarcode(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onAcceptedTrackedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return;
        }
        listener.onAcceptedBarcodeTapped(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onClusterTapped(BarcodeCountBasicOverlay overlay, NativeCluster cluster) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(cluster, "cluster");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return;
        }
        listener.onClusterTapped(barcodeCountView, new Cluster(cluster));
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onFilteredBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode filteredBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(filteredBarcode, "filteredBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return;
        }
        listener.onFilteredBarcodeTapped(barcodeCountView, filteredBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeNotInListTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return;
        }
        listener.onRecognizedBarcodeNotInListTapped(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRecognizedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return;
        }
        listener.onRecognizedBarcodeTapped(barcodeCountView, trackedBarcode);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlayListener
    public final void onRejectedTrackedBarcodeTapped(BarcodeCountBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeCountViewListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f120851a.get();
        if (barcodeCountView == null || (listener = barcodeCountView.getListener()) == null) {
            return;
        }
        listener.onRejectedBarcodeTapped(barcodeCountView, trackedBarcode);
    }
}
