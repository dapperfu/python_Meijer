package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyBaseClass;
import java.util.ArrayList;
import kotlin.Metadata;

@ProxyBaseClass(NativeProductProvider.class)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "", "_productIdentifierForItems", "", "itemsData", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "callback", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallback;", "_productProviderImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProvider;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodePickProductProvider {
    void _productIdentifierForItems(ArrayList<String> itemsData, BarcodePickProductProviderCallback callback);

    @NativeImpl
    NativeProductProvider _productProviderImpl();
}
