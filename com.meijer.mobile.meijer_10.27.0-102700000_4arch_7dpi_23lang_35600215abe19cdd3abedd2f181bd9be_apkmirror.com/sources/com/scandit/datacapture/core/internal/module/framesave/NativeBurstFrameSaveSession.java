package com.scandit.datacapture.core.internal.module.framesave;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBurstFrameSaveSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBurstFrameSaveSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124614a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListenerAsync(long j10, NativeFrameSaveSessionListener nativeFrameSaveSessionListener);

        private native void native_addToContext(long j10, NativeDataCaptureContext nativeDataCaptureContext);

        private native NativeFrameSaveSession native_asFrameSaveSession(long j10);

        private native void native_disable(long j10);

        private native boolean native_empty(long j10);

        private native void native_enable(long j10);

        private native void native_flushPendingTasks(long j10);

        private native boolean native_isCollectingFrames(long j10);

        private native void native_removeFromContext(long j10, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_removeListenerAsync(long j10, NativeFrameSaveSessionListener nativeFrameSaveSessionListener);

        private native void native_save(long j10);

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void addListenerAsync(NativeFrameSaveSessionListener nativeFrameSaveSessionListener) {
            native_addListenerAsync(this.nativeRef, nativeFrameSaveSessionListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void addToContext(NativeDataCaptureContext nativeDataCaptureContext) {
            native_addToContext(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public NativeFrameSaveSession asFrameSaveSession() {
            return native_asFrameSaveSession(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void disable() {
            native_disable(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public boolean empty() {
            return native_empty(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void enable() {
            native_enable(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void flushPendingTasks() {
            native_flushPendingTasks(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public boolean isCollectingFrames() {
            return native_isCollectingFrames(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void removeFromContext(NativeDataCaptureContext nativeDataCaptureContext) {
            native_removeFromContext(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void removeListenerAsync(NativeFrameSaveSessionListener nativeFrameSaveSessionListener) {
            native_removeListenerAsync(this.nativeRef, nativeFrameSaveSessionListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.framesave.NativeBurstFrameSaveSession
        public void save() {
            native_save(this.nativeRef);
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

    public static native NativeBurstFrameSaveSession create(NativeBurstFrameSaveConfiguration nativeBurstFrameSaveConfiguration);

    public abstract void addListenerAsync(NativeFrameSaveSessionListener nativeFrameSaveSessionListener);

    public abstract void addToContext(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract NativeFrameSaveSession asFrameSaveSession();

    public abstract void disable();

    public abstract boolean empty();

    public abstract void enable();

    public abstract void flushPendingTasks();

    public abstract boolean isCollectingFrames();

    public abstract void removeFromContext(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void removeListenerAsync(NativeFrameSaveSessionListener nativeFrameSaveSessionListener);

    public abstract void save();
}
