package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012R\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSession;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "addedTrackedBarcodes", "getUpdatedTrackedBarcodes", "updatedTrackedBarcodes", "", "getRemovedTrackedBarcodes", "removedTrackedBarcodes", "", "getTrackedBarcodes", "()Ljava/util/Map;", "trackedBarcodes", "getUnscannedTrackedBarcodes", "unscannedTrackedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class BarcodeBatchSession implements BarcodeBatchSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f121381a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f121382b;

    public BarcodeBatchSession(Function0<? extends NativeBarcodeTrackingSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f121381a = getImpl;
        this.f121382b = LazyKt.b(new G(this));
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    /* renamed from: _impl */
    public NativeBarcodeTrackingSession getF121383a() {
        return (NativeBarcodeTrackingSession) this.f121381a.invoke();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<TrackedBarcode> getAddedTrackedBarcodes() {
        return ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).getAddedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public long getFrameSequenceId() {
        return ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<Integer> getRemovedTrackedBarcodes() {
        return ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).getRemovedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public Map<Integer, TrackedBarcode> getTrackedBarcodes() {
        return ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).getTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<TrackedBarcode> getUnscannedTrackedBarcodes() {
        return ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).getUnscannedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<TrackedBarcode> getUpdatedTrackedBarcodes() {
        return ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).getUpdatedTrackedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public void reset() {
        ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).reset();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public String toJson() {
        return ((BarcodeBatchSessionProxyAdapter) this.f121382b.getValue()).toJson();
    }
}
