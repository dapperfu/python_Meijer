package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningListener;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningListener;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningListener;", "_BarcodePickScanningListener", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;", "_BarcodePickInternal", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningListener;Lcom/scandit/datacapture/barcode/internal/module/pick/capture/BarcodePickInternal;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "mode", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;", "session", "", "onScanningSessionUpdated", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;)V", "onScanningSessionCompleted", "onObservationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;)V", "onObservationStopped", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickScanningListenerReversedAdapter extends NativeBarcodePickScanningListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickScanningListener f123570a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f123572c;

    public /* synthetic */ BarcodePickScanningListenerReversedAdapter(BarcodePickScanningListener barcodePickScanningListener, BarcodePickInternal barcodePickInternal, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodePickScanningListener, barcodePickInternal, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningListener
    public void onObservationStarted(NativeBarcodePick mode) {
        Intrinsics.j(mode, "mode");
        if (((BarcodePickInternal) this.f123572c.get()) != null) {
            this.f123570a.onObservationStarted(BarcodeNativeTypeFactory.INSTANCE.convert(mode));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningListener
    public void onObservationStopped(NativeBarcodePick mode) {
        Intrinsics.j(mode, "mode");
        if (((BarcodePickInternal) this.f123572c.get()) != null) {
            this.f123570a.onObservationStopped(BarcodeNativeTypeFactory.INSTANCE.convert(mode));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningListener
    public void onScanningSessionCompleted(NativeBarcodePick mode, NativeBarcodePickScanningSession session) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123572c.get();
        if (barcodePickInternal != null) {
            this.f123570a.onScanningSessionCompleted(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (BarcodePickScanningSession) this.proxyCache.getOrPut(Reflection.b(NativeBarcodePickScanningSession.class), null, session, new c(barcodePickInternal)));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningListener
    public void onScanningSessionUpdated(NativeBarcodePick mode, NativeBarcodePickScanningSession session) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123572c.get();
        if (barcodePickInternal != null) {
            this.f123570a.onScanningSessionUpdated(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (BarcodePickScanningSession) this.proxyCache.getOrPut(Reflection.b(NativeBarcodePickScanningSession.class), null, session, new d(barcodePickInternal)));
        }
    }

    public BarcodePickScanningListenerReversedAdapter(BarcodePickScanningListener _BarcodePickScanningListener, BarcodePickInternal _BarcodePickInternal, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodePickScanningListener, "_BarcodePickScanningListener");
        Intrinsics.j(_BarcodePickInternal, "_BarcodePickInternal");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123570a = _BarcodePickScanningListener;
        this.proxyCache = proxyCache;
        this.f123572c = new WeakReference(_BarcodePickInternal);
    }
}
