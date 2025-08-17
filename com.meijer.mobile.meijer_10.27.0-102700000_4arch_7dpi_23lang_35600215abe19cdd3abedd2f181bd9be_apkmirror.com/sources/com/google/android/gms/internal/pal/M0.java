package com.google.android.gms.internal.pal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class M0 extends L implements RandomAccess, N0 {

    /* renamed from: c, reason: collision with root package name */
    private static final M0 f82756c;

    /* renamed from: d, reason: collision with root package name */
    public static final N0 f82757d;

    /* renamed from: b, reason: collision with root package name */
    private final List f82758b;

    public M0() {
        this(10);
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof N0) {
            collection = ((N0) collection).zzh();
        }
        boolean zAddAll = this.f82758b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    static {
        M0 m02 = new M0(10);
        f82756c = m02;
        m02.zzb();
        f82757d = m02;
    }

    public M0(int i10) {
        this.f82758b = new ArrayList(i10);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC10605b0 ? ((AbstractC10605b0) obj).x(J0.f82677b) : J0.h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f82758b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC10605b0) {
            AbstractC10605b0 abstractC10605b0 = (AbstractC10605b0) obj;
            String strX = abstractC10605b0.x(J0.f82677b);
            if (abstractC10605b0.p()) {
                this.f82758b.set(i10, strX);
            }
            return strX;
        }
        byte[] bArr = (byte[]) obj;
        String strH = J0.h(bArr);
        if (J0.i(bArr)) {
            this.f82758b.set(i10, strH);
        }
        return strH;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.f82758b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return e(this.f82758b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f82758b.size();
    }

    @Override // com.google.android.gms.internal.pal.N0
    public final Object zzf(int i10) {
        return this.f82758b.get(i10);
    }

    @Override // com.google.android.gms.internal.pal.N0
    public final List zzh() {
        return Collections.unmodifiableList(this.f82758b);
    }

    @Override // com.google.android.gms.internal.pal.N0
    public final void Y0(AbstractC10605b0 abstractC10605b0) {
        zza();
        this.f82758b.add(abstractC10605b0);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.f82758b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object objRemove = this.f82758b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // com.google.android.gms.internal.pal.I0
    public final /* bridge */ /* synthetic */ I0 zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f82758b);
            return new M0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.pal.N0
    public final N0 zze() {
        if (zzc()) {
            return new O1(this);
        }
        return this;
    }

    private M0(ArrayList arrayList) {
        this.f82758b = arrayList;
    }

    @Override // com.google.android.gms.internal.pal.L, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
