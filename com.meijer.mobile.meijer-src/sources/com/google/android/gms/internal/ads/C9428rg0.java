package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.rg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C9428rg0 extends C8787lg0 implements SortedSet {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f78895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9428rg0(AbstractC9963wg0 abstractC9963wg0, SortedMap sortedMap) {
        super(abstractC9963wg0, sortedMap);
        this.f78895c = abstractC9963wg0;
    }

    SortedMap a() {
        return (SortedMap) this.f81105a;
    }

    public SortedSet headSet(Object obj) {
        return new C9428rg0(this.f78895c, a().headMap(obj));
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C9428rg0(this.f78895c, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C9428rg0(this.f78895c, a().tailMap(obj));
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }
}
