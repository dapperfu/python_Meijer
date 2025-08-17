package com.scandit.datacapture.core.internal.module.source;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13369s {

    /* renamed from: a, reason: collision with root package name */
    public final C13373w f125115a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC13370t f125116b;

    /* renamed from: c, reason: collision with root package name */
    public int f125117c;

    /* renamed from: d, reason: collision with root package name */
    public int f125118d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f125119e;

    /* renamed from: f, reason: collision with root package name */
    public final C13365n f125120f;

    /* renamed from: g, reason: collision with root package name */
    public final HandlerC13368q f125121g;

    /* renamed from: h, reason: collision with root package name */
    public final J f125122h;

    /* renamed from: i, reason: collision with root package name */
    public final r f125123i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f125124j;

    /* renamed from: k, reason: collision with root package name */
    public final Camera.PreviewCallback f125125k;

    public static final void a(C13369s this$0, byte[] bArr, Camera camera) {
        Intrinsics.j(this$0, "this$0");
        if (bArr == null) {
            return;
        }
        this$0.getClass();
        NativeCameraFrameData nativeCameraFrameData = null;
        if (bArr.length == ((this$0.f125117c * this$0.f125118d) * 12) / 8) {
            J j10 = this$0.f125122h;
            NativeCameraFrameData nativeCameraFrameData2 = !j10.f124785b.isEmpty() ? (NativeCameraFrameData) j10.f124785b.pop() : null;
            if (nativeCameraFrameData2 != null) {
                NativeCameraCaptureParameters captureParameters = nativeCameraFrameData2.getCaptureParameters();
                if (captureParameters != null) {
                    Intrinsics.g(captureParameters);
                    captureParameters.clear();
                } else {
                    captureParameters = NativeCameraCaptureParameters.create();
                }
                NativeCameraCaptureParameters nativeCameraCaptureParameters = captureParameters;
                int i10 = this$0.f125117c;
                int i11 = this$0.f125118d;
                r rVar = this$0.f125123i;
                int cameraToNativeDeviceOrientation = this$0.f125120f.getCameraToNativeDeviceOrientation();
                NativeAxis nativeAxis = this$0.f125120f.shouldMirrorAroundYAxis() ? NativeAxis.Y : NativeAxis.NONE;
                Intrinsics.g(nativeCameraCaptureParameters);
                InterfaceC13370t cameraInfo = this$0.f125116b;
                Intrinsics.j(nativeCameraCaptureParameters, "<this>");
                Intrinsics.j(cameraInfo, "cameraInfo");
                NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey = NativeCameraCaptureParameterKey.POSITION;
                int i12 = ((b0) cameraInfo).f125016c;
                nativeCameraCaptureParameters.insertInt64(nativeCameraCaptureParameterKey, i12 != 0 ? i12 != 1 ? -1L : 2L : 1L);
                nativeCameraFrameData2.update(i10, i11, bArr, rVar, cameraToNativeDeviceOrientation, nativeAxis, nativeCameraCaptureParameters, null);
                nativeCameraFrameData = nativeCameraFrameData2;
            }
        }
        if (nativeCameraFrameData != null) {
            nativeCameraFrameData.retain();
            try {
                if (this$0.f125124j) {
                    this$0.f125119e.invoke(nativeCameraFrameData);
                }
                nativeCameraFrameData.release();
            } catch (Throwable th2) {
                nativeCameraFrameData.release();
                throw th2;
            }
        }
    }

    public C13369s(C13373w cameraWrapper, InterfaceC13370t cameraInfo, int i10, int i11, Function1 frameDataCallback, C13365n delegate) {
        Intrinsics.j(cameraWrapper, "cameraWrapper");
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(frameDataCallback, "frameDataCallback");
        Intrinsics.j(delegate, "delegate");
        this.f125115a = cameraWrapper;
        this.f125116b = cameraInfo;
        this.f125117c = i10;
        this.f125118d = i11;
        this.f125119e = frameDataCallback;
        this.f125120f = delegate;
        this.f125121g = new HandlerC13368q(this);
        this.f125122h = new J(3);
        this.f125123i = new r(this);
        this.f125124j = true;
        this.f125125k = new Camera.PreviewCallback() { // from class: com.scandit.datacapture.core.internal.module.source.f0
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                C13369s.a(this.f125080a, bArr, camera);
            }
        };
        a();
        for (int i12 = 0; i12 < 3; i12++) {
            a(new byte[((this.f125117c * this.f125118d) * 12) / 8]);
        }
    }

    public final void b() {
        Camera camera = this.f125115a.f125126a;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(null);
        }
    }

    public final void a() {
        Camera camera = this.f125115a.f125126a;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(this.f125125k);
        }
    }

    public final void a(byte[] bArr) {
        Camera camera;
        if (bArr.length != ((this.f125117c * this.f125118d) * 12) / 8 || (camera = this.f125115a.f125126a) == null) {
            return;
        }
        camera.addCallbackBuffer(bArr);
    }
}
