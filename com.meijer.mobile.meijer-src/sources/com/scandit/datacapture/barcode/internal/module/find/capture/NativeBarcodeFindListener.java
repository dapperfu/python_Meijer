package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.HashSet;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeFindListener {
    public abstract void onItemListUpdatedInternal(HashSet<NativeBarcodeFindItem> hashSet);

    public abstract void onObservationStarted(NativeBarcodeFind nativeBarcodeFind);

    public abstract void onObservationStopped(NativeBarcodeFind nativeBarcodeFind);

    public abstract void onSearchPaused(HashSet<NativeBarcodeFindItem> hashSet);

    public abstract void onSearchStarted();

    public abstract void onSearchStopped(HashSet<NativeBarcodeFindItem> hashSet);

    public abstract void onSessionUpdated(NativeBarcodeFind nativeBarcodeFind, NativeBarcodeFindSession nativeBarcodeFindSession, NativeFrameData nativeFrameData);
}
