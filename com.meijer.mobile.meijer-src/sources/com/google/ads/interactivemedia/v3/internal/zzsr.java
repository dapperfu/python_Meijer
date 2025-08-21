package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes4.dex */
final class zzsr {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzsb.zza;
            }
        } else if (iterable instanceof zzsq) {
            comparator2 = ((zzsq) iterable).comparator();
        } else {
            return false;
        }
        return comparator.equals(comparator2);
    }
}
