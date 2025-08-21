package com.scandit.datacapture.barcode.internal.module.generator;

import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeGenerator {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeGenerator {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123348a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureComponent native_asDataCaptureComponent(long j10);

        private native NativeBarcodeGeneratorGenerateResult native_generate(long j10, byte[] bArr, ArrayList<EncodingRange> arrayList);

        private native String native_getIdentifier(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator
        public NativeDataCaptureComponent asDataCaptureComponent() {
            return native_asDataCaptureComponent(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator
        public NativeBarcodeGeneratorGenerateResult generate(byte[] bArr, ArrayList<EncodingRange> arrayList) {
            return native_generate(this.nativeRef, bArr, arrayList);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.generator.NativeBarcodeGenerator
        public String getIdentifier() {
            return native_getIdentifier(this.nativeRef);
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

    public static native NativeBarcodeGeneratorFactoryResult create(NativeDataCaptureContext nativeDataCaptureContext, NativeBarcodeGeneratorSymbology nativeBarcodeGeneratorSymbology, NativeBarcodeGeneratorOptions nativeBarcodeGeneratorOptions);

    public static native NativeBarcodeGeneratorOptions createDefaultOptions(NativeBarcodeGeneratorSymbology nativeBarcodeGeneratorSymbology);

    public abstract NativeDataCaptureComponent asDataCaptureComponent();

    public abstract NativeBarcodeGeneratorGenerateResult generate(byte[] bArr, ArrayList<EncodingRange> arrayList);

    public abstract String getIdentifier();
}
