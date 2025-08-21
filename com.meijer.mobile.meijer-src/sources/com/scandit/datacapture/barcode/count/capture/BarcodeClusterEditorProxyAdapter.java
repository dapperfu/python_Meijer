package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterEditor;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditorProxyAdapter;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditorProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterEditor;", "_NativeBarcodeClusterEditor", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterEditor;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcodes", "", "formCluster", "(Ljava/util/List;)V", "Lcom/scandit/datacapture/barcode/data/Cluster;", "cluster", "dissolveCluster", "(Lcom/scandit/datacapture/barcode/data/Cluster;)V", "endEditing", "()V", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeClusterEditorProxyAdapter implements BarcodeClusterEditorProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodeClusterEditor f121549a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeClusterEditorProxyAdapter(NativeBarcodeClusterEditor _NativeBarcodeClusterEditor, ProxyCache proxyCache) {
        Intrinsics.j(_NativeBarcodeClusterEditor, "_NativeBarcodeClusterEditor");
        Intrinsics.j(proxyCache, "proxyCache");
        this.f121549a = _NativeBarcodeClusterEditor;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeClusterEditorProxy
    public void dissolveCluster(Cluster cluster) {
        Intrinsics.j(cluster, "cluster");
        this.f121549a.dissolveCluster(BarcodeNativeTypeFactory.INSTANCE.convert(cluster));
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeClusterEditorProxy
    public void endEditing() {
        this.f121549a.endEditing();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeClusterEditorProxy
    public void formCluster(List<Barcode> barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        this.f121549a.formCluster(BarcodeNativeTypeFactory.INSTANCE.convertBarcodeList(barcodes));
    }

    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ BarcodeClusterEditorProxyAdapter(NativeBarcodeClusterEditor nativeBarcodeClusterEditor, ProxyCache proxyCache, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodeClusterEditor, (i10 & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
