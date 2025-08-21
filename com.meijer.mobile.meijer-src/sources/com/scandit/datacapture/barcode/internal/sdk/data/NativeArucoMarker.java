package com.scandit.datacapture.barcode.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeArucoMarker {

    @DjinniGenerated
    public static final class CppProxy extends NativeArucoMarker {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124496a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native byte[] native_getBits(long j10);

        private native int native_getSize(long j10);

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoMarker
        public byte[] getBits() {
            return native_getBits(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoMarker
        public int getSize() {
            return native_getSize(this.nativeRef);
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

    public static native NativeArucoMarker create(int i10, byte[] bArr);

    public abstract byte[] getBits();

    public abstract int getSize();
}
