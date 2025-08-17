package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.batch.data.TrackedObject;
import com.scandit.datacapture.core.data.FrameData;
import java.util.Map;

/* loaded from: classes11.dex */
public interface BarcodePickListener {
    void a(TrackedObject trackedObject);

    void a(BarcodePickInternal barcodePickInternal);

    void a(BarcodePickInternal barcodePickInternal, v vVar, FrameData frameData);

    void a(BarcodePickInternal barcodePickInternal, String str, boolean z10);

    void a(BarcodePickInternal barcodePickInternal, Map map);

    void b(BarcodePickInternal barcodePickInternal);

    void b(BarcodePickInternal barcodePickInternal, v vVar, FrameData frameData);
}
