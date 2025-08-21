package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes14.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* renamed from: a, reason: collision with root package name */
    private final LazyStringList f146794a;

    class a implements ListIterator<String> {

        /* renamed from: a, reason: collision with root package name */
        ListIterator<String> f146795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f146796b;

        a(int i10) {
            this.f146796b = i10;
            this.f146795a = UnmodifiableLazyStringList.this.f146794a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f146795a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f146795a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f146795a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f146795a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f146795a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f146795a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* renamed from: a, reason: collision with root package name */
        Iterator<String> f146798a;

        b() {
            this.f146798a = UnmodifiableLazyStringList.this.f146794a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f146798a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f146798a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList J() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void D1(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return this.f146794a.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> g() {
        return this.f146794a.g();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString k1(int i10) {
        return this.f146794a.k1(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f146794a.size();
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f146794a = lazyStringList;
    }
}
