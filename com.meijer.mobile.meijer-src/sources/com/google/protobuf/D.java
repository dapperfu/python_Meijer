package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public class D extends AbstractC11642c<String> implements E, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    private static final D f91268c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final E f91269d;

    /* renamed from: b, reason: collision with root package name */
    private final List<Object> f91270b;

    private D(boolean z10) {
        super(z10);
        this.f91270b = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    static {
        D d10 = new D(false);
        f91268c = d10;
        f91269d = d10;
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC11646g ? ((AbstractC11646g) obj).y() : C11663y.j((byte[]) obj);
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        a();
        if (collection instanceof E) {
            collection = ((E) collection).g();
        }
        boolean zAddAll = this.f91270b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.E
    public Object c(int i10) {
        return this.f91270b.get(i10);
    }

    @Override // com.google.protobuf.E
    public List<?> g() {
        return Collections.unmodifiableList(this.f91270b);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f91270b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC11646g) {
            AbstractC11646g abstractC11646g = (AbstractC11646g) obj;
            String strY = abstractC11646g.y();
            if (abstractC11646g.n()) {
                this.f91270b.set(i10, strY);
            }
            return strY;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = C11663y.j(bArr);
        if (C11663y.g(bArr)) {
            this.f91270b.set(i10, strJ);
        }
        return strJ;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f91270b.size();
    }

    public D(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // com.google.protobuf.E
    public E J() {
        if (j()) {
            return new o0(this);
        }
        return this;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f91270b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        a();
        this.f91270b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.E
    public void h0(AbstractC11646g abstractC11646g) {
        a();
        this.f91270b.add(abstractC11646g);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC11642c, com.google.protobuf.C11663y.i
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // com.google.protobuf.C11663y.i
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public D b3(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f91270b);
            return new D((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        a();
        Object objRemove = this.f91270b.remove(i10);
        ((AbstractList) this).modCount++;
        return f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        a();
        return f(this.f91270b.set(i10, str));
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC11642c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    private D(ArrayList<Object> arrayList) {
        this.f91270b = arrayList;
    }
}
