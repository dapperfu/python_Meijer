package com.scandit.datacapture.barcode.count.ui.overlay;

import com.scandit.datacapture.core.ui.DataCaptureViewListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.count.ui.overlay.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13190a implements DataCaptureViewListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121733a;

    public C13190a(BarcodeCountBasicOverlay owner) {
        Intrinsics.j(owner, "owner");
        this.f121733a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewListener
    public final void onSizeChanged(int i10, int i11, int i12) {
        BarcodeCountBasicOverlayCallback callback;
        BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.f121733a.get();
        if (barcodeCountBasicOverlay == null || (callback = barcodeCountBasicOverlay.getCallback()) == null) {
            return;
        }
        callback.onDataCaptureViewSizeChanged();
    }
}
