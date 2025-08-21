package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.ng0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9001ng0 extends C9428rg0 implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f77959d;

    @Override // com.google.android.gms.internal.ads.C9428rg0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.C9428rg0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.C9428rg0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9001ng0(AbstractC9963wg0 abstractC9963wg0, NavigableMap navigableMap) {
        super(abstractC9963wg0, navigableMap);
        this.f77959d = abstractC9963wg0;
    }

    @Override // com.google.android.gms.internal.ads.C9428rg0
    final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f81105a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f81105a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C9001ng0(this.f77959d, ((NavigableMap) ((SortedMap) this.f81105a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f81105a)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new C9001ng0(this.f77959d, ((NavigableMap) ((SortedMap) this.f81105a)).headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f81105a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f81105a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new C9001ng0(this.f77959d, ((NavigableMap) ((SortedMap) this.f81105a)).subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new C9001ng0(this.f77959d, ((NavigableMap) ((SortedMap) this.f81105a)).tailMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return C9110oh0.a(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return C9110oh0.a(descendingIterator());
    }
}
