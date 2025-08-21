package com.scandit.datacapture.barcode.internal.module.ar.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeArSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeArSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122008a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native ArrayList<NativeTrackedBarcode> native_getAddedTrackedBarcodes(long j10);

        private native ArrayList<Integer> native_getRemovedTrackedBarcodes(long j10);

        private native HashMap<Integer, NativeTrackedBarcode> native_getTrackedBarcodes(long j10);

        private native void native_reset(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession
        public ArrayList<NativeTrackedBarcode> getAddedTrackedBarcodes() {
            return native_getAddedTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession
        public ArrayList<Integer> getRemovedTrackedBarcodes() {
            return native_getRemovedTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession
        public HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes() {
            return native_getTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession
        public void reset() {
            native_reset(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSession
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

    public abstract ArrayList<NativeTrackedBarcode> getAddedTrackedBarcodes();

    public abstract ArrayList<Integer> getRemovedTrackedBarcodes();

    public abstract HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes();

    public abstract void reset();

    public abstract String toJson();
}
