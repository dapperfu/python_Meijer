package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionType;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00038g@gX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelectionProxy;", "", "<set-?>", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "aimerBehavior", "getAimerBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "setAimerBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;)V", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;", "_selectionTypeImpl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeAimerSelection.class)
/* loaded from: classes12.dex */
public interface BarcodeSelectionAimerSelectionProxy {
    @NativeImpl
    NativeAimerSelection _impl();

    @NativeImpl
    NativeSelectionType _selectionTypeImpl();

    @ProxyFunction(property = "aimerBehavior")
    BarcodeSelectionAimerBehavior getAimerBehavior();

    @ProxyFunction(property = "aimerBehavior")
    void setAimerBehavior(BarcodeSelectionAimerBehavior barcodeSelectionAimerBehavior);

    @ProxyFunction
    String toJson();
}
