package com.scandit.datacapture.core.common.buffer;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class EncodingRange {
    final int endIndex;
    final String ianaName;
    final int startIndex;

    public boolean equals(Object obj) {
        if (!(obj instanceof EncodingRange)) {
            return false;
        }
        EncodingRange encodingRange = (EncodingRange) obj;
        return this.ianaName.equals(encodingRange.ianaName) && this.startIndex == encodingRange.startIndex && this.endIndex == encodingRange.endIndex;
    }

    public int getEndIndex() {
        return this.endIndex;
    }

    public String getIanaName() {
        return this.ianaName;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return ((((this.ianaName.hashCode() + 527) * 31) + this.startIndex) * 31) + this.endIndex;
    }

    public String toString() {
        return "EncodingRange{ianaName=" + this.ianaName + ",startIndex=" + this.startIndex + ",endIndex=" + this.endIndex + "}";
    }

    public EncodingRange(String str, int i10, int i11) {
        this.ianaName = str;
        this.startIndex = i10;
        this.endIndex = i11;
    }
}
