package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodePickViewHighlightStyleRectangularWithIcons {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickViewHighlightStyleRectangularWithIcons {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123427a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeBarcodePickViewHighlightStyle native_asHighlightStyle(long j10);

        private native NativeBrush native_brushForState(long j10, NativeBarcodePickState nativeBarcodePickState);

        private native int native_getMinimumHighlightHeight(long j10);

        private native int native_getMinimumHighlightWidth(long j10);

        private native NativeBarcodePickStatusIconSettings native_getStatusIconSettings(long j10);

        private native boolean native_getStyleResponseCacheEnabled(long j10);

        private native NativeBrush native_selectedBrushForState(long j10, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setBrushForState(long j10, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setMinimumHighlightHeight(long j10, int i10);

        private native void native_setMinimumHighlightWidth(long j10, int i10);

        private native void native_setSelectedBrushForState(long j10, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setStatusIconSettings(long j10, NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings);

        private native void native_setStyleResponseCacheEnabled(long j10, boolean z10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBarcodePickViewHighlightStyle asHighlightStyle() {
            return native_asHighlightStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_brushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public int getMinimumHighlightHeight() {
            return native_getMinimumHighlightHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public int getMinimumHighlightWidth() {
            return native_getMinimumHighlightWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBarcodePickStatusIconSettings getStatusIconSettings() {
            return native_getStatusIconSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public boolean getStyleResponseCacheEnabled() {
            return native_getStyleResponseCacheEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_selectedBrushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setMinimumHighlightHeight(int i10) {
            native_setMinimumHighlightHeight(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setMinimumHighlightWidth(int i10) {
            native_setMinimumHighlightWidth(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setSelectedBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setStatusIconSettings(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings) {
            native_setStatusIconSettings(this.nativeRef, nativeBarcodePickStatusIconSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public void setStyleResponseCacheEnabled(boolean z10) {
            native_setStyleResponseCacheEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons
        public String toJson() {
            return native_toJson(this.nativeRef);
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

    public static native NativeBarcodePickViewHighlightStyleRectangularWithIcons create();

    public abstract NativeBarcodePickViewHighlightStyle asHighlightStyle();

    public abstract NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract int getMinimumHighlightHeight();

    public abstract int getMinimumHighlightWidth();

    public abstract NativeBarcodePickStatusIconSettings getStatusIconSettings();

    public abstract boolean getStyleResponseCacheEnabled();

    public abstract NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract void setMinimumHighlightHeight(int i10);

    public abstract void setMinimumHighlightWidth(int i10);

    public abstract void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract void setStatusIconSettings(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings);

    public abstract void setStyleResponseCacheEnabled(boolean z10);

    public abstract String toJson();
}
