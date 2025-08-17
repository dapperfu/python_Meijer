package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanEnableDisableListener;
import com.scandit.datacapture.barcode.internal.module.spark.capture.SparkScanModeViewListener;
import com.scandit.datacapture.barcode.internal.module.spark.internal.SparkScanInternal;
import com.scandit.datacapture.barcode.internal.module.spark.internal.j;
import com.scandit.datacapture.barcode.spark.serialization.SparkScanDeserializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyPushSource;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001SB\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\tJ\u000f\u0010\u0018\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010!\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010\nJ\u000f\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b\"\u0010\nJ\u0017\u0010%\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010*\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020+¢\u0006\u0004\b.\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\tR.\u0010<\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010A\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R.\u0010I\u001a\u0004\u0018\u00010B2\b\u00105\u001a\u0004\u0018\u00010B8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR$\u0010N\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010\u000fR\u0014\u0010R\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010O¨\u0006T"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "", "Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;", "sparkScanInternal", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "sparkScanSettings", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;)V", "settings", "(Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;)V", "()V", "", "enabled", "", "setSingleScanModeEnabled$scandit_barcode_capture", "(Z)V", "setSingleScanModeEnabled", "Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyPushSource;", "propertyPushSource", "setPropertyPushSource$scandit_barcode_capture", "(Lcom/scandit/datacapture/core/internal/sdk/analytics/NativePropertyPushSource;)V", "setPropertyPushSource", "applySettings", "_applySettings$scandit_barcode_capture", "_applySettings", "Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanEnableDisableListener;", "listener", "_addEnableDisableListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanEnableDisableListener;)V", "_addEnableDisableListener", "_removeEnableDisableListener$scandit_barcode_capture", "_removeEnableDisableListener", "_disable$scandit_barcode_capture", "_disable", "_enable$scandit_barcode_capture", "_enable", "_setResultSuppressionEnabled$scandit_barcode_capture", "_setResultSuppressionEnabled", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;", "scanningMode", "_applyNewSettingsForScanningMode$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanScanningMode;)V", "_applyNewSettingsForScanningMode", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanListener;", "addListener", "(Lcom/scandit/datacapture/barcode/spark/capture/SparkScanListener;)V", "removeListener", "a", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "getSparkScanSettings$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSettings;", "setSparkScanSettings$scandit_barcode_capture", "Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;", "value", "b", "Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;", "get_sparkScanModeViewListener$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;", "set_sparkScanModeViewListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/spark/capture/SparkScanModeViewListener;)V", "_sparkScanModeViewListener", "e", "Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;", "get_sparkScanInternal$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/spark/internal/SparkScanInternal;", "_sparkScanInternal", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "f", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "getDataCaptureContext$scandit_barcode_capture", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "setDataCaptureContext$scandit_barcode_capture", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanLicenseInfo;", "getSparkScanLicenseInfo", "()Lcom/scandit/datacapture/barcode/spark/capture/SparkScanLicenseInfo;", "sparkScanLicenseInfo", "isEnabled", "()Z", "setEnabled", "isSuppressed$scandit_barcode_capture", "isSuppressed", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SparkScan {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private SparkScanSettings sparkScanSettings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ SparkScanModeViewListener _sparkScanModeViewListener;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f123859c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f123860d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SparkScanInternal _sparkScanInternal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private DataCaptureContext dataCaptureContext;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScan$Companion;", "", "", "jsonData", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "fromJson", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final SparkScan fromJson(String jsonData) {
            Intrinsics.j(jsonData, "jsonData");
            return new SparkScanDeserializer().modeFromJson(jsonData);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SparkScan(SparkScanSettings settings) {
        this(new SparkScanInternal(settings), settings);
        Intrinsics.j(settings, "settings");
        Intrinsics.j(settings, "settings");
    }

    @JvmStatic
    public static final SparkScan fromJson(String str) {
        return INSTANCE.fromJson(str);
    }

    public final void _addEnableDisableListener$scandit_barcode_capture(SparkScanEnableDisableListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123860d.add(listener);
    }

    public final void _applyNewSettingsForScanningMode$scandit_barcode_capture(SparkScanScanningMode scanningMode) {
        Intrinsics.j(scanningMode, "scanningMode");
        this.sparkScanSettings._applySettingsForScanningMode$scandit_barcode_capture(scanningMode);
        _applySettings$scandit_barcode_capture();
    }

    public final void _applySettings$scandit_barcode_capture() {
        SparkScanInternal.a(this._sparkScanInternal, this.sparkScanSettings);
    }

    public final void _disable$scandit_barcode_capture() {
        if (this._sparkScanInternal.isEnabled() || isSuppressed$scandit_barcode_capture()) {
            this._sparkScanInternal.setEnabled(false);
            DataCaptureContext dataCaptureContext = this.dataCaptureContext;
            if (dataCaptureContext != null) {
                dataCaptureContext.removeMode(this._sparkScanInternal);
            }
        }
    }

    public final void _removeEnableDisableListener$scandit_barcode_capture(SparkScanEnableDisableListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123860d.remove(listener);
    }

    public final void _setResultSuppressionEnabled$scandit_barcode_capture(boolean enabled) {
        this._sparkScanInternal.a().setResultSuppressionEnabled(enabled);
    }

    public final void addListener(SparkScanListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123859c.add(listener);
    }

    public final void applySettings(SparkScanSettings settings) {
        Intrinsics.j(settings, "settings");
        this.sparkScanSettings = settings;
        SparkScanModeViewListener sparkScanModeViewListener = this._sparkScanModeViewListener;
        if (sparkScanModeViewListener == null) {
            _applySettings$scandit_barcode_capture();
        } else {
            sparkScanModeViewListener.onApplySettings(settings);
            _applyNewSettingsForScanningMode$scandit_barcode_capture(sparkScanModeViewListener.getScanningMode());
        }
    }

    /* renamed from: getDataCaptureContext$scandit_barcode_capture, reason: from getter */
    public final DataCaptureContext getDataCaptureContext() {
        return this.dataCaptureContext;
    }

    public final SparkScanLicenseInfo getSparkScanLicenseInfo() {
        return this._sparkScanInternal.c();
    }

    /* renamed from: getSparkScanSettings$scandit_barcode_capture, reason: from getter */
    public final SparkScanSettings getSparkScanSettings() {
        return this.sparkScanSettings;
    }

    /* renamed from: get_sparkScanInternal$scandit_barcode_capture, reason: from getter */
    public final SparkScanInternal get_sparkScanInternal() {
        return this._sparkScanInternal;
    }

    /* renamed from: get_sparkScanModeViewListener$scandit_barcode_capture, reason: from getter */
    public final SparkScanModeViewListener get_sparkScanModeViewListener() {
        return this._sparkScanModeViewListener;
    }

    public final boolean isEnabled() {
        return this._sparkScanInternal.isEnabled();
    }

    public final boolean isSuppressed$scandit_barcode_capture() {
        return this._sparkScanInternal.a().isSuppressed();
    }

    public final void removeListener(SparkScanListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123859c.remove(listener);
    }

    public final void setDataCaptureContext$scandit_barcode_capture(DataCaptureContext dataCaptureContext) {
        if (Intrinsics.e(dataCaptureContext, this.dataCaptureContext)) {
            return;
        }
        DataCaptureContext dataCaptureContext2 = this.dataCaptureContext;
        if (dataCaptureContext2 != null) {
            dataCaptureContext2.removeMode(this._sparkScanInternal);
        }
        if (this._sparkScanInternal.isEnabled() && dataCaptureContext != null) {
            dataCaptureContext.setMode(this._sparkScanInternal);
        }
        this.dataCaptureContext = dataCaptureContext;
    }

    public final void setEnabled(boolean z10) {
        Iterator it = this.f123860d.iterator();
        while (it.hasNext()) {
            ((SparkScanEnableDisableListener) it.next()).onEnabledChange(z10);
        }
    }

    public final void setPropertyPushSource$scandit_barcode_capture(NativePropertyPushSource propertyPushSource) {
        this._sparkScanInternal.a().setPropertyPushSource(propertyPushSource);
    }

    public final void setSingleScanModeEnabled$scandit_barcode_capture(boolean enabled) {
        this._sparkScanInternal.a(enabled);
    }

    public final void setSparkScanSettings$scandit_barcode_capture(SparkScanSettings sparkScanSettings) {
        Intrinsics.j(sparkScanSettings, "<set-?>");
        this.sparkScanSettings = sparkScanSettings;
    }

    public final void set_sparkScanModeViewListener$scandit_barcode_capture(SparkScanModeViewListener sparkScanModeViewListener) {
        this._sparkScanModeViewListener = sparkScanModeViewListener;
        if (sparkScanModeViewListener != null) {
            sparkScanModeViewListener.onApplySettings(this.sparkScanSettings);
        }
    }

    public final void _enable$scandit_barcode_capture() {
        if (isSuppressed$scandit_barcode_capture()) {
            _setResultSuppressionEnabled$scandit_barcode_capture(false);
        } else if (!this._sparkScanInternal.isEnabled()) {
            DataCaptureContext dataCaptureContext = this.dataCaptureContext;
            if (dataCaptureContext != null) {
                dataCaptureContext.setMode(this._sparkScanInternal);
            }
            this._sparkScanInternal.setEnabled(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.scandit.datacapture.barcode.spark.capture.SparkScan$sparkScanListenerInternal$1] */
    public SparkScan(SparkScanInternal sparkScanInternal, SparkScanSettings sparkScanSettings) {
        Intrinsics.j(sparkScanInternal, "sparkScanInternal");
        Intrinsics.j(sparkScanSettings, "sparkScanSettings");
        this.sparkScanSettings = sparkScanSettings;
        ?? r32 = new j() { // from class: com.scandit.datacapture.barcode.spark.capture.SparkScan$sparkScanListenerInternal$1
            @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
            public void onBarcodeScanned(SparkScanInternal sparkScan, SparkScanSession session, FrameData data) {
                Intrinsics.j(sparkScan, "sparkScan");
                Intrinsics.j(session, "session");
                Intrinsics.j(data, "data");
                Collection collection = this.f123863a.f123859c;
                SparkScan sparkScan2 = this.f123863a;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((SparkScanListener) it.next()).onBarcodeScanned(sparkScan2, session, data);
                }
            }

            @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
            @ProxyFunction
            public void onObservationStarted(SparkScanInternal sparkScan) {
                Intrinsics.j(sparkScan, "sparkScan");
            }

            @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
            @ProxyFunction
            public void onObservationStopped(SparkScanInternal sparkScan) {
                Intrinsics.j(sparkScan, "sparkScan");
            }

            @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.j
            public void onSessionUpdated(SparkScanInternal sparkScan, SparkScanSession session, FrameData data) {
                Intrinsics.j(sparkScan, "sparkScan");
                Intrinsics.j(session, "session");
                Intrinsics.j(data, "data");
                Collection collection = this.f123863a.f123859c;
                SparkScan sparkScan2 = this.f123863a;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((SparkScanListener) it.next()).onSessionUpdated(sparkScan2, session, data);
                }
            }
        };
        this.f123859c = new CopyOnWriteArrayList();
        this.f123860d = new CopyOnWriteArraySet();
        sparkScanInternal.setEnabled(false);
        sparkScanInternal.a((SparkScan$sparkScanListenerInternal$1) r32);
        this._sparkScanInternal = sparkScanInternal;
    }

    public SparkScan() {
        this(new SparkScanSettings());
    }
}
