package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeFocusSettings {
    final FocusGestureStrategy focusGestureStrategy;
    final Point manualFocusPoint;
    final float manualLensPosition;
    final NativeJsonValue properties;
    final NativeFocusStrategy selectedFocusStrategy;
    final boolean shouldPreferSmoothAutoFocus;

    public boolean equals(Object obj) {
        NativeJsonValue nativeJsonValue;
        Point point;
        if (!(obj instanceof NativeFocusSettings)) {
            return false;
        }
        NativeFocusSettings nativeFocusSettings = (NativeFocusSettings) obj;
        return this.manualLensPosition == nativeFocusSettings.manualLensPosition && this.selectedFocusStrategy == nativeFocusSettings.selectedFocusStrategy && this.shouldPreferSmoothAutoFocus == nativeFocusSettings.shouldPreferSmoothAutoFocus && (((nativeJsonValue = this.properties) == null && nativeFocusSettings.properties == null) || (nativeJsonValue != null && nativeJsonValue.equals(nativeFocusSettings.properties))) && ((((point = this.manualFocusPoint) == null && nativeFocusSettings.manualFocusPoint == null) || (point != null && point.equals(nativeFocusSettings.manualFocusPoint))) && this.focusGestureStrategy == nativeFocusSettings.focusGestureStrategy);
    }

    public FocusGestureStrategy getFocusGestureStrategy() {
        return this.focusGestureStrategy;
    }

    public Point getManualFocusPoint() {
        return this.manualFocusPoint;
    }

    public float getManualLensPosition() {
        return this.manualLensPosition;
    }

    public NativeJsonValue getProperties() {
        return this.properties;
    }

    public NativeFocusStrategy getSelectedFocusStrategy() {
        return this.selectedFocusStrategy;
    }

    public boolean getShouldPreferSmoothAutoFocus() {
        return this.shouldPreferSmoothAutoFocus;
    }

    public int hashCode() {
        int iHashCode = (((this.selectedFocusStrategy.hashCode() + ((Float.floatToIntBits(this.manualLensPosition) + 527) * 31)) * 31) + (this.shouldPreferSmoothAutoFocus ? 1 : 0)) * 31;
        NativeJsonValue nativeJsonValue = this.properties;
        int iHashCode2 = (iHashCode + (nativeJsonValue == null ? 0 : nativeJsonValue.hashCode())) * 31;
        Point point = this.manualFocusPoint;
        return this.focusGestureStrategy.hashCode() + ((iHashCode2 + (point != null ? point.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "NativeFocusSettings{manualLensPosition=" + this.manualLensPosition + ",selectedFocusStrategy=" + this.selectedFocusStrategy + ",shouldPreferSmoothAutoFocus=" + this.shouldPreferSmoothAutoFocus + ",properties=" + this.properties + ",manualFocusPoint=" + this.manualFocusPoint + ",focusGestureStrategy=" + this.focusGestureStrategy + "}";
    }

    public NativeFocusSettings(float f10, NativeFocusStrategy nativeFocusStrategy, boolean z10, NativeJsonValue nativeJsonValue, Point point, FocusGestureStrategy focusGestureStrategy) {
        this.manualLensPosition = f10;
        this.selectedFocusStrategy = nativeFocusStrategy;
        this.shouldPreferSmoothAutoFocus = z10;
        this.properties = nativeJsonValue;
        this.manualFocusPoint = point;
        this.focusGestureStrategy = focusGestureStrategy;
    }
}
