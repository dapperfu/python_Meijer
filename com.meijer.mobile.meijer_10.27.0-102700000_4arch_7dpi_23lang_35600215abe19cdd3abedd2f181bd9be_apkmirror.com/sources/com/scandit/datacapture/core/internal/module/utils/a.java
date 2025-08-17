package com.scandit.datacapture.core.internal.module.utils;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends ConcurrentHashMap {
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && hashCode() == ((a) obj).hashCode();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Set<Map.Entry> setEntrySet = super.entrySet();
        Intrinsics.i(setEntrySet, "<get-entries>(...)");
        int i10 = 0;
        for (Map.Entry entry : setEntrySet) {
            Intrinsics.g(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 * 31;
            if (key != null) {
                iHashCode = key.hashCode();
            } else {
                iHashCode = 0;
            }
            int i12 = (i11 + iHashCode) * 31;
            if (value instanceof Object[]) {
                iHashCode2 = ArraysKt.b((Object[]) value);
            } else if (value instanceof int[]) {
                iHashCode2 = Arrays.hashCode((int[]) value);
            } else if (value != null) {
                iHashCode2 = value.hashCode();
            } else {
                iHashCode2 = 0;
            }
            i10 = i12 + iHashCode2;
        }
        return i10;
    }
}
