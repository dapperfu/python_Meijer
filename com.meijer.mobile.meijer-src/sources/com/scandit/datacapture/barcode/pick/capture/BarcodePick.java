package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.w;
import com.scandit.datacapture.barcode.internal.module.pick.capture.x;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.common.feedback.ResourceSound;
import com.scandit.datacapture.core.common.feedback.Vibration;
import com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u0000 ^2\u00020\u0001:\u0002^_B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010!J\u000f\u0010%\u001a\u00020\u0012H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010'\u001a\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010$J\u000f\u0010)\u001a\u00020\u0012H\u0000¢\u0006\u0004\b(\u0010$J\u000f\u0010+\u001a\u00020\u0012H\u0000¢\u0006\u0004\b*\u0010$J\u000f\u0010-\u001a\u00020\u0012H\u0000¢\u0006\u0004\b,\u0010$J\u0017\u00102\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101J#\u00107\u001a\u00020\u00122\u0006\u00104\u001a\u0002032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b5\u00106J\u0017\u0010;\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u000208H\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u000208H\u0000¢\u0006\u0004\b<\u0010:J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00122\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0004\bC\u0010AJ\u0017\u0010H\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020EH\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020EH\u0000¢\u0006\u0004\bI\u0010GJ)\u0010O\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010KH\u0000¢\u0006\u0004\bM\u0010NJ\u000f\u0010S\u001a\u00020PH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010V\u001a\u00020\u0006H\u0000¢\u0006\u0004\bT\u0010UJ\u000f\u0010Y\u001a\u00020\u0002H\u0000¢\u0006\u0004\bW\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020E0Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006`"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;", "barcodePickInternal", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;)V", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "impl", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;)V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "settings", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "productProvider", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;)V", "", "data", "", "confirmActionForItemWithData", "(Ljava/lang/String;)V", "cancelActionForItemWithData", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSelectItemActionCallback;", "callback", "selectItemWithData", "(Ljava/lang/String;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSelectItemActionCallback;)V", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningListener;", "listener", "addScanningListener", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningListener;)V", "removeScanningListener", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickListener;", "addListener", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickListener;)V", "removeListener", "_start$scandit_barcode_capture", "()V", "_start", "_pause$scandit_barcode_capture", "_pause", "_stop$scandit_barcode_capture", "_stop", "_freeze$scandit_barcode_capture", "_freeze", "_reset$scandit_barcode_capture", "_reset", "", "statusShownWhilePaused", "_notifyStatusShownWhilePausedUpdated$scandit_barcode_capture", "(Z)V", "_notifyStatusShownWhilePausedUpdated", "Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;", "track", "_onTrackedObjectTap$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedObject;Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSelectItemActionCallback;)V", "_onTrackedObjectTap", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickListener;", "_addListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickListener;)V", "_addListener", "_removeListener$scandit_barcode_capture", "_removeListener", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;", "actionListener", "_addActionListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;)V", "_addActionListener", "_removeActionListener$scandit_barcode_capture", "_removeActionListener", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickStatusListenerInternal;", "_addStatusListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickStatusListenerInternal;)V", "_addStatusListener", "_removeStatusListener$scandit_barcode_capture", "_removeStatusListener", "Lkotlin/Function0;", "whenDone", "_applySettings$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;Lkotlin/jvm/functions/Function0;)V", "_applySettings", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "_asDataCaptureMode$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "_asDataCaptureMode", "_impl$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "_impl", "_asBarcodePickInternal$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;", "_asBarcodePickInternal", "", "get_statusListeners$scandit_barcode_capture", "()Ljava/util/Collection;", "_statusListeners", "Companion", "com/scandit/datacapture/barcode/pick/capture/a", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BarcodePick {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickInternal f124511a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet f124512b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick$Companion;", "", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "", "KEY_EXPOSURE_TARGET_BIAS", "Ljava/lang/String;", "KEY_FOCUS_STRATEGY", "KEY_SCAN_PHASE_NO_SRE_TIMEOUT", "VALUE_CONTINUOUS_UNTIL_NO_SCAN", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setPreferredResolution(VideoResolution.UHD4K);
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.NONE);
            cameraSettings.setZoomGestureZoomFactor(2.0f);
            cameraSettings.setProperty("focusStrategy", "continuousUntilNoScan");
            cameraSettings.setProperty("scanPhaseNoSreTimeout", Float.valueOf(3.0f));
            cameraSettings.setProperty("exposureTargetBias", Float.valueOf(-1.0f));
            return cameraSettings;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BarcodePick(BarcodePickInternal barcodePickInternal) {
        Intrinsics.j(barcodePickInternal, "barcodePickInternal");
        this.f124511a = barcodePickInternal;
        this.f124512b = new CopyOnWriteArraySet();
        barcodePickInternal.a(this);
        _impl$scandit_barcode_capture().addStatusListenerAsync(new x(new a(this), this));
    }

    @JvmStatic
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    public static /* synthetic */ void _applySettings$scandit_barcode_capture$default(BarcodePick barcodePick, BarcodePickSettings barcodePickSettings, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        barcodePick._applySettings$scandit_barcode_capture(barcodePickSettings, function0);
    }

    public static /* synthetic */ void _onTrackedObjectTap$scandit_barcode_capture$default(BarcodePick barcodePick, TrackedObject trackedObject, BarcodePickSelectItemActionCallback barcodePickSelectItemActionCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            barcodePickSelectItemActionCallback = null;
        }
        barcodePick._onTrackedObjectTap$scandit_barcode_capture(trackedObject, barcodePickSelectItemActionCallback);
    }

    public final /* synthetic */ void _addActionListener$scandit_barcode_capture(BarcodePickActionListener actionListener) {
        Intrinsics.j(actionListener, "actionListener");
        this.f124511a.a(actionListener);
    }

    public final /* synthetic */ void _addListener$scandit_barcode_capture(com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        this.f124511a.a(listener);
    }

    public final /* synthetic */ void _addStatusListener$scandit_barcode_capture(BarcodePickStatusListenerInternal listener) {
        Intrinsics.j(listener, "listener");
        if (this.f124512b.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final /* synthetic */ void _applySettings$scandit_barcode_capture(BarcodePickSettings settings, final Function0 whenDone) {
        Intrinsics.j(settings, "settings");
        this.f124511a.a(settings, whenDone != null ? new Runnable() { // from class: com.scandit.datacapture.barcode.pick.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                BarcodePick.a(whenDone);
            }
        } : null);
    }

    /* renamed from: _asBarcodePickInternal$scandit_barcode_capture, reason: from getter */
    public final /* synthetic */ BarcodePickInternal getF124511a() {
        return this.f124511a;
    }

    public final /* synthetic */ DataCaptureMode _asDataCaptureMode$scandit_barcode_capture() {
        return this.f124511a;
    }

    public final /* synthetic */ NativeBarcodePick _impl$scandit_barcode_capture() {
        return this.f124511a.a();
    }

    public final /* synthetic */ void _onTrackedObjectTap$scandit_barcode_capture(TrackedObject track, BarcodePickSelectItemActionCallback callback) {
        Intrinsics.j(track, "track");
        this.f124511a.a(track, callback);
    }

    public final /* synthetic */ void _removeActionListener$scandit_barcode_capture(BarcodePickActionListener actionListener) {
        Intrinsics.j(actionListener, "actionListener");
        this.f124511a.b(actionListener);
    }

    public final /* synthetic */ void _removeListener$scandit_barcode_capture(com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        this.f124511a.b(listener);
    }

    public final /* synthetic */ void _removeStatusListener$scandit_barcode_capture(BarcodePickStatusListenerInternal listener) {
        Intrinsics.j(listener, "listener");
        if (this.f124512b.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void addListener(BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f124511a.a(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void addScanningListener(BarcodePickScanningListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f124511a.a(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public final void cancelActionForItemWithData(String data) {
        Intrinsics.j(data, "data");
        this.f124511a.a(data, false);
    }

    public final void confirmActionForItemWithData(String data) {
        Intrinsics.j(data, "data");
        this.f124511a.a(data, true);
    }

    public final /* synthetic */ Collection get_statusListeners$scandit_barcode_capture() {
        return this.f124512b;
    }

    public final void removeListener(BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f124511a.b(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void removeScanningListener(BarcodePickScanningListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f124511a.b(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void selectItemWithData(String data, BarcodePickSelectItemActionCallback callback) {
        Object next;
        Intrinsics.j(data, "data");
        HashMap<Integer, NativeTrackedObject> trackedObjects = ((w) this.f124511a.c().f123406b.getValue()).f123407a.getTrackedObjects();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(trackedObjects);
        Iterator<T> it = barcodeNativeTypeFactory.convertTrackedObjectNativeMap(trackedObjects).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.e(((TrackedObject) next).getData(), data)) {
                    break;
                }
            }
        }
        TrackedObject trackedObject = (TrackedObject) next;
        if (trackedObject == null) {
            return;
        }
        _onTrackedObjectTap$scandit_barcode_capture(trackedObject, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0) {
        function0.invoke();
    }

    public final /* synthetic */ void _freeze$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().freezeAsync();
    }

    public final /* synthetic */ void _notifyStatusShownWhilePausedUpdated$scandit_barcode_capture(boolean statusShownWhilePaused) {
        _impl$scandit_barcode_capture().notifyStatusShownWhilePausedUpdatedAsync(statusShownWhilePaused);
    }

    public final /* synthetic */ void _pause$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().pauseAsync();
    }

    public final /* synthetic */ void _reset$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().reset();
    }

    public final /* synthetic */ void _start$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().startAsync();
    }

    public final /* synthetic */ void _stop$scandit_barcode_capture() {
        _impl$scandit_barcode_capture().stopAsync();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarcodePick(NativeBarcodePick impl) {
        this(new BarcodePickInternal(impl));
        Intrinsics.j(impl, "impl");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePick(DataCaptureContext dataCaptureContext, BarcodePickSettings settings, BarcodePickProductProvider productProvider) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(settings, "settings");
        Intrinsics.j(productProvider, "productProvider");
        NativeBarcodePick nativeBarcodePickCreate = NativeBarcodePick.create(dataCaptureContext._impl(), settings._impl(), productProvider._productProviderImpl());
        nativeBarcodePickCreate.setToPickCodeScannedFeedback(FeedbackExtensionsKt.toNativeFeedback(new Feedback(settings.getHapticsEnabled() ? Vibration.INSTANCE.defaultVibration() : null, settings.getSoundEnabled() ? new ResourceSound(R.raw.sc_barcode_find_found) : null)));
        nativeBarcodePickCreate.setCodePickedFeedback(FeedbackExtensionsKt.toNativeFeedback(new Feedback(settings.getHapticsEnabled() ? Vibration.INSTANCE.defaultVibration() : null, settings.getSoundEnabled() ? new ResourceSound(R.raw.sc_barcode_count_success) : null)));
        Intrinsics.i(nativeBarcodePickCreate, "apply(...)");
        this(nativeBarcodePickCreate);
    }
}
