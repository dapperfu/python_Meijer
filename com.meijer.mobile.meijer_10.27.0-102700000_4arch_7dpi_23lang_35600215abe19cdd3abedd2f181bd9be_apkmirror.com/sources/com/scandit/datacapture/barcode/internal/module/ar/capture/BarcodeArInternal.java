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

/* loaded from: classes11.dex */
public final class BarcodeArInternal implements DataCaptureMode {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArSession f121048a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ c f121049b;

    /* renamed from: c, reason: collision with root package name */
    private BarcodeArFeedbackEmitter f121050c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodeArFeedback f121051d;

    /* renamed from: e, reason: collision with root package name */
    private BarcodeAr f121052e;

    /* renamed from: f, reason: collision with root package name */
    private DataCaptureContext f121053f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f121054g;

    public final void a(BarcodeArSettings settings, Runnable runnable) {
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = this.f121049b.f121060a.applySettingsWrapped(settings.getF120100a());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, runnable);
    }

    public final boolean b(BarcodeArListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f121054g.remove(listener);
    }

    public BarcodeArInternal(NativeBarcodeAr impl) {
        BarcodeArSession session = new BarcodeArSession(new a(impl));
        Intrinsics.j(impl, "impl");
        Intrinsics.j(session, "session");
        this.f121048a = session;
        this.f121049b = new c(impl);
        this.f121051d = BarcodeArFeedback.INSTANCE.defaultFeedback();
        this.f121054g = new CopyOnWriteArraySet();
        ProxyCacheKt.getGlobalProxyCache().put(Reflection.b(NativeBarcodeAr.class), null, impl, this);
        impl.addListenerAsync(new BarcodeArListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final NativeDataCaptureMode _dataCaptureModeImpl() {
        return this.f121049b.f121061b;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public final void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.f121053f = dataCaptureContext;
    }

    public final BarcodeArSession b() {
        return this.f121048a;
    }

    public final BarcodeAr c() {
        BarcodeAr barcodeAr = this.f121052e;
        if (barcodeAr != null) {
            return barcodeAr;
        }
        BarcodeAr barcodeAr2 = new BarcodeAr(this);
        this.f121052e = barcodeAr2;
        return barcodeAr2;
    }

    public final BarcodeArFeedback d() {
        return this.f121051d;
    }

    public final BarcodeArFeedbackEmitter e() {
        return this.f121050c;
    }

    public final void f() {
        this.f121049b.f121060a.pauseAsync();
    }

    public final void g() {
        this.f121049b.f121060a.startAsync();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext */
    public final DataCaptureContext getF120407c() {
        return this.f121053f;
    }

    public final void h() {
        this.f121049b.f121060a.stopAsync();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final boolean isEnabled() {
        return this.f121049b.f121060a.isEnabled();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final void setEnabled(boolean z10) {
        this.f121049b.f121060a.setEnabled(z10);
    }

    public final NativeBarcodeAr a() {
        return this.f121049b.f121060a;
    }

    public final void a(BarcodeArFeedbackEmitter barcodeArFeedbackEmitter) {
        this.f121050c = barcodeArFeedbackEmitter;
        if (barcodeArFeedbackEmitter != null) {
            barcodeArFeedbackEmitter.a(this.f121051d);
        }
    }

    public final void a(BarcodeArFeedback value) {
        Intrinsics.j(value, "value");
        this.f121051d = value;
        BarcodeArFeedbackEmitter barcodeArFeedbackEmitter = this.f121050c;
        if (barcodeArFeedbackEmitter != null) {
            barcodeArFeedbackEmitter.a(value);
        }
    }

    public final void a(BarcodeAr value) {
        Intrinsics.j(value, "value");
        this.f121052e = value;
    }

    public final boolean a(BarcodeArListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f121054g.add(listener);
    }
}
