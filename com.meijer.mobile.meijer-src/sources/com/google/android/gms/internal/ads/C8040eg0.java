package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8040eg0 extends AbstractC9963wg0 implements InterfaceC9217ph0 {
    @Override // com.google.android.gms.internal.ads.AbstractC9963wg0
    final Collection h(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9963wg0
    final Collection i(Object obj, Collection collection) {
        return k(obj, (List) collection, null);
    }

    protected C8040eg0(Map map) {
        super(map);
    }
}
