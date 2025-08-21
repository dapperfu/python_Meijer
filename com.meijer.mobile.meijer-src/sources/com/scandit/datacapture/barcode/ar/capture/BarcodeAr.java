package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.ar.feedback.BarcodeArFeedback;
import com.scandit.datacapture.barcode.internal.module.ar.capture.BarcodeArInternal;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.ar.feedback.BarcodeArFeedbackEmitter;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ#\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR.\u0010%\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8@@@X\u0080\u000e¢\u0006\u0012\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010+\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020&8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/BarcodeArInternal;", "barcodeArInternal", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ar/capture/BarcodeArInternal;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;", "settings", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;)V", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArListener;", "listener", "", "addListener", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArListener;)V", "removeListener", "Ljava/lang/Runnable;", "whenDone", "applySettings", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSettings;Ljava/lang/Runnable;)V", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;", "_impl$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;", "_impl", "a", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/BarcodeArInternal;", "getBarcodeArInternal$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/ar/capture/BarcodeArInternal;", "Lcom/scandit/datacapture/barcode/internal/module/ar/feedback/BarcodeArFeedbackEmitter;", "value", "getFeedbackEmitter$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/ar/feedback/BarcodeArFeedbackEmitter;", "setFeedbackEmitter$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/ar/feedback/BarcodeArFeedbackEmitter;)V", "getFeedbackEmitter$scandit_barcode_capture$annotations", "()V", "feedbackEmitter", "Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/ar/feedback/BarcodeArFeedback;)V", "feedback", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class BarcodeAr {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BarcodeArInternal barcodeArInternal;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "", "KEY_EXPOSURE_TARGET_BIAS", "Ljava/lang/String;", "KEY_FOCUS_STRATEGY", "KEY_PREFERRED_ASPECT_RATIO", "KEY_SCAN_PHASE_NO_SRE_TIMEOUT", "VALUE_CONTINUOUS_UNTIL_NO_SCAN", "", "VALUE_EXPOSURE_TARGET_BIAS", "F", "VALUE_PREFERRED_ASPECT_RATIO", "VALUE_SCAN_PHASE_NO_SRE_TIMEOUT", "ZOOM_GESTURE_ZOOM_FACTOR_VALUE", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.NONE);
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
            cameraSettings.setZoomGestureZoomFactor(2.0f);
            cameraSettings.setProperty("preferredAspectRatio", "fourToThree");
            cameraSettings.setProperty("focusStrategy", "continuousUntilNoScan");
            cameraSettings.setProperty("scanPhaseNoSreTimeout", Float.valueOf(3.0f));
            cameraSettings.setProperty("exposureTargetBias", Float.valueOf(-1.0f));
            return cameraSettings;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeAr(DataCaptureContext context, BarcodeArSettings settings) {
        Intrinsics.j(context, "context");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(settings, "settings");
        NativeBarcodeAr nativeBarcodeArCreate = NativeBarcodeAr.create(context != null ? context._impl() : null, settings.getF121052a());
        Intrinsics.i(nativeBarcodeArCreate, "create(...)");
        this(new BarcodeArInternal(nativeBarcodeArCreate));
    }

    @JvmStatic
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    public static /* synthetic */ void getFeedbackEmitter$scandit_barcode_capture$annotations() {
    }

    @JvmOverloads
    public final void applySettings(BarcodeArSettings settings) {
        Intrinsics.j(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    public static /* synthetic */ void applySettings$default(BarcodeAr barcodeAr, BarcodeArSettings barcodeArSettings, Runnable runnable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            runnable = null;
        }
        barcodeAr.applySettings(barcodeArSettings, runnable);
    }

    public final /* synthetic */ NativeBarcodeAr _impl$scandit_barcode_capture() {
        return this.barcodeArInternal.a();
    }

    public final void addListener(BarcodeArListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.barcodeArInternal.a(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @JvmOverloads
    public final void applySettings(BarcodeArSettings settings, Runnable whenDone) {
        Intrinsics.j(settings, "settings");
        this.barcodeArInternal.a(settings, whenDone);
    }

    /* renamed from: getBarcodeArInternal$scandit_barcode_capture, reason: from getter */
    public final BarcodeArInternal getBarcodeArInternal() {
        return this.barcodeArInternal;
    }

    public final BarcodeArFeedback getFeedback() {
        return this.barcodeArInternal.d();
    }

    public final /* synthetic */ BarcodeArFeedbackEmitter getFeedbackEmitter$scandit_barcode_capture() {
        return this.barcodeArInternal.e();
    }

    public final void removeListener(BarcodeArListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.barcodeArInternal.b(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void setFeedback(BarcodeArFeedback value) {
        Intrinsics.j(value, "value");
        this.barcodeArInternal.a(value);
    }

    public final /* synthetic */ void setFeedbackEmitter$scandit_barcode_capture(BarcodeArFeedbackEmitter barcodeArFeedbackEmitter) {
        this.barcodeArInternal.a(barcodeArFeedbackEmitter);
    }

    public BarcodeAr(BarcodeArInternal barcodeArInternal) {
        Intrinsics.j(barcodeArInternal, "barcodeArInternal");
        this.barcodeArInternal = barcodeArInternal;
        barcodeArInternal.a(this);
    }
}
