package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.k;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class s extends t implements r {

    /* renamed from: L, reason: collision with root package name */
    private static final k.c f47685L = k.c.OPTIONAL;

    public static s b0() {
        return new s(new TreeMap(t.f47686J));
    }

    public static s c0(k kVar) {
        TreeMap treeMap = new TreeMap(t.f47686J);
        for (k.a<?> aVar : kVar.f()) {
            Set<k.c> setG = kVar.g(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (k.c cVar : setG) {
                arrayMap.put(cVar, kVar.e(aVar, cVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new s(treeMap);
    }

    public <ValueT> ValueT d0(k.a<ValueT> aVar) {
        return (ValueT) this.f47688I.remove(aVar);
    }

    @Override // androidx.camera.core.impl.r
    public <ValueT> void p(k.a<ValueT> aVar, k.c cVar, ValueT valuet) {
        Map<k.c, Object> map = this.f47688I.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f47688I.put(aVar, arrayMap);
            arrayMap.put(cVar, valuet);
            return;
        }
        k.c cVar2 = (k.c) Collections.min(map.keySet());
        if (Objects.equals(map.get(cVar2), valuet) || !k.A(cVar2, cVar)) {
            map.put(cVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + cVar2 + ")=" + map.get(cVar2) + ", conflicting (" + cVar + ")=" + valuet);
    }

    @Override // androidx.camera.core.impl.r
    public <ValueT> void r(k.a<ValueT> aVar, ValueT valuet) {
        p(aVar, f47685L, valuet);
    }

    private s(TreeMap<k.a<?>, Map<k.c, Object>> treeMap) {
        super(treeMap);
    }
}
