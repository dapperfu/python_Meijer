package com.google.maps.android.heatmaps;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;

/* loaded from: classes7.dex */
public class WeightedLatLng implements PointQuadTree.Item {
    public static final double DEFAULT_INTENSITY = 1.0d;
    private static final SphericalMercatorProjection sProjection = new SphericalMercatorProjection(1.0d);
    private double mIntensity;
    private Point mPoint;

    public WeightedLatLng(LatLng latLng, double d10) {
        this.mPoint = sProjection.toPoint(latLng);
        if (d10 >= 0.0d) {
            this.mIntensity = d10;
        } else {
            this.mIntensity = 1.0d;
        }
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    @Override // com.google.maps.android.quadtree.PointQuadTree.Item
    public Point getPoint() {
        return this.mPoint;
    }

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
