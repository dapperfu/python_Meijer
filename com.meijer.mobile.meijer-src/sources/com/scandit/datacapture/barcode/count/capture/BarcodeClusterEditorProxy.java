package com.scandit.datacapture.barcode.count.capture;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterEditor;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.data.Cluster;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0003H'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/BarcodeClusterEditorProxy;", "", "dissolveCluster", "", "cluster", "Lcom/scandit/datacapture/barcode/data/Cluster;", "endEditing", "formCluster", "barcodes", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBarcodeClusterEditor.class)
/* loaded from: classes12.dex */
public interface BarcodeClusterEditorProxy {
    @ProxyFunction
    void dissolveCluster(Cluster cluster);

    @ProxyFunction
    void endEditing();

    @ProxyFunction
    void formCluster(List<Barcode> barcodes);
}
