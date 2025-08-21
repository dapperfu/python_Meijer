package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzaek implements Iterator {
    private final Iterator zza;

    public zzaek(Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzael ? new zzaej(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
