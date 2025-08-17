package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.LocalizedOnlyBarcode;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSessionProxyAdapter;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSessionProxy;", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSession;", "_NativeBarcodeCaptureSession", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSession;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "reset", "()V", "", "toJson", "()Ljava/lang/String;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getNewlyRecognizedBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "newlyRecognizedBarcode", "", "Lcom/scandit/datacapture/barcode/data/LocalizedOnlyBarcode;", "getNewlyLocalizedBarcodes", "()Ljava/util/List;", "newlyLocalizedBarcodes", "get_newlyRecognizedBarcodes", "_newlyRecognizedBarcodes", "", "getFrameSequenceId", "()J", "frameSequenceId", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCaptureSessionProxyAdapter implements BarcodeCaptureSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeCaptureSession f120543a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCaptureSessionProxyAdapter(NativeBarcodeCaptureSession _NativeBarcodeCaptureSession, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeCaptureSession, "_NativeBarcodeCaptureSession");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f120543a = _NativeBarcodeCaptureSession;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public long getFrameSequenceId() {
        return this.f120543a.getFrameSeqIdAndroid();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public List<LocalizedOnlyBarcode> getNewlyLocalizedBarcodes() {
        ArrayList<NativeLocalizedOnlyBarcode> newlyLocalizedBarcodes = this.f120543a.getNewlyLocalizedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(newlyLocalizedBarcodes);
        return barcodeNativeTypeFactory.convertNativeLocalizedOnlyBarcode(newlyLocalizedBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public Barcode getNewlyRecognizedBarcode() {
        NativeBarcode newlyRecognizedBarcode = this.f120543a.getNewlyRecognizedBarcode();
        if (newlyRecognizedBarcode != null) {
            return (Barcode) this.proxyCache.getOrPut(Reflection.b(NativeBarcode.class), null, newlyRecognizedBarcode, new T(newlyRecognizedBarcode));
        }
        return null;
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public List<Barcode> get_newlyRecognizedBarcodes() {
        ArrayList<NativeBarcode> newlyRecognizedBarcodes = this.f120543a.getNewlyRecognizedBarcodes();
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(newlyRecognizedBarcodes);
        return barcodeNativeTypeFactory.convertNativeBarcodeList(newlyRecognizedBarcodes);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public void reset() {
        this.f120543a.clear();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureSessionProxy
    public String toJson() {
        String json = this.f120543a.toJson();
        Intrinsics.g(json);
        return json;
    }

    public /* synthetic */ BarcodeCaptureSessionProxyAdapter(NativeBarcodeCaptureSession nativeBarcodeCaptureSession, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeCaptureSession, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
