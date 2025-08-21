package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeFrameSourceListener {

    @DjinniGenerated
    public static final class CppProxy extends NativeFrameSourceListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125756a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_onDataCaptureContextAttached(long j10, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_onDataCaptureContextDetached(long j10, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_onFrameOutputAndroid(long j10, NativeFrameSource nativeFrameSource, NativeFrameData nativeFrameData);

        private native void native_onObservationStarted(long j10, NativeFrameSource nativeFrameSource);

        private native void native_onObservationStopped(long j10, NativeFrameSource nativeFrameSource);

        private native void native_onStateChanged(long j10, NativeFrameSource nativeFrameSource, FrameSourceState frameSourceState);

        @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
        public void onDataCaptureContextAttached(NativeDataCaptureContext nativeDataCaptureContext) {
            native_onDataCaptureContextAttached(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
        public void onDataCaptureContextDetached(NativeDataCaptureContext nativeDataCaptureContext) {
            native_onDataCaptureContextDetached(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
        public void onFrameOutputAndroid(NativeFrameSource nativeFrameSource, NativeFrameData nativeFrameData) {
            native_onFrameOutputAndroid(this.nativeRef, nativeFrameSource, nativeFrameData);
        }

        @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
        public void onObservationStarted(NativeFrameSource nativeFrameSource) {
            native_onObservationStarted(this.nativeRef, nativeFrameSource);
        }

        @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
        public void onObservationStopped(NativeFrameSource nativeFrameSource) {
            native_onObservationStopped(this.nativeRef, nativeFrameSource);
        }

        @Override // com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener
        public void onStateChanged(NativeFrameSource nativeFrameSource, FrameSourceState frameSourceState) {
            native_onStateChanged(this.nativeRef, nativeFrameSource, frameSourceState);
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

    public abstract void onDataCaptureContextAttached(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void onDataCaptureContextDetached(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void onFrameOutputAndroid(NativeFrameSource nativeFrameSource, NativeFrameData nativeFrameData);

    public abstract void onObservationStarted(NativeFrameSource nativeFrameSource);

    public abstract void onObservationStopped(NativeFrameSource nativeFrameSource);

    public abstract void onStateChanged(NativeFrameSource nativeFrameSource, FrameSourceState frameSourceState);
}
