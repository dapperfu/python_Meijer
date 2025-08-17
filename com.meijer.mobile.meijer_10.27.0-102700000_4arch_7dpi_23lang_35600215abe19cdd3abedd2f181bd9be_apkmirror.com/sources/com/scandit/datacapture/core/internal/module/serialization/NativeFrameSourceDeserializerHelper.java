package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.module.source.NativeAbstractCamera;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeFrameSourceDeserializerHelper {
    public abstract void applySettings(NativeAbstractCamera nativeAbstractCamera, NativeCameraSettings nativeCameraSettings);

    public abstract NativeAbstractCamera createCamera(CameraPosition cameraPosition, NativeCameraSettings nativeCameraSettings, String str, String str2);

    public abstract NativeFrameSource createImageFrameSource(String str);

    public abstract void updateCameraFromJson(NativeAbstractCamera nativeAbstractCamera, NativeJsonValue nativeJsonValue);
}
