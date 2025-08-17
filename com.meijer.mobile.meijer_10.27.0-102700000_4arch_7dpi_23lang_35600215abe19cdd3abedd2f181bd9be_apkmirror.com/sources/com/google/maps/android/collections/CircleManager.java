package com.google.maps.android.collections;

import Kd.C3945c;
import Md.C4181g;
import Md.C4182h;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class CircleManager extends MapObjectManager<C4181g, Collection> implements C3945c.g {

    public class Collection extends MapObjectManager.Collection {
        private C3945c.g mCircleClickListener;

        public void addAll(java.util.Collection<C4182h> collection) {
            Iterator<C4182h> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4181g addCircle(C4182h c4182h) {
            C4181g c4181gA = CircleManager.this.mMap.a(c4182h);
            super.add(c4181gA);
            return c4181gA;
        }

        public void setOnCircleClickListener(C3945c.g gVar) {
            this.mCircleClickListener = gVar;
        }

        public void addAll(java.util.Collection<C4182h> collection, boolean z10) {
            Iterator<C4182h> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next()).j(z10);
            }
        }

        public java.util.Collection<C4181g> getCircles() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4181g> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().j(false);
            }
        }

        public boolean remove(C4181g c4181g) {
            return super.remove((Collection) c4181g);
        }

        public void showAll() {
            Iterator<C4181g> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().j(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Kd.C3945c.g
    public void onCircleClick(C4181g c4181g) {
        Collection collection = (Collection) this.mAllObjects.get(c4181g);
        if (collection == null || collection.mCircleClickListener == null) {
            return;
        }
        collection.mCircleClickListener.onCircleClick(c4181g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4181g c4181g) {
        c4181g.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C3945c c3945c = this.mMap;
        if (c3945c != null) {
            c3945c.D(this);
        }
    }

    public CircleManager(C3945c c3945c) {
        super(c3945c);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(C4181g c4181g) {
        return super.remove(c4181g);
    }
}
