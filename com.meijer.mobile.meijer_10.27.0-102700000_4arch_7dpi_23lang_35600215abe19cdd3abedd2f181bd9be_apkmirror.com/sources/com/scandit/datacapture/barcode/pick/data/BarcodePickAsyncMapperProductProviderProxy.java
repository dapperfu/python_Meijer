package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeAsyncMapperProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J(\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\n\u001a\u00020\u000bH'J\b\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickAsyncMapperProductProviderProxy;", "", "_impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeAsyncMapperProductProvider;", "_productIdentifierForItems", "", "itemsData", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "callback", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallback;", "_productProviderImpl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProvider;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeAsyncMapperProductProvider.class)
/* loaded from: classes11.dex */
public interface BarcodePickAsyncMapperProductProviderProxy {
    @NativeImpl
    NativeAsyncMapperProductProvider _impl();

    @ProxyFunction(nativeName = "productIdentifierForItems")
    void _productIdentifierForItems(ArrayList<String> itemsData, BarcodePickProductProviderCallback callback);

    @NativeImpl
    NativeProductProvider _productProviderImpl();
}
