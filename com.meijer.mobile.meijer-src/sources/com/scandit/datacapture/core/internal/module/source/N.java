package com.scandit.datacapture.core.internal.module.source;

import android.util.Range;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f125749a = new Comparator() { // from class: com.scandit.datacapture.core.internal.module.source.d0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return N.a((Range) obj, (Range) obj2);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator f125750b = new Comparator() { // from class: com.scandit.datacapture.core.internal.module.source.e0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return N.b((Range) obj, (Range) obj2);
        }
    };

    public static final int a(Range range, Range range2) {
        Object upper = range.getUpper();
        Intrinsics.i(upper, "getUpper(...)");
        int iIntValue = ((Number) upper).intValue();
        Object upper2 = range2.getUpper();
        Intrinsics.i(upper2, "getUpper(...)");
        if (iIntValue > ((Number) upper2).intValue()) {
            return -1;
        }
        Object upper3 = range.getUpper();
        Intrinsics.i(upper3, "getUpper(...)");
        int iIntValue2 = ((Number) upper3).intValue();
        Object upper4 = range2.getUpper();
        Intrinsics.i(upper4, "getUpper(...)");
        if (iIntValue2 < ((Number) upper4).intValue()) {
            return 1;
        }
        Object lower = range.getLower();
        Intrinsics.i(lower, "getLower(...)");
        int iIntValue3 = ((Number) lower).intValue();
        Object lower2 = range2.getLower();
        Intrinsics.i(lower2, "getLower(...)");
        if (iIntValue3 > ((Number) lower2).intValue()) {
            return -1;
        }
        Object lower3 = range.getLower();
        Intrinsics.i(lower3, "getLower(...)");
        int iIntValue4 = ((Number) lower3).intValue();
        Object lower4 = range2.getLower();
        Intrinsics.i(lower4, "getLower(...)");
        return iIntValue4 < ((Number) lower4).intValue() ? 1 : 0;
    }

    public static final int b(Range range, Range range2) {
        Object upper = range.getUpper();
        Intrinsics.i(upper, "getUpper(...)");
        int iIntValue = ((Number) upper).intValue();
        Object upper2 = range2.getUpper();
        Intrinsics.i(upper2, "getUpper(...)");
        if (iIntValue > ((Number) upper2).intValue()) {
            return -1;
        }
        Object upper3 = range.getUpper();
        Intrinsics.i(upper3, "getUpper(...)");
        int iIntValue2 = ((Number) upper3).intValue();
        Object upper4 = range2.getUpper();
        Intrinsics.i(upper4, "getUpper(...)");
        if (iIntValue2 < ((Number) upper4).intValue()) {
            return 1;
        }
        Object lower = range.getLower();
        Intrinsics.i(lower, "getLower(...)");
        int iIntValue3 = ((Number) lower).intValue();
        Object lower2 = range2.getLower();
        Intrinsics.i(lower2, "getLower(...)");
        if (iIntValue3 < ((Number) lower2).intValue()) {
            return -1;
        }
        Object lower3 = range.getLower();
        Intrinsics.i(lower3, "getLower(...)");
        int iIntValue4 = ((Number) lower3).intValue();
        Object lower4 = range2.getLower();
        Intrinsics.i(lower4, "getLower(...)");
        return iIntValue4 > ((Number) lower4).intValue() ? 1 : 0;
    }

    public static final Range c(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        for (Range range : frameRateRanges) {
            if ((((Integer) range.getUpper()) != null ? Float.valueOf(r4.intValue()) : null).floatValue() <= f10) {
                arrayList.add(range);
            }
        }
        return (Range) CollectionsKt.u0(CollectionsKt.Z0(arrayList, f125750b));
    }

    public static final Range a(Range[] frameRateRanges, float f10) {
        Object next;
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        int length = frameRateRanges.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Range range = frameRateRanges[i10];
            if ((((Integer) range.getUpper()) != null ? Float.valueOf(r5.intValue()) : null).floatValue() <= f10) {
                arrayList.add(range);
            }
            i10++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Integer num = (Integer) ((Range) next).getUpper();
                do {
                    Object next2 = it.next();
                    Integer num2 = (Integer) ((Range) next2).getUpper();
                    if (num.compareTo(num2) < 0) {
                        next = next2;
                        num = num2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Range range2 = (Range) next;
        Integer num3 = range2 != null ? (Integer) range2.getUpper() : null;
        if (num3 != null) {
            return new Range(num3, num3);
        }
        return null;
    }

    public static final Range b(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        for (Range range : frameRateRanges) {
            if ((((Integer) range.getUpper()) != null ? Float.valueOf(r4.intValue()) : null).floatValue() <= f10) {
                arrayList.add(range);
            }
        }
        return (Range) CollectionsKt.u0(CollectionsKt.Z0(arrayList, f125749a));
    }
}
