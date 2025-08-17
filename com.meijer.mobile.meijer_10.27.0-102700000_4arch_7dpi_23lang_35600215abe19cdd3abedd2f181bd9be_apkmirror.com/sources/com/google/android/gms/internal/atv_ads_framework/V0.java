package com.google.android.gms.internal.atv_ads_framework;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
public final class V0 extends AbstractC10213e0 implements RandomAccess, W0 {

    /* renamed from: c, reason: collision with root package name */
    private static final V0 f80908c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final W0 f80909d;

    /* renamed from: b, reason: collision with root package name */
    private final List f80910b;

    public V0() {
        this(10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof W0) {
            collection = ((W0) collection).zzh();
        }
        boolean zAddAll = this.f80910b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    static {
        V0 v02 = new V0(false);
        f80908c = v02;
        f80909d = v02;
    }

    public V0(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f80910b = arrayList;
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC10249q0 ? ((AbstractC10249q0) obj).q(S0.f80873b) : S0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f80910b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC10249q0) {
            AbstractC10249q0 abstractC10249q0 = (AbstractC10249q0) obj;
            String strQ = abstractC10249q0.q(S0.f80873b);
            if (abstractC10249q0.n()) {
                this.f80910b.set(i10, strQ);
            }
            return strQ;
        }
        byte[] bArr = (byte[]) obj;
        String strD = S0.d(bArr);
        if (f2.d(bArr)) {
            this.f80910b.set(i10, strD);
        }
        return strD;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.f80910b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return e(this.f80910b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80910b.size();
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.W0
    public final Object zze(int i10) {
        return this.f80910b.get(i10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.W0
    public final List zzh() {
        return Collections.unmodifiableList(this.f80910b);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.f80910b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object objRemove = this.f80910b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.W0
    public final W0 zzd() {
        if (zzc()) {
            return new V1(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.R0
    public final /* bridge */ /* synthetic */ R0 zzg(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f80910b);
            return new V0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    private V0(ArrayList arrayList) {
        super(true);
        this.f80910b = arrayList;
    }

    private V0(boolean z10) {
        super(false);
        this.f80910b = Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10213e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
