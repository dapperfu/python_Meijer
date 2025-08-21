package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13537k extends AbstractC13543q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f127194a;

    public C13537k(N n10) {
        this.f127194a = n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f127194a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = this.f127194a.get(key)) != null && this.f127194a.f127177f.a().a().b(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f127194a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13536j(this.f127194a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f127194a.remove(key, entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f127194a.size();
    }
}
