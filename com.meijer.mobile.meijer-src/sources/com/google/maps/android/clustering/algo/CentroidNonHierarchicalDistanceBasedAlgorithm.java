package com.google.maps.android.clustering.algo;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public class CentroidNonHierarchicalDistanceBasedAlgorithm<T extends ClusterItem> extends NonHierarchicalDistanceBasedAlgorithm<T> {
    protected LatLng computeCentroid(Collection<T> collection) {
        double d10 = 0.0d;
        int i10 = 0;
        double d11 = 0.0d;
        for (T t10 : collection) {
            d10 += t10.getPosition().f85654a;
            d11 += t10.getPosition().f85655b;
            i10++;
        }
        double d12 = i10;
        return new LatLng(d10 / d12, d11 / d12);
    }

    @Override // com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm, com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        Set<? extends Cluster<T>> clusters = super.getClusters(f10);
        HashSet hashSet = new HashSet();
        for (Cluster<T> cluster : clusters) {
            StaticCluster staticCluster = new StaticCluster(computeCentroid(cluster.getItems()));
            Iterator<T> it = cluster.getItems().iterator();
            while (it.hasNext()) {
                staticCluster.add(it.next());
            }
            hashSet.add(staticCluster);
        }
        return hashSet;
    }
}
