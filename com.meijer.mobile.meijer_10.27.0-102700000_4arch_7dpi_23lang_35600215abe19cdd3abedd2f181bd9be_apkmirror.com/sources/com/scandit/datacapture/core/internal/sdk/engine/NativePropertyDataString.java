package com.scandit.datacapture.core.internal.sdk.engine;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import java.util.ArrayList;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativePropertyDataString {
    final String defaultValue;
    final ArrayList<String> supportedValues;

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public ArrayList<String> getSupportedValues() {
        return this.supportedValues;
    }

    public String toString() {
        return "NativePropertyDataString{defaultValue=" + this.defaultValue + ",supportedValues=" + this.supportedValues + "}";
    }

    public NativePropertyDataString(String str, ArrayList<String> arrayList) {
        this.defaultValue = str;
        this.supportedValues = arrayList;
    }
}
