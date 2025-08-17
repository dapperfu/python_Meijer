package com.scandit.datacapture.barcode.internal.module.spark.internal;

import com.scandit.datacapture.barcode.spark.capture.SparkScan$sparkScanListenerInternal$1;
import com.scandit.datacapture.barcode.spark.capture.SparkScanLicenseInfo;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSession;
import com.scandit.datacapture.barcode.spark.capture.SparkScanSettings;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanLicenseInfo;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class SparkScanInternal implements DataCaptureMode {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t f122927a;

    /* renamed from: b, reason: collision with root package name */
    private DataCaptureContext f122928b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArraySet f122929c;

    /* renamed from: d, reason: collision with root package name */
    private final SparkScanSession f122930d;

    public SparkScanInternal(SparkScanSettings sparkScanSettings) {
        NativeSparkScan impl = NativeSparkScan.create(null, sparkScanSettings.getF123870a());
        Intrinsics.i(impl, "create(...)");
        Intrinsics.j(impl, "impl");
        t tVar = new t(impl);
        this.f122927a = tVar;
        this.f122929c = new CopyOnWriteArraySet();
        this.f122930d = new SparkScanSession(new i(impl));
        tVar.f122955a.addListenerAsync(new s(new h(this), this));
    }

    public final NativeSparkScan a() {
        return this.f122927a.f122955a;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final NativeDataCaptureMode _dataCaptureModeImpl() {
        return this.f122927a.f122956b;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public final void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.f122928b = dataCaptureContext;
    }

    public final void a(boolean z10) {
        this.f122927a.f122955a.enableSingleScanMode(z10);
    }

    public final SparkScanSession b() {
        return this.f122930d;
    }

    public final SparkScanLicenseInfo c() {
        NativeSparkScanLicenseInfo sparkScanLicenseInfo = this.f122927a.f122955a.getSparkScanLicenseInfo();
        if (sparkScanLicenseInfo != null) {
            return new SparkScanLicenseInfo(sparkScanLicenseInfo);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext */
    public final DataCaptureContext getF120935c() {
        return this.f122928b;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final boolean isEnabled() {
        return this.f122927a.f122955a.isEnabled();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final void setEnabled(boolean z10) {
        this.f122927a.f122955a.setEnabled(z10);
    }

    public final void a(SparkScan$sparkScanListenerInternal$1 listener) {
        Intrinsics.j(listener, "listener");
        if (this.f122929c.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    public static void a(SparkScanInternal sparkScanInternal, SparkScanSettings settings) {
        sparkScanInternal.getClass();
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = sparkScanInternal.f122927a.f122955a.applySettingsWrapped(settings.getF123870a());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, (Runnable) null);
    }
}
