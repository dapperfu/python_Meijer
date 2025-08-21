package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionStrategy;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H'J\b\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategyProxy;", "", "_impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;", "_selectionStrategyImpl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionStrategy;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeManualSelectionStrategy.class)
/* loaded from: classes12.dex */
public interface BarcodeSelectionManualSelectionStrategyProxy {
    @NativeImpl
    NativeManualSelectionStrategy _impl();

    @NativeImpl
    NativeSelectionStrategy _selectionStrategyImpl();

    @ProxyFunction
    String toJson();
}
