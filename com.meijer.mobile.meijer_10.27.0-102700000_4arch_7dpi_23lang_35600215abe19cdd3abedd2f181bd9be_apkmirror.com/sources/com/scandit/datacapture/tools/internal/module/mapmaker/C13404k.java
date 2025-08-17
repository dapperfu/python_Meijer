package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13404k extends AbstractC13410q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f126242a;

    public C13404k(N n10) {
        this.f126242a = n10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f126242a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = this.f126242a.get(key)) != null && this.f126242a.f126225f.a().a().b(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f126242a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C13403j(this.f126242a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && this.f126242a.remove(key, entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f126242a.size();
    }
}
