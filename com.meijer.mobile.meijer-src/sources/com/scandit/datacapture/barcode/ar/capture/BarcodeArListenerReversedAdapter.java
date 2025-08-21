package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.internal.module.ar.capture.BarcodeArInternal;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArListener;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArListener;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArListener;", "_BarcodeArListener", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/BarcodeArInternal;", "_BarcodeArInternal", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArListener;Lcom/scandit/datacapture/barcode/internal/module/ar/capture/BarcodeArInternal;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;", "barcodeAr", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSession;", "session", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;", "data", "", "onSessionUpdated", "(Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSession;Lcom/scandit/datacapture/core/internal/sdk/data/NativeFrameData;)V", "onObservationStarted", "(Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeAr;)V", "onObservationStopped", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArListenerReversedAdapter extends NativeBarcodeArListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArListener f121044a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f121046c;

    public /* synthetic */ BarcodeArListenerReversedAdapter(BarcodeArListener barcodeArListener, BarcodeArInternal barcodeArInternal, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeArListener, barcodeArInternal, (i10 & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArListener
    public void onObservationStarted(NativeBarcodeAr barcodeAr) {
        Intrinsics.j(barcodeAr, "barcodeAr");
        if (((BarcodeArInternal) this.f121046c.get()) != null) {
            this.f121044a.onObservationStarted(BarcodeNativeTypeFactory.INSTANCE.convert(barcodeAr));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArListener
    public void onObservationStopped(NativeBarcodeAr barcodeAr) {
        Intrinsics.j(barcodeAr, "barcodeAr");
        if (((BarcodeArInternal) this.f121046c.get()) != null) {
            this.f121044a.onObservationStopped(BarcodeNativeTypeFactory.INSTANCE.convert(barcodeAr));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArListener
    public void onSessionUpdated(NativeBarcodeAr barcodeAr, NativeBarcodeArSession session, NativeFrameData data) {
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeArInternal barcodeArInternal = (BarcodeArInternal) this.f121046c.get();
        if (barcodeArInternal != null) {
            this.f121044a.onSessionUpdated(BarcodeNativeTypeFactory.INSTANCE.convert(barcodeAr), (BarcodeArSession) this.proxyCache.getOrPut(Reflection.b(NativeBarcodeArSession.class), null, session, new a(barcodeArInternal)), (FrameData) this.proxyCache.getOrPut(Reflection.b(NativeFrameData.class), null, data, new b(data)));
        }
    }

    public BarcodeArListenerReversedAdapter(BarcodeArListener _BarcodeArListener, BarcodeArInternal _BarcodeArInternal, ProxyCache proxyCache) {
        Intrinsics.j(_BarcodeArListener, "_BarcodeArListener");
        Intrinsics.j(_BarcodeArInternal, "_BarcodeArInternal");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121044a = _BarcodeArListener;
        this.proxyCache = proxyCache;
        this.f121046c = new WeakReference(_BarcodeArInternal);
    }
}
