package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzmq extends LinkedHashMap {
    zzmq(int i10, float f10, boolean z10) {
        super(16, 0.75f, true);
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 10) {
            return true;
        }
        return false;
    }
}
