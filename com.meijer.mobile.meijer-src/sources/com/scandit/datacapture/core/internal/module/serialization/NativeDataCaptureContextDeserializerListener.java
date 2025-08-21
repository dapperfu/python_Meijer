package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataCaptureContextDeserializerListener {
    public abstract void onContextDeserializationFinished(NativeDataCaptureContextDeserializer nativeDataCaptureContextDeserializer, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

    public abstract void onContextDeserializationStarted(NativeDataCaptureContextDeserializer nativeDataCaptureContextDeserializer, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);
}
