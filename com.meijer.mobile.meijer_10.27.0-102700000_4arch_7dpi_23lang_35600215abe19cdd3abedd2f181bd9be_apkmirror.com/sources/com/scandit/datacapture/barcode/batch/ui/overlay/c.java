package com.scandit.datacapture.barcode.batch.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements BarcodeBatchBasicOverlayListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120505a;

    public c(BarcodeBatchBasicOverlay owner) {
        Intrinsics.j(owner, "owner");
        this.f120505a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlayListener
    public final Brush brushForTrackedBarcode(BarcodeBatchBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeBatchBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeBatchBasicOverlay barcodeBatchBasicOverlay = (BarcodeBatchBasicOverlay) this.f120505a.get();
        if (barcodeBatchBasicOverlay != null && (listener = barcodeBatchBasicOverlay.getListener()) != null) {
            return listener.brushForTrackedBarcode(overlay, trackedBarcode);
        }
        BarcodeBatchBasicOverlay barcodeBatchBasicOverlay2 = (BarcodeBatchBasicOverlay) this.f120505a.get();
        if (barcodeBatchBasicOverlay2 != null) {
            return barcodeBatchBasicOverlay2.getBrush();
        }
        return null;
    }

    @Override // com.scandit.datacapture.barcode.batch.ui.overlay.BarcodeBatchBasicOverlayListener
    public final void onTrackedBarcodeTapped(BarcodeBatchBasicOverlay overlay, TrackedBarcode trackedBarcode) {
        BarcodeBatchBasicOverlayListener listener;
        Intrinsics.j(overlay, "overlay");
        Intrinsics.j(trackedBarcode, "trackedBarcode");
        BarcodeBatchBasicOverlay barcodeBatchBasicOverlay = (BarcodeBatchBasicOverlay) this.f120505a.get();
        if (barcodeBatchBasicOverlay == null || (listener = barcodeBatchBasicOverlay.getListener()) == null) {
            return;
        }
        listener.onTrackedBarcodeTapped(overlay, trackedBarcode);
    }
}
