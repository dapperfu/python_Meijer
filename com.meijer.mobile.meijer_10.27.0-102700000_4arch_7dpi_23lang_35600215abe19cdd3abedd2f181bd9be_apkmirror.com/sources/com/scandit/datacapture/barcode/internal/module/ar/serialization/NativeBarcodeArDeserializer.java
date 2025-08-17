package com.scandit.datacapture.barcode.internal.module.ar.serialization;

import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeAr;
import com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeArDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeArDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121069a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureModeDeserializer native_asDataCaptureModeDeserializer(long j10);

        private native NativeBarcodeAr native_barcodeArFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeArDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setListener(long j10, NativeBarcodeArDeserializerListener nativeBarcodeArDeserializerListener);

        private native NativeBarcodeArSettings native_settingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeAr native_updateBarcodeArFromJson(long j10, NativeBarcodeAr nativeBarcodeAr, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeArSettings native_updateSettingsFromJson(long j10, NativeBarcodeArSettings nativeBarcodeArSettings, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer() {
            return native_asDataCaptureModeDeserializer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public NativeBarcodeAr barcodeArFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue) {
            return native_barcodeArFromJson(this.nativeRef, nativeDataCaptureContext, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public NativeBarcodeArDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public void setListener(NativeBarcodeArDeserializerListener nativeBarcodeArDeserializerListener) {
            native_setListener(this.nativeRef, nativeBarcodeArDeserializerListener);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public NativeBarcodeArSettings settingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_settingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public NativeBarcodeAr updateBarcodeArFromJson(NativeBarcodeAr nativeBarcodeAr, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeArFromJson(this.nativeRef, nativeBarcodeAr, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.serialization.NativeBarcodeArDeserializer
        public NativeBarcodeArSettings updateSettingsFromJson(NativeBarcodeArSettings nativeBarcodeArSettings, NativeJsonValue nativeJsonValue) {
            return native_updateSettingsFromJson(this.nativeRef, nativeBarcodeArSettings, nativeJsonValue);
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

    public static native NativeBarcodeArDeserializer create(NativeBarcodeArDeserializerHelper nativeBarcodeArDeserializerHelper);

    public abstract NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer();

    public abstract NativeBarcodeAr barcodeArFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeArDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setListener(NativeBarcodeArDeserializerListener nativeBarcodeArDeserializerListener);

    public abstract NativeBarcodeArSettings settingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeAr updateBarcodeArFromJson(NativeBarcodeAr nativeBarcodeAr, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeArSettings updateSettingsFromJson(NativeBarcodeArSettings nativeBarcodeArSettings, NativeJsonValue nativeJsonValue);
}
