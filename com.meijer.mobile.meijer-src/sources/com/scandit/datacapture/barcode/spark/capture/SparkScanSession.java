package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSession;", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSessionProxy;", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSession;", "getImpl", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "", "getFrameSequenceId", "()J", "frameSequenceId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class SparkScanSession implements SparkScanSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f124817a;

    public SparkScanSession(Function0<? extends NativeSparkScanSession> getImpl) {
        Intrinsics.j(getImpl, "getImpl");
        this.f124817a = LazyKt.b(new a(getImpl));
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public long getFrameSequenceId() {
        return ((SparkScanSessionProxyAdapter) this.f124817a.getValue()).getFrameSequenceId();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public Barcode getNewlyRecognizedBarcode() {
        return ((SparkScanSessionProxyAdapter) this.f124817a.getValue()).getNewlyRecognizedBarcode();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public void reset() {
        ((SparkScanSessionProxyAdapter) this.f124817a.getValue()).reset();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public String toJson() {
        return ((SparkScanSessionProxyAdapter) this.f124817a.getValue()).toJson();
    }
}
