package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSession;", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickScanningSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickScanningSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toJson", "()Ljava/lang/String;", "", "getPickedItems", "()Ljava/util/Set;", "pickedItems", "getScannedItems", "scannedItems", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickScanningSession implements BarcodePickScanningSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f123573a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f123574b;

    public BarcodePickScanningSession(Function0<? extends NativeBarcodePickScanningSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f123573a = getImpl;
        this.f123574b = LazyKt.b(new e(this));
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    public Set<String> getPickedItems() {
        return ((BarcodePickScanningSessionProxyAdapter) this.f123574b.getValue()).getPickedItems();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    public Set<String> getScannedItems() {
        return ((BarcodePickScanningSessionProxyAdapter) this.f123574b.getValue()).getScannedItems();
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickScanningSessionProxy
    public String toJson() {
        return ((BarcodePickScanningSessionProxyAdapter) this.f123574b.getValue()).toJson();
    }
}
