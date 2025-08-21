package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.AbstractSet;
import java.util.Collection;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13543q extends AbstractSet {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return N.a((Collection) this).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return N.a((Collection) this).toArray(objArr);
    }
}
