package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeFindItem {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFindItem {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123071a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native int native_getCount(long j10);

        private native byte[] native_getFindableData(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem
        public int getCount() {
            return native_getCount(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem
        public byte[] getFindableData() {
            return native_getFindableData(this.nativeRef);
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

    public static native NativeBarcodeFindItem create(String str);

    public static native NativeBarcodeFindItem createWithRaw(byte[] bArr);

    public abstract int getCount();

    public abstract byte[] getFindableData();
}
