package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "getNewlyLocalizedBarcodes", "()Ljava/util/List;", "newlyLocalizedBarcodes", "get_newlyRecognizedBarcodes", "_newlyRecognizedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class BarcodeCaptureSession implements BarcodeCaptureSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f121494a;

    public BarcodeCaptureSession(Function0<? extends NativeBarcodeCaptureSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f121494a = LazyKt.b(new S(getImpl));
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public long getFrameSequenceId() {
        return ((BarcodeCaptureSessionProxyAdapter) this.f121494a.getValue()).getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public List<LocalizedOnlyBarcode> getNewlyLocalizedBarcodes() {
        return ((BarcodeCaptureSessionProxyAdapter) this.f121494a.getValue()).getNewlyLocalizedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public Barcode getNewlyRecognizedBarcode() {
        return ((BarcodeCaptureSessionProxyAdapter) this.f121494a.getValue()).getNewlyRecognizedBarcode();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public List<Barcode> get_newlyRecognizedBarcodes() {
        return ((BarcodeCaptureSessionProxyAdapter) this.f121494a.getValue()).get_newlyRecognizedBarcodes();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public void reset() {
        ((BarcodeCaptureSessionProxyAdapter) this.f121494a.getValue()).reset();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public String toJson() {
        return ((BarcodeCaptureSessionProxyAdapter) this.f121494a.getValue()).toJson();
    }
}
