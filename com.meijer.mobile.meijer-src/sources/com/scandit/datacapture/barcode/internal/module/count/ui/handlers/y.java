package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.J0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class y implements com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f122631a;

    public y(J owner) {
        Intrinsics.j(owner, "owner");
        this.f122631a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void a(boolean z10) {
        t tVar;
        BarcodeCountView barcodeCountView;
        J j10 = (J) this.f122631a.get();
        if (j10 == null || (tVar = j10.f122585s) == null || (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) == null) {
            return;
        }
        BarcodeCountView.access$updateModeFeedback(barcodeCountView);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void b(boolean z10) {
        t tVar;
        J j10 = (J) this.f122631a.get();
        if (j10 != null) {
            NativeBarcodeCountBasicOverlayColorScheme colorScheme = z10 ? NativeBarcodeCountBasicOverlayColorScheme.ACCESSIBLE : NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
            j10.f122582p.setColorScheme$scandit_barcode_capture(colorScheme);
            J j11 = (J) this.f122631a.get();
            if (j11 == null || (tVar = j11.f122585s) == null) {
                return;
            }
            Intrinsics.j(colorScheme, "colorScheme");
            BarcodeCountView barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get();
            if (barcodeCountView != null) {
                BarcodeCountView.access$onToolbarColorSchemeChanged(barcodeCountView, colorScheme);
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void c(boolean z10) {
        J j10 = (J) this.f122631a.get();
        if (j10 != null) {
            J0 j02 = (J0) j10.f122567a;
            j02.f122853k = true;
            j02.f122846d = z10;
            j02.a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.b
    public final void d(boolean z10) {
        t tVar;
        BarcodeCountView barcodeCountView;
        J j10 = (J) this.f122631a.get();
        if (j10 == null || (tVar = j10.f122585s) == null || (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f121810a.get()) == null) {
            return;
        }
        BarcodeCountView.access$updateModeFeedback(barcodeCountView);
    }
}
