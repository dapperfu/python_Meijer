package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d0 implements InterfaceC13461b0 {

    /* renamed from: a, reason: collision with root package name */
    public final CameraDevice f125840a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraCaptureSession f125841b;

    /* renamed from: c, reason: collision with root package name */
    public final Surface f125842c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageReader f125843d;

    /* renamed from: e, reason: collision with root package name */
    public final C0 f125844e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f125845f;

    /* renamed from: g, reason: collision with root package name */
    public final CaptureRequest f125846g;

    public final boolean a() throws CameraAccessException {
        try {
            this.f125841b.abortCaptures();
            this.f125841b.capture(this.f125846g, new C13463c0(), this.f125845f);
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
        this.f125840a = cameraDevice;
        this.f125841b = androidSession;
        this.f125842c = previewSurface;
        this.f125843d = yuvImageReader;
        this.f125844e = imageAvailableListener;
        this.f125845f = handler;
        this.f125846g = cleanupRequest;
    }

    public final void b() throws CameraAccessException {
        try {
            this.f125841b.abortCaptures();
            this.f125841b.close();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        this.f125843d.getSurface().release();
    }

    public final boolean a(m0 requestSettings, C13462c callback) throws CameraAccessException {
        Intrinsics.j(requestSettings, "requestSettings");
        Intrinsics.j(callback, "callback");
        try {
            CameraDevice cameraDevice = this.f125840a;
            Surface surface = this.f125842c;
            Surface surface2 = this.f125843d.getSurface();
            Intrinsics.i(surface2, "getSurface(...)");
            this.f125841b.setRepeatingRequest(requestSettings.a(E.a(cameraDevice, surface, surface2)), new H(callback), this.f125845f);
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
        C13464d callback = C13464d.f125839a;
        Intrinsics.j(requestSettings, "requestSettings");
        Intrinsics.j(callback, "callback");
        try {
            CameraDevice cameraDevice = this.f125840a;
            Surface surface = this.f125842c;
            Surface surface2 = this.f125843d.getSurface();
            Intrinsics.i(surface2, "getSurface(...)");
            this.f125841b.capture(requestSettings.a(E.a(cameraDevice, surface, surface2)), new H(callback), this.f125845f);
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
