package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.feedback.BarcodeCaptureFeedback;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureLicenseInfo;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0002ABB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0010\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$R*\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u00020/2\u0006\u00100\u001a\u00020/8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u0010:\u001a\u0004\u0018\u0001052\b\u00100\u001a\u0004\u0018\u0001058W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "impl", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;", "batterySavingHandler", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "settings", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "", "_setDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "", "jsonData", "updateFromJson", "(Ljava/lang/String;)V", "Ljava/lang/Runnable;", "whenDone", "applySettings", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;Ljava/lang/Runnable;)V", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;", "_session", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;", "listener", "addListener", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;)V", "removeListener", "Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "value", "e", "Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;)V", "feedback", "", "<set-?>", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "pointOfInterest", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureLicenseInfo;", "getBarcodeCaptureLicenseInfo", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureLicenseInfo;", "barcodeCaptureLicenseInfo", "Companion", "com/scandit/datacapture/barcode/capture/b", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BarcodeCapture implements DataCaptureMode, BarcodeCaptureProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BatterySavingHandler f121464a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeCaptureProxyAdapter f121465b;

    /* renamed from: c, reason: collision with root package name */
    private DataCaptureContext f121466c;

    /* renamed from: d, reason: collision with root package name */
    private final BarcodeCapture$dataCaptureContextListener$1 f121467d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private BarcodeCaptureFeedback feedback;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet f121469f;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodeCaptureSession f121470g;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCapture$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "settings", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "forDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;)Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "", "jsonData", "fromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.MANUAL_UNTIL_CAPTURE);
            return cameraSettings;
        }

        @JvmStatic
        public final BarcodeCapture forDataCaptureContext(DataCaptureContext dataCaptureContext, BarcodeCaptureSettings settings) {
            Intrinsics.j(settings, "settings");
            BarcodeCapture barcodeCapture = new BarcodeCapture(dataCaptureContext, settings, BatterySavingHandler.Companion.impl$default(BatterySavingHandler.INSTANCE, null, 1, null));
            if (dataCaptureContext != null) {
                dataCaptureContext.setMode(barcodeCapture);
            }
            return barcodeCapture;
        }

        @JvmStatic
        public final BarcodeCapture fromJson(DataCaptureContext dataCaptureContext, String jsonData) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeCaptureDeserializer().modeFromJson(dataCaptureContext, jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.scandit.datacapture.barcode.capture.BarcodeCapture$dataCaptureContextListener$1] */
    public BarcodeCapture(NativeBarcodeCapture impl, BatterySavingHandler batterySavingHandler) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(batterySavingHandler, "batterySavingHandler");
        this.f121464a = batterySavingHandler;
        this.f121465b = new BarcodeCaptureProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        batterySavingHandler.setListener(new C13170a(this));
        this.f121467d = new DataCaptureContextListener() { // from class: com.scandit.datacapture.barcode.capture.BarcodeCapture$dataCaptureContextListener$1
            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onFrameSourceChanged(DataCaptureContext dataCaptureContext, FrameSource frameSource) {
                Intrinsics.j(dataCaptureContext, "dataCaptureContext");
                BarcodeCapture barcodeCapture = this.f121471a;
                BarcodeCapture.access$applyBatterySavingMode(barcodeCapture, dataCaptureContext, barcodeCapture.f121464a.getShouldSaveBattery());
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeAdded(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeAdded(this, dataCaptureContext, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeRemoved(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeRemoved(this, dataCaptureContext, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStarted(DataCaptureContext dataCaptureContext) {
                DataCaptureContextListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStopped(DataCaptureContext dataCaptureContext) {
                DataCaptureContextListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onStatusChanged(DataCaptureContext dataCaptureContext, ContextStatus contextStatus) {
                DataCaptureContextListener.DefaultImpls.onStatusChanged(this, dataCaptureContext, contextStatus);
            }
        };
        BarcodeCaptureFeedback barcodeCaptureFeedbackDefaultFeedback = BarcodeCaptureFeedback.INSTANCE.defaultFeedback();
        getF121491a().setSuccessFeedback(new BarcodeCapture$setNativeFeedback$1(barcodeCaptureFeedbackDefaultFeedback));
        this.feedback = barcodeCaptureFeedbackDefaultFeedback;
        this.f121469f = new CopyOnWriteArraySet();
        getF121491a().addListenerAsync(new BarcodeCaptureListenerReversedAdapter(new C13171b(this), this, null, 4, null));
        BatterySavingMode batterySavingMode = getF121491a().getSettings().getBatterySavingMode();
        Intrinsics.i(batterySavingMode, "getBatterySavingMode(...)");
        batterySavingHandler.setBatterySavingMode(batterySavingMode);
        this.f121470g = new BarcodeCaptureSession(new C13172c(impl));
    }

    private static void a(DataCaptureContext dataCaptureContext, boolean z10) {
        FrameSource frameSource = dataCaptureContext != null ? dataCaptureContext.get_frameSource() : null;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        NativeAndroidCamera nativeAndroidCamera_impl = camera != null ? camera.getF126823a() : null;
        if (nativeAndroidCamera_impl != null) {
            nativeAndroidCamera_impl.setBatterySavingMode(z10);
        }
    }

    @JvmStatic
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    @JvmStatic
    public static final BarcodeCapture forDataCaptureContext(DataCaptureContext dataCaptureContext, BarcodeCaptureSettings barcodeCaptureSettings) {
        return INSTANCE.forDataCaptureContext(dataCaptureContext, barcodeCaptureSettings);
    }

    @JvmStatic
    public static final BarcodeCapture fromJson(DataCaptureContext dataCaptureContext, String str) {
        return INSTANCE.fromJson(dataCaptureContext, str);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @NativeImpl
    /* renamed from: _dataCaptureModeImpl */
    public NativeDataCaptureMode getF121380c() {
        return this.f121465b.getF121493c();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCapture getF121491a() {
        return this.f121465b.getF121491a();
    }

    @JvmOverloads
    public final void applySettings(BarcodeCaptureSettings settings) {
        Intrinsics.j(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "pointOfInterest")
    public PointWithUnit getPointOfInterest() {
        return this.f121465b.getPointOfInterest();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.f121465b.isEnabled();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z10) {
        this.f121465b.setEnabled(z10);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "pointOfInterest")
    public void setPointOfInterest(PointWithUnit pointWithUnit) {
        this.f121465b.setPointOfInterest(pointWithUnit);
    }

    public static /* synthetic */ void applySettings$default(BarcodeCapture barcodeCapture, BarcodeCaptureSettings barcodeCaptureSettings, Runnable runnable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            runnable = null;
        }
        barcodeCapture.applySettings(barcodeCaptureSettings, runnable);
    }

    /* renamed from: _session, reason: from getter */
    public final BarcodeCaptureSession getF121470g() {
        return this.f121470g;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        a(this.f121466c, false);
        DataCaptureContext dataCaptureContext2 = this.f121466c;
        if (dataCaptureContext2 != null) {
            dataCaptureContext2.removeListener(this.f121467d);
        }
        this.f121466c = dataCaptureContext;
        if (dataCaptureContext != null) {
            dataCaptureContext.addListener(this.f121467d);
        }
        a(dataCaptureContext, this.f121464a.getShouldSaveBattery());
    }

    public final void addListener(BarcodeCaptureListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f121469f.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @JvmOverloads
    public final void applySettings(BarcodeCaptureSettings settings, Runnable whenDone) {
        Intrinsics.j(settings, "settings");
        this.f121464a.setBatterySavingMode(settings.getBatterySaving());
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = getF121491a().applySettingsWrapped(settings._impl());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, whenDone);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext, reason: from getter */
    public DataCaptureContext getF121887c() {
        return this.f121466c;
    }

    public final BarcodeCaptureFeedback getFeedback() {
        return this.feedback;
    }

    public final void removeListener(BarcodeCaptureListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f121469f.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void setFeedback(BarcodeCaptureFeedback value) {
        Intrinsics.j(value, "value");
        this.feedback = value;
        getF121491a().setSuccessFeedback(new BarcodeCapture$setNativeFeedback$1(value));
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeCaptureDeserializer().updateModeFromJson(this, jsonData);
    }

    public static final /* synthetic */ void access$applyBatterySavingMode(BarcodeCapture barcodeCapture, DataCaptureContext dataCaptureContext, boolean z10) {
        barcodeCapture.getClass();
        a(dataCaptureContext, z10);
    }

    public final BarcodeCaptureLicenseInfo getBarcodeCaptureLicenseInfo() {
        NativeBarcodeCaptureLicenseInfo barcodeCaptureLicenseInfo = getF121491a().getBarcodeCaptureLicenseInfo();
        if (barcodeCaptureLicenseInfo != null) {
            return new BarcodeCaptureLicenseInfo(barcodeCaptureLicenseInfo);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCapture(DataCaptureContext dataCaptureContext, BarcodeCaptureSettings settings, BatterySavingHandler batterySavingHandler) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(batterySavingHandler, "batterySavingHandler");
        NativeBarcodeCapture nativeBarcodeCaptureCreate = NativeBarcodeCapture.create(dataCaptureContext != null ? dataCaptureContext._impl() : null, settings._impl());
        Intrinsics.i(nativeBarcodeCaptureCreate, "create(...)");
        this(nativeBarcodeCaptureCreate, batterySavingHandler);
    }
}
