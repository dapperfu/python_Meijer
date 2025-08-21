package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.core.internal.sdk.analytics.NativePropertyPushSource;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScan {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScan {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124852a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListenerAsync(long j10, NativeSparkScanListener nativeSparkScanListener);

        private native NativeWrappedFuture native_applySettingsWrapped(long j10, NativeSparkScanSettings nativeSparkScanSettings);

        private native NativeDataCaptureMode native_asDataCaptureMode(long j10);

        private native void native_enableSingleScanMode(long j10, boolean z10);

        private native NativeDataCaptureContext native_getContext(long j10);

        private native NativeSparkScanSession native_getSession(long j10);

        private native NativeSparkScanLicenseInfo native_getSparkScanLicenseInfo(long j10);

        private native NativeSparkScanStateMachine native_getStateMachine(long j10);

        private native NativeFeedback native_getSuccessFeedback(long j10);

        private native boolean native_isEnabled(long j10);

        private native boolean native_isSuppressed(long j10);

        private native void native_removeListenerAsync(long j10, NativeSparkScanListener nativeSparkScanListener);

        private native void native_setEnabled(long j10, boolean z10);

        private native void native_setPropertyPushSource(long j10, NativePropertyPushSource nativePropertyPushSource);

        private native void native_setResultSuppressionEnabled(long j10, boolean z10);

        private native void native_setSuccessFeedback(long j10, NativeFeedback nativeFeedback);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public void addListenerAsync(NativeSparkScanListener nativeSparkScanListener) {
            native_addListenerAsync(this.nativeRef, nativeSparkScanListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public NativeWrappedFuture applySettingsWrapped(NativeSparkScanSettings nativeSparkScanSettings) {
            return native_applySettingsWrapped(this.nativeRef, nativeSparkScanSettings);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public NativeDataCaptureMode asDataCaptureMode() {
            return native_asDataCaptureMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public void enableSingleScanMode(boolean z10) {
            native_enableSingleScanMode(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public NativeDataCaptureContext getContext() {
            return native_getContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public NativeSparkScanSession getSession() {
            return native_getSession(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public NativeSparkScanLicenseInfo getSparkScanLicenseInfo() {
            return native_getSparkScanLicenseInfo(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public NativeSparkScanStateMachine getStateMachine() {
            return native_getStateMachine(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public NativeFeedback getSuccessFeedback() {
            return native_getSuccessFeedback(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public boolean isSuppressed() {
            return native_isSuppressed(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public void removeListenerAsync(NativeSparkScanListener nativeSparkScanListener) {
            native_removeListenerAsync(this.nativeRef, nativeSparkScanListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public void setEnabled(boolean z10) {
            native_setEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public void setPropertyPushSource(NativePropertyPushSource nativePropertyPushSource) {
            native_setPropertyPushSource(this.nativeRef, nativePropertyPushSource);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
        public void setResultSuppressionEnabled(boolean z10) {
            native_setResultSuppressionEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan
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

    public static native NativeSparkScan create(NativeDataCaptureContext nativeDataCaptureContext, NativeSparkScanSettings nativeSparkScanSettings);

    public abstract void addListenerAsync(NativeSparkScanListener nativeSparkScanListener);

    public abstract NativeWrappedFuture applySettingsWrapped(NativeSparkScanSettings nativeSparkScanSettings);

    public abstract NativeDataCaptureMode asDataCaptureMode();

    public abstract void enableSingleScanMode(boolean z10);

    public abstract NativeDataCaptureContext getContext();

    public abstract NativeSparkScanSession getSession();

    public abstract NativeSparkScanLicenseInfo getSparkScanLicenseInfo();

    public abstract NativeSparkScanStateMachine getStateMachine();

    public abstract NativeFeedback getSuccessFeedback();

    public abstract boolean isEnabled();

    public abstract boolean isSuppressed();

    public abstract void removeListenerAsync(NativeSparkScanListener nativeSparkScanListener);

    public abstract void setEnabled(boolean z10);

    public abstract void setPropertyPushSource(NativePropertyPushSource nativePropertyPushSource);

    public abstract void setResultSuppressionEnabled(boolean z10);

    public abstract void setSuccessFeedback(NativeFeedback nativeFeedback);
}
