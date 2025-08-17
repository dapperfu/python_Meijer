package com.scandit.datacapture.core.internal.sdk.json;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeJsonValue {

    @DjinniGenerated
    public static final class CppProxy extends NativeJsonValue {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125500a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeJsonValue native_asArray(long j10);

        private native boolean native_asBool(long j10);

        private native NativeBrush native_asBrush(long j10);

        private native NativeColor native_asColor(long j10);

        private native double native_asDouble(long j10);

        private native float native_asFloat(long j10);

        private native FloatWithUnit native_asFloatWithUnit(long j10);

        private native int native_asInt(long j10);

        private native MarginsWithUnit native_asMarginsWithUnit(long j10);

        private native NativeJsonValue native_asObject(long j10);

        private native PointWithUnit native_asPointWithUnit(long j10);

        private native String native_asString(long j10);

        private native boolean native_contains(long j10, String str);

        private native boolean native_containsNull(long j10, String str);

        private native String native_getAbsolutePath(long j10);

        private native NativeJsonValue native_getArrayForKey(long j10, String str);

        private native NativeJsonValue native_getArrayForKeyOrDefault(long j10, String str, NativeJsonValue nativeJsonValue);

        private native boolean native_getBoolForKey(long j10, String str);

        private native boolean native_getBoolForKeyOrDefault(long j10, String str, boolean z10);

        private native NativeBrush native_getBrushForKey(long j10, String str);

        private native NativeBrush native_getBrushForKeyOrDefault(long j10, String str, NativeBrush nativeBrush);

        private native NativeColor native_getColorForKey(long j10, String str);

        private native NativeColor native_getColorForKeyOrDefault(long j10, String str, NativeColor nativeColor);

        private native double native_getDoubleForKey(long j10, String str);

        private native double native_getDoubleForKeyOrDefault(long j10, String str, double d10);

        private native float native_getFloatForKey(long j10, String str);

        private native float native_getFloatForKeyOrDefault(long j10, String str, float f10);

        private native FloatWithUnit native_getFloatWithUnitForKey(long j10, String str);

        private native FloatWithUnit native_getFloatWithUnitForKeyOrDefault(long j10, String str, FloatWithUnit floatWithUnit);

        private native NativeJsonValue native_getForIndex(long j10, int i10);

        private native NativeJsonValue native_getForKey(long j10, String str);

        private native int native_getIntForKey(long j10, String str);

        private native int native_getIntForKeyOrDefault(long j10, String str, int i10);

        private native MarginsWithUnit native_getMarginsWithUnitForKey(long j10, String str);

        private native MarginsWithUnit native_getMarginsWithUnitForKeyOrDefault(long j10, String str, MarginsWithUnit marginsWithUnit);

        private native NativeJsonValue native_getObjectForKey(long j10, String str);

        private native NativeJsonValue native_getObjectForKeyOrDefault(long j10, String str, NativeJsonValue nativeJsonValue);

        private native NativeColor native_getOptionalColorForKeyOrDefault(long j10, String str, NativeColor nativeColor);

        private native String native_getOptionalStringForKeyOrDefault(long j10, String str, String str2);

        private native PointWithUnit native_getPointWithUnitForKey(long j10, String str);

        private native PointWithUnit native_getPointWithUnitForKeyOrDefault(long j10, String str, PointWithUnit pointWithUnit);

        private native String native_getStringForKey(long j10, String str);

        private native String native_getStringForKeyOrDefault(long j10, String str, String str2);

        private native ArrayList<String> native_getWarnings(long j10);

        private native boolean native_isArray(long j10);

        private native boolean native_isBool(long j10);

        private native boolean native_isInt(long j10);

        private native boolean native_isNumeric(long j10);

        private native boolean native_isObject(long j10);

        private native boolean native_isString(long j10);

        private native boolean native_isUsed(long j10);

        private native void native_removeKeys(long j10, ArrayList<String> arrayList);

        private native void native_setUsed(long j10, boolean z10);

        private native long native_size(long j10);

        private native String native_toString(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue asArray() {
            return native_asArray(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean asBool() {
            return native_asBool(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeBrush asBrush() {
            return native_asBrush(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeColor asColor() {
            return native_asColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public double asDouble() {
            return native_asDouble(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public float asFloat() {
            return native_asFloat(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public FloatWithUnit asFloatWithUnit() {
            return native_asFloatWithUnit(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public int asInt() {
            return native_asInt(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public MarginsWithUnit asMarginsWithUnit() {
            return native_asMarginsWithUnit(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue asObject() {
            return native_asObject(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public PointWithUnit asPointWithUnit() {
            return native_asPointWithUnit(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public String asString() {
            return native_asString(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean contains(String str) {
            return native_contains(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean containsNull(String str) {
            return native_containsNull(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public String getAbsolutePath() {
            return native_getAbsolutePath(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue getArrayForKey(String str) {
            return native_getArrayForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue getArrayForKeyOrDefault(String str, NativeJsonValue nativeJsonValue) {
            return native_getArrayForKeyOrDefault(this.nativeRef, str, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean getBoolForKey(String str) {
            return native_getBoolForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean getBoolForKeyOrDefault(String str, boolean z10) {
            return native_getBoolForKeyOrDefault(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeBrush getBrushForKey(String str) {
            return native_getBrushForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeBrush getBrushForKeyOrDefault(String str, NativeBrush nativeBrush) {
            return native_getBrushForKeyOrDefault(this.nativeRef, str, nativeBrush);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeColor getColorForKey(String str) {
            return native_getColorForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeColor getColorForKeyOrDefault(String str, NativeColor nativeColor) {
            return native_getColorForKeyOrDefault(this.nativeRef, str, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public double getDoubleForKey(String str) {
            return native_getDoubleForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public double getDoubleForKeyOrDefault(String str, double d10) {
            return native_getDoubleForKeyOrDefault(this.nativeRef, str, d10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public float getFloatForKey(String str) {
            return native_getFloatForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public float getFloatForKeyOrDefault(String str, float f10) {
            return native_getFloatForKeyOrDefault(this.nativeRef, str, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public FloatWithUnit getFloatWithUnitForKey(String str) {
            return native_getFloatWithUnitForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public FloatWithUnit getFloatWithUnitForKeyOrDefault(String str, FloatWithUnit floatWithUnit) {
            return native_getFloatWithUnitForKeyOrDefault(this.nativeRef, str, floatWithUnit);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue getForIndex(int i10) {
            return native_getForIndex(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue getForKey(String str) {
            return native_getForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public int getIntForKey(String str) {
            return native_getIntForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public int getIntForKeyOrDefault(String str, int i10) {
            return native_getIntForKeyOrDefault(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public MarginsWithUnit getMarginsWithUnitForKey(String str) {
            return native_getMarginsWithUnitForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public MarginsWithUnit getMarginsWithUnitForKeyOrDefault(String str, MarginsWithUnit marginsWithUnit) {
            return native_getMarginsWithUnitForKeyOrDefault(this.nativeRef, str, marginsWithUnit);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue getObjectForKey(String str) {
            return native_getObjectForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeJsonValue getObjectForKeyOrDefault(String str, NativeJsonValue nativeJsonValue) {
            return native_getObjectForKeyOrDefault(this.nativeRef, str, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public NativeColor getOptionalColorForKeyOrDefault(String str, NativeColor nativeColor) {
            return native_getOptionalColorForKeyOrDefault(this.nativeRef, str, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public String getOptionalStringForKeyOrDefault(String str, String str2) {
            return native_getOptionalStringForKeyOrDefault(this.nativeRef, str, str2);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public PointWithUnit getPointWithUnitForKey(String str) {
            return native_getPointWithUnitForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public PointWithUnit getPointWithUnitForKeyOrDefault(String str, PointWithUnit pointWithUnit) {
            return native_getPointWithUnitForKeyOrDefault(this.nativeRef, str, pointWithUnit);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public String getStringForKey(String str) {
            return native_getStringForKey(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public String getStringForKeyOrDefault(String str, String str2) {
            return native_getStringForKeyOrDefault(this.nativeRef, str, str2);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean isArray() {
            return native_isArray(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean isBool() {
            return native_isBool(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean isInt() {
            return native_isInt(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean isNumeric() {
            return native_isNumeric(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean isObject() {
            return native_isObject(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean isString() {
            return native_isString(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public boolean isUsed() {
            return native_isUsed(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public void removeKeys(ArrayList<String> arrayList) {
            native_removeKeys(this.nativeRef, arrayList);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public void setUsed(boolean z10) {
            native_setUsed(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public long size() {
            return native_size(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue
        public String toString() {
            return native_toString(this.nativeRef);
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

    public static native NativeJsonValue fromString(String str);

    public abstract NativeJsonValue asArray();

    public abstract boolean asBool();

    public abstract NativeBrush asBrush();

    public abstract NativeColor asColor();

    public abstract double asDouble();

    public abstract float asFloat();

    public abstract FloatWithUnit asFloatWithUnit();

    public abstract int asInt();

    public abstract MarginsWithUnit asMarginsWithUnit();

    public abstract NativeJsonValue asObject();

    public abstract PointWithUnit asPointWithUnit();

    public abstract String asString();

    public abstract boolean contains(String str);

    public abstract boolean containsNull(String str);

    public abstract String getAbsolutePath();

    public abstract NativeJsonValue getArrayForKey(String str);

    public abstract NativeJsonValue getArrayForKeyOrDefault(String str, NativeJsonValue nativeJsonValue);

    public abstract boolean getBoolForKey(String str);

    public abstract boolean getBoolForKeyOrDefault(String str, boolean z10);

    public abstract NativeBrush getBrushForKey(String str);

    public abstract NativeBrush getBrushForKeyOrDefault(String str, NativeBrush nativeBrush);

    public abstract NativeColor getColorForKey(String str);

    public abstract NativeColor getColorForKeyOrDefault(String str, NativeColor nativeColor);

    public abstract double getDoubleForKey(String str);

    public abstract double getDoubleForKeyOrDefault(String str, double d10);

    public abstract float getFloatForKey(String str);

    public abstract float getFloatForKeyOrDefault(String str, float f10);

    public abstract FloatWithUnit getFloatWithUnitForKey(String str);

    public abstract FloatWithUnit getFloatWithUnitForKeyOrDefault(String str, FloatWithUnit floatWithUnit);

    public abstract NativeJsonValue getForIndex(int i10);

    public abstract NativeJsonValue getForKey(String str);

    public abstract int getIntForKey(String str);

    public abstract int getIntForKeyOrDefault(String str, int i10);

    public abstract MarginsWithUnit getMarginsWithUnitForKey(String str);

    public abstract MarginsWithUnit getMarginsWithUnitForKeyOrDefault(String str, MarginsWithUnit marginsWithUnit);

    public abstract NativeJsonValue getObjectForKey(String str);

    public abstract NativeJsonValue getObjectForKeyOrDefault(String str, NativeJsonValue nativeJsonValue);

    public abstract NativeColor getOptionalColorForKeyOrDefault(String str, NativeColor nativeColor);

    public abstract String getOptionalStringForKeyOrDefault(String str, String str2);

    public abstract PointWithUnit getPointWithUnitForKey(String str);

    public abstract PointWithUnit getPointWithUnitForKeyOrDefault(String str, PointWithUnit pointWithUnit);

    public abstract String getStringForKey(String str);

    public abstract String getStringForKeyOrDefault(String str, String str2);

    public abstract ArrayList<String> getWarnings();

    public abstract boolean isArray();

    public abstract boolean isBool();

    public abstract boolean isInt();

    public abstract boolean isNumeric();

    public abstract boolean isObject();

    public abstract boolean isString();

    public abstract boolean isUsed();

    public abstract void removeKeys(ArrayList<String> arrayList);

    public abstract void setUsed(boolean z10);

    public abstract long size();

    public abstract String toString();
}
