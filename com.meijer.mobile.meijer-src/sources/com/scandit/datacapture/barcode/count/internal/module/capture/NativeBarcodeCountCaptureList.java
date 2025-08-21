package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.internal.module.common.NativeBarcodeDataTransformer;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountCaptureList {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountCaptureList {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121664a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListenerAsync(long j10, NativeBarcodeCountCaptureListListener nativeBarcodeCountCaptureListListener);

        private native NativeBarcodeCountCaptureListSession native_getSession(long j10);

        private native int native_getTargetBarcodesQuantity(long j10);

        private native void native_setBarcodeCountTransformer(long j10, NativeBarcodeDataTransformer nativeBarcodeDataTransformer);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList
        public void addListenerAsync(NativeBarcodeCountCaptureListListener nativeBarcodeCountCaptureListListener) {
            native_addListenerAsync(this.nativeRef, nativeBarcodeCountCaptureListListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList
        public NativeBarcodeCountCaptureListSession getSession() {
            return native_getSession(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList
        public int getTargetBarcodesQuantity() {
            return native_getTargetBarcodesQuantity(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountCaptureList
        public void setBarcodeCountTransformer(NativeBarcodeDataTransformer nativeBarcodeDataTransformer) {
            native_setBarcodeCountTransformer(this.nativeRef, nativeBarcodeDataTransformer);
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

    public static native NativeBarcodeCountCaptureList createForAndroid(HashSet<NativeTargetBarcode> hashSet);

    public abstract void addListenerAsync(NativeBarcodeCountCaptureListListener nativeBarcodeCountCaptureListListener);

    public abstract NativeBarcodeCountCaptureListSession getSession();

    public abstract int getTargetBarcodesQuantity();

    public abstract void setBarcodeCountTransformer(NativeBarcodeDataTransformer nativeBarcodeDataTransformer);
}
