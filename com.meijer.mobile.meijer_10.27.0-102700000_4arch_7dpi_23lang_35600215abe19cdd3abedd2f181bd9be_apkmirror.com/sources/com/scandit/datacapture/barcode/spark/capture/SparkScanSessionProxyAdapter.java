package com.scandit.datacapture.barcode.spark.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScanSessionProxy;", "Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSession;", "_NativeSparkScanSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/spark/internal/module/capture/NativeSparkScanSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "", "getFrameSequenceId", "()J", "frameSequenceId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanSessionProxyAdapter implements SparkScanSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSparkScanSession f123866a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public SparkScanSessionProxyAdapter(NativeSparkScanSession _NativeSparkScanSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeSparkScanSession, "_NativeSparkScanSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f123866a = _NativeSparkScanSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public long getFrameSequenceId() {
        return this.f123866a.getFrameSeqIdAndroid();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public Barcode getNewlyRecognizedBarcode() {
        NativeBarcode newlyRecognizedBarcode = this.f123866a.getNewlyRecognizedBarcode();
        if (newlyRecognizedBarcode != null) {
            return (Barcode) this.proxyCache.getOrPut(Reflection.b(NativeBarcode.class), null, newlyRecognizedBarcode, new b(newlyRecognizedBarcode));
        }
        return null;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public void reset() {
        this.f123866a.clear();
    }

    @Override // com.scandit.datacapture.barcode.spark.capture.SparkScanSessionProxy
    public String toJson() {
        String json = this.f123866a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ SparkScanSessionProxyAdapter(NativeSparkScanSession nativeSparkScanSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSparkScanSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
