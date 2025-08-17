package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import android.os.Handler;
import android.os.Looper;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.s;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class s implements BarcodeCountCameraHandler {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCount f121673a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f121674b;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountCameraHandler
    public final void a(final com.scandit.datacapture.barcode.count.ui.view.h onFocus) {
        Intrinsics.j(onFocus, "onFocus");
        if (!this.f121673a.getTriggerAutoFocusOnShutter$scandit_barcode_capture()) {
            onFocus.invoke();
            return;
        }
        DataCaptureContext f123746c = this.f121673a.getF120601c();
        FrameSource frameSource = f123746c != null ? f123746c.get_frameSource() : null;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (camera == null) {
            onFocus.invoke();
        } else {
            camera.getF125871a().triggerAutoFocus();
            this.f121674b.postDelayed(new Runnable() { // from class: Lt.b
                @Override // java.lang.Runnable
                public final void run() {
                    s.a(onFocus);
                }
            }, this.f121673a.getTriggerAutoFocusDelay$scandit_barcode_capture());
        }
    }

    public s(BarcodeCount barcodeCount) {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.j(barcodeCount, "barcodeCount");
        Intrinsics.j(handler, "handler");
        this.f121673a = barcodeCount;
        this.f121674b = handler;
    }

    public static final void a(Function0 tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
