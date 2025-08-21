package com.scandit.datacapture.barcode.pick.capture;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionListener;", "", "onPick", "", "itemData", "", "callback", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickActionCallback;", "onUnpick", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodePickActionListener {
    void onPick(String itemData, BarcodePickActionCallback callback);

    void onUnpick(String itemData, BarcodePickActionCallback callback);
}
