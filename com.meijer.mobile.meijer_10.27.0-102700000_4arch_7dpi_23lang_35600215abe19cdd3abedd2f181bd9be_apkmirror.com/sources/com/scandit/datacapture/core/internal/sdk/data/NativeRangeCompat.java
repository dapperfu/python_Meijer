package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeRangeCompat {
    public static native Range create(short s10, short s11, short s12);

    public static native boolean isValid(Range range);

    @DjinniGenerated
    public static final class CppProxy extends NativeRangeCompat {
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
