package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
enum zztt {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    static /* synthetic */ zztt zza(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj.getClass())));
    }
}
