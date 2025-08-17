package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Gg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6761Gg0 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6964Mg0 f67266a;

    C6761Gg0(C6964Mg0 c6964Mg0) {
        this.f67266a = c6964Mg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f67266a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapV = this.f67266a.v();
        if (mapV != null) {
            return mapV.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int I10 = this.f67266a.I(entry.getKey());
            if (I10 != -1 && C6555Af0.a(C6964Mg0.r(this.f67266a, I10), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C6964Mg0 c6964Mg0 = this.f67266a;
        Map mapV = c6964Mg0.v();
        return mapV != null ? mapV.entrySet().iterator() : new C6693Eg0(c6964Mg0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapV = this.f67266a.v();
        if (mapV != null) {
            return mapV.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        C6964Mg0 c6964Mg0 = this.f67266a;
        if (c6964Mg0.D()) {
            return false;
        }
        int iH = c6964Mg0.H();
        Object key = entry.getKey();
        Object value = entry.getValue();
        C6964Mg0 c6964Mg02 = this.f67266a;
        int iB = C6998Ng0.b(key, value, iH, C6964Mg0.q(c6964Mg02), c6964Mg02.a(), c6964Mg02.b(), c6964Mg02.c());
        if (iB == -1) {
            return false;
        }
        this.f67266a.C(iB, iH);
        C6964Mg0 c6964Mg03 = this.f67266a;
        c6964Mg03.f68699f--;
        this.f67266a.A();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f67266a.size();
    }
}
