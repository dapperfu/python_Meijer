package com.scandit.datacapture.barcode.internal.module.ar.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeArViewDefaults {
    public static native Anchor defaultCameraSwitchControlPosition();

    public static native boolean defaultShouldShowCameraSwitchControl();

    public static native boolean defaultShouldShowTorchControl();

    public static native boolean defaultShouldShowZoomControl();

    public static native Anchor defaultTorchControlPosition();

    public static native Anchor defaultZoomControlPosition();

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeArViewDefaults {
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
