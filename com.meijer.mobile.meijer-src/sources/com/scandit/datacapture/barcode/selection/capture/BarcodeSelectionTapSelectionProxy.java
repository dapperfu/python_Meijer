package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionType;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0015\u001a\u00020\u0016H'J\b\u0010\u0017\u001a\u00020\u0018H'J\b\u0010\u0019\u001a\u00020\u001aH'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f8g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapSelectionProxy;", "", "<set-?>", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "freezeBehavior", "getFreezeBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;", "setFreezeBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionFreezeBehavior;)V", "", "shouldFreezeOnDoubleTap", "getShouldFreezeOnDoubleTap", "()Z", "setShouldFreezeOnDoubleTap", "(Z)V", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;", "tapBehavior", "getTapBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;", "setTapBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionTapBehavior;)V", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeTapSelection;", "_selectionTypeImpl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeTapSelection.class)
/* loaded from: classes12.dex */
public interface BarcodeSelectionTapSelectionProxy {
    @NativeImpl
    NativeTapSelection _impl();

    @NativeImpl
    NativeSelectionType _selectionTypeImpl();

    @ProxyFunction(property = "freezeBehavior")
    BarcodeSelectionFreezeBehavior getFreezeBehavior();

    @ProxyFunction(property = "shouldFreezeOnDoubleTap")
    boolean getShouldFreezeOnDoubleTap();

    @ProxyFunction(property = "tapBehavior")
    BarcodeSelectionTapBehavior getTapBehavior();

    @ProxyFunction(property = "freezeBehavior")
    void setFreezeBehavior(BarcodeSelectionFreezeBehavior barcodeSelectionFreezeBehavior);

    @ProxyFunction(property = "shouldFreezeOnDoubleTap")
    void setShouldFreezeOnDoubleTap(boolean z10);

    @ProxyFunction(property = "tapBehavior")
    void setTapBehavior(BarcodeSelectionTapBehavior barcodeSelectionTapBehavior);

    @ProxyFunction
    String toJson();
}
