package com.scandit.datacapture.barcode.selection.internal.module.capture;

import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionFreezeBehavior;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapBehavior;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeTapSelection {

    @DjinniGenerated
    public static final class CppProxy extends NativeTapSelection {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123842a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeSelectionType native_asSelectionType(long j10);

        private native BarcodeSelectionFreezeBehavior native_getFreezeBehavior(long j10);

        private native boolean native_getShouldFreezeOnDoubleTap(long j10);

        private native BarcodeSelectionTapBehavior native_getTapBehavior(long j10);

        private native void native_setFreezeBehavior(long j10, BarcodeSelectionFreezeBehavior barcodeSelectionFreezeBehavior);

        private native void native_setShouldFreezeOnDoubleTap(long j10, boolean z10);

        private native void native_setTapBehavior(long j10, BarcodeSelectionTapBehavior barcodeSelectionTapBehavior);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public NativeSelectionType asSelectionType() {
            return native_asSelectionType(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public BarcodeSelectionFreezeBehavior getFreezeBehavior() {
            return native_getFreezeBehavior(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public boolean getShouldFreezeOnDoubleTap() {
            return native_getShouldFreezeOnDoubleTap(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public BarcodeSelectionTapBehavior getTapBehavior() {
            return native_getTapBehavior(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public void setFreezeBehavior(BarcodeSelectionFreezeBehavior barcodeSelectionFreezeBehavior) {
            native_setFreezeBehavior(this.nativeRef, barcodeSelectionFreezeBehavior);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public void setShouldFreezeOnDoubleTap(boolean z10) {
            native_setShouldFreezeOnDoubleTap(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public void setTapBehavior(BarcodeSelectionTapBehavior barcodeSelectionTapBehavior) {
            native_setTapBehavior(this.nativeRef, barcodeSelectionTapBehavior);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection
        public String toJson() {
            return native_toJson(this.nativeRef);
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

    public static native NativeTapSelection create();

    public abstract NativeSelectionType asSelectionType();

    public abstract BarcodeSelectionFreezeBehavior getFreezeBehavior();

    public abstract boolean getShouldFreezeOnDoubleTap();

    public abstract BarcodeSelectionTapBehavior getTapBehavior();

    public abstract void setFreezeBehavior(BarcodeSelectionFreezeBehavior barcodeSelectionFreezeBehavior);

    public abstract void setShouldFreezeOnDoubleTap(boolean z10);

    public abstract void setTapBehavior(BarcodeSelectionTapBehavior barcodeSelectionTapBehavior);

    public abstract String toJson();
}
