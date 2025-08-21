package com.scandit.datacapture.core.internal.module;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeByteArrayTest {
    public static native int getArraySize(byte[] bArr);

    public static native byte getElementAtIndex(byte[] bArr, int i10);

    public static native void multiply(ByteBuffer byteBuffer, int i10);

    @DjinniGenerated
    public static final class CppProxy extends NativeByteArrayTest {
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
