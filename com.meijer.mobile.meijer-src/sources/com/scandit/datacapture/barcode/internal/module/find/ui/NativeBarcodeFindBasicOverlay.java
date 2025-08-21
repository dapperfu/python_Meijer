package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeFindBasicOverlay {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFindBasicOverlay {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123109a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureOverlay native_asDataCaptureOverlay(long j10);

        private native boolean native_getShouldShowScanAreaGuides(long j10);

        private native boolean native_isDisplayingLogo(long j10);

        private native void native_setGuidanceHandler(long j10, NativeBarcodeFindGuidanceHandler nativeBarcodeFindGuidanceHandler);

        private native void native_setShouldShowHint(long j10, boolean z10);

        private native void native_setShouldShowScanAreaGuides(long j10, boolean z10);

        private native void native_setTextForAllItemsFoundSuccessfullyHint(long j10, String str);

        private native void native_setTextForItemListUpdatedHint(long j10, String str);

        private native void native_setTextForItemListUpdatedWhenPausedHint(long j10, String str);

        private native void native_setTextForMoveCloserToBarcodesHint(long j10, String str);

        private native void native_setTextForPointAtBarcodesToSearchHint(long j10, String str);

        private native void native_setTextForTapShutterToPauseScreenHint(long j10, String str);

        private native void native_setTextForTapShutterToResumeScreenHint(long j10, String str);

        private native void native_setUserGuidanceEnabled(long j10, boolean z10);

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public NativeDataCaptureOverlay asDataCaptureOverlay() {
            return native_asDataCaptureOverlay(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public boolean getShouldShowScanAreaGuides() {
            return native_getShouldShowScanAreaGuides(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public boolean isDisplayingLogo() {
            return native_isDisplayingLogo(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setGuidanceHandler(NativeBarcodeFindGuidanceHandler nativeBarcodeFindGuidanceHandler) {
            native_setGuidanceHandler(this.nativeRef, nativeBarcodeFindGuidanceHandler);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setShouldShowHint(boolean z10) {
            native_setShouldShowHint(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setShouldShowScanAreaGuides(boolean z10) {
            native_setShouldShowScanAreaGuides(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setTextForAllItemsFoundSuccessfullyHint(String str) {
            native_setTextForAllItemsFoundSuccessfullyHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setTextForItemListUpdatedHint(String str) {
            native_setTextForItemListUpdatedHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setTextForItemListUpdatedWhenPausedHint(String str) {
            native_setTextForItemListUpdatedWhenPausedHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setTextForMoveCloserToBarcodesHint(String str) {
            native_setTextForMoveCloserToBarcodesHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setTextForPointAtBarcodesToSearchHint(String str) {
            native_setTextForPointAtBarcodesToSearchHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setTextForTapShutterToPauseScreenHint(String str) {
            native_setTextForTapShutterToPauseScreenHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setTextForTapShutterToResumeScreenHint(String str) {
            native_setTextForTapShutterToResumeScreenHint(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.ui.NativeBarcodeFindBasicOverlay
        public void setUserGuidanceEnabled(boolean z10) {
            native_setUserGuidanceEnabled(this.nativeRef, z10);
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

    public static native NativeBarcodeFindBasicOverlay create(NativeBarcodeFind nativeBarcodeFind);

    public abstract NativeDataCaptureOverlay asDataCaptureOverlay();

    public abstract boolean getShouldShowScanAreaGuides();

    public abstract boolean isDisplayingLogo();

    public abstract void setGuidanceHandler(NativeBarcodeFindGuidanceHandler nativeBarcodeFindGuidanceHandler);

    public abstract void setShouldShowHint(boolean z10);

    public abstract void setShouldShowScanAreaGuides(boolean z10);

    public abstract void setTextForAllItemsFoundSuccessfullyHint(String str);

    public abstract void setTextForItemListUpdatedHint(String str);

    public abstract void setTextForItemListUpdatedWhenPausedHint(String str);

    public abstract void setTextForMoveCloserToBarcodesHint(String str);

    public abstract void setTextForPointAtBarcodesToSearchHint(String str);

    public abstract void setTextForTapShutterToPauseScreenHint(String str);

    public abstract void setTextForTapShutterToResumeScreenHint(String str);

    public abstract void setUserGuidanceEnabled(boolean z10);
}
