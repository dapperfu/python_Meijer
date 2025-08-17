package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8058fy0 {
    private static int d(int i10) {
        return i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    static HashSet a(int i10) {
        return new HashSet(d(i10));
    }

    public static LinkedHashMap b(int i10) {
        return new LinkedHashMap(d(i10));
    }

    public static List c(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }
}
