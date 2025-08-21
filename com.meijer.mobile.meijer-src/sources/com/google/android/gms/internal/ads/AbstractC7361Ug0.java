package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ug0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7361Ug0 extends AbstractC7394Vg0 implements Map {
    protected AbstractC7361Ug0() {
    }

    protected abstract Map b();

    @Override // java.util.Map
    public abstract Set entrySet();

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    protected final boolean t(Object obj) {
        C9965wh0 c9965wh0 = new C9965wh0(entrySet().iterator());
        if (obj == null) {
            while (c9965wh0.hasNext()) {
                if (c9965wh0.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c9965wh0.hasNext()) {
            if (obj.equals(c9965wh0.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Collection values() {
        return b().values();
    }

    protected final boolean w(Object obj) {
        return C6718Bh0.b(this, obj);
    }

    protected final int zzc() {
        return C8258gi0.a(entrySet());
    }
}
