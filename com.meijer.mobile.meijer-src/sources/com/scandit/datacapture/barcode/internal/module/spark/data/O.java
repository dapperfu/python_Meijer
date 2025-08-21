package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.internal.module.spark.ui.c0;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanCameraStartListener$1;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.TorchState;
import com.scandit.datacapture.core.source.VideoResolution;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class O implements SparkScanViewCameraManager, DataCaptureContextListener {

    /* renamed from: l, reason: collision with root package name */
    public static final Semaphore f123805l = new Semaphore(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureContext f123806a;

    /* renamed from: b, reason: collision with root package name */
    public final SparkScanStateManager f123807b;

    /* renamed from: c, reason: collision with root package name */
    public final SparkScanSettings f123808c;

    /* renamed from: d, reason: collision with root package name */
    public final SparkScanViewSettings f123809d;

    /* renamed from: e, reason: collision with root package name */
    public Camera f123810e;

    /* renamed from: f, reason: collision with root package name */
    public final Camera f123811f;

    /* renamed from: g, reason: collision with root package name */
    public final Camera f123812g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC13328h f123813h;

    /* renamed from: i, reason: collision with root package name */
    public final ExecutorService f123814i;

    /* renamed from: j, reason: collision with root package name */
    public BatterySavingMode f123815j;

    /* renamed from: k, reason: collision with root package name */
    public final BatterySavingHandler f123816k;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(com.scandit.datacapture.barcode.internal.module.spark.ui.S onDone) {
        Intrinsics.j(onDone, "onDone");
        b((Callback) null);
        b(new E(this, onDone));
    }

    public final void b(final Function0 function0) {
        this.f123814i.submit(new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.T
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                O.c(function0);
            }
        });
    }

    public final boolean c() {
        return Intrinsics.e(this.f123808c.getProperty("uhd_resolution_enabled"), 1);
    }

    public O(DataCaptureContext dataCaptureContext, SparkScanStateManager stateManager, BatterySavingManager batterySavingManager, SparkScanSettings modeSettings, SparkScanViewSettings viewSettings) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(batterySavingManager, "batterySavingManager");
        Intrinsics.j(modeSettings, "modeSettings");
        Intrinsics.j(viewSettings, "viewSettings");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(stateManager, "stateManager");
        Intrinsics.j(batterySavingManager, "batterySavingManager");
        Intrinsics.j(modeSettings, "modeSettings");
        Intrinsics.j(viewSettings, "viewSettings");
        this.f123806a = dataCaptureContext;
        this.f123807b = stateManager;
        this.f123808c = modeSettings;
        this.f123809d = viewSettings;
        this.f123814i = Executors.newSingleThreadExecutor();
        this.f123815j = BatterySavingMode.OFF;
        C13337q c13337q = new C13337q(this);
        BatterySavingHandler batterySavingHandlerImpl = BatterySavingHandler.INSTANCE.impl(batterySavingManager);
        batterySavingHandlerImpl.setListener(c13337q);
        this.f123816k = batterySavingHandlerImpl;
        Camera.Companion companion = Camera.INSTANCE;
        Camera camera = companion.getCamera(CameraPosition.WORLD_FACING, a(stateManager.p(), c()));
        this.f123811f = camera;
        Camera camera2 = companion.getCamera(CameraPosition.USER_FACING, a(stateManager.p(), c()));
        this.f123812g = camera2;
        if (AbstractC13336p.f123863a[viewSettings.getDefaultCameraPosition().ordinal()] == 1) {
            onFrameSourceChanged(dataCaptureContext, camera2);
            dataCaptureContext.setFrameSource(camera2, null);
        } else {
            onFrameSourceChanged(dataCaptureContext, camera);
            dataCaptureContext.setFrameSource(camera, null);
        }
    }

    public static final void c(Function0 block) throws InterruptedException {
        Intrinsics.j(block, "$block");
        f123805l.acquire();
        block.invoke();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void b(Callback callback) {
        b(new I(this, callback));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final boolean isTorchAvailable() {
        Camera camera = this.f123810e;
        return camera != null && camera.isTorchAvailable();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onFrameSourceChanged(DataCaptureContext dataCaptureContext, FrameSource frameSource) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (Intrinsics.e(camera, this.f123811f) || Intrinsics.e(camera, this.f123812g)) {
            this.f123810e = camera;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void release() {
        this.f123806a.removeListener(this);
        setBatterySavingMode(BatterySavingMode.OFF);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void setBatterySavingMode(BatterySavingMode batterySavingMode) {
        Intrinsics.j(batterySavingMode, "batterySavingMode");
        this.f123815j = batterySavingMode;
        this.f123816k.setBatterySavingMode(batterySavingMode);
    }

    public static final void a(O o10, Function0 function0) {
        o10.getClass();
        function0.invoke();
        f123805l.release();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void b() {
        b(new N(this));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeAdded(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        DataCaptureContextListener.DefaultImpls.onModeAdded(this, dataCaptureContext, dataCaptureMode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeRemoved(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        DataCaptureContextListener.DefaultImpls.onModeRemoved(this, dataCaptureContext, dataCaptureMode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStarted(DataCaptureContext dataCaptureContext) {
        DataCaptureContextListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStopped(DataCaptureContext dataCaptureContext) {
        DataCaptureContextListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onStatusChanged(DataCaptureContext dataCaptureContext, ContextStatus contextStatus) {
        DataCaptureContextListener.DefaultImpls.onStatusChanged(this, dataCaptureContext, contextStatus);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final Camera a() {
        return this.f123810e;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(SparkScanView$sparkScanCameraStartListener$1 sparkScanView$sparkScanCameraStartListener$1) {
        this.f123813h = sparkScanView$sparkScanCameraStartListener$1;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(c0 whenDone) {
        Intrinsics.j(whenDone, "whenDone");
        b(new C13340u(this, whenDone));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(Callback callback) {
        b(new M(this, callback));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(TorchState torchState, Function0 whenDone) {
        Intrinsics.j(torchState, "torchState");
        Intrinsics.j(whenDone, "whenDone");
        b(new A(this, torchState, whenDone));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(Function0 whenDone) {
        Intrinsics.j(whenDone, "whenDone");
        this.f123806a.addListener(this);
        b(new y(this));
        b((Callback) null);
        b(new C(this, whenDone));
        setBatterySavingMode(this.f123815j);
    }

    public final CameraSettings a(SparkScanScanningMode sparkScanScanningMode, boolean z10) {
        CameraSettings cameraSettings;
        float zoomFactorOut;
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Default) {
            cameraSettings = new CameraSettings();
            cameraSettings.setPreferredResolution(VideoResolution.FULL_HD);
            cameraSettings.setZoomFactor(1.0f);
            cameraSettings.setProperty("exposureTargetBias", -1);
            cameraSettings.setProperty("repeatedTriggerInterval", 1);
            cameraSettings.setProperty("stage1StandbyDuration", 4);
            cameraSettings.setProperty("usesApi2Features", Boolean.TRUE);
        } else if (sparkScanScanningMode instanceof SparkScanScanningMode.Target) {
            cameraSettings = new CameraSettings();
            cameraSettings.setPreferredResolution(VideoResolution.FULL_HD);
            cameraSettings.setProperty("exposureTargetBias", -1);
            cameraSettings.setProperty("repeatedTriggerInterval", 1);
            cameraSettings.setProperty("stage1StandbyDuration", 4);
            cameraSettings.setProperty("usesApi2Features", Boolean.TRUE);
            cameraSettings.setProperty("regionStrategy", "spot");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.f123807b.y()) {
            zoomFactorOut = this.f123809d.getZoomFactorIn();
        } else {
            zoomFactorOut = this.f123809d.getZoomFactorOut();
        }
        cameraSettings.setZoomFactor(zoomFactorOut);
        if (z10) {
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
        }
        return cameraSettings;
    }
}
