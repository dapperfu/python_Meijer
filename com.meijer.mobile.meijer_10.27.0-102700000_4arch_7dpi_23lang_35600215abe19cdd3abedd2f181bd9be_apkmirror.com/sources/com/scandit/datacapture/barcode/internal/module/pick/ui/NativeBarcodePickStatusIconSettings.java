package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickStatusIconSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickStatusIconSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122470a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native int native_getMaxSize(long j10);

        private native int native_getMinSize(long j10);

        private native float native_getSizeToHighlightSizeRatio(long j10);

        private native void native_setMaxSize(long j10, int i10);

        private native void native_setMinSize(long j10, int i10);

        private native void native_setSizeToHighlightSizeRatio(long j10, float f10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings
        public int getMaxSize() {
            return native_getMaxSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings
        public int getMinSize() {
            return native_getMinSize(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings
        public float getSizeToHighlightSizeRatio() {
            return native_getSizeToHighlightSizeRatio(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings
        public void setMaxSize(int i10) {
            native_setMaxSize(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings
        public void setMinSize(int i10) {
            native_setMinSize(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickStatusIconSettings
        public void setSizeToHighlightSizeRatio(float f10) {
            native_setSizeToHighlightSizeRatio(this.nativeRef, f10);
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

    public static native NativeBarcodePickStatusIconSettings create();

    public abstract int getMaxSize();

    public abstract int getMinSize();

    public abstract float getSizeToHighlightSizeRatio();

    public abstract void setMaxSize(int i10);

    public abstract void setMinSize(int i10);

    public abstract void setSizeToHighlightSizeRatio(float f10);
}
