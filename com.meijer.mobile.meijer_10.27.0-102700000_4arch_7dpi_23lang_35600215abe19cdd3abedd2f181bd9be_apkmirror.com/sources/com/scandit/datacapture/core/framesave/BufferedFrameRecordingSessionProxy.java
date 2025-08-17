package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.internal.module.framesave.NativeBufferedFrameRecordingSession;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyAdapter;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u0003H'¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BufferedFrameRecordingSessionProxy;", "", "_saveCapturedFrames", "", "storageDir", "", "discardFramesOlderThan", "", "discardFramesNewerThan", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "startRecording", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "stopRecording", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ProxyAdapter(NativeBufferedFrameRecordingSession.class)
/* loaded from: classes11.dex */
public interface BufferedFrameRecordingSessionProxy {
    @ProxyFunction(nativeName = "saveCapturedFramesAsync")
    void _saveCapturedFrames(String storageDir, Long discardFramesOlderThan, Long discardFramesNewerThan);

    @ProxyFunction(nativeName = "startRecordingAsync")
    void startRecording(FrameSource frameSource);

    @ProxyFunction(nativeName = "stopRecordingAsync")
    void stopRecording();
}
