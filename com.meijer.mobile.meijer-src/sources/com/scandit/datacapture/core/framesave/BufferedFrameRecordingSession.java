package com.scandit.datacapture.core.framesave;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.framesave.NativeBufferedFrameRecordingSession;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0097\u0001¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0097\u0001J\t\u0010\u0016\u001a\u00020\u000bH\u0097\u0001¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/framesave/BufferedFrameRecordingSession;", "Lcom/scandit/datacapture/core/framesave/BufferedFrameRecordingSessionProxy;", "context", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "frameCapacity", "", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;I)V", "impl", "Lcom/scandit/datacapture/core/internal/module/framesave/NativeBufferedFrameRecordingSession;", "(Lcom/scandit/datacapture/core/internal/module/framesave/NativeBufferedFrameRecordingSession;)V", "_saveCapturedFrames", "", "storageDir", "", "discardFramesOlderThan", "", "discardFramesNewerThan", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "saveCapturedFrames", "startRecording", "frameSource", "Lcom/scandit/datacapture/core/source/FrameSource;", "stopRecording", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BufferedFrameRecordingSession implements BufferedFrameRecordingSessionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BufferedFrameRecordingSessionProxyAdapter f125100a;

    public BufferedFrameRecordingSession(NativeBufferedFrameRecordingSession impl) {
        Intrinsics.j(impl, "impl");
        this.f125100a = new BufferedFrameRecordingSessionProxyAdapter(impl, null, 2, null);
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    @ProxyFunction(nativeName = "saveCapturedFramesAsync")
    public void _saveCapturedFrames(String storageDir, Long discardFramesOlderThan, Long discardFramesNewerThan) {
        Intrinsics.j(storageDir, "storageDir");
        this.f125100a._saveCapturedFrames(storageDir, discardFramesOlderThan, discardFramesNewerThan);
    }

    public final void saveCapturedFrames(String storageDir) {
        Intrinsics.j(storageDir, "storageDir");
        _saveCapturedFrames(storageDir, null, null);
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    @ProxyFunction(nativeName = "startRecordingAsync")
    public void startRecording(FrameSource frameSource) {
        Intrinsics.j(frameSource, "frameSource");
        this.f125100a.startRecording(frameSource);
    }

    @Override // com.scandit.datacapture.core.framesave.BufferedFrameRecordingSessionProxy
    @ProxyFunction(nativeName = "stopRecordingAsync")
    public void stopRecording() {
        this.f125100a.stopRecording();
    }

    public final void saveCapturedFrames(String storageDir, Long discardFramesOlderThan, Long discardFramesNewerThan) {
        Intrinsics.j(storageDir, "storageDir");
        _saveCapturedFrames(storageDir, discardFramesOlderThan, discardFramesNewerThan);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BufferedFrameRecordingSession(DataCaptureContext context, int i10) {
        Intrinsics.j(context, "context");
        NativeBufferedFrameRecordingSession nativeBufferedFrameRecordingSessionCreate = NativeBufferedFrameRecordingSession.create(context.getF125005a(), i10);
        Intrinsics.i(nativeBufferedFrameRecordingSessionCreate, "create(...)");
        this(nativeBufferedFrameRecordingSessionCreate);
    }
}
