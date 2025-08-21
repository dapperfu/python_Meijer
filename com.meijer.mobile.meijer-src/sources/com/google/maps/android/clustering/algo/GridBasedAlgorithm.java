package com.google.maps.android.clustering.algo;

import Z.C;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class GridBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_GRID_SIZE = 100;
    private int mGridSize = 100;
    private final Set<T> mItems = Collections.synchronizedSet(new HashSet());

    private static long getCoord(long j10, double d10, double d11) {
        return (long) ((j10 * Math.floor(d10)) + Math.floor(d11));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t10) {
        return this.mItems.add(t10);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        return this.mItems.addAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mItems.clear();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        long j10;
        long jCeil = (long) Math.ceil((Math.pow(2.0d, f10) * 256.0d) / this.mGridSize);
        SphericalMercatorProjection sphericalMercatorProjection = new SphericalMercatorProjection(jCeil);
        HashSet hashSet = new HashSet();
        C c10 = new C();
        synchronized (this.mItems) {
            try {
                for (T t10 : this.mItems) {
                    Point point = sphericalMercatorProjection.toPoint(t10.getPosition());
                    long coord = getCoord(jCeil, point.f91175x, point.f91176y);
                    StaticCluster staticCluster = (StaticCluster) c10.d(coord);
                    if (staticCluster == null) {
                        j10 = jCeil;
                        staticCluster = new StaticCluster(sphericalMercatorProjection.toLatLng(new com.google.maps.android.geometry.Point(Math.floor(point.f91175x) + 0.5d, Math.floor(point.f91176y) + 0.5d)));
                        c10.i(coord, staticCluster);
                        hashSet.add(staticCluster);
                    } else {
                        j10 = jCeil;
                    }
                    staticCluster.add(t10);
                    jCeil = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mGridSize;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t10) {
        return this.mItems.remove(t10);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        return this.mItems.removeAll(collection);
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i10) {
        this.mGridSize = i10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t10) {
        boolean zRemoveItem;
        synchronized (this.mItems) {
            try {
                zRemoveItem = removeItem(t10);
                if (zRemoveItem) {
                    zRemoveItem = addItem(t10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemoveItem;
    }
}
