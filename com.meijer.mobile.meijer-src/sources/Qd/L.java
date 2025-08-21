package Qd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes6.dex */
public final /* synthetic */ class L {
    public static /* synthetic */ Set a(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
