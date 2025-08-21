package com.scandit.datacapture.barcode.count.internal.module.serialization;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121676a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureModeDeserializer native_asDataCaptureModeDeserializer(long j10);

        private native NativeBarcodeCountBasicOverlay native_barcodeCountBasicOverlayFromJson(long j10, NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCount native_barcodeCountFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

        private native NativeCameraSettings native_createRecommendedCameraSettings(long j10);

        private native NativeBarcodeCountDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setListener(long j10, NativeBarcodeCountDeserializerListener nativeBarcodeCountDeserializerListener);

        private native NativeBarcodeCountSettings native_settingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCountBasicOverlay native_updateBarcodeCountBasicOverlayFromJson(long j10, NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCount native_updateBarcodeCountFromJson(long j10, NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCountSettings native_updateSettingsFromJson(long j10, NativeBarcodeCountSettings nativeBarcodeCountSettings, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer() {
            return native_asDataCaptureModeDeserializer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeBarcodeCountBasicOverlay barcodeCountBasicOverlayFromJson(NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue) {
            return native_barcodeCountBasicOverlayFromJson(this.nativeRef, nativeBarcodeCount, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeBarcodeCount barcodeCountFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue) {
            return native_barcodeCountFromJson(this.nativeRef, nativeDataCaptureContext, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeCameraSettings createRecommendedCameraSettings() {
            return native_createRecommendedCameraSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeBarcodeCountDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public void setListener(NativeBarcodeCountDeserializerListener nativeBarcodeCountDeserializerListener) {
            native_setListener(this.nativeRef, nativeBarcodeCountDeserializerListener);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeBarcodeCountSettings settingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_settingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeBarcodeCountBasicOverlay updateBarcodeCountBasicOverlayFromJson(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeCountBasicOverlayFromJson(this.nativeRef, nativeBarcodeCountBasicOverlay, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeBarcodeCount updateBarcodeCountFromJson(NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeCountFromJson(this.nativeRef, nativeBarcodeCount, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer
        public NativeBarcodeCountSettings updateSettingsFromJson(NativeBarcodeCountSettings nativeBarcodeCountSettings, NativeJsonValue nativeJsonValue) {
            return native_updateSettingsFromJson(this.nativeRef, nativeBarcodeCountSettings, nativeJsonValue);
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

    public static native NativeBarcodeCountDeserializer create(NativeBarcodeCountDeserializerHelper nativeBarcodeCountDeserializerHelper);

    public abstract NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer();

    public abstract NativeBarcodeCountBasicOverlay barcodeCountBasicOverlayFromJson(NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCount barcodeCountFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

    public abstract NativeCameraSettings createRecommendedCameraSettings();

    public abstract NativeBarcodeCountDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setListener(NativeBarcodeCountDeserializerListener nativeBarcodeCountDeserializerListener);

    public abstract NativeBarcodeCountSettings settingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCountBasicOverlay updateBarcodeCountBasicOverlayFromJson(NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCount updateBarcodeCountFromJson(NativeBarcodeCount nativeBarcodeCount, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCountSettings updateSettingsFromJson(NativeBarcodeCountSettings nativeBarcodeCountSettings, NativeJsonValue nativeJsonValue);
}
