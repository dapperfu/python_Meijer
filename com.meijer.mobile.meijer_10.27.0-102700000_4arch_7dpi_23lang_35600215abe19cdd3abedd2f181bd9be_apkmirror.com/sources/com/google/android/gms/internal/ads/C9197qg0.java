package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.qg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9197qg0 extends C8342ig0 implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    SortedSet f77828e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f77829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9197qg0(AbstractC9838wg0 abstractC9838wg0, SortedMap sortedMap) {
        super(abstractC9838wg0, sortedMap);
        this.f77829f = abstractC9838wg0;
    }

    SortedMap c() {
        return (SortedMap) this.f74994c;
    }

    SortedSet d() {
        return new C9303rg0(this.f77829f, c());
    }

    @Override // com.google.android.gms.internal.ads.C8342ig0, java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f77828e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetD = d();
        this.f77828e = sortedSetD;
        return sortedSetD;
    }

    public SortedMap headMap(Object obj) {
        return new C9197qg0(this.f77829f, c().headMap(obj));
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C9197qg0(this.f77829f, c().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C9197qg0(this.f77829f, c().tailMap(obj));
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
