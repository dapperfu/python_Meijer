package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeFilterOverlaySettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFilterOverlaySettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121884a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeBrush native_getBrush(long j10);

        private native NativeBarcodeFilterHighlightType native_getOverlayType(long j10);

        private native void native_setBarcodeFilterHighlightType(long j10, NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType);

        private native void native_setBrush(long j10, NativeBrush nativeBrush);

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public NativeBrush getBrush() {
            return native_getBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public NativeBarcodeFilterHighlightType getOverlayType() {
            return native_getOverlayType(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public void setBarcodeFilterHighlightType(NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType) {
            native_setBarcodeFilterHighlightType(this.nativeRef, nativeBarcodeFilterHighlightType);
        }

        @Override // com.scandit.datacapture.barcode.filter.ui.overlay.NativeBarcodeFilterOverlaySettings
        public void setBrush(NativeBrush nativeBrush) {
            native_setBrush(this.nativeRef, nativeBrush);
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

    public static native NativeBarcodeFilterOverlaySettings create();

    public abstract NativeBrush getBrush();

    public abstract NativeBarcodeFilterHighlightType getOverlayType();

    public abstract void setBarcodeFilterHighlightType(NativeBarcodeFilterHighlightType nativeBarcodeFilterHighlightType);

    public abstract void setBrush(NativeBrush nativeBrush);
}
