package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class C extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13482w f125787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f125788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Surface f125789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ImageReader f125790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0 f125791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Handler f125792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f125793g;

    public C(InterfaceC13482w interfaceC13482w, CameraDevice cameraDevice, Surface surface, ImageReader imageReader, C0 c02, Handler handler, CaptureRequest captureRequest) {
        this.f125787a = interfaceC13482w;
        this.f125788b = cameraDevice;
        this.f125789c = surface;
        this.f125790d = imageReader;
        this.f125791e = c02;
        this.f125792f = handler;
        this.f125793g = captureRequest;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession session) {
        Intrinsics.j(session, "session");
        ((C13473m) this.f125787a).a(I.f125800a);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession session) {
        Intrinsics.j(session, "session");
        ((C13473m) this.f125787a).a(new J(new d0(this.f125788b, session, this.f125789c, this.f125790d, this.f125791e, this.f125792f, this.f125793g)));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession session) {
        Intrinsics.j(session, "session");
        ((C13473m) this.f125787a).f125883b.f125922s = false;
    }
}
