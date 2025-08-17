package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.L;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.O;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.V;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.X;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.o1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.p1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.s1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.v1;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.y1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class w extends NativeBarcodeCountGuidanceHandler {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121677a;

    public w(J owner) {
        Intrinsics.j(owner, "owner");
        this.f121677a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void clear() {
        t tVar;
        BarcodeCountView barcodeCountView;
        J j10 = (J) this.f121677a.get();
        if (j10 != null) {
            com.scandit.datacapture.barcode.internal.module.ui.l lVar = ((y1) j10.f121626l).f122111b;
            if (lVar != null) {
                lVar.setVisibility(8);
                lVar.f123349d = null;
            }
            L.b((X) j10.f121627m, false, "");
            L.a((X) j10.f121627m, false, "");
            X x10 = (X) j10.f121627m;
            if (x10.f121940a) {
                x10.f121943d.a(new V(x10, 0.0f));
            }
        }
        J j11 = (J) this.f121677a.get();
        if (j11 == null || (tVar = j11.f121633s) == null || (barcodeCountView = (BarcodeCountView) ((com.scandit.datacapture.barcode.count.ui.view.i) tVar).f120858a.get()) == null) {
            return;
        }
        BarcodeCountView.access$clearIndicatorsOnMainThread(barcodeCountView);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setMoveCloserAndRescan(boolean z10, String str) {
        s1 s1Var;
        J j10 = (J) this.f121677a.get();
        if (j10 == null || (s1Var = j10.f121626l) == null) {
            return;
        }
        o1.b((y1) s1Var, z10, str);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setMoveFurtherAndRescan(boolean z10, String str) {
        s1 s1Var;
        J j10 = (J) this.f121677a.get();
        if (j10 == null || (s1Var = j10.f121626l) == null) {
            return;
        }
        o1.a((y1) s1Var, z10, str);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setScanning(boolean z10, String str) {
        O o10;
        J j10 = (J) this.f121677a.get();
        if (j10 == null || (o10 = j10.f121627m) == null) {
            return;
        }
        L.b((X) o10, z10, str);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setScanningProgress(int i10) {
        O o10;
        J j10 = (J) this.f121677a.get();
        if (j10 == null || (o10 = j10.f121627m) == null) {
            return;
        }
        float f10 = i10 / 100.0f;
        X x10 = (X) o10;
        if (x10.f121940a) {
            x10.f121943d.a(new V(x10, f10));
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountGuidanceHandler
    public final void setTapToScan(boolean z10, String str) {
        s1 s1Var;
        J j10 = (J) this.f121677a.get();
        if (j10 == null || (s1Var = j10.f121626l) == null) {
            return;
        }
        p1 onFinished = p1.f122056a;
        y1 y1Var = (y1) s1Var;
        Intrinsics.j(onFinished, "onFinished");
        if (y1Var.f122110a) {
            y1Var.f122112c.a(new v1(z10, y1Var, str, onFinished));
        }
    }
}
