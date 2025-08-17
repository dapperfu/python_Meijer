package com.scandit.datacapture.core.internal.sdk.engine;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativePropertyDataFloat {
    final float defaultValue;
    final float maxValue;
    final float minValue;

    public float getDefaultValue() {
        return this.defaultValue;
    }

    public float getMaxValue() {
        return this.maxValue;
    }

    public float getMinValue() {
        return this.minValue;
    }

    public String toString() {
        return "NativePropertyDataFloat{defaultValue=" + this.defaultValue + ",minValue=" + this.minValue + ",maxValue=" + this.maxValue + "}";
    }

    public NativePropertyDataFloat(float f10, float f11, float f12) {
        this.defaultValue = f10;
        this.minValue = f11;
        this.maxValue = f12;
    }
}
