package com.scandit.datacapture.core.internal.module.framesave;

import com.scandit.datacapture.core.framesave.FileFormat;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBurstFrameSaveConfiguration {
    public static native NativeBurstFrameSaveConfiguration forLocalStorage(String str, int i10, FileFormat fileFormat, String str2);

    public static native NativeBurstFrameSaveConfiguration forRemoteStagingStorage(int i10, FileFormat fileFormat, String str);

    public static native NativeBurstFrameSaveConfiguration forRemoteStorage(int i10, FileFormat fileFormat, String str);

    @DjinniGenerated
    public static final class CppProxy extends NativeBurstFrameSaveConfiguration {
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
