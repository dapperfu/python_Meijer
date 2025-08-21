package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.core.data.ClusteringMode;
import com.scandit.datacapture.core.internal.sdk.engine.NativeProperty;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCountSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCountSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f121669a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_enableSymbologies(long j10, HashSet<Symbology> hashSet);

        private native boolean native_expectsOnlyUniqueBarcodes(long j10);

        private native HashMap<String, ArrayList<NativeProperty>> native_getAllProperties(long j10);

        private native Boolean native_getBoolProperty(long j10, String str);

        private native ClusteringMode native_getClusteringMode(long j10);

        private native boolean native_getEnableUnrecognizedBarcodeDetection(long j10);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j10);

        private native NativeBarcodeFilterSettings native_getFilterSettings(long j10);

        private native Integer native_getIntProperty(long j10, String str);

        private native boolean native_getMappingEnabled(long j10);

        private native boolean native_getShouldUseIMUData(long j10);

        private native NativeSymbologySettings native_getSymbologySettings(long j10, Symbology symbology);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setClusteringMode(long j10, ClusteringMode clusteringMode);

        private native void native_setEnableUnrecognizedBarcodeDetection(long j10, boolean z10);

        private native void native_setExpectsOnlyUniqueBarcodes(long j10, boolean z10);

        private native void native_setIntProperty(long j10, String str, int i10);

        private native void native_setMappingEnabled(long j10, boolean z10);

        private native void native_setShouldDisableModeWhenCaptureListCompleted(long j10, boolean z10);

        private native void native_setShouldUseIMUData(long j10, boolean z10);

        private native void native_setSymbologyEnabled(long j10, Symbology symbology, boolean z10);

        private native boolean native_shouldDisableModeWhenCaptureListCompleted(long j10);

        private native void native_updateFromJson(long j10, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public boolean expectsOnlyUniqueBarcodes() {
            return native_expectsOnlyUniqueBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public HashMap<String, ArrayList<NativeProperty>> getAllProperties() {
            return native_getAllProperties(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public Boolean getBoolProperty(String str) {
            return native_getBoolProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public ClusteringMode getClusteringMode() {
            return native_getClusteringMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public boolean getEnableUnrecognizedBarcodeDetection() {
            return native_getEnableUnrecognizedBarcodeDetection(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public NativeBarcodeFilterSettings getFilterSettings() {
            return native_getFilterSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public Integer getIntProperty(String str) {
            return native_getIntProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public boolean getMappingEnabled() {
            return native_getMappingEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public boolean getShouldUseIMUData() {
            return native_getShouldUseIMUData(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setClusteringMode(ClusteringMode clusteringMode) {
            native_setClusteringMode(this.nativeRef, clusteringMode);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setEnableUnrecognizedBarcodeDetection(boolean z10) {
            native_setEnableUnrecognizedBarcodeDetection(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setExpectsOnlyUniqueBarcodes(boolean z10) {
            native_setExpectsOnlyUniqueBarcodes(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setIntProperty(String str, int i10) {
            native_setIntProperty(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setMappingEnabled(boolean z10) {
            native_setMappingEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setShouldDisableModeWhenCaptureListCompleted(boolean z10) {
            native_setShouldDisableModeWhenCaptureListCompleted(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setShouldUseIMUData(boolean z10) {
            native_setShouldUseIMUData(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z10) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public boolean shouldDisableModeWhenCaptureListCompleted() {
            return native_shouldDisableModeWhenCaptureListCompleted(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings
        public void updateFromJson(NativeJsonValue nativeJsonValue) {
            native_updateFromJson(this.nativeRef, nativeJsonValue);
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

    public static native NativeBarcodeCountSettings create();

    public static native NativeBarcodeCountSettings fromJson(NativeJsonValue nativeJsonValue);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract boolean expectsOnlyUniqueBarcodes();

    public abstract HashMap<String, ArrayList<NativeProperty>> getAllProperties();

    public abstract Boolean getBoolProperty(String str);

    public abstract ClusteringMode getClusteringMode();

    public abstract boolean getEnableUnrecognizedBarcodeDetection();

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract NativeBarcodeFilterSettings getFilterSettings();

    public abstract Integer getIntProperty(String str);

    public abstract boolean getMappingEnabled();

    public abstract boolean getShouldUseIMUData();

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setClusteringMode(ClusteringMode clusteringMode);

    public abstract void setEnableUnrecognizedBarcodeDetection(boolean z10);

    public abstract void setExpectsOnlyUniqueBarcodes(boolean z10);

    public abstract void setIntProperty(String str, int i10);

    public abstract void setMappingEnabled(boolean z10);

    public abstract void setShouldDisableModeWhenCaptureListCompleted(boolean z10);

    public abstract void setShouldUseIMUData(boolean z10);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z10);

    public abstract boolean shouldDisableModeWhenCaptureListCompleted();

    public abstract void updateFromJson(NativeJsonValue nativeJsonValue);
}
