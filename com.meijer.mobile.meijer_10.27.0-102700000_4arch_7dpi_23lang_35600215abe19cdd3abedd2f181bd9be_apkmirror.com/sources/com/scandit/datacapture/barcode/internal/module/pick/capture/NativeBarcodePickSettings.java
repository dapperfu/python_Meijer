package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.barcode.internal.sdk.data.NativeArucoDictionary;
import com.scandit.datacapture.core.internal.sdk.engine.NativeProperty;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122424a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_enableSymbologies(long j10, HashSet<Symbology> hashSet);

        private native HashMap<String, ArrayList<NativeProperty>> native_getAllProperties(long j10);

        private native Boolean native_getBoolProperty(long j10, String str);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j10);

        private native NativeBarcodeFilterSettings native_getFilterSettings(long j10);

        private native boolean native_getHapticEnabled(long j10);

        private native Integer native_getIntProperty(long j10, String str);

        private native boolean native_getShouldEnableCaching(long j10);

        private native boolean native_getSoundEnabled(long j10);

        private native NativeSymbologySettings native_getSymbologySettings(long j10, Symbology symbology);

        private native void native_setArucoDictionary(long j10, NativeArucoDictionary nativeArucoDictionary);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setFilterSettings(long j10, NativeBarcodeFilterSettings nativeBarcodeFilterSettings);

        private native void native_setHapticEnabled(long j10, boolean z10);

        private native void native_setIntProperty(long j10, String str, int i10);

        private native void native_setShouldEnableCaching(long j10, boolean z10);

        private native void native_setSoundEnabled(long j10, boolean z10);

        private native void native_setSymbologyEnabled(long j10, Symbology symbology, boolean z10);

        private native void native_updateFromJson(long j10, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public HashMap<String, ArrayList<NativeProperty>> getAllProperties() {
            return native_getAllProperties(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public Boolean getBoolProperty(String str) {
            return native_getBoolProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public NativeBarcodeFilterSettings getFilterSettings() {
            return native_getFilterSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public boolean getHapticEnabled() {
            return native_getHapticEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public Integer getIntProperty(String str) {
            return native_getIntProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public boolean getShouldEnableCaching() {
            return native_getShouldEnableCaching(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public boolean getSoundEnabled() {
            return native_getSoundEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary) {
            native_setArucoDictionary(this.nativeRef, nativeArucoDictionary);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setFilterSettings(NativeBarcodeFilterSettings nativeBarcodeFilterSettings) {
            native_setFilterSettings(this.nativeRef, nativeBarcodeFilterSettings);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setHapticEnabled(boolean z10) {
            native_setHapticEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setIntProperty(String str, int i10) {
            native_setIntProperty(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setShouldEnableCaching(boolean z10) {
            native_setShouldEnableCaching(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setSoundEnabled(boolean z10) {
            native_setSoundEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z10) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings
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

    public static native NativeBarcodePickSettings create();

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract HashMap<String, ArrayList<NativeProperty>> getAllProperties();

    public abstract Boolean getBoolProperty(String str);

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract NativeBarcodeFilterSettings getFilterSettings();

    public abstract boolean getHapticEnabled();

    public abstract Integer getIntProperty(String str);

    public abstract boolean getShouldEnableCaching();

    public abstract boolean getSoundEnabled();

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setArucoDictionary(NativeArucoDictionary nativeArucoDictionary);

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setFilterSettings(NativeBarcodeFilterSettings nativeBarcodeFilterSettings);

    public abstract void setHapticEnabled(boolean z10);

    public abstract void setIntProperty(String str, int i10);

    public abstract void setShouldEnableCaching(boolean z10);

    public abstract void setSoundEnabled(boolean z10);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z10);

    public abstract void updateFromJson(NativeJsonValue nativeJsonValue);
}
