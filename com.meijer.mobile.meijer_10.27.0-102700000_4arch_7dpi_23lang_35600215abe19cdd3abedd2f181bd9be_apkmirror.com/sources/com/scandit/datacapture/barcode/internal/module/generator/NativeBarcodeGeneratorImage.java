package com.scandit.datacapture.barcode.internal.module.generator;

import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeGeneratorImage {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeGeneratorImage {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122399a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeImageBuffer native_getImageBuffer(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorImage
        public NativeImageBuffer getImageBuffer() {
            return native_getImageBuffer(this.nativeRef);
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

    public abstract NativeImageBuffer getImageBuffer();
}
