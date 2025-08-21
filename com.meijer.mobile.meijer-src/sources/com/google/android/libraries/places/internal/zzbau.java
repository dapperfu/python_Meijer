package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzbau implements Iterator {
    private final Iterator zza;

    public zzbau(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzbav ? new zzbat(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
