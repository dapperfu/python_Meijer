package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.mg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8769mg0 extends C9197qg0 implements NavigableMap {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f76856g;

    @Override // com.google.android.gms.internal.ads.C9197qg0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.C9197qg0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C9197qg0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8769mg0(AbstractC9838wg0 abstractC9838wg0, NavigableMap navigableMap) {
        super(abstractC9838wg0, navigableMap);
        this.f76856g = abstractC9838wg0;
    }

    @Override // com.google.android.gms.internal.ads.C9197qg0
    final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.f74994c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f74994c)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return b(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f74994c)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C8769mg0(this.f76856g, ((NavigableMap) ((SortedMap) this.f74994c)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f74994c)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return b(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f74994c)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return b(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f74994c)).floorKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.C9197qg0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableSet d() {
        return new C8876ng0(this.f76856g, (NavigableMap) ((SortedMap) this.f74994c));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new C8769mg0(this.f76856g, ((NavigableMap) ((SortedMap) this.f74994c)).headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f74994c)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return b(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f74994c)).higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f74994c)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return b(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f74994c)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return b(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f74994c)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new C8769mg0(this.f76856g, ((NavigableMap) ((SortedMap) this.f74994c)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new C8769mg0(this.f76856g, ((NavigableMap) ((SortedMap) this.f74994c)).tailMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.C9197qg0
    /* renamed from: f */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    final Map.Entry g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionG = this.f76856g.g();
        collectionG.addAll((Collection) entry.getValue());
        it.remove();
        return new C7491ah0(entry.getKey(), this.f76856g.h(collectionG));
    }

    @Override // com.google.android.gms.internal.ads.C9197qg0, com.google.android.gms.internal.ads.C8342ig0, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(descendingMap().entrySet().iterator());
    }
}
