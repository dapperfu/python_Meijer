package com.scandit.datacapture.barcode.internal.module.capture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCapture {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCapture {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122224a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListenerAsync(long j10, NativeBarcodeCaptureListener nativeBarcodeCaptureListener);

        private native NativeWrappedFuture native_applySettingsWrapped(long j10, NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings);

        private native NativeDataCaptureMode native_asDataCaptureMode(long j10);

        private native NativeBarcodeCaptureLicenseInfo native_getBarcodeCaptureLicenseInfo(long j10);

        private native NativeDataCaptureContext native_getContext(long j10);

        private native PointWithUnit native_getPointOfInterest(long j10);

        private native NativeBarcodeCaptureSession native_getSession(long j10);

        private native NativeBarcodeCaptureSettings native_getSettings(long j10);

        private native boolean native_isEnabled(long j10);

        private native void native_removeListenerAsync(long j10, NativeBarcodeCaptureListener nativeBarcodeCaptureListener);

        private native void native_setEnabled(long j10, boolean z10);

        private native void native_setPointOfInterest(long j10, PointWithUnit pointWithUnit);

        private native void native_setSuccessFeedback(long j10, NativeFeedback nativeFeedback);

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public void addListenerAsync(NativeBarcodeCaptureListener nativeBarcodeCaptureListener) {
            native_addListenerAsync(this.nativeRef, nativeBarcodeCaptureListener);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public NativeWrappedFuture applySettingsWrapped(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings) {
            return native_applySettingsWrapped(this.nativeRef, nativeBarcodeCaptureSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public NativeDataCaptureMode asDataCaptureMode() {
            return native_asDataCaptureMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public NativeBarcodeCaptureLicenseInfo getBarcodeCaptureLicenseInfo() {
            return native_getBarcodeCaptureLicenseInfo(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public NativeDataCaptureContext getContext() {
            return native_getContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public PointWithUnit getPointOfInterest() {
            return native_getPointOfInterest(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public NativeBarcodeCaptureSession getSession() {
            return native_getSession(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public NativeBarcodeCaptureSettings getSettings() {
            return native_getSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public void removeListenerAsync(NativeBarcodeCaptureListener nativeBarcodeCaptureListener) {
            native_removeListenerAsync(this.nativeRef, nativeBarcodeCaptureListener);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public void setEnabled(boolean z10) {
            native_setEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public void setPointOfInterest(PointWithUnit pointWithUnit) {
            native_setPointOfInterest(this.nativeRef, pointWithUnit);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture
        public void setSuccessFeedback(NativeFeedback nativeFeedback) {
            native_setSuccessFeedback(this.nativeRef, nativeFeedback);
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

    public static native NativeBarcodeCapture create(NativeDataCaptureContext nativeDataCaptureContext, NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings);

    public abstract void addListenerAsync(NativeBarcodeCaptureListener nativeBarcodeCaptureListener);

    public abstract NativeWrappedFuture applySettingsWrapped(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings);

    public abstract NativeDataCaptureMode asDataCaptureMode();

    public abstract NativeBarcodeCaptureLicenseInfo getBarcodeCaptureLicenseInfo();

    public abstract NativeDataCaptureContext getContext();

    public abstract PointWithUnit getPointOfInterest();

    public abstract NativeBarcodeCaptureSession getSession();

    public abstract NativeBarcodeCaptureSettings getSettings();

    public abstract boolean isEnabled();

    public abstract void removeListenerAsync(NativeBarcodeCaptureListener nativeBarcodeCaptureListener);

    public abstract void setEnabled(boolean z10);

    public abstract void setPointOfInterest(PointWithUnit pointWithUnit);

    public abstract void setSuccessFeedback(NativeFeedback nativeFeedback);
}
