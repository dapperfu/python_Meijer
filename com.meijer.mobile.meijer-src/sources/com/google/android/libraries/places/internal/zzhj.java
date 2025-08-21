package com.google.android.libraries.places.internal;

import De.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzhj {
    public static String zza(List list, List list2) {
        return zzc(list, true, list2);
    }

    public static String zzb(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("attributions");
        return zzc(arrayList, false, new ArrayList());
    }

    private static String zzc(List list, boolean z10, List list2) {
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strConcat = (String) it.next();
            if (z10) {
                strConcat = "places.".concat(String.valueOf(strConcat));
            }
            arrayList.add(strConcat);
        }
        String str = "attributions";
        if (!list.contains("attributions")) {
            if (true == z10) {
                str = "places.attributions";
            }
            arrayList.add(str);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((zzhi) it2.next()).toString());
        }
        return i.h(",").e(arrayList);
    }
}
