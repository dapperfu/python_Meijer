package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.oh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9110oh0 {
    public static boolean c(Collection collection, Iterator it) {
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    static Object a(Iterator it) {
        if (it.hasNext()) {
            Object next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    static void b(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
