package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.k;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class t implements k {

    /* renamed from: J, reason: collision with root package name */
    protected static final Comparator<k.a<?>> f47462J;

    /* renamed from: K, reason: collision with root package name */
    private static final t f47463K;

    /* renamed from: I, reason: collision with root package name */
    protected final TreeMap<k.a<?>, Map<k.c, Object>> f47464I;

    static {
        Comparator<k.a<?>> comparator = new Comparator() { // from class: F.d0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((k.a) obj).c().compareTo(((k.a) obj2).c());
            }
        };
        f47462J = comparator;
        f47463K = new t(new TreeMap(comparator));
    }

    public static t Z() {
        return f47463K;
    }

    public static t a0(k kVar) {
        if (t.class.equals(kVar.getClass())) {
            return (t) kVar;
        }
        TreeMap treeMap = new TreeMap(f47462J);
        for (k.a<?> aVar : kVar.f()) {
            Set<k.c> setG = kVar.g(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (k.c cVar : setG) {
                arrayMap.put(cVar, kVar.e(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new t(treeMap);
    }

    @Override // androidx.camera.core.impl.k
    public <ValueT> ValueT a(k.a<ValueT> aVar) {
        Map<k.c, Object> map = this.f47464I.get(aVar);
        if (map != null) {
            return (ValueT) map.get((k.c) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.k
    public boolean c(k.a<?> aVar) {
        return this.f47464I.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.k
    public void d(String str, k.b bVar) {
        for (Map.Entry<k.a<?>, Map<k.c, Object>> entry : this.f47464I.tailMap(k.a.a(str, Void.class)).entrySet()) {
            if (!entry.getKey().c().startsWith(str) || !bVar.a(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.k
    public <ValueT> ValueT e(k.a<ValueT> aVar, k.c cVar) {
        Map<k.c, Object> map = this.f47464I.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(cVar)) {
            return (ValueT) map.get(cVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + cVar);
    }

    @Override // androidx.camera.core.impl.k
    public Set<k.a<?>> f() {
        return Collections.unmodifiableSet(this.f47464I.keySet());
    }

    @Override // androidx.camera.core.impl.k
    public Set<k.c> g(k.a<?> aVar) {
        Map<k.c, Object> map = this.f47464I.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.k
    public k.c i(k.a<?> aVar) {
        Map<k.c, Object> map = this.f47464I.get(aVar);
        if (map != null) {
            return (k.c) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    t(TreeMap<k.a<?>, Map<k.c, Object>> treeMap) {
        this.f47464I = treeMap;
    }

    @Override // androidx.camera.core.impl.k
    public <ValueT> ValueT h(k.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }
}
