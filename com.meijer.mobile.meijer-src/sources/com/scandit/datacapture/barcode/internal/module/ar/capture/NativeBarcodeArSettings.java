package com.scandit.datacapture.barcode.internal.module.ar.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodeArSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeArSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122009a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_enableSymbologies(long j10, HashSet<Symbology> hashSet);

        private native boolean native_expectsOnlyUniqueBarcodes(long j10);

        private native Boolean native_getBoolProperty(long j10, String str);

        private native HashSet<Symbology> native_getEnabledSymbologies(long j10);

        private native Integer native_getIntProperty(long j10, String str);

        private native NativeSymbologySettings native_getSymbologySettings(long j10, Symbology symbology);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setExpectsOnlyUniqueBarcodes(long j10, boolean z10);

        private native void native_setIntProperty(long j10, String str, int i10);

        private native void native_setSymbologyEnabled(long j10, Symbology symbology, boolean z10);

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public void enableSymbologies(HashSet<Symbology> hashSet) {
            native_enableSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public boolean expectsOnlyUniqueBarcodes() {
            return native_expectsOnlyUniqueBarcodes(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public Boolean getBoolProperty(String str) {
            return native_getBoolProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public HashSet<Symbology> getEnabledSymbologies() {
            return native_getEnabledSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public Integer getIntProperty(String str) {
            return native_getIntProperty(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public NativeSymbologySettings getSymbologySettings(Symbology symbology) {
            return native_getSymbologySettings(this.nativeRef, symbology);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public void setExpectsOnlyUniqueBarcodes(boolean z10) {
            native_setExpectsOnlyUniqueBarcodes(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
        public void setIntProperty(String str, int i10) {
            native_setIntProperty(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.ar.capture.NativeBarcodeArSettings
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

    public static native NativeBarcodeArSettings create();

    public static native NativeBarcodeArSettings fromJson(NativeJsonValue nativeJsonValue);

    public abstract void enableSymbologies(HashSet<Symbology> hashSet);

    public abstract boolean expectsOnlyUniqueBarcodes();

    public abstract Boolean getBoolProperty(String str);

    public abstract HashSet<Symbology> getEnabledSymbologies();

    public abstract Integer getIntProperty(String str);

    public abstract NativeSymbologySettings getSymbologySettings(Symbology symbology);

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setExpectsOnlyUniqueBarcodes(boolean z10);

    public abstract void setIntProperty(String str, int i10);

    public abstract void setSymbologyEnabled(Symbology symbology, boolean z10);
}
