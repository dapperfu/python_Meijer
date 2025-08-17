package com.scandit.datacapture.core.internal.module.source;

import android.hardware.Camera;
import android.util.Range;
import com.fullstory.FS;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import com.scandit.datacapture.core.internal.sdk.data.DisposableResource;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.GraphicsExtensionsKt;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchState;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.core.internal.module.source.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13365n extends NativeCameraDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13370t f125097a;

    /* renamed from: b, reason: collision with root package name */
    public final CameraProfile f125098b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f125099c;

    /* renamed from: d, reason: collision with root package name */
    public final C13373w f125100d;

    /* renamed from: e, reason: collision with root package name */
    public HandlerC13324a f125101e;

    /* renamed from: f, reason: collision with root package name */
    public final DisposableResource f125102f;

    /* renamed from: g, reason: collision with root package name */
    public C13369s f125103g;

    /* renamed from: h, reason: collision with root package name */
    public Subscription f125104h;

    /* renamed from: i, reason: collision with root package name */
    public Size2 f125105i;

    /* renamed from: j, reason: collision with root package name */
    public WeakReference f125106j;

    /* renamed from: k, reason: collision with root package name */
    public float f125107k;

    /* renamed from: l, reason: collision with root package name */
    public NativeCameraDelegateSettings f125108l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f125109m;

    public final void a(boolean z10) {
        Subscription subscription = this.f125104h;
        if (subscription != null) {
            subscription.use(new C13357f(z10));
        }
        C13369s c13369s = this.f125103g;
        if (c13369s == null) {
            return;
        }
        c13369s.f125124j = z10;
    }

    public final boolean b() {
        try {
            Camera.Parameters parameters = this.f125100d.f125128c;
            if (parameters != null) {
                parameters.setFlashMode("off");
                a(parameters);
            }
            C13373w c13373w = this.f125100d;
            Camera camera = c13373w.f125126a;
            if (camera != null) {
                camera.stopPreview();
            }
            c13373w.f125127b.set(false);
            return true;
        } catch (Exception e10) {
            Intrinsics.j(e10, "e");
            e10.printStackTrace();
            return false;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasManualLensPositionControl() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTimestampRealtime() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean setFixedLensPosition(float f10) {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void shutDown() throws Exception {
        try {
            try {
                HandlerC13324a handlerC13324a = this.f125101e;
                if (handlerC13324a != null) {
                    handlerC13324a.removeMessages(4);
                }
                C13369s c13369s = this.f125103g;
                if (c13369s != null) {
                    c13369s.b();
                }
                this.f125103g = null;
                C13373w c13373w = this.f125100d;
                Camera camera = c13373w.f125126a;
                c13373w.f125126a = null;
                c13373w.f125128c = null;
                if (camera != null) {
                    camera.release();
                }
                c13373w.f125127b.set(false);
            } catch (Exception e10) {
                Intrinsics.j(e10, "e");
                e10.printStackTrace();
            }
            Subscription subscription = this.f125104h;
            if (subscription != null) {
                subscription.dispose();
            }
            this.f125108l = null;
        } catch (Exception e11) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e11);
            throw e11;
        }
    }

    public C13365n(InterfaceC13370t cameraInfo, CameraProfile cameraProfile, H frameDataCallback) {
        Intrinsics.j(cameraInfo, "cameraInfo");
        Intrinsics.j(cameraProfile, "cameraProfile");
        Intrinsics.j(frameDataCallback, "frameDataCallback");
        this.f125097a = cameraInfo;
        this.f125098b = cameraProfile;
        this.f125099c = frameDataCallback;
        this.f125100d = new C13373w();
        this.f125102f = com.scandit.datacapture.core.internal.module.gl.g.f124630b;
        this.f125105i = new Size2(0.0f, 0.0f);
        this.f125106j = new WeakReference(null);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void bootUpWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(whenDone, "whenDone");
        try {
            a(settings, new C13356e(whenDone, this));
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final NativeCameraApi getCameraApi() {
        return NativeCameraApi.CAMERA1;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final String getCameraId() {
        return ((b0) this.f125097a).f125014a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.scandit.datacapture.core.internal.module.source.NativeCameraInfo getCameraInfo() {
        /*
            r4 = this;
            com.scandit.datacapture.core.internal.module.source.NativeCameraInfo r0 = new com.scandit.datacapture.core.internal.module.source.NativeCameraInfo
            com.scandit.datacapture.core.internal.module.source.w r1 = r4.f125100d
            android.hardware.Camera$Parameters r1 = r1.f125128c
            if (r1 == 0) goto L3b
            boolean r2 = r1.isZoomSupported()
            if (r2 == 0) goto L3b
            java.util.List r1 = r1.getZoomRatios()
            int r2 = r1.size()
            if (r2 <= 0) goto L3b
            kotlin.jvm.internal.Intrinsics.g(r1)
            java.lang.Object r2 = kotlin.collections.CollectionsKt.s0(r1)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r2 = (float) r2
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r3
            java.lang.Object r1 = kotlin.collections.CollectionsKt.D0(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            float r1 = (float) r1
            float r1 = r1 / r3
            com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange r3 = new com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange
            r3.<init>(r2, r1)
            goto L42
        L3b:
            com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange r3 = new com.scandit.datacapture.core.internal.sdk.data.NativeFloatRange
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r1, r1)
        L42:
            java.util.ArrayList r1 = r4.getFrameResolutions()
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.C13365n.getCameraInfo():com.scandit.datacapture.core.internal.module.source.NativeCameraInfo");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final CameraPosition getCameraPosition() {
        int i10 = ((b0) this.f125097a).f125016c;
        if (i10 == 0) {
            return CameraPosition.WORLD_FACING;
        }
        if (i10 == 1) {
            return CameraPosition.USER_FACING;
        }
        throw new AssertionError("Unsupported Camera API 1 facing " + ((b0) this.f125097a).f125016c);
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final int getCameraToNativeDeviceOrientation() {
        b0 b0Var = (b0) this.f125097a;
        return b0Var.f125016c == 0 ? b0Var.f125017d : -b0Var.f125017d;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final ArrayList getFrameResolutions() throws Exception {
        try {
            Camera.Parameters parameters = this.f125100d.f125128c;
            List<Camera.Size> supportedPreviewSizes = parameters != null ? parameters.getSupportedPreviewSizes() : null;
            if (supportedPreviewSizes == null) {
                supportedPreviewSizes = CollectionsKt.m();
            } else {
                Intrinsics.g(supportedPreviewSizes);
            }
            ArrayList arrayList = new ArrayList();
            for (Camera.Size size : supportedPreviewSizes) {
                Size2 Size2 = size.width * size.height <= this.f125098b.b() ? Size2UtilsKt.Size2(size.width, size.height) : null;
                if (Size2 != null) {
                    arrayList.add(Size2);
                }
            }
            return CollectionsExtensionsKt.toArrayList(arrayList);
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x001c A[SYNTHETIC] */
    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.EnumSet getSupportedFocusModesBits() {
        /*
            r6 = this;
            java.lang.Class<com.scandit.datacapture.core.internal.module.source.NativeFocusMode> r0 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r6.f125098b
            com.scandit.datacapture.core.internal.module.device.profiles.camera.f r1 = r1.a()
            boolean r1 = r1.f124227b
            com.scandit.datacapture.core.internal.module.source.w r2 = r6.f125100d
            android.hardware.Camera$Parameters r2 = r2.f125128c
            if (r2 == 0) goto L88
            java.util.List r2 = r2.getSupportedFocusModes()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L1c
            int r4 = r3.hashCode()
            r5 = -194628547(0xfffffffff466343d, float:-7.2954577E31)
            if (r4 == r5) goto L6a
            r5 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r4 == r5) goto L5b
            r5 = 97445748(0x5cee774, float:1.945717E-35)
            if (r4 == r5) goto L4c
            r5 = 910005312(0x363d9440, float:2.8249488E-6)
            if (r4 == r5) goto L43
            goto L1c
        L43:
            java.lang.String r4 = "continuous-picture"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1c
            goto L73
        L4c:
            java.lang.String r4 = "fixed"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L55
            goto L1c
        L55:
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r3 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.FIXED
            r0.add(r3)
            goto L1c
        L5b:
            java.lang.String r4 = "auto"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L64
            goto L1c
        L64:
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r3 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.AUTO
            r0.add(r3)
            goto L1c
        L6a:
            java.lang.String r4 = "continuous-video"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L73
            goto L1c
        L73:
            if (r1 != 0) goto L1c
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r3 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.AUTO
            r0.add(r3)
            goto L1c
        L7b:
            com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile r1 = r6.f125098b
            boolean r1 = r1.h()
            if (r1 == 0) goto L88
            com.scandit.datacapture.core.internal.module.source.NativeFocusMode r1 = com.scandit.datacapture.core.internal.module.source.NativeFocusMode.FIXED
            r0.add(r1)
        L88:
            kotlin.jvm.internal.Intrinsics.g(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.source.C13365n.getSupportedFocusModesBits():java.util.EnumSet");
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean goToSleep() throws Exception {
        try {
            if (this.f125107k <= 0.0f) {
                return b();
            }
            try {
                a(false);
                long j10 = (long) (this.f125107k * 1000);
                HandlerC13324a handlerC13324a = this.f125101e;
                if (handlerC13324a != null) {
                    handlerC13324a.sendMessageDelayed(handlerC13324a.obtainMessage(4), j10);
                }
                Camera.Parameters parameters = this.f125100d.f125128c;
                if (parameters == null) {
                    return true;
                }
                parameters.setFlashMode("off");
                a(parameters);
                return true;
            } catch (Exception e10) {
                Intrinsics.j(e10, "e");
                e10.printStackTrace();
                return false;
            }
        } catch (Exception e11) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e11);
            throw e11;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean isTorchAvailable() {
        Camera.Parameters parameters = this.f125100d.f125128c;
        return (parameters != null ? parameters.getFlashMode() : null) != null;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void setBatterySavingMode(boolean z10) throws Exception {
        try {
            if (this.f125109m == z10) {
                return;
            }
            this.f125109m = z10;
            Camera.Parameters parameters = this.f125100d.f125128c;
            if (parameters == null) {
                return;
            }
            NativeCameraDelegateSettings nativeCameraDelegateSettings = this.f125108l;
            a(parameters, z10, nativeCameraDelegateSettings != null ? nativeCameraDelegateSettings.preferredFrameRateRange : null);
            a(parameters);
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldMirrorAroundYAxis() {
        return ((b0) this.f125097a).f125016c == 1;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean shouldUseContinuous(boolean z10) throws Exception {
        try {
            if (!this.f125098b.a().f124227b) {
                return true;
            }
            if (z10) {
                return this.f125098b.i();
            }
            return false;
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startSingleShotFocusInArea(Rect rect) throws Exception {
        Camera.Parameters parameters;
        try {
            if (!a() || (parameters = this.f125100d.f125128c) == null) {
                return false;
            }
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            Intrinsics.i(supportedFocusModes, "getSupportedFocusModes(...)");
            if (!supportedFocusModes.contains(CameraSettings.FOCUS_STRATEGY_AUTO)) {
                return false;
            }
            parameters.setFocusMode(CameraSettings.FOCUS_STRATEGY_AUTO);
            a(parameters, rect);
            a(parameters);
            return this.f125100d.a();
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void startWithSettings(NativeCameraDelegateSettings settings, NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(whenDone, "whenDone");
        try {
            a(settings, new C13362k(whenDone, this, settings));
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void updateSettings(NativeCameraDelegateSettings settings, FrameSourceState currentState) throws Exception {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(currentState, "currentState");
        this.f125108l = settings;
        try {
            Size2 size2 = settings.frameResolution;
            boolean zE = Intrinsics.e(size2, this.f125105i);
            boolean z10 = !zE && currentState == FrameSourceState.ON;
            if (z10) {
                b();
            }
            this.f125107k = settings.stageOneStandbyDuration;
            C13369s c13369s = this.f125103g;
            if (c13369s != null) {
                int width = (int) size2.getWidth();
                int height = (int) size2.getHeight();
                if (c13369s.f125117c != width || c13369s.f125118d != height) {
                    c13369s.b();
                    c13369s.f125117c = width;
                    c13369s.f125118d = height;
                    for (int i10 = 0; i10 < 3; i10++) {
                        c13369s.a(new byte[((c13369s.f125117c * c13369s.f125118d) * 12) / 8]);
                    }
                }
            }
            Camera.Parameters parameters = this.f125100d.f125128c;
            if (parameters != null) {
                if (!zE) {
                    Size2 frameResolution = settings.frameResolution;
                    Intrinsics.i(frameResolution, "frameResolution");
                    a(parameters, frameResolution);
                }
                a(parameters, settings.zoomFactor);
                b(parameters, settings.exposureTargetBias);
                a(parameters, this.f125109m, settings.preferredFrameRateRange);
                a(parameters);
            }
            TorchState torchState = settings.torchState;
            Intrinsics.i(torchState, "torchState");
            int i11 = AbstractC13353b.f125013a[torchState.ordinal()];
            if (i11 == 1) {
                b(false);
            } else if (i11 != 2) {
                Intrinsics.j("Automatic torch is not implemented in Camera 1", "message");
                FS.log_e("sdc-core", "Automatic torch is not implemented in Camera 1");
            } else {
                b(true);
            }
            if (z10) {
                a(C13363l.f125094a);
            }
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final void wakeUp(NativeWrappedPromise whenDone) throws Exception {
        Intrinsics.j(whenDone, "whenDone");
        try {
            a(new C13364m(whenDone, this));
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean hasNoFocusSystem() throws Exception {
        Camera.Parameters parameters;
        try {
            if (!a() || (parameters = this.f125100d.f125128c) == null) {
                return false;
            }
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            Intrinsics.i(supportedFocusModes, "getSupportedFocusModes(...)");
            String str = "continuous-picture";
            if (!supportedFocusModes.contains("continuous-picture")) {
                str = "continuous-video";
                if (!supportedFocusModes.contains("continuous-video")) {
                    str = null;
                }
            }
            if (str != null) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.NativeCameraDelegate
    public final boolean startContinuousFocusInArea(Rect rect) throws Exception {
        Camera.Parameters parameters;
        try {
            if (!a() || (parameters = this.f125100d.f125128c) == null) {
                return false;
            }
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            Intrinsics.i(supportedFocusModes, "getSupportedFocusModes(...)");
            String str = "continuous-picture";
            if (!supportedFocusModes.contains("continuous-picture")) {
                str = "continuous-video";
                if (!supportedFocusModes.contains("continuous-video")) {
                    str = null;
                }
            }
            if (str == null) {
                return false;
            }
            parameters.setFocusMode(str);
            a(parameters, rect);
            return a(parameters);
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    public final void a(Function1 function1) {
        HandlerC13324a handlerC13324a = this.f125101e;
        if (handlerC13324a != null) {
            handlerC13324a.removeMessages(4);
        }
        Camera.Parameters parameters = this.f125100d.f125128c;
        if (parameters != null) {
            boolean z10 = this.f125109m;
            NativeCameraDelegateSettings nativeCameraDelegateSettings = this.f125108l;
            a(parameters, z10, nativeCameraDelegateSettings != null ? nativeCameraDelegateSettings.preferredFrameRateRange : null);
            NativeCameraDelegateSettings nativeCameraDelegateSettings2 = this.f125108l;
            if ((nativeCameraDelegateSettings2 != null ? nativeCameraDelegateSettings2.torchState : null) == TorchState.ON) {
                parameters.setFlashMode(a(parameters, true));
            }
            a(parameters);
        }
        C13369s c13369s = this.f125103g;
        if (c13369s != null) {
            c13369s.a();
        }
        HandlerC13324a handlerC13324a2 = this.f125101e;
        if (handlerC13324a2 != null) {
            handlerC13324a2.sendMessage(handlerC13324a2.obtainMessage(2, function1));
        }
    }

    public final void b(boolean z10) {
        Camera.Parameters parameters;
        if (isTorchAvailable() && (parameters = this.f125100d.f125128c) != null) {
            try {
                parameters.setFlashMode(a(parameters, z10));
                a(parameters);
            } catch (Exception e10) {
                Intrinsics.j(e10, "e");
                e10.printStackTrace();
            }
        }
    }

    public static final void a(C13365n c13365n, Function1 function1) {
        C13373w c13373w = c13365n.f125100d;
        boolean z10 = false;
        if (c13373w.f125126a != null) {
            try {
                if (!c13373w.f125127b.get()) {
                    Camera camera = c13373w.f125126a;
                    if (camera != null) {
                        camera.startPreview();
                    }
                    c13373w.f125127b.set(true);
                }
                z10 = true;
            } catch (IOException e10) {
                Intrinsics.j(e10, "e");
                e10.printStackTrace();
            } catch (RuntimeException e11) {
                com.scandit.datacapture.core.internal.module.utils.i.a("Either the Camera object has been released or a hardware or other low-level error occurred", e11);
            }
        }
        function1.invoke(Boolean.valueOf(z10));
    }

    public final void b(Camera.Parameters parameters, float f10) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        parameters.setExposureCompensation((!this.f125098b.f() || (minExposureCompensation == 0 && maxExposureCompensation == 0) || exposureCompensationStep == 0.0f || Float.isInfinite(exposureCompensationStep) || Float.isNaN(exposureCompensationStep)) ? 0 : RangesKt.o(MathKt.d(f10 / exposureCompensationStep), minExposureCompensation, maxExposureCompensation));
    }

    public final boolean a(Camera.Parameters parameters) {
        try {
            if (!this.f125100d.a(parameters)) {
                return false;
            }
            Camera.Size previewSize = parameters.getPreviewSize();
            this.f125105i = new Size2(previewSize.width, previewSize.height);
            return true;
        } catch (Exception unused) {
            Intrinsics.j("Failed to set camera parameters", "message");
            FS.log_e("sdc-core", "Failed to set camera parameters");
            return false;
        }
    }

    public static void a(Camera.Parameters parameters, float f10) {
        Object obj;
        if (f10 < 1.0f || !parameters.isZoomSupported()) {
            return;
        }
        int i10 = (int) (f10 * 100.0f);
        List<Integer> zoomRatios = parameters.getZoomRatios();
        Intrinsics.i(zoomRatios, "getZoomRatios(...)");
        Iterator it = CollectionsKt.s1(zoomRatios).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iAbs = Math.abs(((Number) ((IndexedValue) next).d()).intValue() - i10);
                do {
                    Object next2 = it.next();
                    int iAbs2 = Math.abs(((Number) ((IndexedValue) next2).d()).intValue() - i10);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        if (indexedValue != null) {
            parameters.setZoom(indexedValue.c());
        }
    }

    public final boolean a() throws Exception {
        Camera cameraOpen;
        try {
            if (this.f125100d.f125126a != null) {
                return true;
            }
            int iA = AbstractC13372v.a(this.f125097a);
            if (iA < 0) {
                return false;
            }
            Camera.Parameters parameters = null;
            try {
                cameraOpen = Camera.open(iA);
            } catch (Exception unused) {
                Intrinsics.j("failed to open camera", "message");
                FS.log_e("sdc-core", "failed to open camera");
                cameraOpen = null;
            }
            C13373w c13373w = this.f125100d;
            c13373w.f125126a = cameraOpen;
            if (cameraOpen == null) {
                c13373w.f125127b.set(false);
            } else {
                try {
                    parameters = cameraOpen.getParameters();
                } catch (Exception unused2) {
                    Intrinsics.j("Failed to get camera parameters", "message");
                    FS.log_e("sdc-core", "Failed to get camera parameters");
                }
                c13373w.f125128c = parameters;
            }
            return this.f125100d.f125126a != null;
        } catch (Exception e10) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Exception caught in listener method. Rethrowing...", e10);
            throw e10;
        }
    }

    public static boolean a(Camera.Parameters parameters, Size2 size2) {
        Object next;
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            return false;
        }
        Iterator<T> it = supportedPreviewSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Camera.Size size = (Camera.Size) next;
            if (size.height == size2.getHeight() && size.width == size2.getWidth()) {
                break;
            }
        }
        Camera.Size size3 = (Camera.Size) next;
        if (size3 == null) {
            return false;
        }
        parameters.setPreviewSize(size3.width, size3.height);
        return true;
    }

    public final void a(NativeCameraDelegateSettings nativeCameraDelegateSettings, Function1 function1) throws Exception {
        this.f125108l = nativeCameraDelegateSettings;
        a();
        C13373w c13373w = this.f125100d;
        if (c13373w.f125126a != null) {
            Camera.Parameters parameters = c13373w.f125128c;
            if (parameters == null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            Size2 frameResolution = nativeCameraDelegateSettings.frameResolution;
            Intrinsics.i(frameResolution, "frameResolution");
            if (!a(parameters, frameResolution)) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            Camera.Size previewSize = parameters.getPreviewSize();
            C13369s c13369s = new C13369s(this.f125100d, this.f125097a, previewSize.width, previewSize.height, this.f125099c, this);
            c13369s.f125124j = false;
            this.f125103g = c13369s;
            parameters.setPreviewFormat(17);
            if (!a(parameters)) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            if (this.f125101e == null) {
                this.f125101e = new HandlerC13324a(this);
            }
            Subscription subscriptionStart = this.f125102f.start();
            subscriptionStart.use(new C13359h(nativeCameraDelegateSettings, this, function1));
            this.f125104h = subscriptionStart;
            a(parameters, this.f125109m, nativeCameraDelegateSettings.preferredFrameRateRange);
            this.f125098b.a(parameters);
            a(parameters, nativeCameraDelegateSettings.zoomFactor);
            if (nativeCameraDelegateSettings.torchState == TorchState.ON) {
                parameters.setFlashMode(a(parameters, true));
            }
            b(parameters, nativeCameraDelegateSettings.exposureTargetBias);
            a(parameters);
            this.f125107k = nativeCameraDelegateSettings.stageOneStandbyDuration;
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public final void a(Camera.Parameters parameters, Rect rect) {
        ArrayList arrayList;
        if (this.f125098b.a().f124230e) {
            return;
        }
        if (rect == null) {
            arrayList = null;
        } else {
            List listE = CollectionsKt.e(rect);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listE, 10));
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                arrayList2.add(GraphicsExtensionsKt.toGraphicRect((Rect) it.next(), -1000, 1000));
            }
            arrayList = new ArrayList(CollectionsKt.x(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new Camera.Area((android.graphics.Rect) it2.next(), 1000));
            }
        }
        if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(arrayList);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList);
        }
    }

    public static String a(Camera.Parameters parameters, boolean z10) {
        List<String> supportedFlashModes;
        if (!z10 || (supportedFlashModes = parameters.getSupportedFlashModes()) == null) {
            return "off";
        }
        if (supportedFlashModes.contains("torch")) {
            return "torch";
        }
        return supportedFlashModes.contains("on") ? "on" : "off";
    }

    public final void a(Camera.Parameters parameters, boolean z10, NativePreferredFrameRateRange nativePreferredFrameRateRange) {
        NativeCameraDelegateSettings nativeCameraDelegateSettings = this.f125108l;
        if (nativeCameraDelegateSettings != null) {
            float f10 = nativeCameraDelegateSettings.maxFrameRate;
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            Intrinsics.i(supportedPreviewFpsRange, "getSupportedPreviewFpsRange(...)");
            ArrayList arrayList = new ArrayList(CollectionsKt.x(supportedPreviewFpsRange, 10));
            Iterator<T> it = supportedPreviewFpsRange.iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                int[] iArr = (int[]) it.next();
                Intrinsics.g(iArr);
                Integer numP0 = ArraysKt.P0(iArr);
                Integer numValueOf = Integer.valueOf(numP0 != null ? numP0.intValue() : 0);
                Integer numN0 = ArraysKt.N0(iArr);
                if (numN0 != null) {
                    iIntValue = numN0.intValue();
                }
                arrayList.add(new Range(numValueOf, Integer.valueOf(iIntValue)));
            }
            Range rangeA = Q.a(this.f125098b, f10, (Range[]) arrayList.toArray(new Range[0]), z10, NativeCameraApi.CAMERA1, nativePreferredFrameRateRange);
            if (rangeA == null) {
                return;
            }
            Object lower = rangeA.getLower();
            Intrinsics.i(lower, "getLower(...)");
            int iIntValue2 = ((Number) lower).intValue();
            Object upper = rangeA.getUpper();
            Intrinsics.i(upper, "getUpper(...)");
            parameters.setPreviewFpsRange(iIntValue2, ((Number) upper).intValue());
        }
    }
}
