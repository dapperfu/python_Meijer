package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d0 implements InterfaceC13328b0 {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice f124888a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession f124889b;

    /* renamed from: c, reason: collision with root package name */
    public final Surface f124890c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageReader f124891d;

    /* renamed from: e, reason: collision with root package name */
    public final C0 f124892e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f124893f;

    /* renamed from: g, reason: collision with root package name */
    public final CaptureRequest f124894g;

    public final boolean a() throws CameraAccessException {
        try {
            this.f124889b.abortCaptures();
            this.f124889b.capture(this.f124894g, new C13330c0(), this.f124893f);
            return true;
        } catch (CameraAccessException | IllegalStateException unused) {
            return false;
        }
    }

    public d0(CameraDevice cameraDevice, CameraCaptureSession androidSession, Surface previewSurface, ImageReader yuvImageReader, C0 imageAvailableListener, Handler handler, CaptureRequest cleanupRequest) {
        Intrinsics.j(cameraDevice, "cameraDevice");
        Intrinsics.j(androidSession, "androidSession");
        Intrinsics.j(previewSurface, "previewSurface");
        Intrinsics.j(yuvImageReader, "yuvImageReader");
        Intrinsics.j(imageAvailableListener, "imageAvailableListener");
        Intrinsics.j(handler, "handler");
        Intrinsics.j(cleanupRequest, "cleanupRequest");
        this.f124888a = cameraDevice;
        this.f124889b = androidSession;
        this.f124890c = previewSurface;
        this.f124891d = yuvImageReader;
        this.f124892e = imageAvailableListener;
        this.f124893f = handler;
        this.f124894g = cleanupRequest;
    }

    public final void b() throws CameraAccessException {
        try {
            this.f124889b.abortCaptures();
            this.f124889b.close();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        this.f124891d.getSurface().release();
    }

    public final boolean a(m0 requestSettings, C13329c callback) throws CameraAccessException {
        Intrinsics.j(requestSettings, "requestSettings");
        Intrinsics.j(callback, "callback");
        try {
            CameraDevice cameraDevice = this.f124888a;
            Surface surface = this.f124890c;
            Surface surface2 = this.f124891d.getSurface();
            Intrinsics.i(surface2, "getSurface(...)");
            this.f124889b.setRepeatingRequest(requestSettings.a(E.a(cameraDevice, surface, surface2)), new H(callback), this.f124893f);
            return true;
        } catch (CameraAccessException e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            return false;
        } catch (IllegalArgumentException e11) {
            Intrinsics.j(e11, "e");
            e11.printStackTrace();
            return false;
        } catch (IllegalStateException e12) {
            Intrinsics.j(e12, "e");
            e12.printStackTrace();
            return false;
        } catch (SecurityException e13) {
            Intrinsics.j(e13, "e");
            e13.printStackTrace();
            return false;
        }
    }

    public final boolean a(m0 requestSettings) throws CameraAccessException {
        C13331d callback = C13331d.f124887a;
        Intrinsics.j(requestSettings, "requestSettings");
        Intrinsics.j(callback, "callback");
        try {
            CameraDevice cameraDevice = this.f124888a;
            Surface surface = this.f124890c;
            Surface surface2 = this.f124891d.getSurface();
            Intrinsics.i(surface2, "getSurface(...)");
            this.f124889b.capture(requestSettings.a(E.a(cameraDevice, surface, surface2)), new H(callback), this.f124893f);
            return true;
        } catch (CameraAccessException e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            return false;
        } catch (IllegalArgumentException e11) {
            Intrinsics.j(e11, "e");
            e11.printStackTrace();
            return false;
        } catch (IllegalStateException e12) {
            Intrinsics.j(e12, "e");
            e12.printStackTrace();
            return false;
        } catch (SecurityException e13) {
            Intrinsics.j(e13, "e");
            e13.printStackTrace();
            return false;
        }
    }
}
