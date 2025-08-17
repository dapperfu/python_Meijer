package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes7.dex */
public class o0 extends AbstractList<String> implements E, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final E f90585a;

    class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        ListIterator<String> f90586a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f90587b;

        a(int i10) {
            this.f90587b = i10;
            this.f90586a = o0.this.f90585a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f90586a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f90586a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f90586a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f90586a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f90586a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f90586a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<String> f90589a;

        b() {
            this.f90589a = o0.this.f90585a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f90589a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f90589a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.E
    public E J() {
        return this;
    }

    @Override // com.google.protobuf.E
    public Object c(int i10) {
        return this.f90585a.c(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f90585a.get(i10);
    }

    @Override // com.google.protobuf.E
    public List<?> g() {
        return this.f90585a.g();
    }

    @Override // com.google.protobuf.E
    public void h0(AbstractC11521g abstractC11521g) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f90585a.size();
    }

    public o0(E e10) {
        this.f90585a = e10;
    }
}
