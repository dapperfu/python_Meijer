package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingLicenseInfo;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002:;B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\rJ#\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b%\u0010$J\r\u0010&\u001a\u00020\u0005¢\u0006\u0004\b&\u0010'R \u0010-\u001a\b\u0012\u0004\u0012\u00020!0(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0013\u00109\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchProxy;", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;", "impl", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSession;", "session", "<init>", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSession;)V", "", "identifier", "", "_activateState", "(Ljava/lang/String;)V", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "()Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTracking;", "reset", "()V", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_setDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "jsonData", "updateFromJson", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "settings", "Ljava/lang/Runnable;", "whenDone", "applySettings", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;Ljava/lang/Runnable;)V", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchListener;", "listener", "addListener", "(Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchListener;)V", "removeListener", "_session", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSession;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "e", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$scandit_barcode_capture", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "", "<set-?>", "isEnabled", "()Z", "setEnabled", "(Z)V", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchLicenseInfo;", "getBarcodeBatchLicenseInfo", "()Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchLicenseInfo;", "barcodeBatchLicenseInfo", "Companion", "com/scandit/datacapture/barcode/batch/capture/c", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BarcodeBatch implements DataCaptureMode, BarcodeBatchProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeBatchSession f121357a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodeBatchProxyAdapter f121358b;

    /* renamed from: c, reason: collision with root package name */
    private DataCaptureContext f121359c;

    /* renamed from: d, reason: collision with root package name */
    private com.scandit.datacapture.barcode.internal.module.batch.capture.a f121360d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList listeners;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;", "settings", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "forDataCaptureContext", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSettings;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "", "jsonData", "fromJson", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatch;", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "()Lcom/scandit/datacapture/core/source/CameraSettings;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setShouldPreferSmoothAutoFocus(true);
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.NONE);
            cameraSettings.setPreferredResolution(VideoResolution.FULL_HD);
            cameraSettings.setZoomGestureZoomFactor(1.0f);
            return cameraSettings;
        }

        @JvmStatic
        public final BarcodeBatch forDataCaptureContext(DataCaptureContext dataCaptureContext, BarcodeBatchSettings settings) {
            Intrinsics.j(settings, "settings");
            BarcodeBatch barcodeBatch = new BarcodeBatch(dataCaptureContext, settings, null);
            ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.b(BarcodeBatch.class), null, barcodeBatch, new C13163b(barcodeBatch));
            if (dataCaptureContext != null) {
                dataCaptureContext.setMode(barcodeBatch);
            }
            BarcodeBatch.access$updateFreezeIndicator(barcodeBatch, settings);
            return barcodeBatch;
        }

        @JvmStatic
        public final BarcodeBatch fromJson(DataCaptureContext dataCaptureContext, String jsonData) {
            Intrinsics.j(dataCaptureContext, "dataCaptureContext");
            Intrinsics.j(jsonData, "jsonData");
            return new BarcodeBatchDeserializer().modeFromJson(dataCaptureContext, jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeBatch(NativeBarcodeTracking impl, BarcodeBatchSession session) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(session, "session");
        this.f121357a = session;
        this.f121358b = new BarcodeBatchProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.listeners = new CopyOnWriteArrayList();
        impl.addListenerAsync(new BarcodeBatchListenerReversedAdapter(new C13164c(this), this, null, 4, null), 1);
    }

    @JvmStatic
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    @JvmStatic
    public static final BarcodeBatch forDataCaptureContext(DataCaptureContext dataCaptureContext, BarcodeBatchSettings barcodeBatchSettings) {
        return INSTANCE.forDataCaptureContext(dataCaptureContext, barcodeBatchSettings);
    }

    @JvmStatic
    public static final BarcodeBatch fromJson(DataCaptureContext dataCaptureContext, String str) {
        return INSTANCE.fromJson(dataCaptureContext, str);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(nativeName = "activateState")
    public void _activateState(String identifier) {
        Intrinsics.j(identifier, "identifier");
        this.f121358b._activateState(identifier);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @NativeImpl
    /* renamed from: _dataCaptureModeImpl */
    public NativeDataCaptureMode getF121380c() {
        return this.f121358b.getF121380c();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeTracking getF121378a() {
        return this.f121358b.getF121378a();
    }

    @JvmOverloads
    public final void applySettings(BarcodeBatchSettings settings) {
        Intrinsics.j(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.f121358b.isEnabled();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(nativeName = "clear")
    public void reset() {
        this.f121358b.reset();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z10) {
        this.f121358b.setEnabled(z10);
    }

    public static final void access$updateFreezeIndicator(BarcodeBatch barcodeBatch, BarcodeBatchSettings barcodeBatchSettings) {
        com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar = barcodeBatch.f121360d;
        if (aVar != null) {
            barcodeBatch.removeListener(aVar);
        }
        Object property = barcodeBatchSettings.getProperty("freezeIndicator");
        com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar2 = null;
        com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar3 = property instanceof com.scandit.datacapture.barcode.internal.module.batch.capture.a ? (com.scandit.datacapture.barcode.internal.module.batch.capture.a) property : null;
        if (aVar3 != null) {
            barcodeBatch.addListener(aVar3);
            aVar2 = aVar3;
        }
        barcodeBatch.f121360d = aVar2;
    }

    public static /* synthetic */ void applySettings$default(BarcodeBatch barcodeBatch, BarcodeBatchSettings barcodeBatchSettings, Runnable runnable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            runnable = null;
        }
        barcodeBatch.applySettings(barcodeBatchSettings, runnable);
    }

    /* renamed from: _session, reason: from getter */
    public final BarcodeBatchSession getF121357a() {
        return this.f121357a;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.f121359c = dataCaptureContext;
    }

    public final void addListener(BarcodeBatchListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
        listener.onObservationStarted(this);
    }

    @JvmOverloads
    public final void applySettings(BarcodeBatchSettings settings, Runnable whenDone) {
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = getF121378a().applySettingsWrapped(settings._impl());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, whenDone);
        com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar = this.f121360d;
        if (aVar != null) {
            removeListener(aVar);
        }
        Object property = settings.getProperty("freezeIndicator");
        com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar2 = null;
        com.scandit.datacapture.barcode.internal.module.batch.capture.a aVar3 = property instanceof com.scandit.datacapture.barcode.internal.module.batch.capture.a ? (com.scandit.datacapture.barcode.internal.module.batch.capture.a) property : null;
        if (aVar3 != null) {
            addListener(aVar3);
            aVar2 = aVar3;
        }
        this.f121360d = aVar2;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext, reason: from getter */
    public DataCaptureContext getF124698c() {
        return this.f121359c;
    }

    public final CopyOnWriteArrayList<BarcodeBatchListener> getListeners$scandit_barcode_capture() {
        return this.listeners;
    }

    public final void removeListener(BarcodeBatchListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void updateFromJson(String jsonData) {
        Intrinsics.j(jsonData, "jsonData");
        new BarcodeBatchDeserializer().updateModeFromJson(this, jsonData);
    }

    public final BarcodeBatchLicenseInfo getBarcodeBatchLicenseInfo() {
        NativeBarcodeTrackingLicenseInfo barcodeTrackingLicenseInfo = getF121378a().getBarcodeTrackingLicenseInfo();
        if (barcodeTrackingLicenseInfo != null) {
            return new BarcodeBatchLicenseInfo(barcodeTrackingLicenseInfo);
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeBatch(DataCaptureContext dataCaptureContext, BarcodeBatchSettings barcodeBatchSettings, DefaultConstructorMarker defaultConstructorMarker) {
        NativeBarcodeTracking nativeBarcodeTrackingCreate = NativeBarcodeTracking.create(dataCaptureContext != null ? dataCaptureContext._impl() : null, barcodeBatchSettings._impl());
        Intrinsics.i(nativeBarcodeTrackingCreate, "create(...)");
        this(nativeBarcodeTrackingCreate, new BarcodeBatchSession(new C13162a(nativeBarcodeTrackingCreate)));
    }
}
