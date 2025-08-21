package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanStateMachine {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanStateMachine {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124860a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addScanningModeListenerAsync(long j10, NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

        private native void native_addSparkScanViewUiListenerAsync(long j10, NativeSparkScanViewUiListener nativeSparkScanViewUiListener);

        private native void native_forceViewState(long j10, SparkScanViewState sparkScanViewState);

        private native NativeSparkScanScanningMode native_getScanningMode(long j10);

        private native SparkScanViewState native_getViewState(long j10);

        private native void native_onCameraSwitchButtonTapped(long j10);

        private native void native_onScanningBehaviorButtonTapped(long j10);

        private native void native_onTargetModeButtonTapped(long j10);

        private native void native_onTorchButtonTapped(long j10);

        private native void native_onZoomIn(long j10);

        private native void native_onZoomOut(long j10);

        private native void native_removeScanningModeListenerAsync(long j10, NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

        private native void native_setScanningMode(long j10, NativeSparkScanScanningMode nativeSparkScanScanningMode);

        private native void native_setToastPresenterDelegate(long j10, NativeSparkScanToastPresenterDelegate nativeSparkScanToastPresenterDelegate);

        private native void native_setViewHandlerDelegate(long j10, NativeSparkScanViewHandlerDelegate nativeSparkScanViewHandlerDelegate);

        private native void native_setViewState(long j10, SparkScanViewState sparkScanViewState);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void addScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener) {
            native_addScanningModeListenerAsync(this.nativeRef, nativeSparkScanScanningModeHandlerListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void addSparkScanViewUiListenerAsync(NativeSparkScanViewUiListener nativeSparkScanViewUiListener) {
            native_addSparkScanViewUiListenerAsync(this.nativeRef, nativeSparkScanViewUiListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void forceViewState(SparkScanViewState sparkScanViewState) {
            native_forceViewState(this.nativeRef, sparkScanViewState);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public NativeSparkScanScanningMode getScanningMode() {
            return native_getScanningMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public SparkScanViewState getViewState() {
            return native_getViewState(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onCameraSwitchButtonTapped() {
            native_onCameraSwitchButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onScanningBehaviorButtonTapped() {
            native_onScanningBehaviorButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onTargetModeButtonTapped() {
            native_onTargetModeButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onTorchButtonTapped() {
            native_onTorchButtonTapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onZoomIn() {
            native_onZoomIn(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void onZoomOut() {
            native_onZoomOut(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void removeScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener) {
            native_removeScanningModeListenerAsync(this.nativeRef, nativeSparkScanScanningModeHandlerListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setScanningMode(NativeSparkScanScanningMode nativeSparkScanScanningMode) {
            native_setScanningMode(this.nativeRef, nativeSparkScanScanningMode);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setToastPresenterDelegate(NativeSparkScanToastPresenterDelegate nativeSparkScanToastPresenterDelegate) {
            native_setToastPresenterDelegate(this.nativeRef, nativeSparkScanToastPresenterDelegate);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setViewHandlerDelegate(NativeSparkScanViewHandlerDelegate nativeSparkScanViewHandlerDelegate) {
            native_setViewHandlerDelegate(this.nativeRef, nativeSparkScanViewHandlerDelegate);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanStateMachine
        public void setViewState(SparkScanViewState sparkScanViewState) {
            native_setViewState(this.nativeRef, sparkScanViewState);
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

    public static native NativeSparkScanStateMachine createForTests();

    public abstract void addScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

    public abstract void addSparkScanViewUiListenerAsync(NativeSparkScanViewUiListener nativeSparkScanViewUiListener);

    public abstract void forceViewState(SparkScanViewState sparkScanViewState);

    public abstract NativeSparkScanScanningMode getScanningMode();

    public abstract SparkScanViewState getViewState();

    public abstract void onCameraSwitchButtonTapped();

    public abstract void onScanningBehaviorButtonTapped();

    public abstract void onTargetModeButtonTapped();

    public abstract void onTorchButtonTapped();

    public abstract void onZoomIn();

    public abstract void onZoomOut();

    public abstract void removeScanningModeListenerAsync(NativeSparkScanScanningModeHandlerListener nativeSparkScanScanningModeHandlerListener);

    public abstract void setScanningMode(NativeSparkScanScanningMode nativeSparkScanScanningMode);

    public abstract void setToastPresenterDelegate(NativeSparkScanToastPresenterDelegate nativeSparkScanToastPresenterDelegate);

    public abstract void setViewHandlerDelegate(NativeSparkScanViewHandlerDelegate nativeSparkScanViewHandlerDelegate);

    public abstract void setViewState(SparkScanViewState sparkScanViewState);
}
