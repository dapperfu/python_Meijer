package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeFindSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFindSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123072a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native HashSet<NativeBarcodeFindItem> native_getAllFoundItems(long j10);

        private native HashSet<NativeBarcodeFindItem> native_getFoundItemsInLastProcessedFrame(long j10);

        private native HashMap<Integer, NativeTrackedBarcode> native_getFoundTrackedBarcodes(long j10);

        private native HashMap<Integer, NativeTrackedBarcode> native_getTrackedBarcodes(long j10);

        private native byte[] native_getTransformedDataForData(long j10, byte[] bArr);

        private native String native_toPublicJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashSet<NativeBarcodeFindItem> getAllFoundItems() {
            return native_getAllFoundItems(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashSet<NativeBarcodeFindItem> getFoundItemsInLastProcessedFrame() {
            return native_getFoundItemsInLastProcessedFrame(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashMap<Integer, NativeTrackedBarcode> getFoundTrackedBarcodes() {
            return native_getFoundTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes() {
            return native_getTrackedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public byte[] getTransformedDataForData(byte[] bArr) {
            return native_getTransformedDataForData(this.nativeRef, bArr);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession
        public String toPublicJson() {
            return native_toPublicJson(this.nativeRef);
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

    public abstract HashSet<NativeBarcodeFindItem> getAllFoundItems();

    public abstract HashSet<NativeBarcodeFindItem> getFoundItemsInLastProcessedFrame();

    public abstract HashMap<Integer, NativeTrackedBarcode> getFoundTrackedBarcodes();

    public abstract HashMap<Integer, NativeTrackedBarcode> getTrackedBarcodes();

    public abstract byte[] getTransformedDataForData(byte[] bArr);

    public abstract String toPublicJson();
}
