package com.scandit.datacapture.barcode.internal.module.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122461a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureModeDeserializer native_asDataCaptureModeDeserializer(long j10);

        private native NativeBarcodePick native_barcodePickFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeProductProvider nativeProductProvider, NativeJsonValue nativeJsonValue);

        private native ArrayList<NativeBarcodePickProduct> native_barcodePickProductsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodePickDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native NativeDataCaptureOverlay native_overlayFromJson(long j10, NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue);

        private native void native_setListener(long j10, NativeBarcodePickDeserializerListener nativeBarcodePickDeserializerListener);

        private native NativeBarcodePickSettings native_settingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeBarcodePick native_updateBarcodePickFromJson(long j10, NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue);

        private native NativeDataCaptureOverlay native_updateOverlayFromJson(long j10, NativeDataCaptureOverlay nativeDataCaptureOverlay, NativeJsonValue nativeJsonValue);

        private native NativeBarcodePickSettings native_updateSettingsFromJson(long j10, NativeBarcodePickSettings nativeBarcodePickSettings, NativeJsonValue nativeJsonValue);

        private native NativeBarcodePickViewSettings native_updateViewSettingsFromJson(long j10, NativeBarcodePickViewSettings nativeBarcodePickViewSettings, NativeJsonValue nativeJsonValue);

        private native NativeBarcodePickViewSettings native_viewSettingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer() {
            return native_asDataCaptureModeDeserializer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeBarcodePick barcodePickFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeProductProvider nativeProductProvider, NativeJsonValue nativeJsonValue) {
            return native_barcodePickFromJson(this.nativeRef, nativeDataCaptureContext, nativeProductProvider, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public ArrayList<NativeBarcodePickProduct> barcodePickProductsFromJson(NativeJsonValue nativeJsonValue) {
            return native_barcodePickProductsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeBarcodePickDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeDataCaptureOverlay overlayFromJson(NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue) {
            return native_overlayFromJson(this.nativeRef, nativeBarcodePick, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public void setListener(NativeBarcodePickDeserializerListener nativeBarcodePickDeserializerListener) {
            native_setListener(this.nativeRef, nativeBarcodePickDeserializerListener);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeBarcodePickSettings settingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_settingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeBarcodePick updateBarcodePickFromJson(NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue) {
            return native_updateBarcodePickFromJson(this.nativeRef, nativeBarcodePick, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeDataCaptureOverlay updateOverlayFromJson(NativeDataCaptureOverlay nativeDataCaptureOverlay, NativeJsonValue nativeJsonValue) {
            return native_updateOverlayFromJson(this.nativeRef, nativeDataCaptureOverlay, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeBarcodePickSettings updateSettingsFromJson(NativeBarcodePickSettings nativeBarcodePickSettings, NativeJsonValue nativeJsonValue) {
            return native_updateSettingsFromJson(this.nativeRef, nativeBarcodePickSettings, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeBarcodePickViewSettings updateViewSettingsFromJson(NativeBarcodePickViewSettings nativeBarcodePickViewSettings, NativeJsonValue nativeJsonValue) {
            return native_updateViewSettingsFromJson(this.nativeRef, nativeBarcodePickViewSettings, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer
        public NativeBarcodePickViewSettings viewSettingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_viewSettingsFromJson(this.nativeRef, nativeJsonValue);
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

    public static native NativeBarcodePickDeserializer create(NativeBarcodePickDeserializerHelper nativeBarcodePickDeserializerHelper);

    public abstract NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer();

    public abstract NativeBarcodePick barcodePickFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeProductProvider nativeProductProvider, NativeJsonValue nativeJsonValue);

    public abstract ArrayList<NativeBarcodePickProduct> barcodePickProductsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodePickDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract NativeDataCaptureOverlay overlayFromJson(NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue);

    public abstract void setListener(NativeBarcodePickDeserializerListener nativeBarcodePickDeserializerListener);

    public abstract NativeBarcodePickSettings settingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodePick updateBarcodePickFromJson(NativeBarcodePick nativeBarcodePick, NativeJsonValue nativeJsonValue);

    public abstract NativeDataCaptureOverlay updateOverlayFromJson(NativeDataCaptureOverlay nativeDataCaptureOverlay, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodePickSettings updateSettingsFromJson(NativeBarcodePickSettings nativeBarcodePickSettings, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodePickViewSettings updateViewSettingsFromJson(NativeBarcodePickViewSettings nativeBarcodePickViewSettings, NativeJsonValue nativeJsonValue);

    public abstract NativeBarcodePickViewSettings viewSettingsFromJson(NativeJsonValue nativeJsonValue);
}
