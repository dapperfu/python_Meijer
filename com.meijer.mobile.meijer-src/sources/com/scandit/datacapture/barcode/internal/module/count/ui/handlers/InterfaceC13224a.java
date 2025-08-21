package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.handlers.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13224a {
    Brush brushForAcceptedBarcodeNotInList(TrackedBarcode trackedBarcode);

    Brush brushForRejectedBarcodeNotInList(TrackedBarcode trackedBarcode);

    Brush brushForTrackedBarcode(TrackedBarcode trackedBarcode);

    Brush brushForTrackedBarcodeNotInList(TrackedBarcode trackedBarcode);

    Brush brushForUnscannedTrackedBarcode(TrackedBarcode trackedBarcode);

    Brush brushFromFilterSettings();

    Brush getAcceptedNotInListBrush();

    Brush getNotInListBrush();

    Brush getRecognizedBrush();

    Brush getRejectedNotInListBrush();

    Brush getUnrecognizedBrush();

    boolean isListenerSet();
}
