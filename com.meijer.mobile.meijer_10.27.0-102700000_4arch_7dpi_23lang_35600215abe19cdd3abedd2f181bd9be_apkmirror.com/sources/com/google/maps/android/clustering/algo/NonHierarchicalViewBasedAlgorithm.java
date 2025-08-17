package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes7.dex */
public class NonHierarchicalViewBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> implements ScreenBasedAlgorithm<T> {
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private LatLng mMapCenter;
    private int mViewHeight;
    private int mViewWidth;

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public boolean shouldReclusterOnMapMovement() {
        return true;
    }

    private Bounds getVisibleBounds(float f10) {
        LatLng latLng = this.mMapCenter;
        if (latLng == null) {
            return new Bounds(0.0d, 0.0d, 0.0d, 0.0d);
        }
        Point point = PROJECTION.toPoint(latLng);
        double d10 = f10;
        double dPow = ((this.mViewWidth / Math.pow(2.0d, d10)) / 256.0d) / 2.0d;
        double dPow2 = ((this.mViewHeight / Math.pow(2.0d, d10)) / 256.0d) / 2.0d;
        double d11 = point.f90336x;
        double d12 = point.f90337y;
        return new Bounds(d11 - dPow, d11 + dPow, d12 - dPow2, d12 + dPow2);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm
    protected Collection<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> getClusteringItems(PointQuadTree<NonHierarchicalDistanceBasedAlgorithm.QuadItem<T>> pointQuadTree, float f10) {
        Bounds visibleBounds = getVisibleBounds(f10);
        ArrayList arrayList = new ArrayList();
        double d10 = visibleBounds.minX;
        if (d10 < 0.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(d10 + 1.0d, 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(0.0d, visibleBounds.maxX, visibleBounds.minY, visibleBounds.maxY);
        }
        double d11 = visibleBounds.maxX;
        if (d11 > 1.0d) {
            arrayList.addAll(pointQuadTree.search(new Bounds(0.0d, d11 - 1.0d, visibleBounds.minY, visibleBounds.maxY)));
            visibleBounds = new Bounds(visibleBounds.minX, 1.0d, visibleBounds.minY, visibleBounds.maxY);
        }
        arrayList.addAll(pointQuadTree.search(visibleBounds));
        return arrayList;
    }

    @Override // com.google.maps.android.clustering.algo.ScreenBasedAlgorithm
    public void onCameraChange(CameraPosition cameraPosition) {
        this.mMapCenter = cameraPosition.f84806a;
    }

    public void updateViewSize(int i10, int i11) {
        this.mViewWidth = i10;
        this.mViewHeight = i11;
    }

    public NonHierarchicalViewBasedAlgorithm(int i10, int i11) {
        this.mViewWidth = i10;
        this.mViewHeight = i11;
    }
}
