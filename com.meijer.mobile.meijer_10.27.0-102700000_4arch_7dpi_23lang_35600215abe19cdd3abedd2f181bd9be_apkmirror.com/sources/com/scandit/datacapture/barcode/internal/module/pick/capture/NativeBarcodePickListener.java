package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.HashMap;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickListener {
    public abstract void onItemResponseReceived(NativeBarcodePick nativeBarcodePick, String str, boolean z10);

    public abstract void onObservationStarted(NativeBarcodePick nativeBarcodePick);

    public abstract void onObservationStopped(NativeBarcodePick nativeBarcodePick);

    public abstract void onPickUpdated(NativeBarcodePick nativeBarcodePick, NativeBarcodePickSession nativeBarcodePickSession, NativeFrameData nativeFrameData);

    public abstract void onSessionUpdated(NativeBarcodePick nativeBarcodePick, NativeBarcodePickSession nativeBarcodePickSession, NativeFrameData nativeFrameData);

    public abstract void onStyleShouldBeRequested(NativeBarcodePick nativeBarcodePick, HashMap<String, String> map);
}
