package com.scandit.datacapture.barcode.internal.module.ar.ui;

import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeArViewSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeArViewSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122029a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native CameraPosition native_getCameraPosition(long j10);

        private native boolean native_getHapticEnabled(long j10);

        private native boolean native_getSoundEnabled(long j10);

        private native void native_setCameraPosition(long j10, CameraPosition cameraPosition);

        private native void native_setHapticEnabled(long j10, boolean z10);

        private native void native_setSoundEnabled(long j10, boolean z10);

        private native void native_updateFromJson(long j10, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings
        public CameraPosition getCameraPosition() {
            return native_getCameraPosition(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings
        public boolean getHapticEnabled() {
            return native_getHapticEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings
        public boolean getSoundEnabled() {
            return native_getSoundEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings
        public void setCameraPosition(CameraPosition cameraPosition) {
            native_setCameraPosition(this.nativeRef, cameraPosition);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings
        public void setHapticEnabled(boolean z10) {
            native_setHapticEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings
        public void setSoundEnabled(boolean z10) {
            native_setSoundEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArViewSettings
        public void updateFromJson(NativeJsonValue nativeJsonValue) {
            native_updateFromJson(this.nativeRef, nativeJsonValue);
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

    public static native NativeBarcodeArViewSettings create();

    public static native NativeBarcodeArViewSettings fromJson(NativeJsonValue nativeJsonValue);

    public abstract CameraPosition getCameraPosition();

    public abstract boolean getHapticEnabled();

    public abstract boolean getSoundEnabled();

    public abstract void setCameraPosition(CameraPosition cameraPosition);

    public abstract void setHapticEnabled(boolean z10);

    public abstract void setSoundEnabled(boolean z10);

    public abstract void updateFromJson(NativeJsonValue nativeJsonValue);
}
