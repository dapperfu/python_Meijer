package com.scandit.datacapture.core.internal.sdk.engine;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativePropertyDataInt {
    final int defaultValue;
    final int maxValue;
    final int minValue;
    final int step;

    public int getDefaultValue() {
        return this.defaultValue;
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public int getMinValue() {
        return this.minValue;
    }

    public int getStep() {
        return this.step;
    }

    public String toString() {
        return "NativePropertyDataInt{defaultValue=" + this.defaultValue + ",minValue=" + this.minValue + ",maxValue=" + this.maxValue + ",step=" + this.step + "}";
    }

    public NativePropertyDataInt(int i10, int i11, int i12, int i13) {
        this.defaultValue = i10;
        this.minValue = i11;
        this.maxValue = i12;
        this.step = i13;
    }
}
