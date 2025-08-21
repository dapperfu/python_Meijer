package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SinceKotlin
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001WB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ%\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0007J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u0010%J\u0015\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010%J\u000f\u0010.\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b.\u0010%J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010%J\u000f\u00100\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b0\u0010%J\u0017\u00101\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00101\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00103J\u001d\u00104\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b4\u00105J%\u00104\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b4\u00106J\u0018\u00107\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b7\u00108J \u00109\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u0018\u0010;\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b;\u00102J\u0017\u0010<\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u0010=J\u0017\u0010?\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u00102J\u0017\u0010@\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b@\u00108J\u001d\u0010A\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\bA\u00105J\u001d\u0010B\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\bB\u00105J\u000f\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\bC\u0010\u0007J)\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010E\"\u0004\b\u0001\u0010D2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0EH\u0016¢\u0006\u0004\bG\u0010JJ\u001f\u0010K\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\bK\u0010\u001bR\u0016\u0010N\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010I0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR$\u0010U\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bL\u0010T¨\u0006X"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "", "initialCapacity", "<init>", "(I)V", "()V", "minCapacity", "", "o", "newCapacity", "k", "index", "u", "(I)I", "s", "q", "n", "internalIndex", "", "elements", "h", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "B", "(II)V", "C", "internalFromIndex", "internalToIndex", "t", "v", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "p", "last", "r", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "x", "removeLast", "y", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "f", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "a", "I", "head", "b", "[Ljava/lang/Object;", "elementData", "value", "c", "()I", "size", "d", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f143378e = new Object[0];

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int head;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] elementData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int size;

    public ArrayDeque(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f143378e;
        } else {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i10);
            }
            objArr = new Object[i10];
        }
        this.elementData = objArr;
    }

    private final void t(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            ArraysKt___ArraysJvmKt.B(this.elementData, null, internalFromIndex, internalToIndex);
            return;
        }
        Object[] objArr = this.elementData;
        ArraysKt___ArraysJvmKt.B(objArr, null, internalFromIndex, objArr.length);
        ArraysKt___ArraysJvmKt.B(this.elementData, null, 0, internalToIndex);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        v();
        o(size() + elements.size());
        h(u(this.head + size()), elements);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        Intrinsics.j(array, "array");
        if (array.length < size()) {
            array = (T[]) C15313d.a(array, size());
        }
        T[] tArr = array;
        int iU = u(this.head + size());
        int i10 = this.head;
        if (i10 < iU) {
            ArraysKt___ArraysJvmKt.t(this.elementData, tArr, 0, i10, iU, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.elementData;
            ArraysKt___ArraysJvmKt.o(objArr, tArr, 0, this.head, objArr.length);
            Object[] objArr2 = this.elementData;
            ArraysKt___ArraysJvmKt.o(objArr2, tArr, objArr2.length - this.head, 0, iU);
        }
        return (T[]) h.f(size(), tArr);
    }

    private final void B(int fromIndex, int toIndex) {
        int iU = u(this.head + (fromIndex - 1));
        int iU2 = u(this.head + (toIndex - 1));
        while (fromIndex > 0) {
            int i10 = iU + 1;
            int iMin = Math.min(fromIndex, Math.min(i10, iU2 + 1));
            Object[] objArr = this.elementData;
            int i11 = iU2 - iMin;
            int i12 = iU - iMin;
            ArraysKt___ArraysJvmKt.o(objArr, objArr, i11 + 1, i12 + 1, i10);
            iU = s(i12);
            iU2 = s(i11);
            fromIndex -= iMin;
        }
    }

    private final void C(int fromIndex, int toIndex) {
        int iU = u(this.head + toIndex);
        int iU2 = u(this.head + fromIndex);
        int size = size();
        while (true) {
            size -= toIndex;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.elementData;
            toIndex = Math.min(size, Math.min(objArr.length - iU, objArr.length - iU2));
            Object[] objArr2 = this.elementData;
            int i10 = iU + toIndex;
            ArraysKt___ArraysJvmKt.o(objArr2, objArr2, iU2, iU, i10);
            iU = u(i10);
            iU2 = u(iU2 + toIndex);
        }
    }

    private final void k(int newCapacity) {
        Object[] objArr = new Object[newCapacity];
        Object[] objArr2 = this.elementData;
        ArraysKt___ArraysJvmKt.o(objArr2, objArr, 0, this.head, objArr2.length);
        Object[] objArr3 = this.elementData;
        int length = objArr3.length;
        int i10 = this.head;
        ArraysKt___ArraysJvmKt.o(objArr3, objArr, length - i10, 0, i10);
        this.head = 0;
        this.elementData = objArr;
    }

    private final int n(int index) {
        return index == 0 ? ArraysKt___ArraysKt.m0(this.elementData) : index - 1;
    }

    private final void o(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.elementData;
        if (minCapacity <= objArr.length) {
            return;
        }
        if (objArr == f143378e) {
            this.elementData = new Object[RangesKt.f(minCapacity, 10)];
        } else {
            k(AbstractList.INSTANCE.e(objArr.length, minCapacity));
        }
    }

    private final int q(int index) {
        if (index == ArraysKt___ArraysKt.m0(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final int s(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    private final int u(int index) {
        Object[] objArr = this.elementData;
        return index >= objArr.length ? index - objArr.length : index;
    }

    private final void v() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: a, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractList.INSTANCE.c(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        v();
        o(size() + 1);
        int iU = u(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int iN = n(iU);
            int iN2 = n(this.head);
            int i10 = this.head;
            if (iN >= i10) {
                Object[] objArr = this.elementData;
                objArr[iN2] = objArr[i10];
                ArraysKt___ArraysJvmKt.o(objArr, objArr, i10, i10 + 1, iN + 1);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr2, objArr2, i10 - 1, i10, objArr2.length);
                Object[] objArr3 = this.elementData;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt___ArraysJvmKt.o(objArr3, objArr3, 0, 1, iN + 1);
            }
            this.elementData[iN] = element;
            this.head = iN2;
        } else {
            int iU2 = u(this.head + size());
            if (iU < iU2) {
                Object[] objArr4 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr4, objArr4, iU + 1, iU, iU2);
            } else {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr5, objArr5, 1, 0, iU2);
                Object[] objArr6 = this.elementData;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt___ArraysJvmKt.o(objArr6, objArr6, iU + 1, iU, objArr6.length - 1);
            }
            this.elementData[iU] = element;
        }
        this.size = size() + 1;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E f(int index) {
        AbstractList.INSTANCE.b(index, size());
        if (index == i.o(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        v();
        int iU = u(this.head + index);
        E e10 = (E) this.elementData[iU];
        if (index < (size() >> 1)) {
            int i10 = this.head;
            if (iU >= i10) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr, objArr, i10 + 1, i10, iU);
            } else {
                Object[] objArr2 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr2, objArr2, 1, 0, iU);
                Object[] objArr3 = this.elementData;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i11 = this.head;
                ArraysKt___ArraysJvmKt.o(objArr3, objArr3, i11 + 1, i11, objArr3.length - 1);
            }
            Object[] objArr4 = this.elementData;
            int i12 = this.head;
            objArr4[i12] = null;
            this.head = q(i12);
        } else {
            int iU2 = u(this.head + i.o(this));
            if (iU <= iU2) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr5, objArr5, iU, iU + 1, iU2 + 1);
            } else {
                Object[] objArr6 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr6, objArr6, iU, iU + 1, objArr6.length);
                Object[] objArr7 = this.elementData;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt___ArraysJvmKt.o(objArr7, objArr7, 0, 1, iU2 + 1);
            }
            this.elementData[iU2] = null;
        }
        this.size = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        AbstractList.INSTANCE.b(index, size());
        return (E) this.elementData[u(this.head + index)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int i10;
        int iU = u(this.head + size());
        int length = this.head;
        if (length < iU) {
            while (length < iU) {
                if (Intrinsics.e(element, this.elementData[length])) {
                    i10 = this.head;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iU) {
            return -1;
        }
        int length2 = this.elementData.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iU; i11++) {
                    if (Intrinsics.e(element, this.elementData[i11])) {
                        length = i11 + this.elementData.length;
                        i10 = this.head;
                    }
                }
                return -1;
            }
            if (Intrinsics.e(element, this.elementData[length])) {
                i10 = this.head;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int iM0;
        int i10;
        int iU = u(this.head + size());
        int i11 = this.head;
        if (i11 < iU) {
            iM0 = iU - 1;
            if (i11 <= iM0) {
                while (!Intrinsics.e(element, this.elementData[iM0])) {
                    if (iM0 != i11) {
                        iM0--;
                    }
                }
                i10 = this.head;
                return iM0 - i10;
            }
            return -1;
        }
        if (i11 > iU) {
            int i12 = iU - 1;
            while (true) {
                if (-1 >= i12) {
                    iM0 = ArraysKt___ArraysKt.m0(this.elementData);
                    int i13 = this.head;
                    if (i13 <= iM0) {
                        while (!Intrinsics.e(element, this.elementData[iM0])) {
                            if (iM0 != i13) {
                                iM0--;
                            }
                        }
                        i10 = this.head;
                    }
                } else {
                    if (Intrinsics.e(element, this.elementData[i12])) {
                        iM0 = i12 + this.elementData.length;
                        i10 = this.head;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        int iU;
        Intrinsics.j(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iU2 = u(this.head + size());
            int i10 = this.head;
            if (i10 < iU2) {
                iU = i10;
                while (i10 < iU2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.elementData[iU] = obj;
                        iU++;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.B(this.elementData, null, iU, iU2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.elementData[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iU = u(i11);
                for (int i12 = 0; i12 < iU2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.elementData[iU] = obj3;
                        iU = q(iU);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                v();
                this.size = s(iU - this.head);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        AbstractList.INSTANCE.d(fromIndex, toIndex, size());
        int i10 = toIndex - fromIndex;
        if (i10 == 0) {
            return;
        }
        if (i10 == size()) {
            clear();
            return;
        }
        if (i10 == 1) {
            remove(fromIndex);
            return;
        }
        v();
        if (fromIndex < size() - toIndex) {
            B(fromIndex, toIndex);
            int iU = u(this.head + i10);
            t(this.head, iU);
            this.head = iU;
        } else {
            C(fromIndex, toIndex);
            int iU2 = u(this.head + size());
            t(s(iU2 - i10), iU2);
        }
        this.size = size() - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        int iU;
        Intrinsics.j(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.elementData.length != 0) {
            int iU2 = u(this.head + size());
            int i10 = this.head;
            if (i10 < iU2) {
                iU = i10;
                while (i10 < iU2) {
                    Object obj = this.elementData[i10];
                    if (elements.contains(obj)) {
                        this.elementData[iU] = obj;
                        iU++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                ArraysKt___ArraysJvmKt.B(this.elementData, null, iU, iU2);
            } else {
                int length = this.elementData.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.elementData;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.elementData[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iU = u(i11);
                for (int i12 = 0; i12 < iU2; i12++) {
                    Object[] objArr2 = this.elementData;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.elementData[iU] = obj3;
                        iU = q(iU);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                v();
                this.size = s(iU - this.head);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        AbstractList.INSTANCE.b(index, size());
        int iU = u(this.head + index);
        Object[] objArr = this.elementData;
        E e10 = (E) objArr[iU];
        objArr[iU] = element;
        return e10;
    }

    private final void h(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        while (internalIndex < length && it.hasNext()) {
            this.elementData[internalIndex] = it.next();
            internalIndex++;
        }
        int i10 = this.head;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.elementData[i11] = it.next();
        }
        this.size = size() + elements.size();
    }

    public final void addFirst(E element) {
        v();
        o(size() + 1);
        int iN = n(this.head);
        this.head = iN;
        this.elementData[iN] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        v();
        o(size() + 1);
        this.elementData[u(this.head + size())] = element;
        this.size = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            v();
            t(this.head, u(this.head + size()));
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        if (indexOf(element) != -1) {
            return true;
        }
        return false;
    }

    public final E first() {
        if (!isEmpty()) {
            return (E) this.elementData[this.head];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final E last() {
        if (!isEmpty()) {
            return (E) this.elementData[u(this.head + i.o(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E p() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    public final E r() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[u(this.head + i.o(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            v();
            Object[] objArr = this.elementData;
            int i10 = this.head;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.head = q(i10);
            this.size = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            v();
            int iU = u(this.head + i.o(this));
            Object[] objArr = this.elementData;
            E e10 = (E) objArr[iU];
            objArr[iU] = null;
            this.size = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E x() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E y() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        Intrinsics.j(elements, "elements");
        AbstractList.INSTANCE.c(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        v();
        o(size() + elements.size());
        int iU = u(this.head + size());
        int iU2 = u(this.head + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i10 = this.head;
            int length = i10 - size;
            if (iU2 < i10) {
                Object[] objArr = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr, objArr, length, i10, objArr.length);
                if (size >= iU2) {
                    Object[] objArr2 = this.elementData;
                    ArraysKt___ArraysJvmKt.o(objArr2, objArr2, objArr2.length - size, 0, iU2);
                } else {
                    Object[] objArr3 = this.elementData;
                    ArraysKt___ArraysJvmKt.o(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.elementData;
                    ArraysKt___ArraysJvmKt.o(objArr4, objArr4, 0, size, iU2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr5, objArr5, length, i10, iU2);
            } else {
                Object[] objArr6 = this.elementData;
                length += objArr6.length;
                int i11 = iU2 - i10;
                int length2 = objArr6.length - length;
                if (length2 >= i11) {
                    ArraysKt___ArraysJvmKt.o(objArr6, objArr6, length, i10, iU2);
                } else {
                    ArraysKt___ArraysJvmKt.o(objArr6, objArr6, length, i10, i10 + length2);
                    Object[] objArr7 = this.elementData;
                    ArraysKt___ArraysJvmKt.o(objArr7, objArr7, 0, this.head + length2, iU2);
                }
            }
            this.head = length;
            h(s(iU2 - size), elements);
        } else {
            int i12 = iU2 + size;
            if (iU2 < iU) {
                int i13 = size + iU;
                Object[] objArr8 = this.elementData;
                if (i13 <= objArr8.length) {
                    ArraysKt___ArraysJvmKt.o(objArr8, objArr8, i12, iU2, iU);
                } else if (i12 >= objArr8.length) {
                    ArraysKt___ArraysJvmKt.o(objArr8, objArr8, i12 - objArr8.length, iU2, iU);
                } else {
                    int length3 = iU - (i13 - objArr8.length);
                    ArraysKt___ArraysJvmKt.o(objArr8, objArr8, 0, length3, iU);
                    Object[] objArr9 = this.elementData;
                    ArraysKt___ArraysJvmKt.o(objArr9, objArr9, i12, iU2, length3);
                }
            } else {
                Object[] objArr10 = this.elementData;
                ArraysKt___ArraysJvmKt.o(objArr10, objArr10, size, 0, iU);
                Object[] objArr11 = this.elementData;
                if (i12 >= objArr11.length) {
                    ArraysKt___ArraysJvmKt.o(objArr11, objArr11, i12 - objArr11.length, iU2, objArr11.length);
                } else {
                    ArraysKt___ArraysJvmKt.o(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.elementData;
                    ArraysKt___ArraysJvmKt.o(objArr12, objArr12, i12, iU2, objArr12.length - size);
                }
            }
            h(iU2, elements);
        }
        return true;
    }

    public ArrayDeque() {
        this.elementData = f143378e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
