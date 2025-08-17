package com.scandit.datacapture.barcode.internal.module.find.serialization;

import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeFindDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFindDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122134a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureModeDeserializer native_asDataCaptureModeDeserializer(long j10);

        private native NativeBarcodeFind native_barcodeFindFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeFindDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setListener(long j10, NativeBarcodeFindDeserializerListener nativeBarcodeFindDeserializerListener);

        private native NativeBarcodeFindSettings native_settingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeFind native_updateBarcodeFindFromJson(long j10, NativeBarcodeFind nativeBarcodeFind, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeFindSettings native_updateSettingsFromJson(long j10, NativeBarcodeFindSettings nativeBarcodeFindSettings, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer() {
            return native_asDataCaptureModeDeserializer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public NativeBarcodeFind barcodeFindFromJson(NativeJsonValue nativeJsonValue) {
            return native_barcodeFindFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public NativeBarcodeFindDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public void setListener(NativeBarcodeFindDeserializerListener nativeBarcodeFindDeserializerListener) {
            native_setListener(this.nativeRef, nativeBarcodeFindDeserializerListener);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public NativeBarcodeFindSettings settingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_settingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public NativeBarcodeFind updateBarcodeFindFromJson(NativeBarcodeFind nativeBarcodeFind, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeFindFromJson(this.nativeRef, nativeBarcodeFind, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer
        public NativeBarcodeFindSettings updateSettingsFromJson(NativeBarcodeFindSettings nativeBarcodeFindSettings, NativeJsonValue nativeJsonValue) {
            return native_updateSettingsFromJson(this.nativeRef, nativeBarcodeFindSettings, nativeJsonValue);
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

    public static native NativeBarcodeFindDeserializer create(NativeBarcodeFindDeserializerHelper nativeBarcodeFindDeserializerHelper);

    public abstract NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer();

    public abstract NativeBarcodeFind barcodeFindFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeFindDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setListener(NativeBarcodeFindDeserializerListener nativeBarcodeFindDeserializerListener);

    public abstract NativeBarcodeFindSettings settingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeFind updateBarcodeFindFromJson(NativeBarcodeFind nativeBarcodeFind, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeFindSettings updateSettingsFromJson(NativeBarcodeFindSettings nativeBarcodeFindSettings, NativeJsonValue nativeJsonValue);
}
