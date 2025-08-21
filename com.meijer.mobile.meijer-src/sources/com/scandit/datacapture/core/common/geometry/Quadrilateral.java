package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class Quadrilateral {
    final Point bottomLeft;
    final Point bottomRight;
    final Point topLeft;
    final Point topRight;

    public boolean equals(Object obj) {
        if (!(obj instanceof Quadrilateral)) {
            return false;
        }
        Quadrilateral quadrilateral = (Quadrilateral) obj;
        return this.topLeft.equals(quadrilateral.topLeft) && this.topRight.equals(quadrilateral.topRight) && this.bottomRight.equals(quadrilateral.bottomRight) && this.bottomLeft.equals(quadrilateral.bottomLeft);
    }

    public Point getBottomLeft() {
        return this.bottomLeft;
    }

    public Point getBottomRight() {
        return this.bottomRight;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public Point getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        return this.bottomLeft.hashCode() + ((this.bottomRight.hashCode() + ((this.topRight.hashCode() + ((this.topLeft.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Quadrilateral{topLeft=" + this.topLeft + ",topRight=" + this.topRight + ",bottomRight=" + this.bottomRight + ",bottomLeft=" + this.bottomLeft + "}";
    }

    public Quadrilateral(Point point, Point point2, Point point3, Point point4) {
        this.topLeft = point;
        this.topRight = point2;
        this.bottomRight = point3;
        this.bottomLeft = point4;
    }
}
