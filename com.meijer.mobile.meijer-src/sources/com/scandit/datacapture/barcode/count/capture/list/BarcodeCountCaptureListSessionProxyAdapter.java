package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0014¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/list/BarcodeCountCaptureListSessionProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "_NativeBarcodeCountCaptureListSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountCaptureListSession;", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getCorrectBarcodes", "()Ljava/util/List;", "correctBarcodes", "getWrongBarcodes", "wrongBarcodes", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "getMissingBarcodes", "missingBarcodes", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getAdditionalBarcodes", "additionalBarcodes", "getAcceptedBarcodes", "acceptedBarcodes", "getRejectedBarcodes", "rejectedBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeCountCaptureListSessionProxyAdapter implements BarcodeCountCaptureListSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCountCaptureListSession f121605a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountCaptureListSessionProxyAdapter(NativeBarcodeCountCaptureListSession _NativeBarcodeCountCaptureListSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCountCaptureListSession, "_NativeBarcodeCountCaptureListSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121605a = _NativeBarcodeCountCaptureListSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodeCountCaptureListSession getF121605a() {
        return this.f121605a;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getAcceptedBarcodes() {
        ArrayList<NativeTrackedBarcode> acceptedBarcodesList = this.f121605a.getAcceptedBarcodesList();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(acceptedBarcodesList);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(acceptedBarcodesList);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<Barcode> getAdditionalBarcodes() {
        ArrayList<NativeBarcode> additionalBarcodes = this.f121605a.getAdditionalBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(additionalBarcodes);
        return barcodeNativeTypeFactory.convertNativeBarcodeList(additionalBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getCorrectBarcodes() {
        ArrayList<NativeTrackedBarcode> correctBarcodes = this.f121605a.getCorrectBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(correctBarcodes);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(correctBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TargetBarcode> getMissingBarcodes() {
        ArrayList<NativeTargetBarcode> missingBarcodes = this.f121605a.getMissingBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(missingBarcodes);
        return barcodeNativeTypeFactory.convert(missingBarcodes);
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getRejectedBarcodes() {
        ArrayList<NativeTrackedBarcode> rejectedBarcodesList = this.f121605a.getRejectedBarcodesList();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(rejectedBarcodesList);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(rejectedBarcodesList);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public List<TrackedBarcode> getWrongBarcodes() {
        ArrayList<NativeTrackedBarcode> wrongBarcodes = this.f121605a.getWrongBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(wrongBarcodes);
        return barcodeNativeTypeFactory.convertNativeTrackedBarcodeList(wrongBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSessionProxy
    public String toJson() {
        String json = this.f121605a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodeCountCaptureListSessionProxyAdapter(NativeBarcodeCountCaptureListSession nativeBarcodeCountCaptureListSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCountCaptureListSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
