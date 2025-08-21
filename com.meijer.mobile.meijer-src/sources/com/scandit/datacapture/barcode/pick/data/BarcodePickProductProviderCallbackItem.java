package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallbackItem;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0007H\u0097\u0001R\u0014\u0010\u0002\u001a\u00020\u00038WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItem;", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProviderCallbackItemProxy;", "itemData", "", "productIdentifier", "(Ljava/lang/String;Ljava/lang/String;)V", "impl", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeProductProviderCallbackItem;)V", "getItemData", "()Ljava/lang/String;", "getProductIdentifier", "_impl", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodePickProductProviderCallbackItem implements BarcodePickProductProviderCallbackItemProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodePickProductProviderCallbackItemProxyAdapter f124555a;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodePickProductProviderCallbackItem(NativeProductProviderCallbackItem impl) {
        Intrinsics.j(impl, "impl");
        this.f124555a = new BarcodePickProductProviderCallbackItemProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeProductProviderCallbackItem getF124556a() {
        return this.f124555a.getF124556a();
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    @ProxyFunction(nativeName = "getToBeTransformedData", property = "itemData")
    public String getItemData() {
        return this.f124555a.getItemData();
    }

    @Override // com.scandit.datacapture.barcode.pick.data.BarcodePickProductProviderCallbackItemProxy
    @ProxyFunction(nativeName = "getTransformationResult", property = "productIdentifier")
    public String getProductIdentifier() {
        return this.f124555a.getProductIdentifier();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodePickProductProviderCallbackItem(String itemData, String str) {
        Intrinsics.j(itemData, "itemData");
        NativeProductProviderCallbackItem nativeProductProviderCallbackItemCreate = NativeProductProviderCallbackItem.create(itemData, str);
        Intrinsics.i(nativeProductProviderCallbackItemCreate, "create(...)");
        this(nativeProductProviderCallbackItemCreate);
    }
}
