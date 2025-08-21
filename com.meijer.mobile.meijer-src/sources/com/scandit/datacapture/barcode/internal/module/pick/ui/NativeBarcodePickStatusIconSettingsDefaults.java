package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodePickStatusIconSettingsDefaults {
    public static native int maxSize();

    public static native int minSize();

    public static native float sizeToHighlightSizeRatio();

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickStatusIconSettingsDefaults {
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
