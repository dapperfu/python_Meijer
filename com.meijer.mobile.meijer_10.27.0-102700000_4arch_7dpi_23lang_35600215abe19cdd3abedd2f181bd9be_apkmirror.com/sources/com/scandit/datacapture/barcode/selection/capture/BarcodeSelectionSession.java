package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSession;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "_impl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSession;", "", "selectUnselectedBarcodes", "()V", "reset", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "", "getCount", "(Lcom/scandit/datacapture/barcode/data/Barcode;)I", "", "toJson", "()Ljava/lang/String;", "", "getNewlySelectedBarcodes", "()Ljava/util/List;", "newlySelectedBarcodes", "getNewlyUnselectedBarcodes", "newlyUnselectedBarcodes", "getSelectedBarcodes", "selectedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "getLastProcessedFrameId", "()I", "lastProcessedFrameId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class BarcodeSelectionSession implements BarcodeSelectionSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f123788a;

    /* renamed from: b, reason: collision with root package name */
    private final Lazy f123789b;

    public BarcodeSelectionSession(Function0<? extends NativeBarcodeSelectionSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f123788a = getImpl;
        this.f123789b = LazyKt.b(new F(this));
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    /* renamed from: _impl */
    public NativeBarcodeSelectionSession getF123790a() {
        return (NativeBarcodeSelectionSession) this.f123788a.invoke();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public int getCount(Barcode barcode) {
        Intrinsics.j(barcode, "barcode");
        return ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).getCount(barcode);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public long getFrameSequenceId() {
        return ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public int getLastProcessedFrameId() {
        return ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).getLastProcessedFrameId();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public List<Barcode> getNewlySelectedBarcodes() {
        return ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).getNewlySelectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public List<Barcode> getNewlyUnselectedBarcodes() {
        return ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).getNewlyUnselectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public List<Barcode> getSelectedBarcodes() {
        return ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).getSelectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public void reset() {
        ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).reset();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public void selectUnselectedBarcodes() {
        ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).selectUnselectedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionSessionProxy
    public String toJson() {
        return ((BarcodeSelectionSessionProxyAdapter) this.f123789b.getValue()).toJson();
    }
}
