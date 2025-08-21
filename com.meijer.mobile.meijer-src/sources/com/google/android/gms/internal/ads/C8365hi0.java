package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.hi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8365hi0 extends AbstractC8575jh0 {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f75612c;

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C9003nh0(this.f75612c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0
    /* renamed from: k */
    public final AbstractC8684ki0 iterator() {
        return new C9003nh0(this.f75612c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final int a(Object[] objArr, int i10) {
        objArr[i10] = this.f75612c;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f75612c.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, com.google.android.gms.internal.ads.AbstractC7526Zg0
    public final AbstractC8042eh0 h() {
        return AbstractC8042eh0.u(this.f75612c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8575jh0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f75612c.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f75612c.toString() + "]";
    }

    C8365hi0(Object obj) {
        obj.getClass();
        this.f75612c = obj;
    }
}
