package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSession;", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "", "toJson", "()Ljava/lang/String;", "", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "getMissingBarcodes", "()Ljava/util/List;", "missingBarcodes", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getCorrectBarcodes", "correctBarcodes", "getWrongBarcodes", "wrongBarcodes", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getAdditionalBarcodes", "additionalBarcodes", "getAcceptedBarcodes", "acceptedBarcodes", "getRejectedBarcodes", "rejectedBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class BarcodeCountCaptureListSession implements BarcodeCountCaptureListSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f120651a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f120652b;

    public BarcodeCountCaptureListSession(Function0<? extends NativeBarcodeCountCaptureListSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f120651a = getImpl;
        this.f120652b = LazyKt.b(new h(this));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    /* renamed from: _impl */
    public NativeBarcodeCountCaptureListSession getF120653a() {
        return (NativeBarcodeCountCaptureListSession) this.f120651a.invoke();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getAcceptedBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.f120652b.getValue()).getAcceptedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<Barcode> getAdditionalBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.f120652b.getValue()).getAdditionalBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getCorrectBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.f120652b.getValue()).getCorrectBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TargetBarcode> getMissingBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.f120652b.getValue()).getMissingBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getRejectedBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.f120652b.getValue()).getRejectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getWrongBarcodes() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.f120652b.getValue()).getWrongBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public String toJson() {
        return ((BarcodeCountCaptureListSessionProxyAdapter) this.f120652b.getValue()).toJson();
    }
}
