package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountStatusItem {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountStatusItem {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121670a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native BarcodeCountStatus native_getStatus(long j10);

        private native NativeTrackedBarcode native_getTrackedBarcode(long j10);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusItem
        public BarcodeCountStatus getStatus() {
            return native_getStatus(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusItem
        public NativeTrackedBarcode getTrackedBarcode() {
            return native_getTrackedBarcode(this.nativeRef);
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

    public static native NativeBarcodeCountStatusItem create(NativeTrackedBarcode nativeTrackedBarcode, BarcodeCountStatus barcodeCountStatus);

    public abstract BarcodeCountStatus getStatus();

    public abstract NativeTrackedBarcode getTrackedBarcode();
}
