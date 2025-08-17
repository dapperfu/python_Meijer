package com.bugsnag.android;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.bugsnag.android.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6492s {
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
