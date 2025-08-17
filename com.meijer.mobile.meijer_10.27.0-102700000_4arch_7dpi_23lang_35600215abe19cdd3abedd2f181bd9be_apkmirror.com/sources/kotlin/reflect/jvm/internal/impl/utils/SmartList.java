package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* loaded from: classes13.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private int f147172a;

    /* renamed from: b, reason: collision with root package name */
    private Object f147173b;

    private static class b<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private static final b f147174a = new b();

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        public static <T> b<T> a() {
            return f147174a;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }

        private b() {
        }
    }

    private class c extends d<E> {

        /* renamed from: b, reason: collision with root package name */
        private final int f147175b;

        public c() {
            super();
            this.f147175b = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.d
        protected void a() {
            if (((AbstractList) SmartList.this).modCount == this.f147175b) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) SmartList.this).modCount + "; expected: " + this.f147175b);
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.d
        protected E c() {
            return (E) SmartList.this.f147173b;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            SmartList.this.clear();
        }
    }

    private static abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f147177a;

        private d() {
        }

        protected abstract void a();

        protected abstract T c();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f147177a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f147177a) {
                throw new NoSuchElementException();
            }
            this.f147177a = true;
            a();
            return c();
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        int i10 = this.f147172a;
        if (i10 == 0) {
            this.f147173b = e10;
        } else if (i10 == 1) {
            this.f147173b = new Object[]{this.f147173b, e10};
        } else {
            Object[] objArr = (Object[]) this.f147173b;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f147173b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f147172a] = e10;
        }
        this.f147172a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f147173b = null;
        this.f147172a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f147172a)) {
            return i11 == 1 ? (E) this.f147173b : (E) ((Object[]) this.f147173b)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f147172a);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        int i10 = this.f147172a;
        if (i10 == 0) {
            b bVarA = b.a();
            if (bVarA == null) {
                a(2);
            }
            return bVarA;
        }
        if (i10 == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it == null) {
            a(3);
        }
        return it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f147172a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f147172a);
        }
        if (i11 == 1) {
            e10 = (E) this.f147173b;
            this.f147173b = null;
        } else {
            Object[] objArr = (Object[]) this.f147173b;
            Object obj = objArr[i10];
            if (i11 == 2) {
                this.f147173b = objArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(objArr, i10 + 1, objArr, i10, i12);
                }
                objArr[this.f147172a - 1] = null;
            }
            e10 = (E) obj;
        }
        this.f147172a--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f147172a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f147172a);
        }
        if (i11 == 1) {
            E e11 = (E) this.f147173b;
            this.f147173b = e10;
            return e11;
        }
        Object[] objArr = (Object[]) this.f147173b;
        E e12 = (E) objArr[i10];
        objArr[i10] = e10;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f147172a;
    }

    @Override // java.util.List
    public void sort(Comparator<? super E> comparator) {
        int i10 = this.f147172a;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f147173b, 0, i10, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            a(4);
        }
        int length = tArr.length;
        int i10 = this.f147172a;
        if (i10 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f147173b;
                return tArr2;
            }
            tArr[0] = this.f147173b;
        } else {
            if (length < i10) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f147173b, i10, tArr.getClass());
                if (tArr3 == null) {
                    a(6);
                }
                return tArr3;
            }
            if (i10 != 0) {
                System.arraycopy(this.f147173b, 0, tArr, 0, i10);
            }
        }
        int i11 = this.f147172a;
        if (length > i11) {
            tArr[i11] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        if (i10 >= 0 && i10 <= (i11 = this.f147172a)) {
            if (i11 == 0) {
                this.f147173b = e10;
            } else if (i11 == 1 && i10 == 0) {
                this.f147173b = new Object[]{e10, this.f147173b};
            } else {
                Object[] objArr = new Object[i11 + 1];
                if (i11 == 1) {
                    objArr[0] = this.f147173b;
                } else {
                    Object[] objArr2 = (Object[]) this.f147173b;
                    System.arraycopy(objArr2, 0, objArr, 0, i10);
                    System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f147172a - i10);
                }
                objArr[i10] = e10;
                this.f147173b = objArr;
            }
            this.f147172a++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f147172a);
    }
}
