package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodePickViewHighlightStyleRectangular {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickViewHighlightStyleRectangular {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123426a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeBarcodePickViewHighlightStyle native_asHighlightStyle(long j10);

        private native NativeBrush native_brushForState(long j10, NativeBarcodePickState nativeBarcodePickState);

        private native int native_getMinimumHighlightHeight(long j10);

        private native int native_getMinimumHighlightWidth(long j10);

        private native NativeBrush native_selectedBrushForState(long j10, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setBrushForState(long j10, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native void native_setMinimumHighlightHeight(long j10, int i10);

        private native void native_setMinimumHighlightWidth(long j10, int i10);

        private native void native_setSelectedBrushForState(long j10, NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public NativeBarcodePickViewHighlightStyle asHighlightStyle() {
            return native_asHighlightStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_brushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public int getMinimumHighlightHeight() {
            return native_getMinimumHighlightHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public int getMinimumHighlightWidth() {
            return native_getMinimumHighlightWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState) {
            return native_selectedBrushForState(this.nativeRef, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public void setMinimumHighlightHeight(int i10) {
            native_setMinimumHighlightHeight(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public void setMinimumHighlightWidth(int i10) {
            native_setMinimumHighlightWidth(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
        public void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState) {
            native_setSelectedBrushForState(this.nativeRef, nativeBrush, nativeBarcodePickState);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular
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

    public static native NativeBarcodePickViewHighlightStyleRectangular create();

    public abstract NativeBarcodePickViewHighlightStyle asHighlightStyle();

    public abstract NativeBrush brushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract int getMinimumHighlightHeight();

    public abstract int getMinimumHighlightWidth();

    public abstract NativeBrush selectedBrushForState(NativeBarcodePickState nativeBarcodePickState);

    public abstract void setBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract void setMinimumHighlightHeight(int i10);

    public abstract void setMinimumHighlightWidth(int i10);

    public abstract void setSelectedBrushForState(NativeBrush nativeBrush, NativeBarcodePickState nativeBarcodePickState);

    public abstract String toJson();
}
