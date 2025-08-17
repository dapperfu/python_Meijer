package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSession;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/batch/capture/BarcodeBatchSessionProxy;", "Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;", "_NativeBarcodeTrackingSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/capture/NativeBarcodeTrackingSession;", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getAddedTrackedBarcodes", "()Ljava/util/List;", "addedTrackedBarcodes", "getUpdatedTrackedBarcodes", "updatedTrackedBarcodes", "", "getRemovedTrackedBarcodes", "removedTrackedBarcodes", "", "getTrackedBarcodes", "()Ljava/util/Map;", "trackedBarcodes", "getUnscannedTrackedBarcodes", "unscannedTrackedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeBatchSessionProxyAdapter implements BarcodeBatchSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeTrackingSession f120431a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeBatchSessionProxyAdapter(NativeBarcodeTrackingSession _NativeBarcodeTrackingSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeTrackingSession, "_NativeBarcodeTrackingSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120431a = _NativeBarcodeTrackingSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeTrackingSession getF120431a() {
        return this.f120431a;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<TrackedBarcode> getAddedTrackedBarcodes() {
        ArrayList<NativeTrackedBarcode> addedTrackedBarcodes = this.f120431a.getAddedTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(addedTrackedBarcodes);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(addedTrackedBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public long getFrameSequenceId() {
        return this.f120431a.getFrameSeqIdAndroid();
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<Integer> getRemovedTrackedBarcodes() {
        ArrayList<Integer> removedTrackedBarcodes = this.f120431a.getRemovedTrackedBarcodes();
        Intrinsics.g(removedTrackedBarcodes);
        return removedTrackedBarcodes;
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public Map<Integer, TrackedBarcode> getTrackedBarcodes() {
        HashMap<Integer, NativeTrackedBarcode> trackedBarcodes = this.f120431a.getTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(trackedBarcodes);
        return barcodeNativeTypeFactory.convert(trackedBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<TrackedBarcode> getUnscannedTrackedBarcodes() {
        ArrayList<NativeTrackedBarcode> unscannedTrackedBarcodes = this.f120431a.getUnscannedTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(unscannedTrackedBarcodes);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(unscannedTrackedBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public List<TrackedBarcode> getUpdatedTrackedBarcodes() {
        ArrayList<NativeTrackedBarcode> updatedTrackedBarcodes = this.f120431a.getUpdatedTrackedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(updatedTrackedBarcodes);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(updatedTrackedBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public void reset() {
        this.f120431a.reset();
    }

    @Override // com.scandit.datacapture.barcode.batch.capture.BarcodeBatchSessionProxy
    public String toJson() {
        String json = this.f120431a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodeBatchSessionProxyAdapter(NativeBarcodeTrackingSession nativeBarcodeTrackingSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeTrackingSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
