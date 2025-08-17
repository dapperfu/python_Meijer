package com.scandit.datacapture.core.internal.module.device;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeBatteryData {
    final int percentage;

    public int getPercentage() {
        return this.percentage;
    }

    public String toString() {
        return "NativeBatteryData{percentage=" + this.percentage + "}";
    }

    public NativeBatteryData(int i10) {
        this.percentage = i10;
    }
}
