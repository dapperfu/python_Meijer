package com.scandit.datacapture.barcode.internal.module.capture;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeLocalizedOnlyBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCaptureSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCaptureSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121274a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_clear(long j10);

        private native long native_getFrameSeqIdAndroid(long j10);

        private native ArrayList<NativeLocalizedOnlyBarcode> native_getNewlyLocalizedBarcodes(long j10);

        private native NativeBarcode native_getNewlyRecognizedBarcode(long j10);

        private native ArrayList<NativeBarcode> native_getNewlyRecognizedBarcodes(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession
        public void clear() {
            native_clear(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession
        public long getFrameSeqIdAndroid() {
            return native_getFrameSeqIdAndroid(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession
        public ArrayList<NativeLocalizedOnlyBarcode> getNewlyLocalizedBarcodes() {
            return native_getNewlyLocalizedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession
        public NativeBarcode getNewlyRecognizedBarcode() {
            return native_getNewlyRecognizedBarcode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession
        public ArrayList<NativeBarcode> getNewlyRecognizedBarcodes() {
            return native_getNewlyRecognizedBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession
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

    public abstract void clear();

    public abstract long getFrameSeqIdAndroid();

    public abstract ArrayList<NativeLocalizedOnlyBarcode> getNewlyLocalizedBarcodes();

    public abstract NativeBarcode getNewlyRecognizedBarcode();

    public abstract ArrayList<NativeBarcode> getNewlyRecognizedBarcodes();

    public abstract String toJson();
}
