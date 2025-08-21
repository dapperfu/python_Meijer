package com.scandit.datacapture.barcode.internal.module.generator;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeGeneratorGenerateResult {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeGeneratorGenerateResult {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123350a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_error(long j10);

        private native boolean native_ok(long j10);

        private native NativeBarcodeGeneratorImage native_value(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorGenerateResult
        public String error() {
            return native_error(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorGenerateResult
        public boolean ok() {
            return native_ok(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGeneratorGenerateResult
        public NativeBarcodeGeneratorImage value() {
            return native_value(this.nativeRef);
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

    public abstract String error();

    public abstract boolean ok();

    public abstract NativeBarcodeGeneratorImage value();
}
