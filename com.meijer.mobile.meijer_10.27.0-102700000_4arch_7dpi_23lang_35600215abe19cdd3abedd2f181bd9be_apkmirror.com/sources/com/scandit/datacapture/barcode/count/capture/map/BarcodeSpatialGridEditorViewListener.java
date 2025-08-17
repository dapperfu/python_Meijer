package com.scandit.datacapture.barcode.count.capture.map;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorViewListener;", "", "onEditingCancelled", "", "view", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGridEditorView;", "onEditingFinished", "spatialGrid", "Lcom/scandit/datacapture/barcode/count/capture/map/BarcodeSpatialGrid;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeSpatialGridEditorViewListener {
    void onEditingCancelled(BarcodeSpatialGridEditorView view);

    void onEditingFinished(BarcodeSpatialGridEditorView view, BarcodeSpatialGrid spatialGrid);
}
