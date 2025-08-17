package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.ng0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8876ng0 extends C9303rg0 implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f77119d;

    @Override // com.google.android.gms.internal.ads.C9303rg0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.C9303rg0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C9303rg0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8876ng0(AbstractC9838wg0 abstractC9838wg0, NavigableMap navigableMap) {
        super(abstractC9838wg0, navigableMap);
        this.f77119d = abstractC9838wg0;
    }

    @Override // com.google.android.gms.internal.ads.C9303rg0
    final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f80265a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f80265a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C8876ng0(this.f77119d, ((NavigableMap) ((SortedMap) this.f80265a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f80265a)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new C8876ng0(this.f77119d, ((NavigableMap) ((SortedMap) this.f80265a)).headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f80265a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f80265a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new C8876ng0(this.f77119d, ((NavigableMap) ((SortedMap) this.f80265a)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new C8876ng0(this.f77119d, ((NavigableMap) ((SortedMap) this.f80265a)).tailMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C8985oh0.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C8985oh0.a(descendingIterator());
    }
}
