package com.scandit.datacapture.barcode.batch.internal.module.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.core.internal.sdk.engine.NativeProperty;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeTrackingSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeTrackingSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f120479a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_asJson(long j10, boolean z10);

        private native void native_enableSymbologies(long j10, HashSet<Symbology> hashSet);

        private native boolean native_expectsOnlyUniqueBarcodes(long j10);

        private native HashMap<String, ArrayList<NativeProperty>> native_getAllProperties(long j10);

        private native Boolean native_getBoolProperty(long j10, String str);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j10);

        private native Integer native_getIntProperty(long j10, String str);

        private native NativeSymbologySettings native_getSymbologySettings(long j10, Symbology symbology);

        private native void native_setArucoDictionary(long j10, NativeArucoDictionary nativeArucoDictionary);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setExpectsOnlyUniqueBarcodes(long j10, boolean z10);

        private native void native_setIntProperty(long j10, String str, int i10);

        private native void native_setSymbologyEnabled(long j10, Symbology symbology, boolean z10);

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public String asJson(boolean z10) {
            return native_asJson(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public boolean expectsOnlyUniqueBarcodes() {
            return native_expectsOnlyUniqueBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public HashMap<String, ArrayList<NativeProperty>> getAllProperties() {
            return native_getAllProperties(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public Boolean getBoolProperty(String str) {
            return native_getBoolProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public Integer getIntProperty(String str) {
            return native_getIntProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary) {
            native_setArucoDictionary(this.nativeRef, nativeArucoDictionary);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public void setExpectsOnlyUniqueBarcodes(boolean z10) {
            native_setExpectsOnlyUniqueBarcodes(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public void setIntProperty(String str, int i10) {
            native_setIntProperty(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z10) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z10);
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

    public static native NativeBarcodeTrackingSettings create();

    public static native NativeBarcodeTrackingSettings createForScenario(NativeObjectTrackerScenario nativeObjectTrackerScenario);

    public abstract String asJson(boolean z10);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract boolean expectsOnlyUniqueBarcodes();

    public abstract HashMap<String, ArrayList<NativeProperty>> getAllProperties();

    public abstract Boolean getBoolProperty(String str);

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract Integer getIntProperty(String str);

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary);

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setExpectsOnlyUniqueBarcodes(boolean z10);

    public abstract void setIntProperty(String str, int i10);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z10);
}
