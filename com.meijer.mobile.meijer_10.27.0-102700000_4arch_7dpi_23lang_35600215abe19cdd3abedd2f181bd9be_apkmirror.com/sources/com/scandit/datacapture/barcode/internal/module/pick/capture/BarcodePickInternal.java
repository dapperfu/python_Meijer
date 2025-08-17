package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListenerKt;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickListenerReversedAdapter;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListener;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningListenerReversedAdapter;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSession;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSelectItemActionCallback;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSelectItemActionCallbackKt;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes11.dex */
public final class BarcodePickInternal implements DataCaptureMode {

    /* renamed from: a, reason: collision with root package name */
    private final v f122409a;

    /* renamed from: b, reason: collision with root package name */
    private final BarcodePickScanningSession f122410b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t f122411c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodePick f122412d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArraySet f122413e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet f122414f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f122415g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f122416h;

    /* renamed from: i, reason: collision with root package name */
    private DataCaptureContext f122417i;

    public final void a(BarcodePickSettings settings, Runnable runnable) {
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = this.f122411c.f122449a.applySettingsWrapped(settings._impl());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, runnable);
    }

    public BarcodePickInternal(NativeBarcodePick impl) {
        v session = new v(new C13187a(impl));
        BarcodePickScanningSession scanningSession = new BarcodePickScanningSession(new b(impl));
        Intrinsics.j(impl, "impl");
        Intrinsics.j(session, "session");
        Intrinsics.j(scanningSession, "scanningSession");
        this.f122409a = session;
        this.f122410b = scanningSession;
        t tVar = new t(impl);
        this.f122411c = tVar;
        this.f122413e = new CopyOnWriteArraySet();
        this.f122414f = new CopyOnWriteArraySet();
        this.f122415g = new CopyOnWriteArraySet();
        this.f122416h = new CopyOnWriteArraySet();
        NativeDataCaptureContext context = tVar.f122449a.getContext();
        this.f122417i = context != null ? (DataCaptureContext) tVar.f122450b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new s(context)) : null;
        impl.addListenerAsync(new r(new f(this), this));
        impl.addActionListenerAsync(BarcodePickActionListenerKt.asNative(new c(this)));
        impl.addScanningListenerAsync(new BarcodePickScanningListenerReversedAdapter(new e(this), this, null, 4, null));
        impl.addPublicListenerAsync(new BarcodePickListenerReversedAdapter(new d(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    /* renamed from: _dataCaptureModeImpl */
    public final NativeDataCaptureMode getF120428c() {
        return this.f122411c.f122451c;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public final void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.f122417i = dataCaptureContext;
    }

    public final BarcodePickScanningSession b() {
        return this.f122410b;
    }

    public final v c() {
        return this.f122409a;
    }

    public final BarcodePick d() {
        BarcodePick barcodePick = this.f122412d;
        if (barcodePick != null) {
            return barcodePick;
        }
        BarcodePick barcodePick2 = new BarcodePick(this);
        this.f122412d = barcodePick2;
        return barcodePick2;
    }

    public final /* synthetic */ CopyOnWriteArraySet e() {
        return this.f122414f;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext */
    public final DataCaptureContext getF120407c() {
        return this.f122417i;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final boolean isEnabled() {
        return this.f122411c.f122449a.isEnabled();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final void setEnabled(boolean z10) {
        this.f122411c.f122449a.setEnabled(z10);
    }

    public final void b(BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f122413e.remove(listener)) {
            listener.b(this);
        }
    }

    public final void a(String itemData, boolean z10) {
        Intrinsics.j(itemData, "itemData");
        t tVar = this.f122411c;
        tVar.getClass();
        Intrinsics.j(itemData, "itemData");
        tVar.f122449a.completeActionForItem(itemData, z10);
    }

    public final void b(BarcodePickActionListener listener) {
        Intrinsics.j(listener, "listener");
        this.f122414f.remove(listener);
    }

    public final NativeBarcodePick a() {
        return this.f122411c.f122449a;
    }

    public final boolean b(BarcodePickScanningListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f122415g.remove(listener);
    }

    public final boolean b(com.scandit.datacapture.barcode.pick.capture.BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f122416h.remove(listener);
    }

    public final void a(BarcodePick value) {
        Intrinsics.j(value, "value");
        this.f122412d = value;
    }

    public final void a(BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f122413e.add(listener)) {
            listener.a(this);
        }
    }

    public final void a(BarcodePickActionListener listener) {
        Intrinsics.j(listener, "listener");
        this.f122414f.add(listener);
    }

    public final boolean a(BarcodePickScanningListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f122415g.add(listener);
    }

    public final boolean a(com.scandit.datacapture.barcode.pick.capture.BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f122416h.add(listener);
    }

    public final void a(TrackedObject track, BarcodePickSelectItemActionCallback barcodePickSelectItemActionCallback) {
        Intrinsics.j(track, "track");
        Iterator it = this.f122413e.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(track);
        }
        this.f122411c.f122449a.handleTapAsync(track.getF120473a(), barcodePickSelectItemActionCallback != null ? BarcodePickSelectItemActionCallbackKt.asNative(barcodePickSelectItemActionCallback) : null);
    }
}
