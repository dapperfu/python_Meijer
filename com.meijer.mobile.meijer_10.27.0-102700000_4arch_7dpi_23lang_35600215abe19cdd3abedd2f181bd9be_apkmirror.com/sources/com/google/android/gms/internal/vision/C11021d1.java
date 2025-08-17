package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11021d1 extends AbstractC11008a0<String> implements InterfaceC11033g1, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final C11021d1 f84523c;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC11033g1 f84524d;

    /* renamed from: b, reason: collision with root package name */
    private final List<Object> f84525b;

    public C11021d1() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        a();
        this.f84525b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, com.google.android.gms.internal.vision.X0
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    static {
        C11021d1 c11021d1 = new C11021d1();
        f84523c = c11021d1;
        c11021d1.zzb();
        f84524d = c11021d1;
    }

    public C11021d1(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC11036h0 ? ((AbstractC11036h0) obj).s() : S0.i((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof InterfaceC11033g1) {
            collection = ((InterfaceC11033g1) collection).zzd();
        }
        boolean zAddAll = this.f84525b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        Object obj = this.f84525b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC11036h0) {
            AbstractC11036h0 abstractC11036h0 = (AbstractC11036h0) obj;
            String strS = abstractC11036h0.s();
            if (abstractC11036h0.zzc()) {
                this.f84525b.set(i10, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String strI = S0.i(bArr);
        if (S0.h(bArr)) {
            this.f84525b.set(i10, strI);
        }
        return strI;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        Object objRemove = this.f84525b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        a();
        return e(this.f84525b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f84525b.size();
    }

    @Override // com.google.android.gms.internal.vision.X0
    public final /* synthetic */ X0 zza(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f84525b);
        return new C11021d1((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11033g1
    public final Object zzb(int i10) {
        return this.f84525b.get(i10);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11033g1
    public final List<?> zzd() {
        return Collections.unmodifiableList(this.f84525b);
    }

    private C11021d1(ArrayList<Object> arrayList) {
        this.f84525b = arrayList;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f84525b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11033g1
    public final void i3(AbstractC11036h0 abstractC11036h0) {
        a();
        this.f84525b.add(abstractC11036h0);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11033g1
    public final InterfaceC11033g1 zze() {
        if (zza()) {
            return new j2(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11008a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
