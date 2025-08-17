package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.core.ui.DataCaptureViewListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.count.ui.overlay.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13057a implements DataCaptureViewListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120781a;

    public C13057a(BarcodeCountBasicOverlay owner) {
        Intrinsics.j(owner, "owner");
        this.f120781a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewListener
    public final void onSizeChanged(int i10, int i11, int i12) {
        BarcodeCountBasicOverlayCallback callback;
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f120781a.get();
        if (barcodeCountBasicOverlay == null || (callback = barcodeCountBasicOverlay.getCallback()) == null) {
            return;
        }
        callback.onDataCaptureViewSizeChanged();
    }
}
