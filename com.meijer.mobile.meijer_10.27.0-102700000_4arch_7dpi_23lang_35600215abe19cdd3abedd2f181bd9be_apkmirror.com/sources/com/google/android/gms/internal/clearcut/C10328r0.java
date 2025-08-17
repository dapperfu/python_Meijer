package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.r0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10328r0 extends AbstractC10333t<String> implements InterfaceC10331s0, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final C10328r0 f81545c;

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC10331s0 f81546d;

    /* renamed from: b, reason: collision with root package name */
    private final List<Object> f81547b;

    static {
        C10328r0 c10328r0 = new C10328r0();
        f81545c = c10328r0;
        c10328r0.zzv();
        f81546d = c10328r0;
    }

    public C10328r0() {
        this(10);
    }

    private static String e(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof A ? ((A) obj).r() : C10299h0.h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10331s0
    public final List<?> A() {
        return Collections.unmodifiableList(this.f81547b);
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10331s0
    public final InterfaceC10331s0 C3() {
        return zzu() ? new C10341v1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        a();
        this.f81547b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof InterfaceC10331s0) {
            collection = ((InterfaceC10331s0) collection).A();
        }
        boolean zAddAll = this.f81547b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10331s0
    public final Object c(int i10) {
        return this.f81547b.get(i10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f81547b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        String strH;
        Object obj = this.f81547b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof A) {
            A a10 = (A) obj;
            strH = a10.r();
            if (a10.k()) {
            }
            return strH;
        }
        byte[] bArr = (byte[]) obj;
        strH = C10299h0.h(bArr);
        if (!C10299h0.g(bArr)) {
            return strH;
        }
        this.f81547b.set(i10, strH);
        return strH;
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        a();
        Object objRemove = this.f81547b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        a();
        return e(this.f81547b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f81547b.size();
    }

    @Override // com.google.android.gms.internal.clearcut.InterfaceC10308k0
    public final /* synthetic */ InterfaceC10308k0 zzi(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f81547b);
        return new C10328r0((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, com.google.android.gms.internal.clearcut.InterfaceC10308k0
    public final /* bridge */ /* synthetic */ boolean zzu() {
        return super.zzu();
    }

    public C10328r0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10333t, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C10328r0(ArrayList<Object> arrayList) {
        this.f81547b = arrayList;
    }
}
