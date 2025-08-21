package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6886Gg0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7089Mg0 f68106a;

    C6886Gg0(C7089Mg0 c7089Mg0) {
        this.f68106a = c7089Mg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f68106a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapT = this.f68106a.t();
        if (mapT != null) {
            return mapT.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int I10 = this.f68106a.I(entry.getKey());
            if (I10 != -1 && C6680Af0.a(C7089Mg0.r(this.f68106a, I10), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C7089Mg0 c7089Mg0 = this.f68106a;
        Map mapT = c7089Mg0.t();
        return mapT != null ? mapT.entrySet().iterator() : new C6818Eg0(c7089Mg0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapT = this.f68106a.t();
        if (mapT != null) {
            return mapT.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C7089Mg0 c7089Mg0 = this.f68106a;
        if (c7089Mg0.D()) {
            return false;
        }
        int iH = c7089Mg0.H();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C7089Mg0 c7089Mg02 = this.f68106a;
        int iB = C7123Ng0.b(key, value, iH, C7089Mg0.q(c7089Mg02), c7089Mg02.a(), c7089Mg02.b(), c7089Mg02.c());
        if (iB == -1) {
            return false;
        }
        this.f68106a.B(iB, iH);
        C7089Mg0 c7089Mg03 = this.f68106a;
        c7089Mg03.f69539f--;
        this.f68106a.y();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f68106a.size();
    }
}
