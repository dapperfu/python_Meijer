package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeFind {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFind {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122118a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListenerAsync(long j10, NativeBarcodeFindListener nativeBarcodeFindListener, int i10);

        private native NativeWrappedFuture native_applySettingsWrapped(long j10, NativeBarcodeFindSettings nativeBarcodeFindSettings);

        private native NativeDataCaptureMode native_asDataCaptureMode(long j10);

        private native NativeBarcodeFindSession native_getSession(long j10);

        private native boolean native_isAttachedToContext(long j10);

        private native boolean native_isEnabled(long j10);

        private native void native_pauseAsync(long j10);

        private native void native_removeListenerAsync(long j10, NativeBarcodeFindListener nativeBarcodeFindListener);

        private native void native_setBarcodeFindTransformerAsync(long j10, NativeBarcodeFindTransformer nativeBarcodeFindTransformer);

        private native void native_setEnabled(long j10, boolean z10);

        private native void native_setFeedback(long j10, NativeFeedback nativeFeedback);

        private native void native_setItemListAsync(long j10, HashSet<NativeBarcodeFindItem> hashSet);

        private native void native_setItemListUpdatedFeedback(long j10, NativeFeedback nativeFeedback);

        private native void native_startAsync(long j10);

        private native void native_stopAsync(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void addListenerAsync(NativeBarcodeFindListener nativeBarcodeFindListener, int i10) {
            native_addListenerAsync(this.nativeRef, nativeBarcodeFindListener, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public NativeWrappedFuture applySettingsWrapped(NativeBarcodeFindSettings nativeBarcodeFindSettings) {
            return native_applySettingsWrapped(this.nativeRef, nativeBarcodeFindSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public NativeDataCaptureMode asDataCaptureMode() {
            return native_asDataCaptureMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public NativeBarcodeFindSession getSession() {
            return native_getSession(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public boolean isAttachedToContext() {
            return native_isAttachedToContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void pauseAsync() {
            native_pauseAsync(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void removeListenerAsync(NativeBarcodeFindListener nativeBarcodeFindListener) {
            native_removeListenerAsync(this.nativeRef, nativeBarcodeFindListener);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void setBarcodeFindTransformerAsync(NativeBarcodeFindTransformer nativeBarcodeFindTransformer) {
            native_setBarcodeFindTransformerAsync(this.nativeRef, nativeBarcodeFindTransformer);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void setEnabled(boolean z10) {
            native_setEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void setFeedback(NativeFeedback nativeFeedback) {
            native_setFeedback(this.nativeRef, nativeFeedback);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void setItemListAsync(HashSet<NativeBarcodeFindItem> hashSet) {
            native_setItemListAsync(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void setItemListUpdatedFeedback(NativeFeedback nativeFeedback) {
            native_setItemListUpdatedFeedback(this.nativeRef, nativeFeedback);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void startAsync() {
            native_startAsync(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind
        public void stopAsync() {
            native_stopAsync(this.nativeRef);
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

    public static native NativeBarcodeFind create(NativeDataCaptureContext nativeDataCaptureContext, NativeBarcodeFindSettings nativeBarcodeFindSettings);

    public abstract void addListenerAsync(NativeBarcodeFindListener nativeBarcodeFindListener, int i10);

    public abstract NativeWrappedFuture applySettingsWrapped(NativeBarcodeFindSettings nativeBarcodeFindSettings);

    public abstract NativeDataCaptureMode asDataCaptureMode();

    public abstract NativeBarcodeFindSession getSession();

    public abstract boolean isAttachedToContext();

    public abstract boolean isEnabled();

    public abstract void pauseAsync();

    public abstract void removeListenerAsync(NativeBarcodeFindListener nativeBarcodeFindListener);

    public abstract void setBarcodeFindTransformerAsync(NativeBarcodeFindTransformer nativeBarcodeFindTransformer);

    public abstract void setEnabled(boolean z10);

    public abstract void setFeedback(NativeFeedback nativeFeedback);

    public abstract void setItemListAsync(HashSet<NativeBarcodeFindItem> hashSet);

    public abstract void setItemListUpdatedFeedback(NativeFeedback nativeFeedback);

    public abstract void startAsync();

    public abstract void stopAsync();
}
