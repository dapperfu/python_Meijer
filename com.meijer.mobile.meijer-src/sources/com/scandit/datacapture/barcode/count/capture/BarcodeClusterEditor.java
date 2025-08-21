package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterEditor;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0097\u0001J\t\u0010\t\u001a\u00020\u0006H\u0097\u0001J\u0017\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0097\u0001¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditor;", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditorProxy;", "impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterEditor;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeClusterEditor;)V", "dissolveCluster", "", "cluster", "Lcom/scandit/datacapture/barcode/data/Cluster;", "endEditing", "formCluster", "barcodes", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodeClusterEditor implements BarcodeClusterEditorProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeClusterEditorProxyAdapter f121548a;

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeClusterEditorProxy
    @ProxyFunction
    public void dissolveCluster(Cluster cluster) {
        Intrinsics.j(cluster, "cluster");
        this.f121548a.dissolveCluster(cluster);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeClusterEditorProxy
    @ProxyFunction
    public void endEditing() {
        this.f121548a.endEditing();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.BarcodeClusterEditorProxy
    @ProxyFunction
    public void formCluster(List<Barcode> barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        this.f121548a.formCluster(barcodes);
    }

    public BarcodeClusterEditor(NativeBarcodeClusterEditor impl) {
        Intrinsics.j(impl, "impl");
        this.f121548a = new BarcodeClusterEditorProxyAdapter(impl, null, 2, null);
    }
}
