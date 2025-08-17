package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import java.util.List;

/* loaded from: classes11.dex */
public interface BarcodePickDrawer {
    void a(int i10);

    void a(TrackedObject trackedObject, BarcodePickState barcodePickState);

    void a(BarcodePickViewHighlightStyle barcodePickViewHighlightStyle);

    void a(List list);

    boolean a();

    void b();

    void b(TrackedObject trackedObject, BarcodePickState barcodePickState);

    void start();

    void stop();
}
