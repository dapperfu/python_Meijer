package com.scandit.datacapture.core.internal.module.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeDataDecodingFactory {
    public static native NativeDataDecoding getDataDecoding();

    public static native void setDataDecoding(NativeDataDecoding nativeDataDecoding);

    @DjinniGenerated
    public static final class CppProxy extends NativeDataDecodingFactory {
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
