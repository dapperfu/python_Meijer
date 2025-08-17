package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class H extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13326a0 f124847a;

    public H(InterfaceC13326a0 callback) {
        Intrinsics.j(callback, "callback");
        this.f124847a = callback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        Intrinsics.j(session, "session");
        Intrinsics.j(request, "request");
        Intrinsics.j(result, "result");
        this.f124847a.a(new G(result));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j10, long j11) {
        Intrinsics.j(session, "session");
        Intrinsics.j(request, "request");
        this.f124847a.a(j10);
    }
}
