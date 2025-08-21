package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountStatusProviderCallback {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountStatusProviderCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121671a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_onStatusReady(long j10, NativeBarcodeCountStatusResult nativeBarcodeCountStatusResult);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProviderCallback
        public void onStatusReady(NativeBarcodeCountStatusResult nativeBarcodeCountStatusResult) {
            native_onStatusReady(this.nativeRef, nativeBarcodeCountStatusResult);
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

    public abstract void onStatusReady(NativeBarcodeCountStatusResult nativeBarcodeCountStatusResult);
}
