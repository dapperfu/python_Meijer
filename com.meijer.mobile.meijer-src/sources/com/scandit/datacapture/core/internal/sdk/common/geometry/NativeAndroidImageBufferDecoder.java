package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeAndroidImageBufferDecoder {
    public static native NativeImageBuffer toARGB32ImageBuffer(byte[] bArr, int i10, int i11, int i12);

    public static native NativeImageBuffer toBGRA32ImageBuffer(byte[] bArr, int i10, int i11, int i12);

    public static native NativeImageBuffer toNV21ImageBuffer(byte[] bArr, int i10, int i11);

    public static native NativeImageBuffer toRGBA32ImageBuffer(byte[] bArr, int i10, int i11, int i12);

    @DjinniGenerated
    public static final class CppProxy extends NativeAndroidImageBufferDecoder {
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private CppProxy(long j10) {
            new AtomicBoolean(false);
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }
}
