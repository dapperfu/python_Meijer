package Z;

import a0.C5637a;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\"\u0010D\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010&\"\u0004\bC\u0010\u0007R\u0014\u0010F\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010&¨\u0006G"}, d2 = {"LZ/b;", "E", "", "", "", "capacity", "<init>", "(I)V", "", "clear", "()V", "minimumCapacity", "a", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "s", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "o", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "[I", "h", "()[I", "q", "([I)V", "hashes", "b", "[Ljava/lang/Object;", "f", "p", "([Ljava/lang/Object;)V", "c", "I", "n", "r", "_size", "k", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5604b<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int[] hashes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] array;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int _size;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZ/b$a;", "LZ/l;", "<init>", "(LZ/b;)V", "", "index", "a", "(I)Ljava/lang/Object;", "", "c", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Z.b$a */
    private final class a extends AbstractC5614l<E> {
        public a() {
            super(C5604b.this.n());
        }

        @Override // Z.AbstractC5614l
        protected E a(int index) {
            return C5604b.this.s(index);
        }

        @Override // Z.AbstractC5614l
        protected void c(int index) {
            C5604b.this.o(index);
        }
    }

    @JvmOverloads
    public C5604b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int iN = n();
            for (int i10 = 0; i10 < iN; i10++) {
                if (!((Set) other).contains(s(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.w(this.array, 0, this._size);
    }

    @JvmOverloads
    public C5604b(int i10) {
        this.hashes = C5637a.f44159a;
        this.array = C5637a.f44161c;
        if (i10 > 0) {
            C5606d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i10;
        int iC;
        int iN = n();
        if (element == null) {
            iC = C5606d.d(this);
            i10 = 0;
        } else {
            int iHashCode = element.hashCode();
            i10 = iHashCode;
            iC = C5606d.c(this, element, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iN >= getHashes().length) {
            int i12 = 8;
            if (iN >= 8) {
                i12 = (iN >> 1) + iN;
            } else if (iN < 4) {
                i12 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            C5606d.a(this, i12);
            if (iN != n()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                ArraysKt.r(hashes, getHashes(), 0, 0, hashes.length, 6, null);
                ArraysKt.t(array, getArray(), 0, 0, array.length, 6, null);
            }
        }
        if (i11 < iN) {
            int i13 = i11 + 1;
            ArraysKt.m(getHashes(), getHashes(), i13, i11, iN);
            ArraysKt.o(getArray(), getArray(), i13, i11, iN);
        }
        if (iN != n() || i11 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i11] = i10;
        getArray()[i11] = element;
        r(n() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        a(n() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    /* renamed from: h, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    public final int indexOf(Object key) {
        return key == null ? C5606d.d(this) : C5606d.c(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new a();
    }

    /* renamed from: k, reason: from getter */
    public int get_size() {
        return this._size;
    }

    public final int n() {
        return this._size;
    }

    public final void p(Object[] objArr) {
        Intrinsics.j(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void q(int[] iArr) {
        Intrinsics.j(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void r(int i10) {
        this._size = i10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.j(elements, "elements");
        boolean z10 = false;
        for (int iN = n() - 1; -1 < iN; iN--) {
            if (!CollectionsKt.h0(elements, getArray()[iN])) {
                o(iN);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        T[] tArr = (T[]) C5605c.a(array, this._size);
        ArraysKt.o(this.array, tArr, 0, 0, this._size);
        Intrinsics.g(tArr);
        return tArr;
    }

    public final void a(int minimumCapacity) {
        int iN = n();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            C5606d.a(this, minimumCapacity);
            if (n() > 0) {
                ArraysKt.r(hashes, getHashes(), 0, 0, n(), 6, null);
                ArraysKt.t(array, getArray(), 0, 0, n(), 6, null);
            }
        }
        if (n() == iN) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (n() != 0) {
            q(C5637a.f44159a);
            p(C5637a.f44161c);
            r(0);
        }
        if (n() == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        if (indexOf(element) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int iN = n();
        int i10 = 0;
        for (int i11 = 0; i11 < iN; i11++) {
            i10 += hashes[i11];
        }
        return i10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (n() <= 0) {
            return true;
        }
        return false;
    }

    public final E o(int index) {
        int i10;
        Object[] objArr;
        int iN = n();
        E e10 = (E) getArray()[index];
        if (iN <= 1) {
            clear();
            return e10;
        }
        int i11 = iN - 1;
        int iN2 = 8;
        if (getHashes().length > 8 && n() < getHashes().length / 3) {
            if (n() > 8) {
                iN2 = n() + (n() >> 1);
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            C5606d.a(this, iN2);
            if (index > 0) {
                ArraysKt.r(hashes, getHashes(), 0, 0, index, 6, null);
                objArr = array;
                ArraysKt.t(objArr, getArray(), 0, 0, index, 6, null);
                i10 = index;
            } else {
                i10 = index;
                objArr = array;
            }
            if (i10 < i11) {
                int i12 = i10 + 1;
                ArraysKt.m(hashes, getHashes(), i10, i12, iN);
                ArraysKt.o(objArr, getArray(), i10, i12, iN);
            }
        } else {
            if (index < i11) {
                int i13 = index + 1;
                ArraysKt.m(getHashes(), getHashes(), index, i13, iN);
                ArraysKt.o(getArray(), getArray(), index, i13, iN);
            }
            getArray()[i11] = null;
        }
        if (iN == n()) {
            r(i11);
            return e10;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            o(iIndexOf);
            return true;
        }
        return false;
    }

    public final E s(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(n() * 14);
        sb2.append('{');
        int iN = n();
        for (int i10 = 0; i10 < iN; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eS = s(i10);
            if (eS != this) {
                sb2.append(eS);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C5604b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
