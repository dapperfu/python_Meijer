package com.scandit.datacapture.barcode.internal.module.ar.capture;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArListener;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArListenerReversedAdapter;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSession;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import com.scandit.datacapture.barcode.ar.feedback.BarcodeArFeedback;
import com.scandit.datacapture.barcode.internal.module.ar.feedback.BarcodeArFeedbackEmitter;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes12.dex */
public final class BarcodeArInternal implements DataCaptureMode {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArSession f122000a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ c f122001b;

    /* renamed from: c, reason: collision with root package name */
    private BarcodeArFeedbackEmitter f122002c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodeArFeedback f122003d;

    /* renamed from: e, reason: collision with root package name */
    private BarcodeAr f122004e;

    /* renamed from: f, reason: collision with root package name */
    private DataCaptureContext f122005f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f122006g;

    public final void a(BarcodeArSettings settings, Runnable runnable) {
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = this.f122001b.f122012a.applySettingsWrapped(settings.getF121052a());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, runnable);
    }

    public final boolean b(BarcodeArListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f122006g.remove(listener);
    }

    public BarcodeArInternal(NativeBarcodeAr impl) {
        BarcodeArSession session = new BarcodeArSession(new a(impl));
        Intrinsics.j(impl, "impl");
        Intrinsics.j(session, "session");
        this.f122000a = session;
        this.f122001b = new c(impl);
        this.f122003d = BarcodeArFeedback.INSTANCE.defaultFeedback();
        this.f122006g = new CopyOnWriteArraySet();
        ProxyCacheKt.getGlobalProxyCache().put(Reflection.b(NativeBarcodeAr.class), null, impl, this);
        impl.addListenerAsync(new BarcodeArListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final NativeDataCaptureMode _dataCaptureModeImpl() {
        return this.f122001b.f122013b;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public final void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.f122005f = dataCaptureContext;
    }

    public final BarcodeArSession b() {
        return this.f122000a;
    }

    public final BarcodeAr c() {
        BarcodeAr barcodeAr = this.f122004e;
        if (barcodeAr != null) {
            return barcodeAr;
        }
        BarcodeAr barcodeAr2 = new BarcodeAr(this);
        this.f122004e = barcodeAr2;
        return barcodeAr2;
    }

    public final BarcodeArFeedback d() {
        return this.f122003d;
    }

    public final BarcodeArFeedbackEmitter e() {
        return this.f122002c;
    }

    public final void f() {
        this.f122001b.f122012a.pauseAsync();
    }

    public final void g() {
        this.f122001b.f122012a.startAsync();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext */
    public final DataCaptureContext getF121359c() {
        return this.f122005f;
    }

    public final void h() {
        this.f122001b.f122012a.stopAsync();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final boolean isEnabled() {
        return this.f122001b.f122012a.isEnabled();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final void setEnabled(boolean z10) {
        this.f122001b.f122012a.setEnabled(z10);
    }

    public final NativeBarcodeAr a() {
        return this.f122001b.f122012a;
    }

    public final void a(BarcodeArFeedbackEmitter barcodeArFeedbackEmitter) {
        this.f122002c = barcodeArFeedbackEmitter;
        if (barcodeArFeedbackEmitter != null) {
            barcodeArFeedbackEmitter.a(this.f122003d);
        }
    }

    public final void a(BarcodeArFeedback value) {
        Intrinsics.j(value, "value");
        this.f122003d = value;
        BarcodeArFeedbackEmitter barcodeArFeedbackEmitter = this.f122002c;
        if (barcodeArFeedbackEmitter != null) {
            barcodeArFeedbackEmitter.a(value);
        }
    }

    public final void a(BarcodeAr value) {
        Intrinsics.j(value, "value");
        this.f122004e = value;
    }

    public final boolean a(BarcodeArListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f122006g.add(listener);
    }
}
