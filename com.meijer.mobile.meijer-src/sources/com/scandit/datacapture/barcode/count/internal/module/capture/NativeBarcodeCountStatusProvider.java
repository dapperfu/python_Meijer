package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountStatusProvider {
    public abstract void onStatusRequested(ArrayList<NativeTrackedBarcode> arrayList, NativeBarcodeCountStatusProviderCallback nativeBarcodeCountStatusProviderCallback);
}
