package com.google.maps.android.clustering.algo;

import androidx.collection.LruCache;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public class PreCachingAlgorithmDecorator<T extends ClusterItem> extends AbstractAlgorithm<T> {
    private final Algorithm<T> mAlgorithm;
    private final LruCache<Integer, Set<? extends Cluster<T>>> mCache = new LruCache<>(5);
    private final ReadWriteLock mCacheLock = new ReentrantReadWriteLock();
    private final Executor mExecutor = Executors.newCachedThreadPool();

    private class PrecacheRunnable implements Runnable {
        private final int mZoom;

        public PrecacheRunnable(int i10) {
            this.mZoom = i10;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            PreCachingAlgorithmDecorator.this.getClustersInternal(this.mZoom);
        }
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Set<? extends Cluster<T>> getClusters(float f10) {
        int i10 = (int) f10;
        Set<? extends Cluster<T>> clustersInternal = getClustersInternal(i10);
        int i11 = i10 + 1;
        if (this.mCache.d(Integer.valueOf(i11)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i11));
        }
        int i12 = i10 - 1;
        if (this.mCache.d(Integer.valueOf(i12)) == null) {
            this.mExecutor.execute(new PrecacheRunnable(i12));
        }
        return clustersInternal;
    }

    private void clearCache() {
        this.mCache.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends Cluster<T>> getClustersInternal(int i10) {
        this.mCacheLock.readLock().lock();
        Set<? extends Cluster<T>> setD = this.mCache.d(Integer.valueOf(i10));
        this.mCacheLock.readLock().unlock();
        if (setD == null) {
            this.mCacheLock.writeLock().lock();
            setD = this.mCache.d(Integer.valueOf(i10));
            if (setD == null) {
                setD = this.mAlgorithm.getClusters(i10);
                this.mCache.f(Integer.valueOf(i10), setD);
            }
            this.mCacheLock.writeLock().unlock();
        }
        return setD;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItem(T t10) {
        boolean zAddItem = this.mAlgorithm.addItem(t10);
        if (zAddItem) {
            clearCache();
        }
        return zAddItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean addItems(Collection<T> collection) {
        boolean zAddItems = this.mAlgorithm.addItems(collection);
        if (zAddItems) {
            clearCache();
        }
        return zAddItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void clearItems() {
        this.mAlgorithm.clearItems();
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public Collection<T> getItems() {
        return this.mAlgorithm.getItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public int getMaxDistanceBetweenClusteredItems() {
        return this.mAlgorithm.getMaxDistanceBetweenClusteredItems();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItem(T t10) {
        boolean zRemoveItem = this.mAlgorithm.removeItem(t10);
        if (zRemoveItem) {
            clearCache();
        }
        return zRemoveItem;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean removeItems(Collection<T> collection) {
        boolean zRemoveItems = this.mAlgorithm.removeItems(collection);
        if (zRemoveItems) {
            clearCache();
        }
        return zRemoveItems;
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void setMaxDistanceBetweenClusteredItems(int i10) {
        this.mAlgorithm.setMaxDistanceBetweenClusteredItems(i10);
        clearCache();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public boolean updateItem(T t10) {
        boolean zUpdateItem = this.mAlgorithm.updateItem(t10);
        if (zUpdateItem) {
            clearCache();
        }
        return zUpdateItem;
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.mAlgorithm = algorithm;
    }
}
