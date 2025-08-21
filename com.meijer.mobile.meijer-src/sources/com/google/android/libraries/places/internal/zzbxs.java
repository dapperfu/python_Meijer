package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzbxs extends LinkedHashMap {
    private zzbxs() {
        throw null;
    }

    /* synthetic */ zzbxs(byte[] bArr) {
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 100) {
            return true;
        }
        return false;
    }
}
