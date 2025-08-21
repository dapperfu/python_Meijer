package com.scandit.datacapture.barcode.internal.module.capture;

import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.engine.NativeProperty;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.ScanIntention;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeCaptureSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeCaptureSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122227a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_asJson(long j10, boolean z10);

        private native void native_enableSymbologies(long j10, HashSet<Symbology> hashSet);

        private native void native_enableSymbologiesForCompositeTypes(long j10, EnumSet<CompositeType> enumSet);

        private native HashMap<String, ArrayList<NativeProperty>> native_getAllProperties(long j10);

        private native BatterySavingMode native_getBatterySavingMode(long j10);

        private native Boolean native_getBoolProperty(long j10, String str);

        private native int native_getCodeDuplicateFilterMilliseconds(long j10);

        private native EnumSet<CompositeType> native_getEnabledCompositeTypesBits(long j10);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j10);

        private native Integer native_getIntProperty(long j10, String str);

        private native NativeLocationSelection native_getLocationSelection(long j10);

        private native ScanIntention native_getScanIntention(long j10);

        private native NativeSymbologySettings native_getSymbologySettings(long j10, Symbology symbology);

        private native void native_setArucoDictionary(long j10, NativeArucoDictionary nativeArucoDictionary);

        private native void native_setBatterySavingMode(long j10, BatterySavingMode batterySavingMode);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setCodeDuplicateFilterMilliseconds(long j10, int i10);

        private native void native_setEnabledCompositeTypesBits(long j10, EnumSet<CompositeType> enumSet);

        private native void native_setFloatProperty(long j10, String str, float f10);

        private native void native_setIntProperty(long j10, String str, int i10);

        private native void native_setLocationSelection(long j10, NativeLocationSelection nativeLocationSelection);

        private native void native_setScanIntention(long j10, ScanIntention scanIntention);

        private native void native_setStringProperty(long j10, String str, String str2);

        private native void native_setSymbologyEnabled(long j10, Symbology symbology, boolean z10);

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public String asJson(boolean z10) {
            return native_asJson(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void enableSymbologiesForCompositeTypes(EnumSet<CompositeType> enumSet) {
            native_enableSymbologiesForCompositeTypes(this.nativeRef, enumSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public HashMap<String, ArrayList<NativeProperty>> getAllProperties() {
            return native_getAllProperties(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public BatterySavingMode getBatterySavingMode() {
            return native_getBatterySavingMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public Boolean getBoolProperty(String str) {
            return native_getBoolProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public int getCodeDuplicateFilterMilliseconds() {
            return native_getCodeDuplicateFilterMilliseconds(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public EnumSet<CompositeType> getEnabledCompositeTypesBits() {
            return native_getEnabledCompositeTypesBits(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public Integer getIntProperty(String str) {
            return native_getIntProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public NativeLocationSelection getLocationSelection() {
            return native_getLocationSelection(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public ScanIntention getScanIntention() {
            return native_getScanIntention(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary) {
            native_setArucoDictionary(this.nativeRef, nativeArucoDictionary);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setBatterySavingMode(BatterySavingMode batterySavingMode) {
            native_setBatterySavingMode(this.nativeRef, batterySavingMode);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setCodeDuplicateFilterMilliseconds(int i10) {
            native_setCodeDuplicateFilterMilliseconds(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setEnabledCompositeTypesBits(EnumSet<CompositeType> enumSet) {
            native_setEnabledCompositeTypesBits(this.nativeRef, enumSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setFloatProperty(String str, float f10) {
            native_setFloatProperty(this.nativeRef, str, f10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setIntProperty(String str, int i10) {
            native_setIntProperty(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setLocationSelection(NativeLocationSelection nativeLocationSelection) {
            native_setLocationSelection(this.nativeRef, nativeLocationSelection);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setScanIntention(ScanIntention scanIntention) {
            native_setScanIntention(this.nativeRef, scanIntention);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
        public void setStringProperty(String str, String str2) {
            native_setStringProperty(this.nativeRef, str, str2);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings
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

    public static native NativeBarcodeCaptureSettings create();

    public static native NativeBarcodeCaptureSettings createWithPresets(HashSet<CapturePreset> hashSet);

    public abstract String asJson(boolean z10);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract void enableSymbologiesForCompositeTypes(EnumSet<CompositeType> enumSet);

    public abstract HashMap<String, ArrayList<NativeProperty>> getAllProperties();

    public abstract BatterySavingMode getBatterySavingMode();

    public abstract Boolean getBoolProperty(String str);

    public abstract int getCodeDuplicateFilterMilliseconds();

    public abstract EnumSet<CompositeType> getEnabledCompositeTypesBits();

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract Integer getIntProperty(String str);

    public abstract NativeLocationSelection getLocationSelection();

    public abstract ScanIntention getScanIntention();

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary);

    public abstract void setBatterySavingMode(BatterySavingMode batterySavingMode);

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setCodeDuplicateFilterMilliseconds(int i10);

    public abstract void setEnabledCompositeTypesBits(EnumSet<CompositeType> enumSet);

    public abstract void setFloatProperty(String str, float f10);

    public abstract void setIntProperty(String str, int i10);

    public abstract void setLocationSelection(NativeLocationSelection nativeLocationSelection);

    public abstract void setScanIntention(ScanIntention scanIntention);

    public abstract void setStringProperty(String str, String str2);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z10);
}
