package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.core.internal.module.common.geometry.NativeAxis;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeCameraFrameData {

    @DjinniGenerated
    public static final class CppProxy extends NativeCameraFrameData {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125509a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeFrameData native_asFrameData(long j10);

        private native NativeCameraCaptureParameters native_getCaptureParameters(long j10);

        private native void native_release(long j10);

        private native void native_retain(long j10);

        private native byte[] native_takeBuffer(long j10);

        private native void native_update(long j10, int i10, int i11, byte[] bArr, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i12, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10);

        private native void native_updateNv21(long j10, int i10, int i11, byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12, int i13, int i14, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i15, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10);

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData
        public NativeFrameData asFrameData() {
            return native_asFrameData(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData
        public NativeCameraCaptureParameters getCaptureParameters() {
            return native_getCaptureParameters(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData
        public void release() {
            native_release(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData
        public void retain() {
            native_retain(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData
        public byte[] takeBuffer() {
            return native_takeBuffer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData
        public void update(int i10, int i11, byte[] bArr, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i12, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10) {
            native_update(this.nativeRef, i10, i11, bArr, nativeCameraFrameDataPool, i12, nativeAxis, nativeCameraCaptureParameters, l10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData
        public void updateNv21(int i10, int i11, byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12, int i13, int i14, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i15, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10) {
            native_updateNv21(this.nativeRef, i10, i11, bArr, byteBuffer, byteBuffer2, byteBuffer3, i12, i13, i14, nativeCameraFrameDataPool, i15, nativeAxis, nativeCameraCaptureParameters, l10);
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

    public static native NativeCameraFrameData create(int i10, int i11, byte[] bArr, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i12, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10);

    public static native NativeCameraFrameData createEmpty();

    public static native NativeCameraFrameData createNv21FrameData(int i10, int i11, byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12, int i13, int i14, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i15, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10);

    public static native byte[] getByteBuffer(NativeFrameData nativeFrameData);

    public abstract NativeFrameData asFrameData();

    public abstract NativeCameraCaptureParameters getCaptureParameters();

    public abstract void release();

    public abstract void retain();

    public abstract byte[] takeBuffer();

    public abstract void update(int i10, int i11, byte[] bArr, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i12, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10);

    public abstract void updateNv21(int i10, int i11, byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i12, int i13, int i14, NativeCameraFrameDataPool nativeCameraFrameDataPool, int i15, NativeAxis nativeAxis, NativeCameraCaptureParameters nativeCameraCaptureParameters, Long l10);
}
