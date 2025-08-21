package com.scandit.datacapture.barcode.internal.sdk.time;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeEngineTime {
    public static native long microsecondsSinceEpoch();

    public static native long millisecondsSinceEpoch();

    @DjinniGenerated
    public static final class CppProxy extends NativeEngineTime {
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
