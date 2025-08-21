package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSourceListener;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeFrameDataCollectionFrameSource {

    @DjinniGenerated
    public static final class CppProxy extends NativeFrameDataCollectionFrameSource {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126462a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListenerAsync(long j10, NativeFrameSourceListener nativeFrameSourceListener);

        private native NativeFrameSource native_asFrameSource(long j10);

        private native void native_flushPendingTasks(long j10);

        private native FrameSourceState native_getCurrentState(long j10);

        private native FrameSourceState native_getDesiredState(long j10);

        private native void native_removeListenerAsync(long j10, NativeFrameSourceListener nativeFrameSourceListener);

        private native void native_setRepeatAsync(long j10, boolean z10);

        private native NativeWrappedFuture native_switchToDesiredStateAsyncAndroid(long j10, FrameSourceState frameSourceState);

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public void addListenerAsync(NativeFrameSourceListener nativeFrameSourceListener) {
            native_addListenerAsync(this.nativeRef, nativeFrameSourceListener);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public NativeFrameSource asFrameSource() {
            return native_asFrameSource(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public void flushPendingTasks() {
            native_flushPendingTasks(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public FrameSourceState getCurrentState() {
            return native_getCurrentState(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public FrameSourceState getDesiredState() {
            return native_getDesiredState(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public void removeListenerAsync(NativeFrameSourceListener nativeFrameSourceListener) {
            native_removeListenerAsync(this.nativeRef, nativeFrameSourceListener);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public void setRepeatAsync(boolean z10) {
            native_setRepeatAsync(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeFrameDataCollectionFrameSource
        public NativeWrappedFuture switchToDesiredStateAsyncAndroid(FrameSourceState frameSourceState) {
            return native_switchToDesiredStateAsyncAndroid(this.nativeRef, frameSourceState);
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

    public static native NativeFrameDataCollectionFrameSource create(NativeSingleBitmapFrameDataCollection nativeSingleBitmapFrameDataCollection);

    public abstract void addListenerAsync(NativeFrameSourceListener nativeFrameSourceListener);

    public abstract NativeFrameSource asFrameSource();

    public abstract void flushPendingTasks();

    public abstract FrameSourceState getCurrentState();

    public abstract FrameSourceState getDesiredState();

    public abstract void removeListenerAsync(NativeFrameSourceListener nativeFrameSourceListener);

    public abstract void setRepeatAsync(boolean z10);

    public abstract NativeWrappedFuture switchToDesiredStateAsyncAndroid(FrameSourceState frameSourceState);
}
