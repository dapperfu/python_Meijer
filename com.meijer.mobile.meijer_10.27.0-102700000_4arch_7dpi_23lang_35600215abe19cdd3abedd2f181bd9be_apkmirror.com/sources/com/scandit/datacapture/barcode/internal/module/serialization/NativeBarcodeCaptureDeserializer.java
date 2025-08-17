package com.scandit.datacapture.barcode.internal.module.serialization;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeCaptureDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCaptureDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122813a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureModeDeserializer native_asDataCaptureModeDeserializer(long j10);

        private native NativeBarcodeCapture native_barcodeCaptureFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCaptureOverlay native_barcodeCaptureOverlayFromJson(long j10, NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCaptureDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setListener(long j10, NativeBarcodeCaptureDeserializerListener nativeBarcodeCaptureDeserializerListener);

        private native NativeBarcodeCaptureSettings native_settingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCapture native_updateBarcodeCaptureFromJson(long j10, NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCaptureOverlay native_updateBarcodeCaptureOverlayFromJson(long j10, NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeCaptureSettings native_updateSettingsFromJson(long j10, NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer() {
            return native_asDataCaptureModeDeserializer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeBarcodeCapture barcodeCaptureFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue) {
            return native_barcodeCaptureFromJson(this.nativeRef, nativeDataCaptureContext, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeBarcodeCaptureOverlay barcodeCaptureOverlayFromJson(NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue) {
            return native_barcodeCaptureOverlayFromJson(this.nativeRef, nativeBarcodeCapture, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeBarcodeCaptureDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public void setListener(NativeBarcodeCaptureDeserializerListener nativeBarcodeCaptureDeserializerListener) {
            native_setListener(this.nativeRef, nativeBarcodeCaptureDeserializerListener);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeBarcodeCaptureSettings settingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_settingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeBarcodeCapture updateBarcodeCaptureFromJson(NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeCaptureFromJson(this.nativeRef, nativeBarcodeCapture, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeBarcodeCaptureOverlay updateBarcodeCaptureOverlayFromJson(NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeCaptureOverlayFromJson(this.nativeRef, nativeBarcodeCaptureOverlay, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer
        public NativeBarcodeCaptureSettings updateSettingsFromJson(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, NativeJsonValue nativeJsonValue) {
            return native_updateSettingsFromJson(this.nativeRef, nativeBarcodeCaptureSettings, nativeJsonValue);
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

    public static native NativeBarcodeCaptureDeserializer create(NativeLocationSelectionDeserializer nativeLocationSelectionDeserializer, NativeViewfinderDeserializer nativeViewfinderDeserializer, NativeBarcodeCaptureDeserializerHelper nativeBarcodeCaptureDeserializerHelper);

    public abstract NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer();

    public abstract NativeBarcodeCapture barcodeCaptureFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCaptureOverlay barcodeCaptureOverlayFromJson(NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCaptureDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setListener(NativeBarcodeCaptureDeserializerListener nativeBarcodeCaptureDeserializerListener);

    public abstract NativeBarcodeCaptureSettings settingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCapture updateBarcodeCaptureFromJson(NativeBarcodeCapture nativeBarcodeCapture, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCaptureOverlay updateBarcodeCaptureOverlayFromJson(NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeCaptureSettings updateSettingsFromJson(NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings, NativeJsonValue nativeJsonValue);
}
