package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.quadtree.PointQuadTree;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class NonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private static final int DEFAULT_MAX_DISTANCE_AT_ZOOM = 100;
    private static final SphericalMercatorProjection PROJECTION = new SphericalMercatorProjection(1.0d);
    private int mMaxDistance = 100;
    private final Collection<QuadItem<T>> mItems = new LinkedHashSet();
    private final PointQuadTree<QuadItem<T>> mQuadTree = new PointQuadTree<>(0.0d, 1.0d, 0.0d, 1.0d);

    protected static class QuadItem<T extends ClusterItem> implements PointQuadTree.Item, Cluster<T> {
        private final T mClusterItem;
        private final Point mPoint;
        private final LatLng mPosition;
        private Set<T> singletonSet;

        @Override // com.google.maps.android.clustering.Cluster
        public int getSize() {
            return 1;
        }

        private QuadItem(T t10) {
            this.mClusterItem = t10;
            LatLng position = t10.getPosition();
            this.mPosition = position;
            this.mPoint = NonHierarchicalDistanceBasedAlgorithm.PROJECTION.toPoint(position);
            this.singletonSet = Collections.singleton(t10);
        }

        public boolean equals(Object obj) {
            if (obj instanceof QuadItem) {
                return ((QuadItem) obj).mClusterItem.equals(this.mClusterItem);
            }
            return false;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public Set<T> getItems() {
            return this.singletonSet;
        }

        @Override // com.google.maps.android.quadtree.PointQuadTree.Item
        public Point getPoint() {
            return this.mPoint;
        }

        @Override // com.google.maps.android.clustering.Cluster
        public LatLng getPosition() {
            return this.mPosition;
        }

        public int hashCode() {
            return this.mClusterItem.hashCode();
        }
    }

    private Bounds createBoundsFromSpan(Point point, double d10) {
        double d11 = d10 / 2.0d;
        double d12 = point.f90336x;
        double d13 = point.f90337y;
        return new Bounds(d12 - d11, d12 + d11, d13 - d11, d13 + d11);
    }

    private double distanceSquared(Point point, Point point2) {
        double d10 = point.f90336x;
        double d11 = point2.f90336x;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = point.f90337y;
        double d14 = point2.f90337y;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t10) {
        boolean zAdd;
        QuadItem<T> quadItem = new QuadItem<>(t10);
        synchronized (this.mQuadTree) {
            try {
                zAdd = this.mItems.add(quadItem);
                if (zAdd) {
                    this.mQuadTree.add(quadItem);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zAdd;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        synchronized (this.mQuadTree) {
            this.mItems.clear();
            this.mQuadTree.clear();
        }
    }

    protected Collection<QuadItem<T>> getClusteringItems(PointQuadTree<QuadItem<T>> pointQuadTree, float f10) {
        return this.mItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        double dPow = (this.mMaxDistance / Math.pow(2.0d, (int) f10)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = getClusteringItems(this.mQuadTree, f10).iterator();
                while (it.hasNext()) {
                    QuadItem<T> next = it.next();
                    if (!hashSet.contains(next)) {
                        Collection<T> collectionSearch = this.mQuadTree.search(createBoundsFromSpan(next.getPoint(), dPow));
                        if (collectionSearch.size() == 1) {
                            hashSet2.add(next);
                            hashSet.add(next);
                            map.put(next, Double.valueOf(0.0d));
                        } else {
                            StaticCluster staticCluster = new StaticCluster(((QuadItem) next).mClusterItem.getPosition());
                            hashSet2.add(staticCluster);
                            for (T t10 : collectionSearch) {
                                Double d10 = (Double) map.get(t10);
                                Iterator<QuadItem<T>> it2 = it;
                                double dDistanceSquared = distanceSquared(t10.getPoint(), next.getPoint());
                                if (d10 == null) {
                                    map.put(t10, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t10.mClusterItem);
                                    map2.put(t10, staticCluster);
                                } else if (d10.doubleValue() >= dDistanceSquared) {
                                    ((StaticCluster) map2.get(t10)).remove(t10.mClusterItem);
                                    map.put(t10, Double.valueOf(dDistanceSquared));
                                    staticCluster.add(t10.mClusterItem);
                                    map2.put(t10, staticCluster);
                                }
                                it = it2;
                            }
                            hashSet.addAll(collectionSearch);
                            it = it;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hashSet2;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.mQuadTree) {
            try {
                Iterator<QuadItem<T>> it = this.mItems.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((QuadItem) it.next()).mClusterItem);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedHashSet;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mMaxDistance;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t10) {
        boolean zRemove;
        QuadItem quadItem = new QuadItem(t10);
        synchronized (this.mQuadTree) {
            try {
                zRemove = this.mItems.remove(quadItem);
                if (zRemove) {
                    this.mQuadTree.remove(quadItem);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zRemove;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean z10;
        synchronized (this.mQuadTree) {
            try {
                Iterator<T> it = collection.iterator();
                z10 = false;
                while (it.hasNext()) {
                    QuadItem quadItem = new QuadItem(it.next());
                    if (this.mItems.remove(quadItem)) {
                        this.mQuadTree.remove(quadItem);
                        z10 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i10) {
        this.mMaxDistance = i10;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t10) {
        boolean zRemoveItem;
        synchronized (this.mQuadTree) {
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

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        Iterator<T> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (addItem(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
