package com.google.maps.android.geometry;

/* loaded from: classes7.dex */
public class Bounds {
    public final double maxX;
    public final double maxY;
    public final double midX;
    public final double midY;
    public final double minX;
    public final double minY;

    public boolean contains(double d10, double d11) {
        return this.minX <= d10 && d10 <= this.maxX && this.minY <= d11 && d11 <= this.maxY;
    }

    public boolean intersects(double d10, double d11, double d12, double d13) {
        return d10 < this.maxX && this.minX < d11 && d12 < this.maxY && this.minY < d13;
    }

    public boolean contains(Point point) {
        return contains(point.f90336x, point.f90337y);
    }

    public boolean intersects(Bounds bounds) {
        return intersects(bounds.minX, bounds.maxX, bounds.minY, bounds.maxY);
    }

    public Bounds(double d10, double d11, double d12, double d13) {
        this.minX = d10;
        this.minY = d12;
        this.maxX = d11;
        this.maxY = d13;
        this.midX = (d10 + d11) / 2.0d;
        this.midY = (d12 + d13) / 2.0d;
    }

    public boolean contains(Bounds bounds) {
        return bounds.minX >= this.minX && bounds.maxX <= this.maxX && bounds.minY >= this.minY && bounds.maxY <= this.maxY;
    }
}
