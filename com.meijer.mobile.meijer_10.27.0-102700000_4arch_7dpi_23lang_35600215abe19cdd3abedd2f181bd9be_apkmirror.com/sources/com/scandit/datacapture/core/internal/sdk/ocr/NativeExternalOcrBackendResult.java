package com.scandit.datacapture.core.internal.sdk.ocr;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeExternalOcrBackendResult {
    final Quadrilateral location;
    final String value;

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeExternalOcrBackendResult)) {
            return false;
        }
        NativeExternalOcrBackendResult nativeExternalOcrBackendResult = (NativeExternalOcrBackendResult) obj;
        return this.value.equals(nativeExternalOcrBackendResult.value) && this.location.equals(nativeExternalOcrBackendResult.location);
    }

    public Quadrilateral getLocation() {
        return this.location;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.location.hashCode() + ((this.value.hashCode() + 527) * 31);
    }

    public String toString() {
        return "NativeExternalOcrBackendResult{value=" + this.value + ",location=" + this.location + "}";
    }

    public NativeExternalOcrBackendResult(String str, Quadrilateral quadrilateral) {
        this.value = str;
        this.location = quadrilateral;
    }
}
