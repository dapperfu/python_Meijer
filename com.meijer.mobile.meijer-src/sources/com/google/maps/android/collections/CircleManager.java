package com.google.maps.android.collections;

import Md.C4110c;
import Od.C4459g;
import Od.C4460h;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* loaded from: classes8.dex */
public class CircleManager extends MapObjectManager<C4459g, Collection> implements C4110c.g {

    public class Collection extends MapObjectManager.Collection {
        private C4110c.g mCircleClickListener;

        public void addAll(java.util.Collection<C4460h> collection) {
            Iterator<C4460h> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next());
            }
        }

        public Collection() {
            super();
        }

        public C4459g addCircle(C4460h c4460h) {
            C4459g c4459gA = CircleManager.this.mMap.a(c4460h);
            super.add(c4459gA);
            return c4459gA;
        }

        public void setOnCircleClickListener(C4110c.g gVar) {
            this.mCircleClickListener = gVar;
        }

        public void addAll(java.util.Collection<C4460h> collection, boolean z10) {
            Iterator<C4460h> it = collection.iterator();
            while (it.hasNext()) {
                addCircle(it.next()).j(z10);
            }
        }

        public java.util.Collection<C4459g> getCircles() {
            return getObjects();
        }

        public void hideAll() {
            Iterator<C4459g> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().j(false);
            }
        }

        public boolean remove(C4459g c4459g) {
            return super.remove((Collection) c4459g);
        }

        public void showAll() {
            Iterator<C4459g> it = getCircles().iterator();
            while (it.hasNext()) {
                it.next().j(true);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // Md.C4110c.g
    public void onCircleClick(C4459g c4459g) {
        Collection collection = (Collection) this.mAllObjects.get(c4459g);
        if (collection == null || collection.mCircleClickListener == null) {
            return;
        }
        collection.mCircleClickListener.onCircleClick(c4459g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    public void removeObjectFromMap(C4459g c4459g) {
        c4459g.a();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void setListenersOnUiThread() {
        C4110c c4110c = this.mMap;
        if (c4110c != null) {
            c4110c.D(this);
        }
    }

    public CircleManager(C4110c c4110c) {
        super(c4110c);
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
    public /* bridge */ /* synthetic */ boolean remove(C4459g c4459g) {
        return super.remove(c4459g);
    }
}
