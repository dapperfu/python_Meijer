package com.scandit.datacapture.core.internal.sdk.source;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBitmapInfo {
    public static native NativeBitmapInfo create(NativeBitmapConfig nativeBitmapConfig, NativeByteOrder nativeByteOrder, byte[] bArr, int i10, int i11, int i12, int i13);

    @DjinniGenerated
    public static final class CppProxy extends NativeBitmapInfo {
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
