package com.scandit.datacapture.barcode.internal.module.ar.ui;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeArView {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeArView {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122028a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native Anchor native_getCameraSwitchControlPosition(long j10);

        private native boolean native_getShouldShowCameraSwitchControl(long j10);

        private native boolean native_getShouldShowTorchControl(long j10);

        private native boolean native_getShouldShowZoomControl(long j10);

        private native Anchor native_getTorchControlPosition(long j10);

        private native Anchor native_getZoomControlPosition(long j10);

        private native void native_setCameraSwitchControlPosition(long j10, Anchor anchor);

        private native void native_setShouldShowCameraSwitchControl(long j10, boolean z10);

        private native void native_setShouldShowTorchControl(long j10, boolean z10);

        private native void native_setShouldShowZoomControl(long j10, boolean z10);

        private native void native_setTorchControlPosition(long j10, Anchor anchor);

        private native void native_setZoomControlPosition(long j10, Anchor anchor);

        private native void native_updateFromJson(long j10, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public Anchor getCameraSwitchControlPosition() {
            return native_getCameraSwitchControlPosition(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public boolean getShouldShowCameraSwitchControl() {
            return native_getShouldShowCameraSwitchControl(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public boolean getShouldShowTorchControl() {
            return native_getShouldShowTorchControl(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public boolean getShouldShowZoomControl() {
            return native_getShouldShowZoomControl(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public Anchor getTorchControlPosition() {
            return native_getTorchControlPosition(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public Anchor getZoomControlPosition() {
            return native_getZoomControlPosition(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public void setCameraSwitchControlPosition(Anchor anchor) {
            native_setCameraSwitchControlPosition(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public void setShouldShowCameraSwitchControl(boolean z10) {
            native_setShouldShowCameraSwitchControl(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public void setShouldShowTorchControl(boolean z10) {
            native_setShouldShowTorchControl(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public void setShouldShowZoomControl(boolean z10) {
            native_setShouldShowZoomControl(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public void setTorchControlPosition(Anchor anchor) {
            native_setTorchControlPosition(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
        public void setZoomControlPosition(Anchor anchor) {
            native_setZoomControlPosition(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.ui.NativeBarcodeArView
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

    public static native NativeBarcodeArView create();

    public static native NativeBarcodeArView fromJson(NativeJsonValue nativeJsonValue);

    public abstract Anchor getCameraSwitchControlPosition();

    public abstract boolean getShouldShowCameraSwitchControl();

    public abstract boolean getShouldShowTorchControl();

    public abstract boolean getShouldShowZoomControl();

    public abstract Anchor getTorchControlPosition();

    public abstract Anchor getZoomControlPosition();

    public abstract void setCameraSwitchControlPosition(Anchor anchor);

    public abstract void setShouldShowCameraSwitchControl(boolean z10);

    public abstract void setShouldShowTorchControl(boolean z10);

    public abstract void setShouldShowZoomControl(boolean z10);

    public abstract void setTorchControlPosition(Anchor anchor);

    public abstract void setZoomControlPosition(Anchor anchor);

    public abstract void updateFromJson(NativeJsonValue nativeJsonValue);
}
