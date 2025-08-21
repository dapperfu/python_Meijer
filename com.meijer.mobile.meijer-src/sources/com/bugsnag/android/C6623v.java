package com.bugsnag.android;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.bugsnag.android.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6623v {
    static <T> boolean a(Collection<T> collection) {
        if (collection == null) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return true;
            }
        }
        return false;
    }
}
