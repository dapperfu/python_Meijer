package com.google.maps.internal;

import com.google.maps.errors.ApiException;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class ExceptionsAllowedToRetry extends HashSet<Class<? extends ApiException>> {
    private static final long serialVersionUID = 5283992240187266422L;

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ExceptionsAllowedToRetry[");
        Object[] array = toArray();
        for (int i10 = 0; i10 < array.length; i10++) {
            sb2.append(array[i10]);
            if (i10 < array.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
