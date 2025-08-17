package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class C extends CameraCaptureSession.StateCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13349w f124835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f124836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Surface f124837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ImageReader f124838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0 f124839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Handler f124840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CaptureRequest f124841g;

    public C(InterfaceC13349w interfaceC13349w, CameraDevice cameraDevice, Surface surface, ImageReader imageReader, C0 c02, Handler handler, CaptureRequest captureRequest) {
        this.f124835a = interfaceC13349w;
        this.f124836b = cameraDevice;
        this.f124837c = surface;
        this.f124838d = imageReader;
        this.f124839e = c02;
        this.f124840f = handler;
        this.f124841g = captureRequest;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession session) {
        Intrinsics.j(session, "session");
        ((C13340m) this.f124835a).a(I.f124848a);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession session) {
        Intrinsics.j(session, "session");
        ((C13340m) this.f124835a).a(new J(new d0(this.f124836b, session, this.f124837c, this.f124838d, this.f124839e, this.f124840f, this.f124841g)));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession session) {
        Intrinsics.j(session, "session");
        ((C13340m) this.f124835a).f124931b.f124970s = false;
    }
}
