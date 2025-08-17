package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeDataCaptureMode {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureMode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125388a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native boolean native_canCoexistWithMode(long j10, NativeDataCaptureMode nativeDataCaptureMode);

        private native NativeDataCaptureContext native_getContext(long j10);

        private native String native_getSettingsAsJson(long j10, boolean z10);

        private native boolean native_isAttachedToContext(long j10);

        private native boolean native_isEnabled(long j10);

        private native void native_onContextAttached(long j10, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_onContextDetached(long j10, NativeDataCaptureContext nativeDataCaptureContext);

        private native void native_setEnabled(long j10, boolean z10);

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public boolean canCoexistWithMode(NativeDataCaptureMode nativeDataCaptureMode) {
            return native_canCoexistWithMode(this.nativeRef, nativeDataCaptureMode);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public NativeDataCaptureContext getContext() {
            return native_getContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public String getSettingsAsJson(boolean z10) {
            return native_getSettingsAsJson(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public boolean isAttachedToContext() {
            return native_isAttachedToContext(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public void onContextAttached(NativeDataCaptureContext nativeDataCaptureContext) {
            native_onContextAttached(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public void onContextDetached(NativeDataCaptureContext nativeDataCaptureContext) {
            native_onContextDetached(this.nativeRef, nativeDataCaptureContext);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode
        public void setEnabled(boolean z10) {
            native_setEnabled(this.nativeRef, z10);
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

    public abstract boolean canCoexistWithMode(NativeDataCaptureMode nativeDataCaptureMode);

    public abstract NativeDataCaptureContext getContext();

    public abstract String getSettingsAsJson(boolean z10);

    public abstract boolean isAttachedToContext();

    public abstract boolean isEnabled();

    public abstract void onContextAttached(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void onContextDetached(NativeDataCaptureContext nativeDataCaptureContext);

    public abstract void setEnabled(boolean z10);
}
