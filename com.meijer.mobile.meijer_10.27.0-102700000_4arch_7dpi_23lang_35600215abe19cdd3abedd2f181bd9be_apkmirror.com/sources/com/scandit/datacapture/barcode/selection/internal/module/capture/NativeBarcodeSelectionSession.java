package com.scandit.datacapture.barcode.selection.internal.module.capture;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeSelectionSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSelectionSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123839a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native int native_getCount(long j10, NativeBarcode nativeBarcode);

        private native long native_getFrameSeqIdAndroid(long j10);

        private native int native_getLastProcessedFrameId(long j10);

        private native ArrayList<NativeBarcode> native_getNewlySelectedBarcodes(long j10);

        private native ArrayList<NativeBarcode> native_getNewlyUnselectedBarcodes(long j10);

        private native ArrayList<NativeBarcode> native_getSelectedBarcodes(long j10);

        private native void native_reset(long j10);

        private native void native_selectAllUnselectedBarcodes(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public int getCount(NativeBarcode nativeBarcode) {
            return native_getCount(this.nativeRef, nativeBarcode);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public long getFrameSeqIdAndroid() {
            return native_getFrameSeqIdAndroid(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public int getLastProcessedFrameId() {
            return native_getLastProcessedFrameId(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public ArrayList<NativeBarcode> getNewlySelectedBarcodes() {
            return native_getNewlySelectedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public ArrayList<NativeBarcode> getNewlyUnselectedBarcodes() {
            return native_getNewlyUnselectedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public ArrayList<NativeBarcode> getSelectedBarcodes() {
            return native_getSelectedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public void reset() {
            native_reset(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
        public void selectAllUnselectedBarcodes() {
            native_selectAllUnselectedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession
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

    public abstract int getCount(NativeBarcode nativeBarcode);

    public abstract long getFrameSeqIdAndroid();

    public abstract int getLastProcessedFrameId();

    public abstract ArrayList<NativeBarcode> getNewlySelectedBarcodes();

    public abstract ArrayList<NativeBarcode> getNewlyUnselectedBarcodes();

    public abstract ArrayList<NativeBarcode> getSelectedBarcodes();

    public abstract void reset();

    public abstract void selectAllUnselectedBarcodes();

    public abstract String toJson();
}
