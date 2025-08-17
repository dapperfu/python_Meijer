package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCountSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f120716a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native ArrayList<NativeTrackedBarcode> native_getAddedTrackedBarcodes(long j10);

        private native ArrayList<NativeBarcode> native_getAdditionalBarcodes(long j10);

        private native HashMap<Integer, NativeTrackedBarcode> native_getClearedBarcodes(long j10);

        private native ArrayList<NativeCluster> native_getClusters(long j10);

        private native HashMap<Integer, NativeTrackedBarcode> native_getFilteredTrackedBarcodes(long j10);

        private native long native_getFrameSeqIdAndroid(long j10);

        private native ArrayList<Integer> native_getRemovedTrackedBarcodes(long j10);

        private native int native_getScannedBarcodeCount(long j10);

        private native NativeBarcodeSpatialGrid native_getSpatialMap(long j10, int i10, int i11);

        private native HashMap<Integer, NativeTrackedBarcode> native_getTrackedBarcodes(long j10);

        private native ArrayList<NativeTrackedBarcode> native_getUnscannedTrackedBarcodes(long j10);

        private native ArrayList<Integer> native_getUpdatedTrackedBarcodeIds(long j10);

        private native ArrayList<NativeTrackedBarcode> native_getUpdatedTrackedBarcodes(long j10);

        private native boolean native_hasScanningFailed(long j10);

        private native void native_reset(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public ArrayList<NativeTrackedBarcode> getAddedTrackedBarcodes() {
            return native_getAddedTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public ArrayList<NativeBarcode> getAdditionalBarcodes() {
            return native_getAdditionalBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public HashMap<Integer, NativeTrackedBarcode> getClearedBarcodes() {
            return native_getClearedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public ArrayList<NativeCluster> getClusters() {
            return native_getClusters(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public HashMap<Integer, NativeTrackedBarcode> getFilteredTrackedBarcodes() {
            return native_getFilteredTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public long getFrameSeqIdAndroid() {
            return native_getFrameSeqIdAndroid(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public ArrayList<Integer> getRemovedTrackedBarcodes() {
            return native_getRemovedTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public int getScannedBarcodeCount() {
            return native_getScannedBarcodeCount(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public NativeBarcodeSpatialGrid getSpatialMap(int i10, int i11) {
            return native_getSpatialMap(this.nativeRef, i10, i11);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes() {
            return native_getTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public ArrayList<NativeTrackedBarcode> getUnscannedTrackedBarcodes() {
            return native_getUnscannedTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public ArrayList<Integer> getUpdatedTrackedBarcodeIds() {
            return native_getUpdatedTrackedBarcodeIds(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public ArrayList<NativeTrackedBarcode> getUpdatedTrackedBarcodes() {
            return native_getUpdatedTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public boolean hasScanningFailed() {
            return native_hasScanningFailed(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
        public void reset() {
            native_reset(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSession
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

    public abstract ArrayList<NativeBarcode> getAdditionalBarcodes();

    public abstract HashMap<Integer, NativeTrackedBarcode> getClearedBarcodes();

    public abstract ArrayList<NativeCluster> getClusters();

    public abstract HashMap<Integer, NativeTrackedBarcode> getFilteredTrackedBarcodes();

    public abstract long getFrameSeqIdAndroid();

    public abstract ArrayList<Integer> getRemovedTrackedBarcodes();

    public abstract int getScannedBarcodeCount();

    public abstract NativeBarcodeSpatialGrid getSpatialMap(int i10, int i11);

    public abstract HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes();

    public abstract ArrayList<NativeTrackedBarcode> getUnscannedTrackedBarcodes();

    public abstract ArrayList<Integer> getUpdatedTrackedBarcodeIds();

    public abstract ArrayList<NativeTrackedBarcode> getUpdatedTrackedBarcodes();

    public abstract boolean hasScanningFailed();

    public abstract void reset();

    public abstract String toJson();
}
