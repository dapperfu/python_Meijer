package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC9947xh0 extends AbstractC7813di0 {
    abstract Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // com.google.android.gms.internal.ads.AbstractC7813di0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return C8133gi0.e(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            return C8133gi0.f(this, collection.iterator());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7813di0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int iCeil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                C6557Ag0.a(size, "expectedSize");
                iCeil = size + 1;
            } else {
                iCeil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : a.e.API_PRIORITY_OTHER;
            }
            HashSet hashSet = new HashSet(iCeil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(hashSet);
        }
    }

    AbstractC9947xh0() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}
