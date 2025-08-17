package com.google.android.gms.common.util;

import Z.C5503a;
import Z.C5504b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class g {
    @Deprecated
    public static <T> List<T> b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.EMPTY_LIST;
    }

    public static <K, V> Map<K, V> c(K k10, V v10, K k11, V v11, K k12, V v12) {
        Map mapG = g(3, false);
        mapG.put(k10, v10);
        mapG.put(k11, v11);
        mapG.put(k12, v12);
        return Collections.unmodifiableMap(mapG);
    }

    public static <K, V> Map<K, V> d(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.EMPTY_MAP;
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapG = g(length, false);
        for (int i10 = 0; i10 < kArr.length; i10++) {
            mapG.put(kArr[i10], vArr[i10]);
        }
        return Collections.unmodifiableMap(mapG);
    }

    @Deprecated
    public static <T> Set<T> e(T t10, T t11, T t12) {
        Set setH = h(3, false);
        setH.add(t10);
        setH.add(t11);
        setH.add(t12);
        return Collections.unmodifiableSet(setH);
    }

    @Deprecated
    public static <T> Set<T> f(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.EMPTY_SET;
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t10 = tArr[0];
            T t11 = tArr[1];
            Set setH = h(2, false);
            setH.add(t10);
            setH.add(t11);
            return Collections.unmodifiableSet(setH);
        }
        if (length == 3) {
            return e(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setH2 = h(length, false);
            Collections.addAll(setH2, tArr);
            return Collections.unmodifiableSet(setH2);
        }
        T t12 = tArr[0];
        T t13 = tArr[1];
        T t14 = tArr[2];
        T t15 = tArr[3];
        Set setH3 = h(4, false);
        setH3.add(t12);
        setH3.add(t13);
        setH3.add(t14);
        setH3.add(t15);
        return Collections.unmodifiableSet(setH3);
    }

    private static Set h(int i10, boolean z10) {
        if (i10 <= (true != z10 ? 256 : 128)) {
            return new C5504b(i10);
        }
        return new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }

    private static Map g(int i10, boolean z10) {
        return i10 <= 256 ? new C5503a(i10) : new HashMap(i10, 1.0f);
    }

    @Deprecated
    public static <T> List<T> a(T t10) {
        return Collections.singletonList(t10);
    }
}
