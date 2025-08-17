package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes7.dex */
public interface Algorithm<T extends ClusterItem> {
    boolean addItem(T t10);

    boolean addItems(Collection<T> collection);

    void clearItems();

    Set<? extends Cluster<T>> getClusters(float f10);

    Collection<T> getItems();

    int getMaxDistanceBetweenClusteredItems();

    void lock();

    boolean removeItem(T t10);

    boolean removeItems(Collection<T> collection);

    void setMaxDistanceBetweenClusteredItems(int i10);

    void unlock();

    boolean updateItem(T t10);
}
