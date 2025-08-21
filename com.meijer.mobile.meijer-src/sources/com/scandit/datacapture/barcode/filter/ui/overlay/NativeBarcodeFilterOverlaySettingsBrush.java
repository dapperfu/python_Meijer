package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeFilterOverlaySettingsBrush {
    public static native NativeBarcodeFilterOverlaySettings create(NativeBrush nativeBrush);

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFilterOverlaySettingsBrush {
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
