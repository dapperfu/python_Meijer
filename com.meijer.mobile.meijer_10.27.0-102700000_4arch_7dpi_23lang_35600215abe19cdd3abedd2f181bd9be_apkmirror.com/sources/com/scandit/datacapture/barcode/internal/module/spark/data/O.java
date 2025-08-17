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

/* loaded from: classes11.dex */
public final class O implements SparkScanViewCameraManager, DataCaptureContextListener {

    /* renamed from: l, reason: collision with root package name */
    public static final Semaphore f122853l = new Semaphore(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final DataCaptureContext f122854a;

    /* renamed from: b, reason: collision with root package name */
    public final SparkScanStateManager f122855b;

    /* renamed from: c, reason: collision with root package name */
    public final SparkScanSettings f122856c;

    /* renamed from: d, reason: collision with root package name */
    public final SparkScanViewSettings f122857d;

    /* renamed from: e, reason: collision with root package name */
    public Camera f122858e;

    /* renamed from: f, reason: collision with root package name */
    public final Camera f122859f;

    /* renamed from: g, reason: collision with root package name */
    public final Camera f122860g;

    /* renamed from: h, reason: collision with root package name */
    public volatile InterfaceC13195h f122861h;

    /* renamed from: i, reason: collision with root package name */
    public final ExecutorService f122862i;

    /* renamed from: j, reason: collision with root package name */
    public BatterySavingMode f122863j;

    /* renamed from: k, reason: collision with root package name */
    public final BatterySavingHandler f122864k;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(com.scandit.datacapture.barcode.internal.module.spark.ui.S onDone) {
        Intrinsics.j(onDone, "onDone");
        b((Callback) null);
        b(new E(this, onDone));
    }

    public final void b(final Function0 function0) {
        this.f122862i.submit(new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.T
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                O.c(function0);
            }
        });
    }

    public final boolean c() {
        return Intrinsics.e(this.f122856c.getProperty("uhd_resolution_enabled"), 1);
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
        this.f122854a = dataCaptureContext;
        this.f122855b = stateManager;
        this.f122856c = modeSettings;
        this.f122857d = viewSettings;
        this.f122862i = Executors.newSingleThreadExecutor();
        this.f122863j = BatterySavingMode.OFF;
        C13204q c13204q = new C13204q(this);
        BatterySavingHandler batterySavingHandlerImpl = BatterySavingHandler.INSTANCE.impl(batterySavingManager);
        batterySavingHandlerImpl.setListener(c13204q);
        this.f122864k = batterySavingHandlerImpl;
        Camera.Companion companion = Camera.INSTANCE;
        Camera camera = companion.getCamera(CameraPosition.WORLD_FACING, a(stateManager.p(), c()));
        this.f122859f = camera;
        Camera camera2 = companion.getCamera(CameraPosition.USER_FACING, a(stateManager.p(), c()));
        this.f122860g = camera2;
        if (AbstractC13203p.f122911a[viewSettings.getDefaultCameraPosition().ordinal()] == 1) {
            onFrameSourceChanged(dataCaptureContext, camera2);
            dataCaptureContext.setFrameSource(camera2, null);
        } else {
            onFrameSourceChanged(dataCaptureContext, camera);
            dataCaptureContext.setFrameSource(camera, null);
        }
    }

    public static final void c(Function0 block) throws InterruptedException {
        Intrinsics.j(block, "$block");
        f122853l.acquire();
        block.invoke();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void b(Callback callback) {
        b(new I(this, callback));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final boolean isTorchAvailable() {
        Camera camera = this.f122858e;
        return camera != null && camera.isTorchAvailable();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onFrameSourceChanged(DataCaptureContext dataCaptureContext, FrameSource frameSource) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (Intrinsics.e(camera, this.f122859f) || Intrinsics.e(camera, this.f122860g)) {
            this.f122858e = camera;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void release() {
        this.f122854a.removeListener(this);
        setBatterySavingMode(BatterySavingMode.OFF);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void setBatterySavingMode(BatterySavingMode batterySavingMode) {
        Intrinsics.j(batterySavingMode, "batterySavingMode");
        this.f122863j = batterySavingMode;
        this.f122864k.setBatterySavingMode(batterySavingMode);
    }

    public static final void a(O o10, Function0 function0) {
        o10.getClass();
        function0.invoke();
        f122853l.release();
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
        return this.f122858e;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(SparkScanView$sparkScanCameraStartListener$1 sparkScanView$sparkScanCameraStartListener$1) {
        this.f122861h = sparkScanView$sparkScanCameraStartListener$1;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(c0 whenDone) {
        Intrinsics.j(whenDone, "whenDone");
        b(new C13207u(this, whenDone));
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
        this.f122854a.addListener(this);
        b(new y(this));
        b((Callback) null);
        b(new C(this, whenDone));
        setBatterySavingMode(this.f122863j);
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
        if (this.f122855b.y()) {
            zoomFactorOut = this.f122857d.getZoomFactorIn();
        } else {
            zoomFactorOut = this.f122857d.getZoomFactorOut();
        }
        cameraSettings.setZoomFactor(zoomFactorOut);
        if (z10) {
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
        }
        return cameraSettings;
    }
}
