package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.ClusterItem;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes7.dex */
public abstract class AbstractAlgorithm<T extends ClusterItem> implements Algorithm<T> {
    private final ReadWriteLock mLock = new ReentrantReadWriteLock();

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void lock() {
        this.mLock.writeLock().lock();
    }

    @Override // com.google.maps.android.clustering.algo.Algorithm
    public void unlock() {
        this.mLock.writeLock().unlock();
    }
}
