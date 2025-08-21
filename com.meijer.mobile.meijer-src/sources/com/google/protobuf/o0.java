package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes8.dex */
public class o0 extends AbstractList<String> implements E, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final E f91424a;

    class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        ListIterator<String> f91425a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f91426b;

        a(int i10) {
            this.f91426b = i10;
            this.f91425a = o0.this.f91424a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f91425a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f91425a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f91425a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f91425a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f91425a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f91425a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<String> f91428a;

        b() {
            this.f91428a = o0.this.f91424a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f91428a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f91428a.hasNext();
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
        return this.f91424a.c(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f91424a.get(i10);
    }

    @Override // com.google.protobuf.E
    public List<?> g() {
        return this.f91424a.g();
    }

    @Override // com.google.protobuf.E
    public void h0(AbstractC11646g abstractC11646g) {
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
        return this.f91424a.size();
    }

    public o0(E e10) {
        this.f91424a = e10;
    }
}
