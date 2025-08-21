package com.scandit.datacapture.barcode.spark.internal.module.capture;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124858a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_clear(long j10);

        private native long native_getFrameSeqIdAndroid(long j10);

        private native NativeBarcode native_getNewlyRecognizedBarcode(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public void clear() {
            native_clear(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public long getFrameSeqIdAndroid() {
            return native_getFrameSeqIdAndroid(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
        public NativeBarcode getNewlyRecognizedBarcode() {
            return native_getNewlyRecognizedBarcode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSession
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

    public abstract NativeBarcode getNewlyRecognizedBarcode();

    public abstract String toJson();
}
