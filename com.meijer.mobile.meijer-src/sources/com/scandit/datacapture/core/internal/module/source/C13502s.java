package com.scandit.datacapture.core.internal.module.source;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.source.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13502s {

    /* renamed from: a, reason: collision with root package name */
    public final C13506w f126067a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC13503t f126068b;

    /* renamed from: c, reason: collision with root package name */
    public int f126069c;

    /* renamed from: d, reason: collision with root package name */
    public int f126070d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f126071e;

    /* renamed from: f, reason: collision with root package name */
    public final C13498n f126072f;

    /* renamed from: g, reason: collision with root package name */
    public final HandlerC13501q f126073g;

    /* renamed from: h, reason: collision with root package name */
    public final J f126074h;

    /* renamed from: i, reason: collision with root package name */
    public final r f126075i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f126076j;

    /* renamed from: k, reason: collision with root package name */
    public final Camera.PreviewCallback f126077k;

    public static final void a(C13502s this$0, byte[] bArr, Camera camera) {
        Intrinsics.j(this$0, "this$0");
        if (bArr == null) {
            return;
        }
        this$0.getClass();
        NativeCameraFrameData nativeCameraFrameData = null;
        if (bArr.length == ((this$0.f126069c * this$0.f126070d) * 12) / 8) {
            J j10 = this$0.f126074h;
            NativeCameraFrameData nativeCameraFrameData2 = !j10.f125737b.isEmpty() ? (NativeCameraFrameData) j10.f125737b.pop() : null;
            if (nativeCameraFrameData2 != null) {
                NativeCameraCaptureParameters captureParameters = nativeCameraFrameData2.getCaptureParameters();
                if (captureParameters != null) {
                    Intrinsics.g(captureParameters);
                    captureParameters.clear();
                } else {
                    captureParameters = NativeCameraCaptureParameters.create();
                }
                NativeCameraCaptureParameters nativeCameraCaptureParameters = captureParameters;
                int i10 = this$0.f126069c;
                int i11 = this$0.f126070d;
                r rVar = this$0.f126075i;
                int cameraToNativeDeviceOrientation = this$0.f126072f.getCameraToNativeDeviceOrientation();
                NativeAxis nativeAxis = this$0.f126072f.shouldMirrorAroundYAxis() ? NativeAxis.Y : NativeAxis.NONE;
                Intrinsics.g(nativeCameraCaptureParameters);
                InterfaceC13503t cameraInfo = this$0.f126068b;
                Intrinsics.j(nativeCameraCaptureParameters, "<this>");
                Intrinsics.j(cameraInfo, "cameraInfo");
                NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey = NativeCameraCaptureParameterKey.POSITION;
                int i12 = ((b0) cameraInfo).f125968c;
                nativeCameraCaptureParameters.insertInt64(nativeCameraCaptureParameterKey, i12 != 0 ? i12 != 1 ? -1L : 2L : 1L);
                nativeCameraFrameData2.update(i10, i11, bArr, rVar, cameraToNativeDeviceOrientation, nativeAxis, nativeCameraCaptureParameters, null);
                nativeCameraFrameData = nativeCameraFrameData2;
            }
        }
        if (nativeCameraFrameData != null) {
            nativeCameraFrameData.retain();
            try {
                if (this$0.f126076j) {
                    this$0.f126071e.invoke(nativeCameraFrameData);
                }
                nativeCameraFrameData.release();
            } catch (Throwable th2) {
                nativeCameraFrameData.release();
                throw th2;
            }
        }
    }

    public C13502s(C13506w cameraWrapper, InterfaceC13503t cameraInfo, int i10, int i11, Function1 frameDataCallback, C13498n delegate) {
        Intrinsics.j(cameraWrapper, "cameraWrapper");
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(frameDataCallback, "frameDataCallback");
        Intrinsics.j(delegate, "delegate");
        this.f126067a = cameraWrapper;
        this.f126068b = cameraInfo;
        this.f126069c = i10;
        this.f126070d = i11;
        this.f126071e = frameDataCallback;
        this.f126072f = delegate;
        this.f126073g = new HandlerC13501q(this);
        this.f126074h = new J(3);
        this.f126075i = new r(this);
        this.f126076j = true;
        this.f126077k = new Camera.PreviewCallback() { // from class: com.scandit.datacapture.core.internal.module.source.f0
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                C13502s.a(this.f126032a, bArr, camera);
            }
        };
        a();
        for (int i12 = 0; i12 < 3; i12++) {
            a(new byte[((this.f126069c * this.f126070d) * 12) / 8]);
        }
    }

    public final void b() {
        Camera camera = this.f126067a.f126078a;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(null);
        }
    }

    public final void a() {
        Camera camera = this.f126067a.f126078a;
        if (camera != null) {
            camera.setPreviewCallbackWithBuffer(this.f126077k);
        }
    }

    public final void a(byte[] bArr) {
        Camera camera;
        if (bArr.length != ((this.f126069c * this.f126070d) * 12) / 8 || (camera = this.f126067a.f126078a) == null) {
            return;
        }
        camera.addCallbackBuffer(bArr);
    }
}
