package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzahu {
    static Object zza(Field field, Object obj) {
        try {
            Objects.requireNonNull(field, "field");
            return field.get(obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
