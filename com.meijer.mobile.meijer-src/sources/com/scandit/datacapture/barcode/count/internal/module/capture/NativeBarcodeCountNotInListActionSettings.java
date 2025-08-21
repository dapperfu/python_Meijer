package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountNotInListActionSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountNotInListActionSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121666a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_getAcceptButtonAccessibilityLabel(long j10);

        private native String native_getAcceptButtonText(long j10);

        private native String native_getAcceptedHintText(long j10);

        private native String native_getCancelButtonAccessibilityLabel(long j10);

        private native String native_getCancelButtonText(long j10);

        private native String native_getRejectButtonAccessibilityLabel(long j10);

        private native String native_getRejectButtonText(long j10);

        private native String native_getRejectedHintText(long j10);

        private native boolean native_isEnabled(long j10);

        private native void native_setAcceptButtonText(long j10, String str);

        private native void native_setAcceptedHintText(long j10, String str);

        private native void native_setCancelButtonText(long j10, String str);

        private native void native_setEnabled(long j10, boolean z10);

        private native void native_setRejectButtonText(long j10, String str);

        private native void native_setRejectedHintText(long j10, String str);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getAcceptButtonAccessibilityLabel() {
            return native_getAcceptButtonAccessibilityLabel(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getAcceptButtonText() {
            return native_getAcceptButtonText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getAcceptedHintText() {
            return native_getAcceptedHintText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getCancelButtonAccessibilityLabel() {
            return native_getCancelButtonAccessibilityLabel(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getCancelButtonText() {
            return native_getCancelButtonText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getRejectButtonAccessibilityLabel() {
            return native_getRejectButtonAccessibilityLabel(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getRejectButtonText() {
            return native_getRejectButtonText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public String getRejectedHintText() {
            return native_getRejectedHintText(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public void setAcceptButtonText(String str) {
            native_setAcceptButtonText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public void setAcceptedHintText(String str) {
            native_setAcceptedHintText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public void setCancelButtonText(String str) {
            native_setCancelButtonText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public void setEnabled(boolean z10) {
            native_setEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public void setRejectButtonText(String str) {
            native_setRejectButtonText(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListActionSettings
        public void setRejectedHintText(String str) {
            native_setRejectedHintText(this.nativeRef, str);
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

    public static native NativeBarcodeCountNotInListActionSettings create();

    public abstract String getAcceptButtonAccessibilityLabel();

    public abstract String getAcceptButtonText();

    public abstract String getAcceptedHintText();

    public abstract String getCancelButtonAccessibilityLabel();

    public abstract String getCancelButtonText();

    public abstract String getRejectButtonAccessibilityLabel();

    public abstract String getRejectButtonText();

    public abstract String getRejectedHintText();

    public abstract boolean isEnabled();

    public abstract void setAcceptButtonText(String str);

    public abstract void setAcceptedHintText(String str);

    public abstract void setCancelButtonText(String str);

    public abstract void setEnabled(boolean z10);

    public abstract void setRejectButtonText(String str);

    public abstract void setRejectedHintText(String str);
}
