package com.scandit.datacapture.core.internal.module.framesave;

import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBufferedFrameRecordingSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBufferedFrameRecordingSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124613a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_saveCapturedFramesAsync(long j10, String str, Long l10, Long l11);

        private native void native_startRecordingAsync(long j10, NativeFrameSource nativeFrameSource);

        private native void native_stopRecordingAsync(long j10);

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBufferedFrameRecordingSession
        public void saveCapturedFramesAsync(String str, Long l10, Long l11) {
            native_saveCapturedFramesAsync(this.nativeRef, str, l10, l11);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBufferedFrameRecordingSession
        public void startRecordingAsync(NativeFrameSource nativeFrameSource) {
            native_startRecordingAsync(this.nativeRef, nativeFrameSource);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBufferedFrameRecordingSession
        public void stopRecordingAsync() {
            native_stopRecordingAsync(this.nativeRef);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public static native NativeBufferedFrameRecordingSession create(NativeDataCaptureContext nativeDataCaptureContext, int i10);

    public abstract void saveCapturedFramesAsync(String str, Long l10, Long l11);

    public abstract void startRecordingAsync(NativeFrameSource nativeFrameSource);

    public abstract void stopRecordingAsync();
}
