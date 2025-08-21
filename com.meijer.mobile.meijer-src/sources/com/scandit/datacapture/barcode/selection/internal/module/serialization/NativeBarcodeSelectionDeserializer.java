package com.scandit.datacapture.barcode.selection.internal.module.serialization;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeSelectionDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSelectionDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124795a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureModeDeserializer native_asDataCaptureModeDeserializer(long j10);

        private native NativeBarcodeSelectionBasicOverlay native_barcodeSelectionBasicOverlayFromJson(long j10, NativeBarcodeSelection nativeBarcodeSelection, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeSelection native_barcodeSelectionFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeSelectionDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setListener(long j10, NativeBarcodeSelectionDeserializerListener nativeBarcodeSelectionDeserializerListener);

        private native NativeBarcodeSelectionSettings native_settingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeSelectionBasicOverlay native_updateBarcodeSelectionBasicOverlayFromJson(long j10, NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeSelection native_updateBarcodeSelectionFromJson(long j10, NativeBarcodeSelection nativeBarcodeSelection, NativeJsonValue nativeJsonValue);

        private native NativeBarcodeSelectionSettings native_updateSettingsFromJson(long j10, NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer() {
            return native_asDataCaptureModeDeserializer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeBarcodeSelectionBasicOverlay barcodeSelectionBasicOverlayFromJson(NativeBarcodeSelection nativeBarcodeSelection, NativeJsonValue nativeJsonValue) {
            return native_barcodeSelectionBasicOverlayFromJson(this.nativeRef, nativeBarcodeSelection, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeBarcodeSelection barcodeSelectionFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue) {
            return native_barcodeSelectionFromJson(this.nativeRef, nativeDataCaptureContext, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeBarcodeSelectionDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public void setListener(NativeBarcodeSelectionDeserializerListener nativeBarcodeSelectionDeserializerListener) {
            native_setListener(this.nativeRef, nativeBarcodeSelectionDeserializerListener);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeBarcodeSelectionSettings settingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_settingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeBarcodeSelectionBasicOverlay updateBarcodeSelectionBasicOverlayFromJson(NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeSelectionBasicOverlayFromJson(this.nativeRef, nativeBarcodeSelectionBasicOverlay, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeBarcodeSelection updateBarcodeSelectionFromJson(NativeBarcodeSelection nativeBarcodeSelection, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodeSelectionFromJson(this.nativeRef, nativeBarcodeSelection, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer
        public NativeBarcodeSelectionSettings updateSettingsFromJson(NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings, NativeJsonValue nativeJsonValue) {
            return native_updateSettingsFromJson(this.nativeRef, nativeBarcodeSelectionSettings, nativeJsonValue);
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

    public static native NativeBarcodeSelectionDeserializer create(NativeViewfinderDeserializer nativeViewfinderDeserializer, NativeBarcodeSelectionDeserializerHelper nativeBarcodeSelectionDeserializerHelper);

    public abstract NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer();

    public abstract NativeBarcodeSelectionBasicOverlay barcodeSelectionBasicOverlayFromJson(NativeBarcodeSelection nativeBarcodeSelection, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeSelection barcodeSelectionFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeSelectionDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setListener(NativeBarcodeSelectionDeserializerListener nativeBarcodeSelectionDeserializerListener);

    public abstract NativeBarcodeSelectionSettings settingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeSelectionBasicOverlay updateBarcodeSelectionBasicOverlayFromJson(NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeSelection updateBarcodeSelectionFromJson(NativeBarcodeSelection nativeBarcodeSelection, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodeSelectionSettings updateSettingsFromJson(NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings, NativeJsonValue nativeJsonValue);
}
