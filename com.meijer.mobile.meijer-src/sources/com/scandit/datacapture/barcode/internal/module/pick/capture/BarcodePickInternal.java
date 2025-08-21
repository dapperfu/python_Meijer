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

/* loaded from: classes12.dex */
public final class BarcodePickInternal implements DataCaptureMode {

    /* renamed from: a, reason: collision with root package name */
    private final v f123361a;

    /* renamed from: b, reason: collision with root package name */
    private final BarcodePickScanningSession f123362b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t f123363c;

    /* renamed from: d, reason: collision with root package name */
    private BarcodePick f123364d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArraySet f123365e;

    /* renamed from: f, reason: collision with root package name */
    private final CopyOnWriteArraySet f123366f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet f123367g;

    /* renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet f123368h;

    /* renamed from: i, reason: collision with root package name */
    private DataCaptureContext f123369i;

    public final void a(BarcodePickSettings settings, Runnable runnable) {
        Intrinsics.j(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = this.f123363c.f123401a.applySettingsWrapped(settings._impl());
        Intrinsics.i(nativeWrappedFutureApplySettingsWrapped, "applySettingsWrapped(...)");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, runnable);
    }

    public BarcodePickInternal(NativeBarcodePick impl) {
        v session = new v(new C13320a(impl));
        BarcodePickScanningSession scanningSession = new BarcodePickScanningSession(new b(impl));
        Intrinsics.j(impl, "impl");
        Intrinsics.j(session, "session");
        Intrinsics.j(scanningSession, "scanningSession");
        this.f123361a = session;
        this.f123362b = scanningSession;
        t tVar = new t(impl);
        this.f123363c = tVar;
        this.f123365e = new CopyOnWriteArraySet();
        this.f123366f = new CopyOnWriteArraySet();
        this.f123367g = new CopyOnWriteArraySet();
        this.f123368h = new CopyOnWriteArraySet();
        NativeDataCaptureContext context = tVar.f123401a.getContext();
        this.f123369i = context != null ? (DataCaptureContext) tVar.f123402b.getOrPut(Reflection.b(NativeDataCaptureContext.class), null, context, new s(context)) : null;
        impl.addListenerAsync(new r(new f(this), this));
        impl.addActionListenerAsync(BarcodePickActionListenerKt.asNative(new c(this)));
        impl.addScanningListenerAsync(new BarcodePickScanningListenerReversedAdapter(new e(this), this, null, 4, null));
        impl.addPublicListenerAsync(new BarcodePickListenerReversedAdapter(new d(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    /* renamed from: _dataCaptureModeImpl */
    public final NativeDataCaptureMode getF121380c() {
        return this.f123363c.f123403c;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public final void _setDataCaptureContext(DataCaptureContext dataCaptureContext) {
        this.f123369i = dataCaptureContext;
    }

    public final BarcodePickScanningSession b() {
        return this.f123362b;
    }

    public final v c() {
        return this.f123361a;
    }

    public final BarcodePick d() {
        BarcodePick barcodePick = this.f123364d;
        if (barcodePick != null) {
            return barcodePick;
        }
        BarcodePick barcodePick2 = new BarcodePick(this);
        this.f123364d = barcodePick2;
        return barcodePick2;
    }

    public final /* synthetic */ CopyOnWriteArraySet e() {
        return this.f123366f;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    /* renamed from: getDataCaptureContext */
    public final DataCaptureContext getF124698c() {
        return this.f123369i;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final boolean isEnabled() {
        return this.f123363c.f123401a.isEnabled();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.batch.capture.BarcodeBatchProxy
    public final void setEnabled(boolean z10) {
        this.f123363c.f123401a.setEnabled(z10);
    }

    public final void b(BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f123365e.remove(listener)) {
            listener.b(this);
        }
    }

    public final void a(String itemData, boolean z10) {
        Intrinsics.j(itemData, "itemData");
        t tVar = this.f123363c;
        tVar.getClass();
        Intrinsics.j(itemData, "itemData");
        tVar.f123401a.completeActionForItem(itemData, z10);
    }

    public final void b(BarcodePickActionListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123366f.remove(listener);
    }

    public final NativeBarcodePick a() {
        return this.f123363c.f123401a;
    }

    public final boolean b(BarcodePickScanningListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f123367g.remove(listener);
    }

    public final boolean b(com.scandit.datacapture.barcode.pick.capture.BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f123368h.remove(listener);
    }

    public final void a(BarcodePick value) {
        Intrinsics.j(value, "value");
        this.f123364d = value;
    }

    public final void a(BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        if (this.f123365e.add(listener)) {
            listener.a(this);
        }
    }

    public final void a(BarcodePickActionListener listener) {
        Intrinsics.j(listener, "listener");
        this.f123366f.add(listener);
    }

    public final boolean a(BarcodePickScanningListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f123367g.add(listener);
    }

    public final boolean a(com.scandit.datacapture.barcode.pick.capture.BarcodePickListener listener) {
        Intrinsics.j(listener, "listener");
        return this.f123368h.add(listener);
    }

    public final void a(TrackedObject track, BarcodePickSelectItemActionCallback barcodePickSelectItemActionCallback) {
        Intrinsics.j(track, "track");
        Iterator it = this.f123365e.iterator();
        while (it.hasNext()) {
            ((BarcodePickListener) it.next()).a(track);
        }
        this.f123363c.f123401a.handleTapAsync(track.getF121425a(), barcodePickSelectItemActionCallback != null ? BarcodePickSelectItemActionCallbackKt.asNative(barcodePickSelectItemActionCallback) : null);
    }
}
