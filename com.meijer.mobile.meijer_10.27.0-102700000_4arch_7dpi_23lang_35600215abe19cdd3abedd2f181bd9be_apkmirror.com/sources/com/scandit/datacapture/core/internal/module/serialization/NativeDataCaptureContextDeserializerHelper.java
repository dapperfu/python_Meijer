package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeDataCaptureContextDeserializerHelper {
    public abstract NativeDataCaptureContext createContext(String str, String str2, String str3, String str4, String str5, NativeDataCaptureContextSettings nativeDataCaptureContextSettings, String str6, String str7, String str8);

    public abstract void removeModeFromContext(NativeDataCaptureContext nativeDataCaptureContext, NativeDataCaptureMode nativeDataCaptureMode);

    public abstract void setFrameSourceOnContext(NativeDataCaptureContext nativeDataCaptureContext, NativeFrameSource nativeFrameSource);

    public abstract void updateContextFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);
}
