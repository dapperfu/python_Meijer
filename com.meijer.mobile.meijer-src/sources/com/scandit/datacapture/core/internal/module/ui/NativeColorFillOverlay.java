package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeColorFillOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeColorFillOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126092a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native NativeColor native_getColor(long j10);

        private native void native_setColor(long j10, NativeColor nativeColor);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay
        public NativeColor getColor() {
            return native_getColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeColorFillOverlay
        public void setColor(NativeColor nativeColor) {
            native_setColor(this.nativeRef, nativeColor);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public static native NativeColorFillOverlay create(NativeColor nativeColor);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract NativeColor getColor();

    public abstract void setColor(NativeColor nativeColor);
}
