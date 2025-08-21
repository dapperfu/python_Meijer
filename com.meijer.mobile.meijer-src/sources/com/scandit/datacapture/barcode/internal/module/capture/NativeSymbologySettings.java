package com.scandit.datacapture.barcode.internal.module.capture;

import com.scandit.datacapture.barcode.data.Checksum;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSymbologySettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeSymbologySettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122228a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native HashSet<Short> native_getActiveSymbolCounts(long j10);

        private native EnumSet<Checksum> native_getChecksumBits(long j10);

        private native HashSet<String> native_getEnabledExtensions(long j10);

        private native String native_getOcrFallbackRegex(long j10);

        private native Symbology native_getSymbology(long j10);

        private native boolean native_isColorInvertedEnabled(long j10);

        private native boolean native_isEnabled(long j10);

        private native boolean native_isExtensionEnabled(long j10, String str);

        private native void native_setActiveSymbolCounts(long j10, HashSet<Short> hashSet);

        private native void native_setChecksumBits(long j10, EnumSet<Checksum> enumSet);

        private native void native_setColorInvertedEnabled(long j10, boolean z10);

        private native void native_setEnabled(long j10, boolean z10);

        private native void native_setExtensionEnabled(long j10, String str, boolean z10);

        private native void native_setOcrFallbackRegex(long j10, String str);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public HashSet<Short> getActiveSymbolCounts() {
            return native_getActiveSymbolCounts(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public EnumSet<Checksum> getChecksumBits() {
            return native_getChecksumBits(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public HashSet<String> getEnabledExtensions() {
            return native_getEnabledExtensions(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public String getOcrFallbackRegex() {
            return native_getOcrFallbackRegex(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public Symbology getSymbology() {
            return native_getSymbology(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public boolean isColorInvertedEnabled() {
            return native_isColorInvertedEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public boolean isEnabled() {
            return native_isEnabled(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public boolean isExtensionEnabled(String str) {
            return native_isExtensionEnabled(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public void setActiveSymbolCounts(HashSet<Short> hashSet) {
            native_setActiveSymbolCounts(this.nativeRef, hashSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public void setChecksumBits(EnumSet<Checksum> enumSet) {
            native_setChecksumBits(this.nativeRef, enumSet);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public void setColorInvertedEnabled(boolean z10) {
            native_setColorInvertedEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public void setEnabled(boolean z10) {
            native_setEnabled(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public void setExtensionEnabled(String str, boolean z10) {
            native_setExtensionEnabled(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public void setOcrFallbackRegex(String str) {
            native_setOcrFallbackRegex(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.capture.NativeSymbologySettings
        public String toJson() {
            return native_toJson(this.nativeRef);
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

    public abstract HashSet<Short> getActiveSymbolCounts();

    public abstract EnumSet<Checksum> getChecksumBits();

    public abstract HashSet<String> getEnabledExtensions();

    public abstract String getOcrFallbackRegex();

    public abstract Symbology getSymbology();

    public abstract boolean isColorInvertedEnabled();

    public abstract boolean isEnabled();

    public abstract boolean isExtensionEnabled(String str);

    public abstract void setActiveSymbolCounts(HashSet<Short> hashSet);

    public abstract void setChecksumBits(EnumSet<Checksum> enumSet);

    public abstract void setColorInvertedEnabled(boolean z10);

    public abstract void setEnabled(boolean z10);

    public abstract void setExtensionEnabled(String str, boolean z10);

    public abstract void setOcrFallbackRegex(String str);

    public abstract String toJson();
}
