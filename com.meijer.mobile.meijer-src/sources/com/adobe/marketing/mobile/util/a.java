package com.adobe.marketing.mobile.util;

import R5.t;
import com.adobe.marketing.mobile.util.CloneFailedException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<Class<?>> f63592a;

    /* renamed from: com.adobe.marketing.mobile.util.a$a, reason: collision with other inner class name */
    private enum EnumC1248a {
        ImmutableContainer,
        MutableContainer
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map<String, Object> a(Map<?, ?> map) {
        if (map == 0) {
            return null;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!(((Map.Entry) it.next()).getKey() instanceof String)) {
                return null;
            }
        }
        return map;
    }

    static {
        HashSet hashSet = new HashSet();
        f63592a = hashSet;
        hashSet.add(Boolean.class);
        hashSet.add(Byte.class);
        hashSet.add(Short.class);
        hashSet.add(Integer.class);
        hashSet.add(Long.class);
        hashSet.add(Float.class);
        hashSet.add(Double.class);
        hashSet.add(BigDecimal.class);
        hashSet.add(BigInteger.class);
        hashSet.add(Character.class);
        hashSet.add(String.class);
        hashSet.add(UUID.class);
    }

    private static Collection<Object> b(Object obj, EnumC1248a enumC1248a, int i10) throws CloneFailedException {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            try {
                arrayList.add(e(Array.get(obj, i11), enumC1248a, i10 + 1));
            } catch (CloneFailedException e10) {
                if (e10.a() != CloneFailedException.a.UNSUPPORTED_TYPE) {
                    throw e10;
                }
                t.e("MobileCore", "EventDataUtils", "cloneArray - Skipped cloning element due to %s", e10.getMessage());
            }
        }
        return enumC1248a == EnumC1248a.ImmutableContainer ? Collections.unmodifiableList(arrayList) : arrayList;
    }

    private static Collection<Object> c(Collection<?> collection, EnumC1248a enumC1248a, int i10) throws CloneFailedException {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(e(it.next(), enumC1248a, i10 + 1));
            } catch (CloneFailedException e10) {
                if (e10.a() != CloneFailedException.a.UNSUPPORTED_TYPE) {
                    throw e10;
                }
                t.e("MobileCore", "EventDataUtils", "cloneCollection - Skipped cloning element due to %s", e10.getMessage());
            }
        }
        return enumC1248a == EnumC1248a.ImmutableContainer ? Collections.unmodifiableList(arrayList) : arrayList;
    }

    private static Map<String, Object> d(Map<?, ?> map, EnumC1248a enumC1248a, int i10) throws CloneFailedException {
        if (map == null) {
            return null;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                try {
                    map2.put(key.toString(), e(entry.getValue(), enumC1248a, i10 + 1));
                } catch (CloneFailedException e10) {
                    if (e10.a() != CloneFailedException.a.UNSUPPORTED_TYPE) {
                        throw e10;
                    }
                    t.e("MobileCore", "EventDataUtils", "cloneMap - Skipped cloning key %s due to %s", key, e10.getMessage());
                }
            }
        }
        return enumC1248a == EnumC1248a.ImmutableContainer ? Collections.unmodifiableMap(map2) : map2;
    }

    private static Object e(Object obj, EnumC1248a enumC1248a, int i10) throws CloneFailedException {
        if (obj == null) {
            return null;
        }
        if (i10 > 256) {
            throw new CloneFailedException(CloneFailedException.a.MAX_DEPTH_REACHED);
        }
        Class<?> cls = obj.getClass();
        if (f63592a.contains(cls)) {
            return obj;
        }
        if (obj instanceof Map) {
            return d((Map) obj, enumC1248a, i10);
        }
        if (obj instanceof Collection) {
            return c((Collection) obj, enumC1248a, i10);
        }
        if (obj.getClass().isArray()) {
            return b(obj, enumC1248a, i10);
        }
        t.e("MobileCore", "EventDataUtils", "Cannot clone object of type: %s", cls.getSimpleName());
        throw new CloneFailedException(CloneFailedException.a.UNSUPPORTED_TYPE);
    }

    public static Map<String, Object> f(Map<String, ?> map) throws CloneFailedException {
        return d(map, EnumC1248a.ImmutableContainer, 0);
    }
}
