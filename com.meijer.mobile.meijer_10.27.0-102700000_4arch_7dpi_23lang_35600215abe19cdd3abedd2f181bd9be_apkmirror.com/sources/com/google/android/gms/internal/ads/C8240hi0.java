package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.hi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8240hi0 extends AbstractC8450jh0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f74772c;

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C8878nh0(this.f74772c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0
    /* renamed from: k */
    public final AbstractC8559ki0 iterator() {
        return new C8878nh0(this.f74772c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final int a(Object[] objArr, int i10) {
        objArr[i10] = this.f74772c;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f74772c.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, com.google.android.gms.internal.ads.AbstractC7401Zg0
    public final AbstractC7917eh0 h() {
        return AbstractC7917eh0.u(this.f74772c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8450jh0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f74772c.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f74772c.toString() + "]";
    }

    C8240hi0(Object obj) {
        obj.getClass();
        this.f74772c = obj;
    }
}
