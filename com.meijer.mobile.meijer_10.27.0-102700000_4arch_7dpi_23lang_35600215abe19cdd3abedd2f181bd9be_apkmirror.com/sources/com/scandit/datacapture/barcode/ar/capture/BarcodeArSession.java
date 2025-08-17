package com.scandit.datacapture.barcode.ar.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSession;", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeArSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/internal/module/ar/capture/NativeBarcodeArSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "toJson", "()Ljava/lang/String;", "", "reset", "()V", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "addedTrackedBarcodes", "", "", "getTrackedBarcodes", "()Ljava/util/Map;", "trackedBarcodes", "getRemovedTrackedBarcodes", "removedTrackedBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArSession implements BarcodeArSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f120095a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f120096b;

    public BarcodeArSession(Function0<? extends NativeBarcodeArSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f120095a = getImpl;
        this.f120096b = LazyKt.b(new c(this));
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public List<TrackedBarcode> getAddedTrackedBarcodes() {
        return ((BarcodeArSessionProxyAdapter) this.f120096b.getValue()).getAddedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public List<Integer> getRemovedTrackedBarcodes() {
        return ((BarcodeArSessionProxyAdapter) this.f120096b.getValue()).getRemovedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public Map<Integer, TrackedBarcode> getTrackedBarcodes() {
        return ((BarcodeArSessionProxyAdapter) this.f120096b.getValue()).getTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public void reset() {
        ((BarcodeArSessionProxyAdapter) this.f120096b.getValue()).reset();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArSessionProxy
    public String toJson() {
        return ((BarcodeArSessionProxyAdapter) this.f120096b.getValue()).toJson();
    }
}
