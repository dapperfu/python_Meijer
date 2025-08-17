package com.scandit.datacapture.barcode.filter.capture;

import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeFilterSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeFilterSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f120922a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_getExcludedCodesRegex(long j10);

        private native HashMap<Symbology, HashSet<Short>> native_getExcludedSymbolCounts(long j10);

        private native HashSet<Symbology> native_getExcludedSymbologies(long j10);

        private native boolean native_isExcludeEan13(long j10);

        private native boolean native_isExcludeUpca(long j10);

        private native void native_setExcludeEan13(long j10, boolean z10);

        private native void native_setExcludeUpca(long j10, boolean z10);

        private native void native_setExcludedCodesRegex(long j10, String str);

        private native void native_setExcludedSymbolCounts(long j10, HashMap<Symbology, HashSet<Short>> map);

        private native void native_setExcludedSymbologies(long j10, HashSet<Symbology> hashSet);

        private native void native_updateFromJson(long j10, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public String getExcludedCodesRegex() {
            return native_getExcludedCodesRegex(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public HashMap<Symbology, HashSet<Short>> getExcludedSymbolCounts() {
            return native_getExcludedSymbolCounts(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public HashSet<Symbology> getExcludedSymbologies() {
            return native_getExcludedSymbologies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public boolean isExcludeEan13() {
            return native_isExcludeEan13(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public boolean isExcludeUpca() {
            return native_isExcludeUpca(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public void setExcludeEan13(boolean z10) {
            native_setExcludeEan13(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public void setExcludeUpca(boolean z10) {
            native_setExcludeUpca(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public void setExcludedCodesRegex(String str) {
            native_setExcludedCodesRegex(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public void setExcludedSymbolCounts(HashMap<Symbology, HashSet<Short>> map) {
            native_setExcludedSymbolCounts(this.nativeRef, map);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
        public void setExcludedSymbologies(HashSet<Symbology> hashSet) {
            native_setExcludedSymbologies(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.filter.capture.NativeBarcodeFilterSettings
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

    public static native NativeBarcodeFilterSettings create();

    public static native NativeBarcodeFilterSettings fromJson(NativeJsonValue nativeJsonValue);

    public abstract String getExcludedCodesRegex();

    public abstract HashMap<Symbology, HashSet<Short>> getExcludedSymbolCounts();

    public abstract HashSet<Symbology> getExcludedSymbologies();

    public abstract boolean isExcludeEan13();

    public abstract boolean isExcludeUpca();

    public abstract void setExcludeEan13(boolean z10);

    public abstract void setExcludeUpca(boolean z10);

    public abstract void setExcludedCodesRegex(String str);

    public abstract void setExcludedSymbolCounts(HashMap<Symbology, HashSet<Short>> map);

    public abstract void setExcludedSymbologies(HashSet<Symbology> hashSet);

    public abstract void updateFromJson(NativeJsonValue nativeJsonValue);
}
