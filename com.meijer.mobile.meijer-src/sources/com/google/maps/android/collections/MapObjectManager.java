package com.google.maps.android.collections;

import Md.C4110c;
import android.os.Handler;
import android.os.Looper;
import com.google.maps.android.collections.MapObjectManager.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public abstract class MapObjectManager<O, C extends Collection> {
    protected final C4110c mMap;
    private final Map<String, C> mNamedCollections = new HashMap();
    protected final Map<O, C> mAllObjects = new HashMap();

    public class Collection {
        private final Set<O> mObjects = new LinkedHashSet();

        public Collection() {
        }

        protected void add(O o10) {
            this.mObjects.add(o10);
            MapObjectManager.this.mAllObjects.put(o10, this);
        }

        public void clear() {
            for (O o10 : this.mObjects) {
                MapObjectManager.this.removeObjectFromMap(o10);
                MapObjectManager.this.mAllObjects.remove(o10);
            }
            this.mObjects.clear();
        }

        protected java.util.Collection<O> getObjects() {
            return Collections.unmodifiableCollection(this.mObjects);
        }

        protected boolean remove(O o10) {
            if (!this.mObjects.remove(o10)) {
                return false;
            }
            MapObjectManager.this.mAllObjects.remove(o10);
            MapObjectManager.this.removeObjectFromMap(o10);
            return true;
        }
    }

    public abstract C newCollection();

    public C newCollection(String str) {
        if (this.mNamedCollections.get(str) == null) {
            C c10 = (C) newCollection();
            this.mNamedCollections.put(str, c10);
            return c10;
        }
        throw new IllegalArgumentException("collection id is not unique: " + str);
    }

    protected abstract void removeObjectFromMap(O o10);

    abstract void setListenersOnUiThread();

    public C getCollection(String str) {
        return this.mNamedCollections.get(str);
    }

    public boolean remove(O o10) {
        C c10 = this.mAllObjects.get(o10);
        return c10 != null && c10.remove(o10);
    }

    public MapObjectManager(C4110c c4110c) {
        this.mMap = c4110c;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.maps.android.collections.MapObjectManager.1
            @Override // java.lang.Runnable
            public void run() {
                MapObjectManager.this.setListenersOnUiThread();
            }
        });
    }
}
