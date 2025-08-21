package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class Rect {
    final Point origin;
    final Size2 size;

    public boolean equals(Object obj) {
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return this.origin.equals(rect.origin) && this.size.equals(rect.size);
    }

    public Point getOrigin() {
        return this.origin;
    }

    public Size2 getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.size.hashCode() + ((this.origin.hashCode() + 527) * 31);
    }

    public String toString() {
        return "Rect{origin=" + this.origin + ",size=" + this.size + "}";
    }

    public Rect(Point point, Size2 size2) {
        this.origin = point;
        this.size = size2;
    }
}
