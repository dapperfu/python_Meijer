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

/* loaded from: classes12.dex */
public final class s implements BarcodeCountCameraHandler {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCount f122625a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f122626b;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountCameraHandler
    public final void a(final com.scandit.datacapture.barcode.count.ui.view.h onFocus) {
        Intrinsics.j(onFocus, "onFocus");
        if (!this.f122625a.getTriggerAutoFocusOnShutter$scandit_barcode_capture()) {
            onFocus.invoke();
            return;
        }
        DataCaptureContext f124698c = this.f122625a.getF121553c();
        FrameSource frameSource = f124698c != null ? f124698c.get_frameSource() : null;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (camera == null) {
            onFocus.invoke();
        } else {
            camera.getF126823a().triggerAutoFocus();
            this.f122626b.postDelayed(new Runnable() { // from class: Lt.b
                @Override // java.lang.Runnable
                public final void run() {
                    s.a(onFocus);
                }
            }, this.f122625a.getTriggerAutoFocusDelay$scandit_barcode_capture());
        }
    }

    public s(BarcodeCount barcodeCount) {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.j(barcodeCount, "barcodeCount");
        Intrinsics.j(handler, "handler");
        this.f122625a = barcodeCount;
        this.f122626b = handler;
    }

    public static final void a(Function0 tmp0) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke();
    }
}
