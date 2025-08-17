package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeFrameData {

    @DjinniGenerated
    public static final class CppProxy extends NativeFrameData {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125449a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeCameraCaptureParameters native_collectCameraCaptureParametersForAndroid(long j10);

        private native NativeImageBuffer native_getImageBuffer(long j10);

        private native int native_getOrientation(long j10);

        private native long native_getTimestampForAndroid(long j10);

        private native void native_release(long j10);

        private native void native_retain(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeFrameData
        public NativeCameraCaptureParameters collectCameraCaptureParametersForAndroid() {
            return native_collectCameraCaptureParametersForAndroid(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeFrameData
        public NativeImageBuffer getImageBuffer() {
            return native_getImageBuffer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeFrameData
        public int getOrientation() {
            return native_getOrientation(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeFrameData
        public long getTimestampForAndroid() {
            return native_getTimestampForAndroid(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeFrameData
        public void release() {
            native_release(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeFrameData
        public void retain() {
            native_retain(this.nativeRef);
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

    public abstract NativeCameraCaptureParameters collectCameraCaptureParametersForAndroid();

    public abstract NativeImageBuffer getImageBuffer();

    public abstract int getOrientation();

    public abstract long getTimestampForAndroid();

    public abstract void release();

    public abstract void retain();
}
