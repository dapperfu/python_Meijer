package com.google.maps.android.quadtree;

import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public class PointQuadTree<T extends Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final Bounds mBounds;
    private List<PointQuadTree<T>> mChildren;
    private final int mDepth;
    private Set<T> mItems;

    public interface Item {
        Point getPoint();
    }

    public PointQuadTree(double d10, double d11, double d12, double d13) {
        this(new Bounds(d10, d11, d12, d13));
    }

    public void clear() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            set.clear();
        }
    }

    public boolean remove(T t10) {
        Point point = t10.getPoint();
        if (this.mBounds.contains(point.f91175x, point.f91176y)) {
            return remove(point.f91175x, point.f91176y, t10);
        }
        return false;
    }

    public Collection<T> search(Bounds bounds) {
        ArrayList arrayList = new ArrayList();
        search(bounds, arrayList);
        return arrayList;
    }

    public PointQuadTree(Bounds bounds) {
        this(bounds, 0);
    }

    private void insert(double d10, double d11, T t10) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list == null) {
            if (this.mItems == null) {
                this.mItems = new LinkedHashSet();
            }
            this.mItems.add(t10);
            if (this.mItems.size() <= MAX_ELEMENTS || this.mDepth >= MAX_DEPTH) {
                return;
            }
            split();
            return;
        }
        Bounds bounds = this.mBounds;
        if (d11 < bounds.midY) {
            if (d10 < bounds.midX) {
                list.get(0).insert(d10, d11, t10);
                return;
            } else {
                list.get(1).insert(d10, d11, t10);
                return;
            }
        }
        if (d10 < bounds.midX) {
            list.get(2).insert(d10, d11, t10);
        } else {
            list.get(3).insert(d10, d11, t10);
        }
    }

    private void split() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        Bounds bounds = this.mBounds;
        arrayList.add(new PointQuadTree(bounds.minX, bounds.midX, bounds.minY, bounds.midY, this.mDepth + 1));
        List<PointQuadTree<T>> list = this.mChildren;
        Bounds bounds2 = this.mBounds;
        list.add(new PointQuadTree<>(bounds2.midX, bounds2.maxX, bounds2.minY, bounds2.midY, this.mDepth + 1));
        List<PointQuadTree<T>> list2 = this.mChildren;
        Bounds bounds3 = this.mBounds;
        list2.add(new PointQuadTree<>(bounds3.minX, bounds3.midX, bounds3.midY, bounds3.maxY, this.mDepth + 1));
        List<PointQuadTree<T>> list3 = this.mChildren;
        Bounds bounds4 = this.mBounds;
        list3.add(new PointQuadTree<>(bounds4.midX, bounds4.maxX, bounds4.midY, bounds4.maxY, this.mDepth + 1));
        Set<T> set = this.mItems;
        this.mItems = null;
        for (T t10 : set) {
            insert(t10.getPoint().f91175x, t10.getPoint().f91176y, t10);
        }
    }

    private PointQuadTree(double d10, double d11, double d12, double d13, int i10) {
        this(new Bounds(d10, d11, d12, d13), i10);
    }

    private void search(Bounds bounds, Collection<T> collection) {
        if (this.mBounds.intersects(bounds)) {
            List<PointQuadTree<T>> list = this.mChildren;
            if (list != null) {
                Iterator<PointQuadTree<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().search(bounds, collection);
                }
            } else if (this.mItems != null) {
                if (bounds.contains(this.mBounds)) {
                    collection.addAll(this.mItems);
                    return;
                }
                for (T t10 : this.mItems) {
                    if (bounds.contains(t10.getPoint())) {
                        collection.add(t10);
                    }
                }
            }
        }
    }

    public void add(T t10) {
        Point point = t10.getPoint();
        if (this.mBounds.contains(point.f91175x, point.f91176y)) {
            insert(point.f91175x, point.f91176y, t10);
        }
    }

    private PointQuadTree(Bounds bounds, int i10) {
        this.mChildren = null;
        this.mBounds = bounds;
        this.mDepth = i10;
    }

    private boolean remove(double d10, double d11, T t10) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list != null) {
            Bounds bounds = this.mBounds;
            if (d11 < bounds.midY) {
                if (d10 < bounds.midX) {
                    return list.get(0).remove(d10, d11, t10);
                }
                return list.get(1).remove(d10, d11, t10);
            }
            if (d10 < bounds.midX) {
                return list.get(2).remove(d10, d11, t10);
            }
            return list.get(3).remove(d10, d11, t10);
        }
        Set<T> set = this.mItems;
        if (set == null) {
            return false;
        }
        return set.remove(t10);
    }
}
