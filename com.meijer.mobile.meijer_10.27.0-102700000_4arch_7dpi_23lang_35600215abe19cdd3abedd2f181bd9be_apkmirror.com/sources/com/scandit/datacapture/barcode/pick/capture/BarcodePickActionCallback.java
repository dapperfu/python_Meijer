package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickActionCallback;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionCallback;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionCallbackProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionCallback;", "impl", "", "itemData", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionCallback;Ljava/lang/String;)V", "_impl", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickActionCallback;", "", "result", "", "onFinish", "(Z)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickActionCallback implements BarcodePickActionCallbackProxy {

    /* renamed from: a, reason: collision with root package name */
    private final String f123562a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BarcodePickActionCallbackProxyAdapter f123563b;

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickActionCallbackProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodePickActionCallback getF123564a() {
        return this.f123563b.getF123564a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodePickActionCallback(NativeBarcodePickActionCallback impl, String itemData) {
        Intrinsics.j(impl, "impl");
        Intrinsics.j(itemData, "itemData");
        this.f123562a = itemData;
        this.f123563b = new BarcodePickActionCallbackProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    public final void onFinish(boolean result) {
        getF123564a().onResponse(this.f123562a, result);
    }
}
