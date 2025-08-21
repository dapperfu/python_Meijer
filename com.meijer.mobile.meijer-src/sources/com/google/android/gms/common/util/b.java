package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C6660q;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class b {
    public static boolean a(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean b(T[] tArr, T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!C6660q.a(tArr[i10], t10)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static <T> ArrayList<T> c() {
        return new ArrayList<>();
    }
}
