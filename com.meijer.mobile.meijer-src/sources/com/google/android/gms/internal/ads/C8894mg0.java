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
final class C8894mg0 extends C9322qg0 implements NavigableMap {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f77696g;

    @Override // com.google.android.gms.internal.ads.C9322qg0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.C9322qg0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C9322qg0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8894mg0(AbstractC9963wg0 abstractC9963wg0, NavigableMap navigableMap) {
        super(abstractC9963wg0, navigableMap);
        this.f77696g = abstractC9963wg0;
    }

    @Override // com.google.android.gms.internal.ads.C9322qg0
    final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.f75834c);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f75834c)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return b(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f75834c)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C8894mg0(this.f77696g, ((NavigableMap) ((SortedMap) this.f75834c)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f75834c)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return b(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f75834c)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return b(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f75834c)).floorKey(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.C9322qg0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableSet d() {
        return new C9001ng0(this.f77696g, (NavigableMap) ((SortedMap) this.f75834c));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new C8894mg0(this.f77696g, ((NavigableMap) ((SortedMap) this.f75834c)).headMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f75834c)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return b(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f75834c)).higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f75834c)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return b(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f75834c)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return b(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f75834c)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new C8894mg0(this.f77696g, ((NavigableMap) ((SortedMap) this.f75834c)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new C8894mg0(this.f77696g, ((NavigableMap) ((SortedMap) this.f75834c)).tailMap(obj, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.android.gms.internal.ads.C9322qg0
    /* renamed from: f */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    final Map.Entry g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionG = this.f77696g.g();
        collectionG.addAll((Collection) entry.getValue());
        it.remove();
        return new C7616ah0(entry.getKey(), this.f77696g.h(collectionG));
    }

    @Override // com.google.android.gms.internal.ads.C9322qg0, com.google.android.gms.internal.ads.C8467ig0, java.util.AbstractMap, java.util.Map
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
