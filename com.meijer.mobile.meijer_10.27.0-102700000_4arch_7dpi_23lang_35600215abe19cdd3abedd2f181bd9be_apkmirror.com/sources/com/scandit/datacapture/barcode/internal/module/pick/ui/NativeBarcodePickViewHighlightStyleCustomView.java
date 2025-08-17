package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickViewHighlightStyleCustomView {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickViewHighlightStyleCustomView {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122471a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeBarcodePickViewHighlightStyle native_asHighlightStyle(long j10);

        private native boolean native_getFitViewsToBarcode(long j10);

        private native int native_getMinimumHighlightHeight(long j10);

        private native int native_getMinimumHighlightWidth(long j10);

        private native NativeBarcodePickStatusIconSettings native_getStatusIconSettings(long j10);

        private native void native_setFitViewsToBarcode(long j10, boolean z10);

        private native void native_setMinimumHighlightHeight(long j10, int i10);

        private native void native_setMinimumHighlightWidth(long j10, int i10);

        private native void native_setStatusIconSettings(long j10, NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public NativeBarcodePickViewHighlightStyle asHighlightStyle() {
            return native_asHighlightStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public boolean getFitViewsToBarcode() {
            return native_getFitViewsToBarcode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public int getMinimumHighlightHeight() {
            return native_getMinimumHighlightHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public int getMinimumHighlightWidth() {
            return native_getMinimumHighlightWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public NativeBarcodePickStatusIconSettings getStatusIconSettings() {
            return native_getStatusIconSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public void setFitViewsToBarcode(boolean z10) {
            native_setFitViewsToBarcode(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public void setMinimumHighlightHeight(int i10) {
            native_setMinimumHighlightHeight(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public void setMinimumHighlightWidth(int i10) {
            native_setMinimumHighlightWidth(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
        public void setStatusIconSettings(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings) {
            native_setStatusIconSettings(this.nativeRef, nativeBarcodePickStatusIconSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView
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

    public static native NativeBarcodePickViewHighlightStyleCustomView create();

    public abstract NativeBarcodePickViewHighlightStyle asHighlightStyle();

    public abstract boolean getFitViewsToBarcode();

    public abstract int getMinimumHighlightHeight();

    public abstract int getMinimumHighlightWidth();

    public abstract NativeBarcodePickStatusIconSettings getStatusIconSettings();

    public abstract void setFitViewsToBarcode(boolean z10);

    public abstract void setMinimumHighlightHeight(int i10);

    public abstract void setMinimumHighlightWidth(int i10);

    public abstract void setStatusIconSettings(NativeBarcodePickStatusIconSettings nativeBarcodePickStatusIconSettings);

    public abstract String toJson();
}
