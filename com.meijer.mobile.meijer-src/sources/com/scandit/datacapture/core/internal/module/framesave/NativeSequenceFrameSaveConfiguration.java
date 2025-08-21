package com.scandit.datacapture.core.internal.module.framesave;

import com.scandit.datacapture.core.framesave.FileFormat;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSequenceFrameSaveConfiguration {
    public static native NativeSequenceFrameSaveConfiguration forLocalStorage(String str, String str2, FileFormat fileFormat, String str3);

    public static native NativeSequenceFrameSaveConfiguration forRemoteStagingStorage(String str, FileFormat fileFormat, String str2);

    public static native NativeSequenceFrameSaveConfiguration forRemoteStorage(String str, FileFormat fileFormat, String str2);

    @DjinniGenerated
    public static final class CppProxy extends NativeSequenceFrameSaveConfiguration {
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
