package com.scandit.datacapture.core.internal.sdk.ocr;

import com.scandit.datacapture.core.common.Direction;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeExternalOcrBackend {
    public abstract String getLastErrorMessage();

    public abstract ArrayList<NativeExternalOcrBackendResult> getLastResults();

    public abstract String getName();

    public abstract String getSpecificData(String str);

    public abstract void onBeforeNextFrame(NativeFrameData nativeFrameData);

    public abstract boolean processFrame(NativeImageBuffer nativeImageBuffer);

    public abstract void setRecognitionArea(Rect rect, Direction direction);

    public abstract void updateSettings(NativeTextRecognizerSettings nativeTextRecognizerSettings);
}
