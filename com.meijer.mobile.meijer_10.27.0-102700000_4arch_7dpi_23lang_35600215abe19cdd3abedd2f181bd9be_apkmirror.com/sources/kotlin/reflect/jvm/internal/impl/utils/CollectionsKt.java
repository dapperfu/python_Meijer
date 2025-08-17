package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CollectionsKt {
    private static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    public static final <T> void a(Collection<T> collection, T t10) {
        Intrinsics.j(collection, "<this>");
        if (t10 != null) {
            collection.add(t10);
        }
    }

    public static final <T> List<T> c(ArrayList<T> arrayList) {
        Intrinsics.j(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return kotlin.collections.CollectionsKt.m();
        }
        if (size == 1) {
            return kotlin.collections.CollectionsKt.e(kotlin.collections.CollectionsKt.s0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K> Map<K, Integer> d(Iterable<? extends K> iterable) {
        Intrinsics.j(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> e(int i10) {
        return new HashMap<>(b(i10));
    }

    public static final <E> HashSet<E> f(int i10) {
        return new HashSet<>(b(i10));
    }

    public static final <E> LinkedHashSet<E> g(int i10) {
        return new LinkedHashSet<>(b(i10));
    }
}
