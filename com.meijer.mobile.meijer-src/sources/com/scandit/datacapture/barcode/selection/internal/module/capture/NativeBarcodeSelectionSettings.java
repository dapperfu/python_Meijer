package com.scandit.datacapture.barcode.selection.internal.module.capture;

import com.scandit.datacapture.barcode.data.CapturePreset;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeSelectionSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSelectionSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124792a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_enableSymbologies(long j10, HashSet<Symbology> hashSet);

        private native Boolean native_getBoolProperty(long j10, String str);

        private native int native_getCodeDuplicateFilterMilliseconds(long j10);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j10);

        private native Integer native_getIntProperty(long j10, String str);

        private native NativeSelectionType native_getSelectionType(long j10);

        private native boolean native_getSingleBarcodeAutoDetectionEnabled(long j10);

        private native boolean native_getSwipeGesturesEnabled(long j10);

        private native NativeSymbologySettings native_getSymbologySettings(long j10, Symbology symbology);

        private native boolean native_getTapGestureForSelectionEnabled(long j10);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setCodeDuplicateFilterMilliseconds(long j10, int i10);

        private native void native_setFloatProperty(long j10, String str, float f10);

        private native void native_setIntProperty(long j10, String str, int i10);

        private native void native_setSelectionType(long j10, NativeSelectionType nativeSelectionType);

        private native void native_setSingleBarcodeAutoDetectionEnabled(long j10, boolean z10);

        private native void native_setStringProperty(long j10, String str, String str2);

        private native void native_setSwipeGesturesEnabled(long j10, boolean z10);

        private native void native_setSymbologyEnabled(long j10, Symbology symbology, boolean z10);

        private native void native_setTapGestureForSelectionEnabled(long j10, boolean z10);

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public Boolean getBoolProperty(String str) {
            return native_getBoolProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public int getCodeDuplicateFilterMilliseconds() {
            return native_getCodeDuplicateFilterMilliseconds(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public Integer getIntProperty(String str) {
            return native_getIntProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public NativeSelectionType getSelectionType() {
            return native_getSelectionType(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public boolean getSingleBarcodeAutoDetectionEnabled() {
            return native_getSingleBarcodeAutoDetectionEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public boolean getSwipeGesturesEnabled() {
            return native_getSwipeGesturesEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public boolean getTapGestureForSelectionEnabled() {
            return native_getTapGestureForSelectionEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setCodeDuplicateFilterMilliseconds(int i10) {
            native_setCodeDuplicateFilterMilliseconds(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setFloatProperty(String str, float f10) {
            native_setFloatProperty(this.nativeRef, str, f10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setIntProperty(String str, int i10) {
            native_setIntProperty(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSelectionType(NativeSelectionType nativeSelectionType) {
            native_setSelectionType(this.nativeRef, nativeSelectionType);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSingleBarcodeAutoDetectionEnabled(boolean z10) {
            native_setSingleBarcodeAutoDetectionEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setStringProperty(String str, String str2) {
            native_setStringProperty(this.nativeRef, str, str2);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSwipeGesturesEnabled(boolean z10) {
            native_setSwipeGesturesEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setSymbologyEnabled(Symbology symbology, boolean z10) {
            native_setSymbologyEnabled(this.nativeRef, symbology, z10);
        }

        @Override // com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings
        public void setTapGestureForSelectionEnabled(boolean z10) {
            native_setTapGestureForSelectionEnabled(this.nativeRef, z10);
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

    public static native NativeBarcodeSelectionSettings create();

    public static native NativeBarcodeSelectionSettings createWithPresets(HashSet<CapturePreset> hashSet);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract Boolean getBoolProperty(String str);

    public abstract int getCodeDuplicateFilterMilliseconds();

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract Integer getIntProperty(String str);

    public abstract NativeSelectionType getSelectionType();

    public abstract boolean getSingleBarcodeAutoDetectionEnabled();

    public abstract boolean getSwipeGesturesEnabled();

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract boolean getTapGestureForSelectionEnabled();

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setCodeDuplicateFilterMilliseconds(int i10);

    public abstract void setFloatProperty(String str, float f10);

    public abstract void setIntProperty(String str, int i10);

    public abstract void setSelectionType(NativeSelectionType nativeSelectionType);

    public abstract void setSingleBarcodeAutoDetectionEnabled(boolean z10);

    public abstract void setStringProperty(String str, String str2);

    public abstract void setSwipeGesturesEnabled(boolean z10);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z10);

    public abstract void setTapGestureForSelectionEnabled(boolean z10);
}
