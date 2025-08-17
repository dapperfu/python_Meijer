package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountState;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCount {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCount {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f120708a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_activateState(long j10, BarcodeCountState barcodeCountState);

        private native void native_addListenerAsync(long j10, NativeBarcodeCountListener nativeBarcodeCountListener, int i10);

        private native void native_addStateListenerAsync(long j10, NativeBarcodeCountStateListener nativeBarcodeCountStateListener, int i10);

        private native NativeWrappedFuture native_applySettingsWrapped(long j10, NativeBarcodeCountSettings nativeBarcodeCountSettings);

        private native NativeDataCaptureMode native_asDataCaptureMode(long j10);

        private native NativeBarcodeClusterEditor native_beginClusterEditing(long j10);

        private native void native_clearAdditionalBarcodes(long j10);

        private native void native_clearHighlightsAndResetSessionAsync(long j10);

        private native void native_didAcceptNotInListBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native void native_didRejectNotInListBarcode(long j10, NativeTrackedBarcode nativeTrackedBarcode);

        private native NativeDataCaptureContext native_getContext(long j10);

        private native NativeBarcodeCountSession native_getSession(long j10);

        private native boolean native_isAttachedToContext(long j10);

        private native boolean native_isEnabled(long j10);

        private native boolean native_isTapToUncountEnabled(long j10);

        private native void native_notifyListeners(long j10, NativeFrameData nativeFrameData);

        private native void native_removeListenerAsync(long j10, NativeBarcodeCountListener nativeBarcodeCountListener);

        private native void native_removeStateListenerAsync(long j10, NativeBarcodeCountStateListener nativeBarcodeCountStateListener);

        private native void native_reset(long j10);

        private native void native_setAdditionalBarcodes(long j10, ArrayList<NativeBarcode> arrayList);

        private native void native_setBarcodeCountCaptureList(long j10, NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList);

        private native void native_setEnabled(long j10, boolean z10);

        private native void native_setFailureFeedback(long j10, NativeFeedback nativeFeedback);

        private native void native_setShouldShowStatusIconsOnScan(long j10, boolean z10);

        private native void native_setStatusListener(long j10, NativeBarcodeCountStatusListener nativeBarcodeCountStatusListener);

        private native void native_setStatusProvider(long j10, NativeBarcodeCountStatusProvider nativeBarcodeCountStatusProvider);

        private native void native_setSuccessFeedback(long j10, NativeFeedback nativeFeedback);

        private native void native_setTapToUncountEnabled(long j10, boolean z10);

        private native void native_setUnrecognizedFeedback(long j10, NativeFeedback nativeFeedback);

        private native boolean native_shouldDisableModeWhenCaptureListCompleted(long j10);

        private native boolean native_shouldShowStatusIconsOnScan(long j10);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void activateState(BarcodeCountState barcodeCountState) {
            native_activateState(this.nativeRef, barcodeCountState);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void addListenerAsync(NativeBarcodeCountListener nativeBarcodeCountListener, int i10) {
            native_addListenerAsync(this.nativeRef, nativeBarcodeCountListener, i10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void addStateListenerAsync(NativeBarcodeCountStateListener nativeBarcodeCountStateListener, int i10) {
            native_addStateListenerAsync(this.nativeRef, nativeBarcodeCountStateListener, i10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public NativeWrappedFuture applySettingsWrapped(NativeBarcodeCountSettings nativeBarcodeCountSettings) {
            return native_applySettingsWrapped(this.nativeRef, nativeBarcodeCountSettings);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public NativeDataCaptureMode asDataCaptureMode() {
            return native_asDataCaptureMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public NativeBarcodeClusterEditor beginClusterEditing() {
            return native_beginClusterEditing(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void clearAdditionalBarcodes() {
            native_clearAdditionalBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void clearHighlightsAndResetSessionAsync() {
            native_clearHighlightsAndResetSessionAsync(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void didAcceptNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didAcceptNotInListBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void didRejectNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode) {
            native_didRejectNotInListBarcode(this.nativeRef, nativeTrackedBarcode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public NativeDataCaptureContext getContext() {
            return native_getContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public NativeBarcodeCountSession getSession() {
            return native_getSession(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public boolean isAttachedToContext() {
            return native_isAttachedToContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public boolean isTapToUncountEnabled() {
            return native_isTapToUncountEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void notifyListeners(NativeFrameData nativeFrameData) {
            native_notifyListeners(this.nativeRef, nativeFrameData);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void removeListenerAsync(NativeBarcodeCountListener nativeBarcodeCountListener) {
            native_removeListenerAsync(this.nativeRef, nativeBarcodeCountListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void removeStateListenerAsync(NativeBarcodeCountStateListener nativeBarcodeCountStateListener) {
            native_removeStateListenerAsync(this.nativeRef, nativeBarcodeCountStateListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void reset() {
            native_reset(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setAdditionalBarcodes(ArrayList<NativeBarcode> arrayList) {
            native_setAdditionalBarcodes(this.nativeRef, arrayList);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setBarcodeCountCaptureList(NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList) {
            native_setBarcodeCountCaptureList(this.nativeRef, nativeBarcodeCountCaptureList);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setEnabled(boolean z10) {
            native_setEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setFailureFeedback(NativeFeedback nativeFeedback) {
            native_setFailureFeedback(this.nativeRef, nativeFeedback);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setShouldShowStatusIconsOnScan(boolean z10) {
            native_setShouldShowStatusIconsOnScan(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setStatusListener(NativeBarcodeCountStatusListener nativeBarcodeCountStatusListener) {
            native_setStatusListener(this.nativeRef, nativeBarcodeCountStatusListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setStatusProvider(NativeBarcodeCountStatusProvider nativeBarcodeCountStatusProvider) {
            native_setStatusProvider(this.nativeRef, nativeBarcodeCountStatusProvider);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setSuccessFeedback(NativeFeedback nativeFeedback) {
            native_setSuccessFeedback(this.nativeRef, nativeFeedback);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setTapToUncountEnabled(boolean z10) {
            native_setTapToUncountEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public void setUnrecognizedFeedback(NativeFeedback nativeFeedback) {
            native_setUnrecognizedFeedback(this.nativeRef, nativeFeedback);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public boolean shouldDisableModeWhenCaptureListCompleted() {
            return native_shouldDisableModeWhenCaptureListCompleted(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount
        public boolean shouldShowStatusIconsOnScan() {
            return native_shouldShowStatusIconsOnScan(this.nativeRef);
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

    public static native NativeBarcodeCount create(NativeDataCaptureContext nativeDataCaptureContext, NativeBarcodeCountSettings nativeBarcodeCountSettings);

    public abstract void activateState(BarcodeCountState barcodeCountState);

    public abstract void addListenerAsync(NativeBarcodeCountListener nativeBarcodeCountListener, int i10);

    public abstract void addStateListenerAsync(NativeBarcodeCountStateListener nativeBarcodeCountStateListener, int i10);

    public abstract NativeWrappedFuture applySettingsWrapped(NativeBarcodeCountSettings nativeBarcodeCountSettings);

    public abstract NativeDataCaptureMode asDataCaptureMode();

    public abstract NativeBarcodeClusterEditor beginClusterEditing();

    public abstract void clearAdditionalBarcodes();

    public abstract void clearHighlightsAndResetSessionAsync();

    public abstract void didAcceptNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract void didRejectNotInListBarcode(NativeTrackedBarcode nativeTrackedBarcode);

    public abstract NativeDataCaptureContext getContext();

    public abstract NativeBarcodeCountSession getSession();

    public abstract boolean isAttachedToContext();

    public abstract boolean isEnabled();

    public abstract boolean isTapToUncountEnabled();

    public abstract void notifyListeners(NativeFrameData nativeFrameData);

    public abstract void removeListenerAsync(NativeBarcodeCountListener nativeBarcodeCountListener);

    public abstract void removeStateListenerAsync(NativeBarcodeCountStateListener nativeBarcodeCountStateListener);

    public abstract void reset();

    public abstract void setAdditionalBarcodes(ArrayList<NativeBarcode> arrayList);

    public abstract void setBarcodeCountCaptureList(NativeBarcodeCountCaptureList nativeBarcodeCountCaptureList);

    public abstract void setEnabled(boolean z10);

    public abstract void setFailureFeedback(NativeFeedback nativeFeedback);

    public abstract void setShouldShowStatusIconsOnScan(boolean z10);

    public abstract void setStatusListener(NativeBarcodeCountStatusListener nativeBarcodeCountStatusListener);

    public abstract void setStatusProvider(NativeBarcodeCountStatusProvider nativeBarcodeCountStatusProvider);

    public abstract void setSuccessFeedback(NativeFeedback nativeFeedback);

    public abstract void setTapToUncountEnabled(boolean z10);

    public abstract void setUnrecognizedFeedback(NativeFeedback nativeFeedback);

    public abstract boolean shouldDisableModeWhenCaptureListCompleted();

    public abstract boolean shouldShowStatusIconsOnScan();
}
