package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickScanningSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickScanningSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122422a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native HashSet<String> native_getPickedObjects(long j10);

        private native HashSet<String> native_getScannedObjects(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession
        public HashSet<String> getPickedObjects() {
            return native_getPickedObjects(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession
        public HashSet<String> getScannedObjects() {
            return native_getScannedObjects(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickScanningSession
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

    public abstract HashSet<String> getPickedObjects();

    public abstract HashSet<String> getScannedObjects();

    public abstract String toJson();
}
