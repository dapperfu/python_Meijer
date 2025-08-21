package com.scandit.datacapture.barcode.internal.sdk.data;

import com.scandit.datacapture.barcode.data.Checksum;
import com.scandit.datacapture.barcode.data.Symbology;
import com.scandit.datacapture.core.data.Range;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSymbologyDescription {

    @DjinniGenerated
    public static final class CppProxy extends NativeSymbologyDescription {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124500a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native Range native_getActiveSymbolCountRange(long j10);

        private native HashSet<String> native_getAllExtensions(long j10);

        private native Range native_getDefaultSymbolCountRange(long j10);

        private native String native_getIdentifier(long j10);

        private native HashSet<String> native_getPublicExtensions(long j10);

        private native String native_getReadableName(long j10);

        private native EnumSet<Checksum> native_getSupportedChecksumsBits(long j10);

        private native Symbology native_getSymbology(long j10);

        private native boolean native_isAvailable(long j10);

        private native boolean native_isColorInvertible(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public Range getActiveSymbolCountRange() {
            return native_getActiveSymbolCountRange(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public HashSet<String> getAllExtensions() {
            return native_getAllExtensions(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public Range getDefaultSymbolCountRange() {
            return native_getDefaultSymbolCountRange(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public String getIdentifier() {
            return native_getIdentifier(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public HashSet<String> getPublicExtensions() {
            return native_getPublicExtensions(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public String getReadableName() {
            return native_getReadableName(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public EnumSet<Checksum> getSupportedChecksumsBits() {
            return native_getSupportedChecksumsBits(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public Symbology getSymbology() {
            return native_getSymbology(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public boolean isAvailable() {
            return native_isAvailable(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
        public boolean isColorInvertible() {
            return native_isColorInvertible(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeSymbologyDescription
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

    public static native NativeSymbologyDescription create(Symbology symbology);

    public static native NativeSymbologyDescription symbologyDescriptionFromIdentifier(String str);

    public static native Symbology symbologyFromIdentifier(String str);

    public abstract Range getActiveSymbolCountRange();

    public abstract HashSet<String> getAllExtensions();

    public abstract Range getDefaultSymbolCountRange();

    public abstract String getIdentifier();

    public abstract HashSet<String> getPublicExtensions();

    public abstract String getReadableName();

    public abstract EnumSet<Checksum> getSupportedChecksumsBits();

    public abstract Symbology getSymbology();

    public abstract boolean isAvailable();

    public abstract boolean isColorInvertible();

    public abstract String toJson();
}
