package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.qg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9322qg0 extends C8467ig0 implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    SortedSet f78668e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f78669f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9322qg0(AbstractC9963wg0 abstractC9963wg0, SortedMap sortedMap) {
        super(abstractC9963wg0, sortedMap);
        this.f78669f = abstractC9963wg0;
    }

    SortedMap c() {
        return (SortedMap) this.f75834c;
    }

    SortedSet d() {
        return new C9428rg0(this.f78669f, c());
    }

    @Override // com.google.android.gms.internal.ads.C8467ig0, java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f78668e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetD = d();
        this.f78668e = sortedSetD;
        return sortedSetD;
    }

    public SortedMap headMap(Object obj) {
        return new C9322qg0(this.f78669f, c().headMap(obj));
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C9322qg0(this.f78669f, c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C9322qg0(this.f78669f, c().tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return c().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return c().firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return c().lastKey();
    }
}
