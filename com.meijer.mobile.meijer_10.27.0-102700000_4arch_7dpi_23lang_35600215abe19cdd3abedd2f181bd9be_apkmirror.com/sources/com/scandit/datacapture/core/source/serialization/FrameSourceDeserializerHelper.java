package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerHelper;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;

@ProxyReversedAdapter(provided = true, value = NativeFrameSourceDeserializerHelper.class)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J*\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerHelper;", "", "applySettings", "", "camera", "Lcom/scandit/datacapture/core/source/Camera;", "settings", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createCamera", "position", "Lcom/scandit/datacapture/core/source/CameraPosition;", "cameraDeviceType", "", "cameraSubtype", "createImageFrameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "base64Image", "updateCameraFromJson", "json", "Lcom/scandit/datacapture/core/json/JsonValue;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FrameSourceDeserializerHelper {
    void applySettings(Camera camera, CameraSettings settings);

    Camera createCamera(CameraPosition position, CameraSettings settings, String cameraDeviceType, String cameraSubtype);

    FrameSource createImageFrameSource(String base64Image);

    void updateCameraFromJson(Camera camera, JsonValue json);
}
