package com.scandit.datacapture.barcode.spark.internal.module.serialization;

import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScan;
import com.scandit.datacapture.barcode.spark.internal.module.capture.NativeSparkScanSettings;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSparkScanDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeSparkScanDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124862a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureModeDeserializer native_asDataCaptureModeDeserializer(long j10);

        private native NativeSparkScanDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setListener(long j10, NativeSparkScanDeserializerListener nativeSparkScanDeserializerListener);

        private native NativeSparkScanSettings native_settingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeSparkScan native_sparkScanFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

        private native NativeSparkScanSettings native_updateSettingsFromJson(long j10, NativeSparkScanSettings nativeSparkScanSettings, NativeJsonValue nativeJsonValue);

        private native NativeSparkScan native_updateSparkScanFromJson(long j10, NativeSparkScan nativeSparkScan, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer() {
            return native_asDataCaptureModeDeserializer(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public NativeSparkScanDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public void setListener(NativeSparkScanDeserializerListener nativeSparkScanDeserializerListener) {
            native_setListener(this.nativeRef, nativeSparkScanDeserializerListener);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public NativeSparkScanSettings settingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_settingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public NativeSparkScan sparkScanFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue) {
            return native_sparkScanFromJson(this.nativeRef, nativeDataCaptureContext, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public NativeSparkScanSettings updateSettingsFromJson(NativeSparkScanSettings nativeSparkScanSettings, NativeJsonValue nativeJsonValue) {
            return native_updateSettingsFromJson(this.nativeRef, nativeSparkScanSettings, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.barcode.spark.internal.module.serialization.NativeSparkScanDeserializer
        public NativeSparkScan updateSparkScanFromJson(NativeSparkScan nativeSparkScan, NativeJsonValue nativeJsonValue) {
            return native_updateSparkScanFromJson(this.nativeRef, nativeSparkScan, nativeJsonValue);
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

    public static native NativeSparkScanDeserializer create(NativeLocationSelectionDeserializer nativeLocationSelectionDeserializer, NativeSparkScanDeserializerHelper nativeSparkScanDeserializerHelper);

    public abstract NativeDataCaptureModeDeserializer asDataCaptureModeDeserializer();

    public abstract NativeSparkScanDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setListener(NativeSparkScanDeserializerListener nativeSparkScanDeserializerListener);

    public abstract NativeSparkScanSettings settingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeSparkScan sparkScanFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

    public abstract NativeSparkScanSettings updateSettingsFromJson(NativeSparkScanSettings nativeSparkScanSettings, NativeJsonValue nativeJsonValue);

    public abstract NativeSparkScan updateSparkScanFromJson(NativeSparkScan nativeSparkScan, NativeJsonValue nativeJsonValue);
}
