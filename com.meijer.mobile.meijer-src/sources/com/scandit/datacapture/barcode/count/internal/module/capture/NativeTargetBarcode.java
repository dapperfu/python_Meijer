package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeTargetBarcode {

    @DjinniGenerated
    public static final class CppProxy extends NativeTargetBarcode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121675a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_getData(long j10);

        private native int native_getQuantity(long j10);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode
        public String getData() {
            return native_getData(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode
        public int getQuantity() {
            return native_getQuantity(this.nativeRef);
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

    public static native NativeTargetBarcode create(String str, int i10);

    public abstract String getData();

    public abstract int getQuantity();
}
