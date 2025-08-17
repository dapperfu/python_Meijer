package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.core.data.FrameData;
import java.util.HashSet;

/* loaded from: classes11.dex */
public interface InternalBarcodeFindListener {
    void a(BarcodeFind barcodeFind);

    void a(BarcodeFind barcodeFind, NativeBarcodeFindSession nativeBarcodeFindSession, FrameData frameData);

    void a(HashSet hashSet);

    void b(BarcodeFind barcodeFind);

    void b(HashSet hashSet);

    void c(HashSet hashSet);

    void onSearchStarted();
}
